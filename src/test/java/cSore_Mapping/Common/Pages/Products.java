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
    WebElement life;
    @FindBy (className="ico_property")
    WebElement household;
    @FindBy (className="ico_accidenthealth")
    WebElement accidentHealth;
    @FindBy (className="ico_motor")
    WebElement motor;

    //-------------------- Methods --------------------
    public void clickLife() throws Exception {
        Click(life, "Click on Life");
    }
    public void clickHousehold() throws Exception {
        Click(household, "Click on Household");
    }
    public void clickMotor() throws Exception {
        Click(motor, "Click on Motor");
    }
    public void clickAccidentHealth() throws Exception {
        Click(accidentHealth, "Click on Accident Health");
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
    //-------------------- End Methods --------------------
}
