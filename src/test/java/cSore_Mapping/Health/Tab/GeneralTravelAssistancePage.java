package cSore_Mapping.Health.Tab;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.util.Map;

public class GeneralTravelAssistancePage extends BasePage {
    public GeneralTravelAssistancePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/legend")
    WebElement dokumentLabel;
    @FindBy(xpath= "//*[@id='form1'/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[1]/div[1]/div/label")   
    WebElement contractTypeLabel;
    @FindBy(id= "Kol26")   
    WebElement contractType;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[1]/div[2]/div/label")   
    WebElement destinationLabel;
    @FindBy(id= "Kol27")   
    WebElement destination;
    @FindBy(id= "Kol19")   
    WebElement offerDate;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[2]/div[2]/div/label")   
    WebElement offerDateLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[2]/div[3]/div/label")   
    WebElement startOfInsuranceLabel;
    @FindBy(id= "Kol2")   
    WebElement startOfInsurance;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[3]/div[2]/div/label")
    WebElement endOfInsuranceLAbel;
    @FindBy(id= "Kol4")   
    WebElement endOfInsurance;
    @FindBy(id= "Kol33")   
    WebElement durationMonths;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[2]/div[6]/div/label")   
    WebElement durationMonthsLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[2]/div[7]/div/label")   
    WebElement durationDaysLabel;
    @FindBy(id= "Kol34")   
    WebElement durationDays;
    @FindBy(css= ".ui-state-active")
    WebElement offerDateList;
    @FindBy(css= ".ui-state-active")
    WebElement endOfInsuranceList;
    @FindBy(css= ".ui-state-active")
    WebElement startOfInsuranceList;
    @FindBy(id= "ContentPlaceHolder1_Kol29_uc_idWucPlaces_tbPlaces")   
    WebElement places;
    @FindBy(xpath= "//*[@id='place_29']/div/div[2]/div/label")   
    WebElement placesLabel;
    @FindBy(id= "ContentPlaceHolder1_Kol29_uc_idWucPlaces_tbStates")   
    WebElement states;
    @FindBy(xpath= "//*[@id='place_29']/div/div[1]/div/label") 
    WebElement statesLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[8]/fieldset/legend")   
    WebElement paymentsLabel;
    @FindBy(id= "Kol24")  
    WebElement paymentDynamic;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[8]/fieldset/div[1]/div/label")   
    WebElement paymentDynamicLabel;
    @FindBy(id= "Kol22")   
    WebElement currency;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[8]/fieldset/div[2]/div/label")   
    WebElement currencyLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[8]/fieldset/div[3]/div/label")
    WebElement fxClauseLabel;
    @FindBy(id= "Kol23")   
    WebElement fxClause;
    @FindBy(id= "Kol21")   
    WebElement paymentMethod;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[8]/fieldset/div[4]/div/label")   
    WebElement paymentMethodLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[8]/fieldset/div[5]/div/label")   
    WebElement bankLabel;
    @FindBy(id= "Kol30")   
    WebElement bank;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[8]/fieldset/legend")   
    WebElement podaciOGratisuLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[8]/fieldset/div[1]/div/label")   
    WebElement tipGratisaLabel;
    @FindBy(id= "Kol41")
    WebElement tipGratisa;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[8]/fieldset/div[3]/div/label")   
    WebElement interniNalogLabel;
    @FindBy(id= "Kol43")
    WebElement interniNalog;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[8]/fieldset/div[2]/div/label")   
    WebElement troskovniCentarLabel;
    @FindBy(id= "Kol42")
    WebElement troskovniCentar;
    @FindBy(id= "Kol14_61")
    WebElement popustZaLojalnostBUSPLUS;
    @FindBy(css= "label[for='Kol14_61']")
    WebElement popustZaLojalnostBUSPLUSLabel;
    @FindBy(id= "Kol14_5")
    WebElement osiguranjeProfesionalnihVozaca;
    @FindBy(css= "label[for='Kol14_5']")
    WebElement osiguranjeProfesionalnihVozacaLabel;
    @FindBy(id= "Kol14_34")
    WebElement vodiciIVozaciTuristickihAgencija;
    @FindBy(css= "label[for='Kol14_34']")
    WebElement vodiciIVozaciTuristickihAgencijaLabel;
    @FindBy(id= "Kol14_33")
    WebElement udruzenjeTransporteraVozaca;
    @FindBy(css= "label[for='Kol14_33']")
    WebElement udruzenjeTransporteraVozacaLabel;
    @FindBy(id= "Kol14_6")
    WebElement turistickeAgencijePoUgovoru;
    @FindBy(css= "label[for='Kol14_6']")
    WebElement turistickeAgencijePoUgovoruLabel;
    @FindBy(id= "Kol14_7")
    WebElement kolektivnoOsiguranjeZaZaposlene;
    @FindBy(css= "label[for='Kol14_7']")
    WebElement kolektivnoOsiguranjeZaZaposleneLabel;
    @FindBy(id= "Kol14_19")
    WebElement zaposleniKodUniqaKompanija;
    @FindBy(css= "label[for='Kol14_19']")
    WebElement zaposleniKodUniqaKompanijaLabel;
    @FindBy(id= "Kol14_8")
    WebElement premijaPoDanu;
    @FindBy(css= "label[for='Kol14_8']")
    WebElement premijaPoDanuLabel;
    @FindBy(id= "Kol14_20")
    WebElement poslovnoPutovanje;
    @FindBy(css= "label[for='Kol14_20']")
    WebElement poslovnoPutovanjeLabel;
    @FindBy(id= "Kol14_21")
    WebElement zaposleniKodPravnogLica;
    @FindBy(css= "label[for='Kol14_21']")
    WebElement zaposleniKodPravnogLicaLabel;
    @FindBy(id= "Kol14_30")
    WebElement dokumentKontaktCentra;
    @FindBy(css= "label[for='Kol14_30']")
    WebElement dokumentKontaktCentraLabel;
    @FindBy(id= "Kol14_26")
    WebElement gratis;
    @FindBy(css= "label[for='Kol14_26']")
    WebElement gratisLabel;
    @FindBy(id= "Kol14_9")
    WebElement polisaSaTerena;
    @FindBy(css= "label[for='Kol14_9']")
    WebElement polisaSaTerenaLabel;
    @FindBy(id= "Kol14_35")
    WebElement polisaBezPoreza;
    @FindBy(css= "label[for='Kol14_35']")
    WebElement polisaBezPrezaLabel;
    @FindBy(css= "label[for='Kol14_57']")
    WebElement webShopLabel;
    @FindBy(id= "Kol14_57")
    WebElement webShopPolisa;

