package cSore_Mapping.NonLife.View;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KaskoPage extends BasePage {
    public KaskoPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy (className="ico_casco")
    WebElement kasko;

    //-------------------- Methods --------------------
    public void clickKasko() throws Exception {
       kasko.click();
    }
    //-------------------- End Methods --------------------

}
