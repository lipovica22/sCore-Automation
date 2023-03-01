package steps.Login;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.TmsLink;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import tests.BaseTest;

import java.io.IOException;


public class Login extends BaseTest {

    String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
    String quit = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("quit");

    @Severity(SeverityLevel.BLOCKER)

    @Before
    public void setup() throws Exception {
        initialization(browser);
    }

    @After
    public void tearDown() throws IOException {
        takeScreenshot("slika" + System.currentTimeMillis());
        if (quit.equalsIgnoreCase("Yes")) {
            quit();
        }
    }
    @Test(description = "User credential test")
    @Description("User credentials")
    @TmsLink("RS_LI_RK_100.xlsx")
    @Given("login on app RS Test")
    public void loginOnAppRSTest() {
        driver.get("https://t-score.uniqa.rs/POS/Serbia/NoAD");
    }

    @When("enter username {string}")
    public void enterUsername(String username) throws Exception {
        new cSore_Mapping.pages.Login(driver).setUsername(username);
    }

    @And("enter password {string}")
    public void enterPassword(String password) throws Exception {
        new cSore_Mapping.pages.Login(driver).setPassword(password);
    }

    @And("click on Submit button")
    public void clickOnSubmitButton() throws Exception {
        new cSore_Mapping.pages.Login(driver).clickSubmit();
    }

    @Then("Logged in {string}")
    public void loggedIn(String loggedUser) throws Exception {
        Assert.assertEquals(new cSore_Mapping.pages.Login(driver).LoggedUser(),loggedUser);
    }

    @And("page is Products")
    public void pageIsProducts() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://t-score.uniqa.rs/POS/Serbia/Products");
    }

}

