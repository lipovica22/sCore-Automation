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
    WebElement PutnaAsistencija;
    @FindBy (className=".ico_accident")
    WebElement Nezgoda;
    @FindBy (className=".ico_meduniqa")
    WebElement MedUniqa;
    @FindBy (className=".ico_bonusprotekt")
    WebElement BonusPaket;
    @FindBy (className=".ico_kreditpaketi")
    WebElement KreditPaket;


    public void selectPutnaAsistencija() throws Exception {
       PutnaAsistencija.click();
    }
    public void selectNezgoda() throws Exception {
        Nezgoda.click();
    }
    public void selectMedUniqa() throws Exception {
        MedUniqa.click();
    }
    public void selectBonusPaket() throws Exception {
        BonusPaket.click();
    }

    public void selectKreditPaket() throws Exception {
        KreditPaket.click();
    }

    public void selectProizvod(String Proizvod) throws Exception {

        switch (Proizvod) {
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
                break;

        }
    }
}
