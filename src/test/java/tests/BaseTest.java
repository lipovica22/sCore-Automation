package tests;

import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import seleniumCore.DriverManager;
import seleniumCore.DriverManagerFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    DriverManager driverManager;
    public WebDriver driver;
    String path = "src/results/screenshots/";

    public void initialization(String type) throws Exception {
        driverManager =  DriverManagerFactory.getDriverManager(type);
        driver = driverManager.getDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void quit(){
        driverManager.quitDriver();
    }

    public void openApp(String env) throws Exception {
        //env = env.toLowerCase();
        switch (env) {
            case "DEVELOPMENT": {
                driver.get("0");
            }
            break;

            case "TEST_BA": {
                driver.get("https://t-unba-iis.uniqa.ba/pos/BosniaAndHerzegovina/NoAD");
            }
            break;

            case "TEST_RS": {
                driver.get("https://t-score.uniqa.rs/POS/Serbia/NoAD");
            }
            break;

            case "TEST_MNE": {
                driver.get("https://mne-test-iis2.stech.loc/POS/Montenegro/NoAD");
            }
            break;
            case "TEST_HR": {
                driver.get("https://aasv098.uniqa.hr/POS/Croatia/NoAD/");
            }
            break;

            case "INTEGRATION": {
                driver.get("01");
            }
            break;
            case "PRODUCTION": {
                driver.get("022");
            }
            break;
            default:
                //driver.get("https://t-score.uniqa.rs/POS/Serbia/NoAD");
        }
    }

    public void takeScreenshot(String fileName) throws IOException {
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File(path +fileName+".png"));
    }

    public void reporterScreenshot(String fileName, String desc) throws IOException {
        takeScreenshot(fileName);
        Path filePath = Paths.get(path +fileName+".png");
        InputStream is = Files.newInputStream(filePath);
        Allure.addAttachment(desc,is);
    }
    public void click(WebElement element)
    {
        try
        {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            element.click();
        }
        catch (NotFoundException ex)
        {
            throw new NotFoundException("Control Click Issue.", ex);
        }
        catch (ElementClickInterceptedException ex)
        {
            throw new ElementClickInterceptedException("Control Click Issue.", ex);
        }
    }

    public void selectOption (String sel_option, WebElement element) {

        //element = driver.findElement(By.cssSelector("option"));
        boolean isClicked = false;
        element.click();
        Select dropdown = new Select(element);
        List<WebElement> optionsToSelect = dropdown.getOptions();

        for (WebElement option : optionsToSelect) {
            if (option.getText().equals(sel_option)) {
                option.click();
                isClicked = true;
                break;
            }
        }element.click();
    }
    public void selectOptionAC (String value, String sel_option, WebElement element) {

        boolean isClicked = false;
        element.click();
        element.sendKeys(value);

        //Select dropdown = new Select(list);
        List<WebElement> optionsToSelect = driver.findElements(By.className("ui-menu-item"));

        for (WebElement option : optionsToSelect) {
            if (option.getText().equals(sel_option)) {
                option.click();
                isClicked = true;
                break;
            }
        }
    }
    public void selectOption1 (String sel_option, WebElement element) {
        Select dropdown = new Select(element);
        dropdown.selectByVisibleText(sel_option);
    }

}







