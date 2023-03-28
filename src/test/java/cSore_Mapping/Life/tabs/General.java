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
    WebElement trajanje;
    @FindBy(id = "ContentPlaceHolder1_Kol29_uc_idWucPlaces_tbStates")
    WebElement drzava;
    @FindBy(id = "ContentPlaceHolder1_Kol29_uc_idWucPlaces_tbPlaces")
    WebElement mesto;
    @FindBy(id = "Kol24")
    WebElement dinamika;
    @FindBy(id = "Kol22")
    WebElement valuta;
    @FindBy(id = "Kol23")
    WebElement valutnaKlauzula;
    @FindBy(id = "Kol21")
    WebElement metodPlacanja;
    @FindBy(id = "Kol30")
    WebElement banka;
    @FindBy(id = "li_Kol14_90")
    WebElement indeksacija;
    @FindBy(id = "Kol62")
    WebElement vrednostIndeksa;
    @FindBy(id = "Kol17")
    WebElement clientInfo;
    @FindBy(id = "Kol51")
    WebElement izborDuzineTrajanja;

    public void setTrajanje(String valueTrajanje) throws Exception {
        if (!trajanje.equals("Doživotno")) {
            trajanje.clear();
            trajanje.sendKeys(valueTrajanje);
        }

    }
    public WebElement getDrzava() {

        return drzava;
    }
    public WebElement getMesto() {

        return mesto;
    }

    public WebElement getDinamika() {

        return dinamika;
    }

    public WebElement getValuta() {

        return valuta;
    }

    public WebElement getValutnaKlauzula() {

        return valutnaKlauzula;
    }

    public WebElement getMetodPlacanja() {

        return metodPlacanja;
    }

    public WebElement getBanka() {
        return banka;
    }

    public WebElement IzborDuzineTrajanja() {

        return izborDuzineTrajanja;
    }

    public void checkIndeksacija() throws Exception {
        indeksacija.click();
    }

    public void selectVrednostIndeksa(String valueVrednostIndeksa) throws Exception {
        vrednostIndeksa.sendKeys(valueVrednostIndeksa);
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
        clientInfo.sendKeys("Test");
    }
}

