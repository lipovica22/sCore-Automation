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
    WebElement Username;
    @FindBy (id="Password")
    WebElement Password;
    @FindBy (xpath="//button[contains(text(),'Prijava')]")
    WebElement Submit;

    @FindBy (id="userFullName")
    WebElement LoggedUser;


    public void setUsername(String username) throws Exception {
        SetValue(Username, "Set username", username);
        //Username.sendKeys(username);
    }

    public void setPassword(String password) throws Exception {
        SetValue(Password, "Set password", password);
        //Password.sendKeys(password);
    }
    public void clickSubmit() throws Exception {
        Click(Submit, "Click on Submit button");
        //Submit.click();
    }
    public String LoggedUser() throws IOException {
        //AreEqual(LoggedUser, "Logged message", "sCoreAgent");
        String user = LoggedUser.getText();
      return user;
    }

}
