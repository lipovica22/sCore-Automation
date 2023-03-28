package cSore_Mapping.Common.Pages;

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
        Click(Life, "Click on Life");
       //Life.click();
    }
    public void clickHousehold() throws Exception {
        Click(Household, "Click on Household");
        //Household.click();
    }
    public void clickMotor() throws Exception {
        Click(Motor, "Click on Motor");
        //Motor.click();
    }
    public void clickAccidentHealth() throws Exception {
        Click(AccidentHealth, "Click on Accident Health");
        //AccidentHealth.click();
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
            case "Nezgoda, putno i zdravstveno":{
                clickAccidentHealth();
            }break;
            default:
                throw new Exception("Non-existent LOB");
        }
    }
}
