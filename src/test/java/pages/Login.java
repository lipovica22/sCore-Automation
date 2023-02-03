package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BasePage{


    public Login(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy (id="Username")
    WebElement Username;
    @FindBy (id="Password")
    WebElement Password;
    @FindBy (xpath="/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]")
    WebElement Submit;



    public void setUsernameAgent() throws Exception {
        Username.sendKeys("sCoreAgent");
    }

    public void setPasswordAgent() throws Exception {
        Password.sendKeys("OvoJ3Test");
    }
    public void clickSubmit() throws Exception {
        Submit.click();
    }


}
