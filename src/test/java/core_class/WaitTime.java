package core_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class WaitTime {
    public static void WaitForElementNotToBeVisible(WebDriver driver, String option, String value)
    {
        By locator = WebElementClass.GetLocator(option, value);
        WebDriverWait wait = new WebDriverWait(driver, 180);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }


}
