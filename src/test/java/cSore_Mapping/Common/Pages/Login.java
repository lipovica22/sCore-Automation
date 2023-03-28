package cSore_Mapping.Common.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Login extends BasePage {
    public Login(WebDriver driver) {
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

    public void testAssert() throws Exception {
        AreEqual(loggedUser, "Checked user status", "sCoreAgent2");
    }
   //-------------------- End Methods --------------------
}
