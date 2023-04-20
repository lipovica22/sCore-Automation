package cSore_Mapping.Life.Tab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import cSore_Mapping.BasePage;

public class GeneralPage extends BasePage {
    public GeneralPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[class='spinner_year_3 input lift center ui-spinner-input']")
    WebElement trajanje;
    @FindBy(id = "ContentPlaceHolder1_Kol29_uc_idWucPlaces_tbStates")
    WebElement drzava;
    @FindBy(css = "ul[id='ui-id-1']")
    WebElement drzavaList;
    @FindBy(id = "ContentPlaceHolder1_Kol29_uc_idWucPlaces_tbPlaces")
    WebElement mesto;
    @FindBy(css = "ul[id='ui-id-2']")
    WebElement mestoList;
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
    @FindBy(xpath = "//*[@id='li_Kol14_60']/label")
    WebElement Vinkulation;
    @FindBy(id = "Kol14_60")
    WebElement VinkulationBox;

    //-------------------- Methods --------------------


    public void setTrajanje(String valueTrajanje) throws Exception {
        if (!trajanje.equals("Doživotno")) {
            SetValue(trajanje, "Set duration", valueTrajanje);
        }
    }
    public void selectCountry(String valueCountry) throws Exception {
        SelectValueAC(drzava, drzavaList, "Select country", valueCountry, valueCountry);
    }
    public void selectPlace(String valuePlace, String valueExactlyPlace) throws Exception {
        SelectValueAC(mesto, mestoList, "Select place", valuePlace, valueExactlyPlace);
    }

    public void selectDynamics(String valueDynamics) throws Exception {
        SelectOption(dinamika, "Select dynamics", valueDynamics);
    }

    public void selectCurrency(String valueCurrency) throws Exception {
        if (valuta.isEnabled()) {
            SelectOption(valuta, "Select currency", valueCurrency);
        }
    }

    public void selectCurrencyClause(String valueCurrencyClause) throws Exception {
        SelectOption(valutnaKlauzula, "Select currency clause", valueCurrencyClause);
    }

    public void selectPaymentMethod(String valuePaymentMethod) throws Exception {
        SelectOption(metodPlacanja, "Select payment method", valuePaymentMethod);
    }

    public void selectBank(String valueBank) throws Exception {
        SelectOption(banka, "Select bank", valueBank);
    }

    public void selectChoiceOfDuration(String valueChoiceOfDuration) throws Exception {
        SelectOption(izborDuzineTrajanja, "Select choice of duration", valueChoiceOfDuration);
    }

    public void clickIndexing() throws Exception {
        Click(indeksacija, "Click on indexing");
    }

    public void setIndexValue(String valueIndex) throws Exception {
        SelectOption(vrednostIndeksa, "Set index value", valueIndex);
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
            }
        }

        return url;
    }

    public void setClientInfo() throws Exception {
        SetValue(clientInfo, "Set client info", "Test");
    }
    public void ClickVinculation() throws Exception {
        if (!VinkulationBox.isSelected()) {
            Vinkulation.click();
        }

    }
    public void uNClickVinculation () throws Exception {
        if (VinkulationBox.isSelected()) {
            Vinkulation.click();
        }
    }
    //-------------------- End Methods --------------------
}

