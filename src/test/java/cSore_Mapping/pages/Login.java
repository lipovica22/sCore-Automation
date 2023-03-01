package cSore_Mapping.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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


    public void setUsername(String username)  {
        Username.sendKeys(username);
    }

    public void setPassword(String password)  {
        Password.sendKeys(password);
    }
    public void clickSubmit()  {
        Submit.click();
    }
    public String LoggedUser() {
        String user = LoggedUser.getText();
      return user;
    }

}
