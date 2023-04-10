package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.TmsLink;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class sCoreSteps {

 WebDriver browser;

    @BeforeMethod
    public void prepareTest () {
        WebDriverManager.chromedriver().setup();
        browser = new ChromeDriver();
        //System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver108.exe");
        //System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver0320.exe");
        browser.manage().window().maximize();
        //browser.get("https://t-score.uniqa.rs/POS/Serbia/NoAD");

        browser.get( "https://t-unba-iis.uniqa.ba/pos/BosniaAndHerzegovina/NoAD");
    }

    @AfterMethod
    @Parameters({"quit"})
    public void tearDown (String quit) throws IOException {
        takeScreenshot("slika"+System.currentTimeMillis());
        if(quit.equalsIgnoreCase("Yes")) {
            browser.quit();
        }
    }

    @Test(enabled = false)
    @TmsLink("Regresivni testovi")
    @Parameters({"username","password"})
    public void loginOnRSD (String username, String password) throws IOException {
        browser.findElement(By.id("Username")).sendKeys(username);
        browser.findElement(By.id("Password")).sendKeys(password);
        browser.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]")).click();
        Assert.assertEquals(browser.getCurrentUrl(), "https://t-score.uniqa.rs/POS/Serbia/Products");
      }

    @Test
    public void loginOnRSDAsAgent() {
        browser.findElement(By.id("Username")).sendKeys("sCoreAgent");
        browser.findElement(By.id("Password")).sendKeys("OvoJ3Test");
        browser.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]")).click();
        Assert.assertEquals(browser.getCurrentUrl(), "https://t-score.uniqa.rs/POS/Serbia/Products");
    }

    @Test
    public void loginOnRSDAsBOC () {
        browser.findElement(By.id("Username")).sendKeys("sCoreBOC");
        browser.findElement(By.id("Password")).sendKeys("OvoJ3Test");
        browser.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]")).click();
        Assert.assertEquals(browser.getCurrentUrl(), "https://t-score.uniqa.rs/POS/Serbia/Products");
    }

    @Test
    public void loginOnRSDAsUW () {
        browser.findElement(By.id("Username")).sendKeys("sCoreUW");
        browser.findElement(By.id("Password")).sendKeys("OvoJ3Test");
        browser.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]")).click();
        Assert.assertEquals(browser.getCurrentUrl(), "https://t-score.uniqa.rs/POS/Serbia/Products");
    }

    @Test
    public void loginOnRSDAsKerkez () {
        browser.findElement(By.id("Username")).sendKeys("dkerkez");
        browser.findElement(By.id("Password")).sendKeys("OvoJ3Test");
        browser.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]")).click();
        Assert.assertEquals(browser.getCurrentUrl(), "https://t-score.uniqa.rs/POS/Serbia/Products");
    }

    @Test
    public void loginOnRSDAsKrasic () {
        browser.findElement(By.id("Username")).sendKeys("pkrasic");
        browser.findElement(By.id("Password")).sendKeys("OvoJ3Test");
        browser.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]")).click();
        Assert.assertEquals(browser.getCurrentUrl(), "https://t-score.uniqa.rs/POS/Serbia/Products");
    }

    public void takeScreenshot(String fileName) throws IOException {
        //Timestamp timestamp = new Timestamp();
        File file = ((TakesScreenshot) browser).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("results/screenshots/"+fileName+".png"));

    }
}
