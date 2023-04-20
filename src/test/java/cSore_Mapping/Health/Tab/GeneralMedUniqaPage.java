package cSore_Mapping.Health.Tab;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralMedUniqaPage extends BasePage {

    public GeneralMedUniqaPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/legend")
    WebElement DocumentsLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[2]/div/div/label")
    WebElement ClientInfoLabel;
    @FindBy(id= "Kol17")
    WebElement ClientInfo;
    @FindBy(id= "Kol19")
    WebElement StartOfInsurance;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[2]/div[2]/div/label")
    WebElement StartOfInsuranceLabel;
    @FindBy(id= "Kol2")
    WebElement DateStart;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[2]/div[3]/div/label")
    WebElement DateStartLabel;
    @FindBy(className= "ui-state-active")
    WebElement DateStartList;

    @FindBy(xpath= "//*[@id='ContentPlaceHolder1_ucContainer1']/div[1]/label")
    WebElement DurationLabel;
    @FindBy(css= "input[class='spinner_year_3 input lift center ui-spinner-input']")
    WebElement DurationGod;
    @FindBy(xpath= "//*[@id='counters_holder']/div[1]/div/span[1]")
    WebElement DurationGodLabel;
    @FindBy(xpath= "//*[@id='counters_holder']/div[2]/div/span[1]")
    WebElement DurationMesLabel;
    @FindBy(id= "DurationMonthValue")
    WebElement DurationMes;
    @FindBy(xpath= "//*[@id='counters_holder']/div[3]/div/span[1]")
    WebElement DurationDanLabel;
    @FindBy(xpath= "///*[@id='counters_holder']/div[3]/div/span[2]/input")
    WebElement DurationDan;
    @FindBy(css= "label[for='Kol18']")
    WebElement UnlimitedDurationLabel;
    @FindBy(id= "Kol18")
    WebElement UnlimitedDuration;
    @FindBy(id= "Kol4")
    WebElement DateEnd;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[3]/div[2]/div/label")
    WebElement DateEndLabel;
    @FindBy(className= "ui-state-active")
    WebElement DateEndList;
    @FindBy(xpath= "//*[@id='place_29']/div/div[1]/div/label")
    WebElement StatesLabel;
    @FindBy(id= "ContentPlaceHolder1_Kol29_uc_idWucPlaces_tbStates")
    WebElement States;
    @FindBy(id= "ContentPlaceHolder1_Kol29_uc_idWucPlaces_tbPlaces")
    WebElement Places;
    @FindBy(xpath= "//*[@id='place_29']/div/div[2]/div/label")
    WebElement PlacesLabel;
    @FindBy(id= "Kol12")
    WebElement CalculationMethod;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[4]/div[1]/div/label")
    WebElement CalculationMethodLabel;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[5]/fieldset/legend")
    WebElement ZdravstvenoOsiguranjeLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[5]/fieldset/div[2]/div/label")
    WebElement VrstaTarifeLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[5]/fieldset/div[1]/div/label")
    WebElement TarifaLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[5]/fieldset/div[3]/div/label")
    WebElement NacinObracunaPremijeLabel;
    @FindBy(id= "Kol35")
    WebElement Tarifa;
    @FindBy(id= "Kol36")
    WebElement VrstaTarife;
    @FindBy(id= "Kol37")
    WebElement NačinObračunaPremije;
    @FindBy(id= "Kol38")
    WebElement ContractedAge;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[8]/fieldset/legend")
    WebElement PaymentsLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[8]/fieldset/div[1]/div/label")
    WebElement PaymentDynamicLabel;
    @FindBy(id= "Kol24")
    WebElement PaymentDynamic;
    @FindBy(id= "Kol22")
    WebElement Currency;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[8]/fieldset/div[2]/div/label")
    WebElement CurrencyLabel;
    @FindBy(id= "Kol23")
    WebElement FXClause;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[8]/fieldset/div[3]/div/label")
    WebElement FXClauseLabel;
    @FindBy(id= "Kol21")
    WebElement PaymentMethod;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[8]/fieldset/div[4]/div/label")
    WebElement PaymentMethodLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[8]/fieldset/div[5]/div/label")
    WebElement BankLabel;
    @FindBy(id= "Kol30")
    WebElement Bank;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[11]/div/div/label")
    WebElement NoteLabel;
    @FindBy(id= "Kol7")
    WebElement Note;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/fieldset/legend")
    WebElement DocumentCalculationLabel;
    @FindBy(id= "Kol9")
    WebElement IssuingDate;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/fieldset/div[1]/div/div[1]/div/label")
    WebElement IssuingDateLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/fieldset/div[1]/div/div[2]/div/label")
    WebElement PeriodFromLabel;
    @FindBy(id= "Kol10")
    WebElement PeriodFrom;
    @FindBy(id= "Kol11")
    WebElement PeriodTo;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/fieldset/div[1]/div/div[3]/div/label")
    WebElement PeriodToLabel;

    @FindBy(id= "Kol14_62")
    WebElement OsiguranjeClanovaPorodice;
    @FindBy(css= "label[for='Kol14_62']")
    WebElement OsiguranjeClanovaPorodiceLabel;
    @FindBy(id= "Kol14_26")
    WebElement Gratis;
    @FindBy(css= "label[for='Kol14_26']")
    WebElement GratisLabel;
    @FindBy(css= "label[for='Kol14_67']")
    WebElement KoriscenjeUzRefundacijuLabel;
    @FindBy(id= "Kol14_67")
    WebElement KoriscenjeUzRefundaciju;
    @FindBy(id= "Kol14_1")
    WebElement ZaZaposlene;
    @FindBy(css= "label[for='Kol14_1']")
    WebElement ZaZaposleneLabel;
    @FindBy(id= "Kol14_80")
    WebElement OtvorenaPolisa;
    @FindBy(css= "label[for='Kol14_80']")
    WebElement OtvorenaPolisaLabel;
    @FindBy(css= "label[for='Kol14_97']")
    WebElement ObnovaIzIWALabel;
    @FindBy(id= "Kol14_97")
    WebElement ObnovaIzIWA;
    @FindBy(id= "Kol14_117")
    WebElement PolisaZaKontraktore;
    @FindBy(css= "label[for='Kol14_117']")
    WebElement PolisaZaKontraktoreLabel;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/fieldset/legend")
    WebElement OfferDateAnexLabel;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/fieldset/div[1]/div/div[1]/div/label")
    WebElement IssuingDateAnexLabel;
    @FindBy(id= "Kol9")
    WebElement IssuingDateAnex;
    @FindBy(className= "ui-state-active")
    WebElement IssuingDateAnexList;

    @FindBy(className =  "ui-state-active")
    WebElement PeriodFromList;

    @FindBy(id= "Kol48")
    WebElement PredefinedNotes;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/fieldset/div[2]/div/div/label")
    WebElement NoteALabel;
    @FindBy(id= "Kol16")
    WebElement NoteA;

    public void DocumentsLabel() throws Exception {}
    public void ClientInfoLabel() throws Exception {}
    public void ClientInfo() throws Exception {}
    public void StartOfInsurance() throws Exception {}
    public void StartOfInsuranceLabel() throws Exception {}
    public void DateStart() throws Exception {}
    public void DateStartLabel() throws Exception {}
    public void DateStartList() throws Exception {}

    public void DurationLabel() throws Exception {}
    public void DurationGod() throws Exception {}
    public void DurationGodLabel() throws Exception {}
    public void DurationMesLabel() throws Exception {}
    public void DurationMes() throws Exception {}
    public void DurationDanLabel() throws Exception {}
    public void DurationDan() throws Exception {}
    public void UnlimitedDurationLabel() throws Exception {}
    public void UnlimitedDuration() throws Exception {}

    public void DateEnd() throws Exception {}
    public void DateEndLabel() throws Exception {}
    public void DateEndList() throws Exception {}
    public void StatesLabel() throws Exception {}
    public void States() throws Exception {}
    public void Places() throws Exception {}
    public void PlacesLabel() throws Exception {}
    public void CalculationMethod() throws Exception {}
    public void CalculationMethodLabel() throws Exception {}

    public void ZdravstvenoOsiguranjeLabel() throws Exception {}
    public void VrstaTarifeLabel() throws Exception {}
    public void TarifaLabel() throws Exception {}
    public void NacinObracunaPremijeLabel() throws Exception {}
    public void selectTariff(String tariff) throws Exception {
        SelectOption(Tarifa,"Select tariff",tariff);
    }
    public void selectTariffType(String tariffType) throws Exception {
        SelectOption(VrstaTarife,"Select tariff",tariffType);
    }
    public void selectPremiumCalculatonMethod(String nop) throws Exception {
        SelectOption(VrstaTarife,"Select tariff",nop);
    }
    public void ContractedAge() throws Exception {}
    public void PaymentsLabel() throws Exception {}
    public void PaymentDynamicLabel() throws Exception {}
    public void PaymentDynamic() throws Exception {}
    public void Currency() throws Exception {}
    public void CurrencyLabel() throws Exception {}
    public void FXClause() throws Exception {}
    public void FXClauseLabel() throws Exception {}
    public void PaymentMethod() throws Exception {}
    public void PaymentMethodLabel() throws Exception {}
    public void BankLabel() throws Exception {}
    public void Bank() throws Exception {}
    public void NoteLabel() throws Exception {}
    public void Note() throws Exception {}

    public void DocumentCalculationLabel() throws Exception {}
    public void IssuingDate() throws Exception {}
    public void IssuingDateLabel() throws Exception {}


    public void OsiguranjeClanovaPorodice() throws Exception {}
    public void OsiguranjeClanovaPorodiceLabel() throws Exception {}
    public void Gratis() throws Exception {}
    public void GratisLabel() throws Exception {}
    public void KoriscenjeUzRefundacijuLabel() throws Exception {}
    public void KoriscenjeUzRefundaciju() throws Exception {}
    public void ZaZaposlene() throws Exception {}
    public void ZaZaposleneLabel() throws Exception {}
    public void OtvorenaPolisa() throws Exception {}
    public void OtvorenaPolisaLabel() throws Exception {}
    public void ObnovaIzIWALabel() throws Exception {}
    public void ObnovaIzIWA() throws Exception {}
    public void PolisaZaKontraktore() throws Exception {}
    public void PolisaZaKontraktoreLabel() throws Exception {}

    public void OfferDateAnexLabel() throws Exception {}

    public void IssuingDateAnexLabel() throws Exception {}
    public void IssuingDateAnex() throws Exception {}
    public void IssuingDateAnexList() throws Exception {}

    public void PeriodFromLabel() throws Exception {}
    public void PeriodFromList() throws Exception {}
    public void PeriodFrom() throws Exception {}

    public void PeriodToLabel() throws Exception {}
    public void PeriodTo() throws Exception {}
    public void PredefinedNotes() throws Exception {}
    public void NoteALabel() throws Exception {}
    public void NoteA() throws Exception {}




}
