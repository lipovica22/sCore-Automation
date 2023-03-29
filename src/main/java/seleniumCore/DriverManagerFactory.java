package seleniumCore;

import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;

import static com.github.automatedowl.tools.AllureEnvironmentWriter.allureEnvironmentWriter;

public class DriverManagerFactory {

    public static DriverManager getDriverManager(String browser) throws Exception{
        DriverManager driverManager;
        browser = browser.toUpperCase();

        switch (browser) {
            case "CHROME": {
                driverManager = new ChromeDriverManager();
            }
            break;
            case "EDGE": {
                driverManager = new EdgeDriverManager();
            }
            break;
            default: throw new Exception("Browser " + browser + " not supported!");
        }

        setAllureEnvironment(driverManager);

        return driverManager;
    }
    private static void setAllureEnvironment(DriverManager driverManager) throws Exception {
        Capabilities capabilities = ((RemoteWebDriver)driverManager.getDriver()).getCapabilities();

        String browserName = capabilities.getBrowserName().toUpperCase();
        String browserVersion = capabilities.getVersion();
        String platform = capabilities.getPlatform().name();

        allureEnvironmentWriter(
                ImmutableMap.<String, String>builder()
                        .put("Browser", browserName)
                        .put("Browser.Version", browserVersion)
                        .put("Operating System", platform)
                        .put("Environment", "3.32.1.0")
                        .build(), pathAllureEnvironment());
    }

    private static String pathAllureEnvironment(){
        File directory = new File(".");
        String absolutePath = directory.getAbsolutePath().replace("\\", "/").replace(".", "").trim();
        String path = absolutePath + "results/allure-results/";
        return path;
    }
}
