package cSore_Mapping.Life.tabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import cSore_Mapping.Common.Pages.BasePage;

public class General extends BasePage {


    public General(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[class='spinner_year_3 input lift center ui-spinner-input']")
    WebElement Trajanje;
    @FindBy(id = "ContentPlaceHolder1_Kol29_uc_idWucPlaces_tbStates")
    WebElement Drzava;
    @FindBy(id = "ContentPlaceHolder1_Kol29_uc_idWucPlaces_tbPlaces")
    WebElement Mesto;
    @FindBy(id = "Kol24")
    WebElement Dinamika;
    @FindBy(id = "Kol22")
    WebElement Valuta;
    @FindBy(id = "Kol23")
    WebElement ValutnaKlauzula;
    @FindBy(id = "Kol21")
    WebElement MetodPlacanja;
    @FindBy(id = "Kol30")
    WebElement Banka;
    @FindBy(id = "li_Kol14_90")
    WebElement Indeksacija;
    @FindBy(id = "Kol62")
    WebElement VrednostIndeksa;
    @FindBy(id = "Kol17")
    WebElement ClientInfo;
    @FindBy(id = "Kol51")
    WebElement IzborDuzineTrajanja;

    public void setTrajanje(String trajanje) throws Exception {
        if (!trajanje.equals("Doživotno")) {
            Trajanje.clear();
            Trajanje.sendKeys(trajanje);
        }

    }

    public WebElement getMesto() {
        return Mesto;
    }

    public WebElement getDinamika() {
        return Dinamika;
    }

    public WebElement getValuta() {
        return Valuta;
    }

    public WebElement getValutnaKlauzula() {
        return ValutnaKlauzula;
    }

    public WebElement getMetodPlacanja() {
        return MetodPlacanja;
    }

    public WebElement getBanka() {
        return Banka;
    }

    public WebElement IzborDuzineTrajanja() {
        return IzborDuzineTrajanja;
    }

    public void checkIndeksacija() throws Exception {
        Indeksacija.click();
    }

    public void selectVrednostIndeksa(String vrednostIndeksa) throws Exception {
        VrednostIndeksa.sendKeys(vrednostIndeksa);
    }

    public String url(String proizvod, String vrstaDokumenta) {
        String url = null;
        if (vrstaDokumenta.equals("Novi ugovor")) {
            switch (proizvod) {
                case "Doživotni riziko": {
                    url = "https://t-score.uniqa.rs/POS/Serbia/Life/DozivotniRiziko/NewContract/New/General";
                }
                break;
                case "Favorit": {
                    url = "https://t-score.uniqa.rs/POS/Serbia/Life/FavoritPremium/NewContract/New/General";
                }
                break;
                case "Riziko kredit": {
                    url = "https://t-score.uniqa.rs/POS/Serbia/Life/RizikoKredit/NewContract/New/General";
                }
                break;
                case "Joker": {
                    url = "https://t-score.uniqa.rs/POS/Serbia/Life/JokerPremium/NewContract/New/General";
                }
                break;
                case "Spektar": {
                    url = "https://t-score.uniqa.rs/POS/Serbia/Life/SpektarPremium/NewContract/New/General";
                }
                break;
                case "Riziko Mix": {
                    url = "https://t-score.uniqa.rs/POS/Serbia/Life/Mozaik/NewContract/New/General";
                }
                break;
                case "Riziko": {
                    url = "https://t-score.uniqa.rs/POS/Serbia/Life/Riziko/NewContract/New/General";
                }
                break;
                default:
                    break;
            }
        } else {
            switch (proizvod) {
                case "Doživotni riziko": {
                    url = "https://t-score.uniqa.rs/POS/Serbia/Life/DozivotniRiziko/InfoOffer/New/General";
                }
                break;
                case "Favorit": {
                    url = "https://t-score.uniqa.rs/POS/Serbia/Life/FavoritPremium/InfoOffer/New/General";
                }
                break;
                case "Riziko kredit": {
                    url = "https://t-score.uniqa.rs/POS/Serbia/Life/RizikoKredit/InfoOffer/New/General";
                }
                break;
                case "Joker": {
                    url = "https://t-score.uniqa.rs/POS/Serbia/Life/JokerPremium/InfoOffer/New/General";
                }
                break;
                case "Spektar": {
                    url = "https://t-score.uniqa.rs/POS/Serbia/Life/SpektarPremium/InfoOffer/New/General";
                }
                break;
                case "Riziko Mix": {
                    url = "https://t-score.uniqa.rs/POS/Serbia/Life/Mozaik/InfoOffer/New/General";
                }
                break;
                case "Riziko": {
                    url = "https://t-score.uniqa.rs/POS/Serbia/Life/Riziko/InfoOffer/New/General";
                }
                break;
                default:
                    break;
            }
        }
        return url;
    }

    public void inputClientInfo() {
        ClientInfo.sendKeys("Test");
    }

}

