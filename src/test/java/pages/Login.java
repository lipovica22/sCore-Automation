package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Login extends BasePage{


    public Login(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
}
