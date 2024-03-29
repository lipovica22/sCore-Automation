package cSore_Mapping.Common.Tab;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    //--------------------- Methods -----------------------
    public void selectCountry(String valueCountry) throws Exception {
        SelectValueAC(drzava, drzavaList, "Select Country", valueCountry, valueCountry);
    }

    public void inputDuration(String trajanj){
        trajanje.clear();
        trajanje.sendKeys(trajanj);
    }

    public void selectPlace(String inputPlace, String valuePlace) throws Exception {
        SelectValueAC(mesto, mestoList, "Select place", inputPlace, valuePlace);
    }

    public void selectDinamika(String dinamik) throws Exception {
        SelectOption(dinamika, "Payment dynamic selected", dinamik);
    }

    public void selectValuta(String valut) throws Exception {
        SelectOption(valuta, "Currency selected", valut);
    }

    public void selectValutnaKlauzula(String valutnaKlauzul)throws Exception  {
        SelectOption(valutnaKlauzula, "FXClause selected", valutnaKlauzul);
    }

    public void selectMetodPlacanja(String metodPlacanj)throws Exception  {
        SelectOption(metodPlacanja,"PaymentMethod selected", metodPlacanj);
    }

    public void selectBanka(String bank) throws Exception {
        SelectOption(banka, "Bank selected", bank);
    }


    //-------------------- End Methods --------------------
}

