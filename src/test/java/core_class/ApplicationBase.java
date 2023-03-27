package core_class;

import org.openqa.selenium.remote.RemoteWebDriver;

public class ApplicationBase {
    public static RemoteWebDriver webDriver;

    public static RemoteWebDriver getWebDriver() {
        return webDriver;
    }

    public static void setWebDriver(RemoteWebDriver driver) {
        webDriver = driver;
    }
}
