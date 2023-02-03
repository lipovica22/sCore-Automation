package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.Login;

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
        takeScreenshot("slika");
    }

    @Test
    @Parameters({"usernameAgent","passwordAgent"})
    public void lifeRS() throws Exception {
        new Login(driver).setUsernameAgent();
        new Login(driver).setPasswordAgent();
        new Login(driver).clickSubmit();
        System.out.println("test");
    }




}
