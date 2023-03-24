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


    public WebElement getDrzava() {
        return Drzava;
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


}

