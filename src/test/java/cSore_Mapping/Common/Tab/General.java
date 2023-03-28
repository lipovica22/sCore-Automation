package cSore_Mapping.Common.Tab;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    //--------------------- Methods -----------------------
    public void country(String valueCountry) throws Exception {
        SelectValueAC(drzava, "Select Country", valueCountry, valueCountry);
    }
    public void place(String valuePlace) throws Exception {
        SelectValueAC(mesto, "Select place", valuePlace, "11000 Beograd");
    }
    //-------------------- End Methods --------------------
}

