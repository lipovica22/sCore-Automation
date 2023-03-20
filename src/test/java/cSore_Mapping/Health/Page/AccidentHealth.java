package cSore_Mapping.Health.Page;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccidentHealth extends BasePage {


    public AccidentHealth(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy (className="ico_travelassistance")
    WebElement PutnaAsistencija;
    @FindBy (className="ico_accident")
    WebElement Nezgoda;
    @FindBy (className="ico_meduniqa")
    WebElement MedUniqa;
    @FindBy (className="ico_bonusprotekt")
    WebElement BonusPaket;
    @FindBy (className="ico_kreditpaketi")
    WebElement KreditPaket;


    public void clickPutnaAsistencija() throws Exception {
       PutnaAsistencija.click();
    }
    public void clickNezgoda() throws Exception {
        Nezgoda.click();
    }
    public void clickMedUniqa() throws Exception {
        MedUniqa.click();
    }
    public void clickBonusPaket() throws Exception {
        BonusPaket.click();
    }

    public void clickKreditPaket() throws Exception {
        KreditPaket.click();
    }


}
