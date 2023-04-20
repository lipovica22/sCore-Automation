package cSore_Mapping.Health.Page;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccidentHealthPage extends BasePage {
    public AccidentHealthPage(WebDriver driver) {
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

    //--------------------- Methods ----------------------
    public void selectPutnaAsistencija() throws Exception {
        Click(PutnaAsistencija, "Click on Travel Assistance");
    }
    public void selectNezgoda() throws Exception {
        Click(Nezgoda, "Click on Accident");
    }
    public void selectMedUniqa() throws Exception {
        Click(MedUniqa, "Click on MedUniqa");
    }
    public void selectBonusPaket() throws Exception {
        Click(BonusPaket, "Click on Bonus Package");
    }

    public void selectKreditPaket() throws Exception {
        Click(KreditPaket, "Click on Credit Package");
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
