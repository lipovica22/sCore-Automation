package tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import cSore_Mapping.pages.Login;
import cSore_Mapping.pages.Products;
import cSore_Mapping.views.Kasko;

import java.io.IOException;

public class sCoreRS extends BaseTest {

    @BeforeMethod
    @Parameters({"browser","env"})
    public void setup(String browser, String env) throws Exception{
        initialization(browser);
        openApp(env);
    }


    @AfterMethod
    @Parameters({"quit"})
    public void tearDown (String quit) throws IOException {
        takeScreenshot("slika" + System.currentTimeMillis());
        if (quit.equalsIgnoreCase("Yes")) {
           quit();
        }
    }

    @Test
    @Parameters({"usernameAgent","passwordAgent"})
    @Description("Login")
    public void loginAgentBA() throws Exception {
        //new Login(driver).setUsernameAgent();
        //new Login(driver).setPasswordAgent();
        new Login(driver).clickSubmit();
        Assert.assertEquals(driver.getCurrentUrl(), "https://t-unba-iis.uniqa.ba/POS/BosniaAndHerzegovina/Products");
    }
    @Test
    @Description("Klik na Morotna vozila")
    public void clickOnMotor() throws Exception {
        new Products(driver).clickMotor();
        Assert.assertEquals(driver.getCurrentUrl(), "https://t-unba-iis.uniqa.ba/POS/BosniaAndHerzegovina/Motor");
    }
    @Test
    @Description("Klik na Kasko")
    public void clickOnKasko() throws Exception {
        new Kasko(driver).clickKasko();
        Assert.assertEquals(driver.getCurrentUrl(), "https://t-unba-iis.uniqa.ba/POS/BosniaAndHerzegovina/Motor/Casco/InfoOffer/New/General");
    }


}
