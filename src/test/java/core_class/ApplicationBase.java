package core_class;

import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;

public class ApplicationBase {
    public static RemoteWebDriver webDriver;

    public static RemoteWebDriver getWebDriver() {
        return webDriver;
    }

    public static void setWebDriver(RemoteWebDriver driver) {
        webDriver = driver;
    }

    public static String pathXlsm(String fileName){
        File directory = new File(".");
        String absolutePath = directory.getAbsolutePath().replace("\\", "/").trim();
        absolutePath = absolutePath.substring(0, absolutePath.length() - 1);
        String path = absolutePath + "src/test/FilesForUpload/" + fileName + ".xlsm";
        return  path;
    }

}
