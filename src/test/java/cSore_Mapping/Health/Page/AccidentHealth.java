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

    @FindBy (css=".ico_travelassistance")
    WebElement putnaAsistencija;
    @FindBy (className=".ico_accident")
    WebElement nezgoda;
    @FindBy (className=".ico_meduniqa")
    WebElement medUniqa;
    @FindBy (className=".ico_bonusprotekt")
    WebElement bonusPaket;
    @FindBy (className=".ico_kreditpaketi")
    WebElement kreditPaket;

    //--------------------- Methods ----------------------
    public void selectPutnaAsistencija() throws Exception {
        Click(putnaAsistencija, "Click on Travel Assistance");
    }
    public void selectNezgoda() throws Exception {
        Click(nezgoda, "Click on Accident");
    }
    public void selectMedUniqa() throws Exception {
        Click(medUniqa, "Click on MedUniqa");
    }
    public void selectBonusPaket() throws Exception {
        Click(bonusPaket, "Click on Bonus Package");
    }

    public void selectKreditPaket() throws Exception {
        Click(kreditPaket, "Click on Credit Package");
    }

    public void selectProizvod(String proizvod) throws Exception {

        switch (proizvod) {
            case "Putna asistencija": {
                selectPutnaAsistencija();
            }
            break;
            case "Nezgoda": {
                selectNezgoda();
            }
            break;
            case "MedUniqa": {
                selectMedUniqa();
            }
            break;
            case "Bonus paket": {
                selectBonusPaket();
            }
            break;
            case "Kredit paket": {
                selectKreditPaket();
            }
            break;
            default:
                throw new Exception("Non-existent product");
        }
    }
    //-------------------- End Methods --------------------
}
