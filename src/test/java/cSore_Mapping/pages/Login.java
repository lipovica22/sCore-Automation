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



    public void setUsername(String username) throws Exception {
        Username.sendKeys(username);
    }

    public void setPassword(String password) throws Exception {
        Password.sendKeys(password);
    }
    public void clickSubmit() throws Exception {
        Submit.click();
    }


}
