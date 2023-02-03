import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Core {
    WebDriver browser;

    public void takeScreenshot(String filename) throws IOException {
        File file = ((TakesScreenshot) browser).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("results/screenshots/"+filename+".jpg"));

    }
}