    //-------------------- Methods --------------------
    public void selectContractType(String contract) throws Exception {
        SelectOption(contractType, "Select contract type", contract);
    }
    public void selectDestination(String valueDestination) throws Exception {
        SelectOption(destination, "Select destination", valueDestination);
    }
    public void setInputDurationMonths(String meseci) throws Exception {
        SetValue(durationMonths, "Set value month", meseci);
    }
    public void setInputDurationDays(String dani) throws Exception {
        SetValue(durationDays, "Set value day", dani);
    }
    public void selectPaymentMethod(String valuePayment) throws Exception {
        SelectOption(paymentMethod, "Select payment", valuePayment);
    }

    public void assertMarks(SoftAssert softAssert, Map<String, String> data) throws Exception {
        //TODO dodati parametar da cita iz excela umesto false
        //Is enabled
        String enabledDiscountBusPlus = String.valueOf(IsEnabled(popustZaLojalnostBUSPLUS, "Is 'Popust za lojalnost BUSPLUS' enabled"));
        AreEqualCheckBox("Assert 'Popust za lojalnost BUSPLUS' enabled", enabledDiscountBusPlus, data.get("DisablePopustBusPlus"), softAssert);

        String enabledBusinessTrip = String.valueOf(IsEnabled(poslovnoPutovanje, "Is 'Poslovno putovanje' enabled"));
        AreEqualCheckBox("Assert 'Poslovno putovanje' enabled", enabledBusinessTrip, data.get("DisablePoslovnoPutovanje"), softAssert);

        String enabledContactCenterDocument = String.valueOf(IsEnabled(dokumentKontaktCentra, "Is 'Dokument Kontakt centra' enabled"));
        AreEqualCheckBox("Assert 'Dokument Kontakt centra' enabled", enabledContactCenterDocument, data.get("DisableDokumentKonCentra"), softAssert);

        String enabledTaxFreePolicy = String.valueOf(IsEnabled(polisaBezPoreza, "Is 'Polisa bez poreza' enabled"));
        AreEqualCheckBox("Assert 'Polisa bez poreza' enabled", enabledTaxFreePolicy, data.get("DisablePolisaBezPoreza"), softAssert);

        String enabledWebShopPolicy = String.valueOf(IsEnabled(webShopPolisa, "Is 'WebShop polisa' enabled"));
        AreEqualCheckBox("Assert 'WebShop polisa' enabled", enabledWebShopPolicy, data.get("DisableWebShop"), softAssert);

        //Is checked
        String checkedDiscountBusPlus = String.valueOf(IsChecked(popustZaLojalnostBUSPLUS, "Is 'Popust za lojalnost BUSPLUS' checked"));
        AreEqualCheckBox("Assert 'Popust za lojalnost BUSPLUS' checked", checkedDiscountBusPlus, data.get("CekiranoPopustBusPlus"), softAssert);

        String checkedEmployeesOfUniqaCompanies = String.valueOf(IsChecked(zaposleniKodUniqaKompanija, "Is 'Zaposleni kod Uniqa kompanija ili partnera od posebnog značaja' checked"));
        AreEqualCheckBox("Assert 'Zaposleni kod Uniqa kompanija ili partnera od posebnog značaja' checked", checkedEmployeesOfUniqaCompanies, data.get("CekiranoZapolseniUniqa"), softAssert);

        String checkedBusinessTrip = String.valueOf(IsChecked(poslovnoPutovanje, "Is 'Poslovno putovanje' checked"));
        AreEqualCheckBox("Assert 'Poslovno putovanje' checked", checkedBusinessTrip, data.get("CekiranoPoslovnoPutovanje"), softAssert);

        String checkedEmployeesOfLegalEntity = String.valueOf(IsChecked(zaposleniKodPravnogLica, "Is 'Zaposleni kod pravnog lica sa kojim postoji ugovor o poslovnoj saradnji' checked"));
        AreEqualCheckBox("Assert 'Zaposleni kod pravnog lica sa kojim postoji ugovor o poslovnoj saradnji' checked", checkedEmployeesOfLegalEntity, data.get("CekiranoZaposleniPravnoLice"), softAssert);

        String checkedContactCenterDocument = String.valueOf(IsChecked(dokumentKontaktCentra, "Is 'Dokument Kontakt centra' checked"));
        AreEqualCheckBox("Assert 'Dokument Kontakt centra' checked", checkedContactCenterDocument, data.get("CekiranoDokumentKonCentra"), softAssert);

        String checkedTaxFreePolicy = String.valueOf(IsChecked(polisaBezPoreza, "Is 'Polisa bez poreza' checked"));
        AreEqualCheckBox("Assert 'Polisa bez poreza' checked", checkedTaxFreePolicy, data.get("CekiranoPolisaBezPoreza"), softAssert);

        String checkedWebShopPolicy = String.valueOf(IsChecked(webShopPolisa, "Is 'WebShop polisa' checked"));
        AreEqualCheckBox("Assert 'WebShop polisa' checked", checkedWebShopPolicy, data.get("CekiranoWebShop"), softAssert);
    }
    //-------------------- End Methods --------------------
}
