package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BasePage {

    WebDriver driver;
    WebDriverWait webDriverWait;
    int waitTime = 3;
    int retries =3;



    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void click(WebElement element) throws Exception{

        //webDriverWait = new WebDriverWait(driver,waitTime);
        Actions actions = new Actions(driver);

        int retryCount=0;
        while (retryCount<retries)
        try {
            webDriverWait.until(ExpectedConditions.visibilityOf(element));
            webDriverWait.until(ExpectedConditions.elementToBeClickable(element));

            actions.moveToElement(element).build().perform(); //hover
            element.click();
        }
        catch (Exception e) {
         retryCount++;
         if (retryCount==retries){
             throw new Exception("Failed to click element:");
         }
        }
    }

    public String getCurentTimeDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }
}
