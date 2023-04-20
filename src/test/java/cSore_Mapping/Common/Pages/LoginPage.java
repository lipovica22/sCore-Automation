package cSore_Mapping.Common.Pages;


import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy (id="Username")
    WebElement username;
    @FindBy (id="Password")
    WebElement password;
    @FindBy (xpath="//button[contains(text(),'Prijava')]")
    WebElement submit;
    @FindBy (id="userFullName")
    WebElement loggedUser;

    //-------------------- Methods --------------------
    public void setUsername(String valueUsername) throws Exception {
        SetValue(username, "Set username", valueUsername);
    }
    public void setPassword(String valuePassword) throws Exception {
        SetValue(password, "Set password", valuePassword);
    }
    public void clickSubmit() throws Exception {
        Click(submit, "Click on Submit button");
    }
    public String LoggedUser() throws IOException {
        //AreEqual(LoggedUser, "Logged message", "sCoreAgent");
        String user = loggedUser.getText();
      return user;
    }

    public void assertUser(String valueAssertUser, SoftAssert softAssert) throws Exception {
        AreEqual(loggedUser, "Assert user status", valueAssertUser, softAssert);
    }

    public void assertUrl(String valueAssertUrl, SoftAssert softAssert) throws Exception {
        AreEqualURL("Assert current URL", valueAssertUrl, softAssert);
    }
   //-------------------- End Methods --------------------
}
