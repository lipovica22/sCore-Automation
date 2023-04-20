package tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import cSore_Mapping.Common.Pages.LoginPage;

import java.io.IOException;

public class TestLoginPage extends BaseTest{

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
    @Description("Login")
    public void login() throws Exception {
        new LoginPage(driver).setUsername("sCoreAgent");
        new LoginPage(driver).setPassword("OvoJ3Test");
        new LoginPage(driver).clickSubmit();
        Assert.assertEquals(driver.getCurrentUrl(), "https://t-score.uniqa.rs/POS/Serbia/Products");
    }




}
