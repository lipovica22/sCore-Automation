package core_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class WebElementClass {
    public static WebElement FindBy(By by) {
        WebDriverWait wait = new WebDriverWait(ApplicationBase.webDriver, TimeUnit.SECONDS.toSeconds(2));

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
            return (WebElement) ApplicationBase.webDriver.findElement(by);
        } catch (Exception ex) {
            return null;
        }
    }

    public static By GetLocator(String option, String value) {
        try {
            switch (option)
            {
                case "name":
                    return By.name(value);
                case "xpath":
                    return By.xpath(value);
                case "class":
                    return By.className(value);
                case "cssSelector":
                    return By.cssSelector(value);
                default:
                    return By.id(value);
            }
        } catch (NoSuchElementException ex) {
            return null;
        }
    }
}
