package cSore_Mapping.pages;

import cSore_Mapping.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products extends BasePage {


    public Products(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy (className="ico_life")
    WebElement Life;
    @FindBy (className="ico_property")
    WebElement Household;
    @FindBy (className="ico_accidenthealth")
    WebElement AccidentHealth;
    @FindBy (className="ico_motor")
    WebElement Motor;


    public void clickLife() throws Exception {
       Life.click();
    }
    public void clickHousehold() throws Exception {
        Household.click();
    }
    public void clickMotor() throws Exception {
        Motor.click();
    }
    public void clickAccidentHealth() throws Exception {
        AccidentHealth.click();
    }
    public void selectLob(String LOB) throws Exception {

        switch (LOB){
            case "Život":{
                clickLife();
            }break;
            case "Imovina":{
                clickHousehold();
            }break;
            case "Kasko":{
                clickMotor();
            }break;
            case "Health":{
                clickAccidentHealth();
            }break;
            default:
                break;
        }
    }

}
