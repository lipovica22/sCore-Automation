package cSore_Mapping.Health.Tab;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class General extends BasePage {

    public General(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/legend")
    WebElement DokumentLabel;
   
    @FindBy(xpath= "//*[@id='form1'/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[1]/div[1]/div/label")   
    WebElement ContractTypeLabel;
    @FindBy(id= "Kol26")   
    WebElement ContractType;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[1]/div[2]/div/label")   
    WebElement DestinationLabel;
    @FindBy(id= "Kol27")   
    WebElement Destination;
    @FindBy(id= "Kol19")   
    WebElement OfferDate;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[2]/div[2]/div/label")   
    WebElement OfferDateLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[2]/div[3]/div/label")   
    WebElement StartOfInsuranceLAbel;
    @FindBy(id= "Kol2")   
    WebElement StartOfInsurance;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[3]/div[2]/div/label")
    WebElement EndOfInsuranceLAbel;
    @FindBy(id= "Kol4")   
    WebElement EndOfInsurance;
    @FindBy(id= "Kol33")   
    WebElement DurationMonths;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[2]/div[6]/div/label")   
    WebElement DurationMonthsLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[2]/div[7]/div/label")   
    WebElement DurationDaysLabel;
    @FindBy(id= "Kol34")   
    WebElement DurationDays;

    @FindBy(css= ".ui-state-active")
    WebElement OfferDateList;
    @FindBy(css= ".ui-state-active")
    WebElement EndOfInsuranceList;
    @FindBy(css= ".ui-state-active")
    WebElement StartOfInsuranceList;

    @FindBy(id= "ContentPlaceHolder1_Kol29_uc_idWucPlaces_tbPlaces")   
    WebElement Places;
    @FindBy(xpath= "//*[@id='place_29']/div/div[2]/div/label")   
    WebElement PlacesLabel;
    @FindBy(id= "ContentPlaceHolder1_Kol29_uc_idWucPlaces_tbStates")   
    WebElement States;
    @FindBy(xpath= "//*[@id='place_29']/div/div[1]/div/label") 
    WebElement StatesLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[8]/fieldset/legend")   
    WebElement PaymentsLabel;
    @FindBy(id= "Kol24")  
    WebElement PaymentDynamic;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[8]/fieldset/div[1]/div/label")   
    WebElement PaymentDynamicLabel;
    @FindBy(id= "Kol22")   
    WebElement Currency;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[8]/fieldset/div[2]/div/label")   
    WebElement CurrencyLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[8]/fieldset/div[3]/div/label")
    WebElement FXClauseLabel;
    @FindBy(id= "Kol23")   
    WebElement FXClause;
    @FindBy(id= "Kol21")   
    WebElement PaymentMethod;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[8]/fieldset/div[4]/div/label")   
    WebElement PaymentMethodLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[8]/fieldset/div[5]/div/label")   
    WebElement BankLabel;
    @FindBy(id= "Kol30")   
    WebElement Bank;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[8]/fieldset/legend")   
    WebElement PodaciOGratisuLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[8]/fieldset/div[1]/div/label")   
    WebElement TipgratisaLabel;
    @FindBy(id= "Kol41")
    WebElement Tipgratisa;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[8]/fieldset/div[3]/div/label")   
    WebElement InterniNalogLabel;
    @FindBy(id= "Kol43")
    WebElement InterniNalog;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[8]/fieldset/div[2]/div/label")   
    WebElement TroskovniCentarLabel;
    @FindBy(id= "Kol42")
    WebElement TroskovniCentar;

    @FindBy(id= "Kol14_61")
    WebElement PopustZaLojalnostBUSPLUS;
    @FindBy(css= "label[for='Kol14_61']")
    WebElement PopustZaLojalnostBUSPLUSLabel;
    @FindBy(id= "Kol14_5")
    WebElement OsiguranjeProfesionalnihVozaca;
    @FindBy(css= "label[for='Kol14_5']")
    WebElement OsiguranjeProfesionalnihVozacaLabel;
    @FindBy(id= "Kol14_34")
    WebElement VodiciIVozaciTuristickihAgencija;
    @FindBy(css= "label[for='Kol14_34']")
    WebElement VodiciIVozaciTuristickihAgencijaLabel;
    @FindBy(id= "Kol14_33")
    WebElement UdruzenjeTransporteraVozaca;
    @FindBy(css= "label[for='Kol14_33']")
    WebElement UdruzenjeTransporteraVozacaLabel;
    @FindBy(id= "Kol14_6")
    WebElement TuristickeAgencijePoUgovoru;
    @FindBy(css= "label[for='Kol14_6']")
    WebElement TuristickeAgencijePoUgovoruLabel;
    @FindBy(id= "Kol14_7")
    WebElement KolektivnoOsiguranjeZaZaposlene;
    @FindBy(css= "label[for='Kol14_7']")
    WebElement KolektivnoOsiguranjeZaZaposleneLabel;
    @FindBy(id= "Kol14_19")
    WebElement ZaposleniKodUniqaKompanija;
    @FindBy(css= "label[for='Kol14_19']")
    WebElement ZaposleniKodUniqaKompanijaLabel;
    @FindBy(id= "Kol14_8")
    WebElement PremijaPoDanu;
    @FindBy(css= "label[for='Kol14_8']")
    WebElement PremijaPoDanuLabel;
    @FindBy(id= "Kol14_20")
    WebElement PoslovnoPutovanje;
    @FindBy(css= "label[for='Kol14_20']")
    WebElement PoslovnoPutovanjeLabel;
    @FindBy(id= "Kol14_21")
    WebElement ZaposleniKodPravnogLica;
    @FindBy(css= "label[for='Kol14_21']")
    WebElement ZaposleniKodPravnogLicaLabel;
    @FindBy(id= "Kol14_30")
    WebElement DokumentKontaktCentra;
    @FindBy(css= "label[for='Kol14_30']")
    WebElement DokumentKontaktCentraLabel;
    @FindBy(id= "Kol14_26")
    WebElement Gratis;
    @FindBy(css= "label[for='Kol14_26']")
    WebElement GratisLabel;
    @FindBy(id= "Kol14_9")
    WebElement PolisaSaTerena;
    @FindBy(css= "label[for='Kol14_9']")
    WebElement PolisaSaTerenaLabel;
    @FindBy(id= "Kol14_35")
    WebElement PolisaBezPoreza;
    @FindBy(css= "label[for='Kol14_35']")
    WebElement PolisaBezPrezaLabel;
    @FindBy(css= "label[for='Kol14_57']")
    WebElement WebShopLabel;
    @FindBy(id= "Kol14_57")
    WebElement WebShopPolisa;


    public void DokumentLabel() throws Exception {

    }
    public void DocumentNumber() throws Exception {

    }
    public void DocumentNumberLabel() throws Exception {

    }
    public void ContractTypeLabel() throws Exception {

    }
    public void contractType(String contract) throws Exception {
        SelectOption(ContractType, "Select contract type", contract);
    }
    public void DestinationLabel() throws Exception {

    }
    public WebElement getDestination() {
        return Destination;
    }
    public void OfferDate() throws Exception {

    }
    public void OfferDateLabel() throws Exception {

    }
    public void StartOfInsuranceLAbel() throws Exception {

    }
    public void StartOfInsurance() throws Exception {

    }
    public void EndOfInsuranceLAbel() throws Exception {

    }
    public void EndOfInsurance() throws Exception {

    }
    public void inputDurationMonths(String meseci) throws Exception {
        DurationMonths.clear();
        DurationMonths.sendKeys(meseci);
    }
    public void DurationMonthsLabel() throws Exception {

    }
    public void DurationDaysLabel() throws Exception {

    }
    public void inputDurationDays(String dani) throws Exception {
        DurationDays.clear();
        DurationDays.sendKeys(dani);
    }

    public void OfferDateList() throws Exception {

    }
    public void EndOfInsuranceList() throws Exception {

    }
    public void StartOfInsuranceList() throws Exception {

    }

    public void Places() throws Exception {

    }
    public void PlacesLabel() throws Exception {

    }
    public void States() throws Exception {

    }
    public void StatesLabel() throws Exception {

    }
    public void PaymentsLabel() throws Exception {

    }
    public void PaymentDynamic() throws Exception {

    }
    public void PaymentDynamicLabel() throws Exception {

    }
    public void Currency() throws Exception {

    }
    public void CurrencyLabel() throws Exception {

    }
    public void FXClauseLabel() throws Exception {

    }
    public void FXClause() throws Exception {

    }
    public WebElement getPaymentMethod()  {
        return PaymentMethod;
    }
    public void PaymentMethodLabel() throws Exception {

    }
    public void BankLabel() throws Exception {

    }
    public void Bank() throws Exception {

    }

    public void PodaciOGratisuLabel() throws Exception {

    }
    public void TipgratisaLabel() throws Exception {

    }
    public void Tipgratisa() throws Exception {

    }
    public void InterniNalogLabel() throws Exception {

    }
    public void InterniNalog() throws Exception {

    }
    public void TroskovniCentarLabel() throws Exception {

    }
    public void TroskovniCentar() throws Exception {

    }

    public void PopustZaLojalnostBUSPLUS() throws Exception {

    }
    public void PopustZaLojalnostBUSPLUSLabel() throws Exception {

    }
    public void OsiguranjeProfesionalnihVozaca() throws Exception {

    }
    public void OsiguranjeProfesionalnihVozacaLabel() throws Exception {

    }
    public void VodiciIVozaciTuristickihAgencija() throws Exception {

    }
    public void VodiciIVozaciTuristickihAgencijaLabel() throws Exception {

    }
    public void UdruzenjeTransporteraVozaca() throws Exception {

    }
    public void UdruzenjeTransporteraVozacaLabel() throws Exception {

    }
    public void TuristickeAgencijePoUgovoru() throws Exception {

    }
    public void TuristickeAgencijePoUgovoruLabel() throws Exception {

    }
    public void KolektivnoOsiguranjeZaZaposlene() throws Exception {

    }
    public void KolektivnoOsiguranjeZaZaposleneLabel() throws Exception {

    }
    public void ZaposleniKodUniqaKompanija() throws Exception {

    }
    public void ZaposleniKodUniqaKompanijaLabel() throws Exception {

    }
    public void PremijaPoDanu() throws Exception {

    }
    public void PremijaPoDanuLabel() throws Exception {

    }
    public void PoslovnoPutovanje() throws Exception {

    }
    public void PoslovnoPutovanjeLabel() throws Exception {

    }
    public void ZaposleniKodPravnogLica() throws Exception {

    }
    public void ZaposleniKodPravnogLicaLabel() throws Exception {

    }
    public void DokumentKontaktCentra() throws Exception {

    }
    public void DokumentKontaktCentraLabel() throws Exception {

    }
    public void Gratis() throws Exception {

    }
    public void GratisLabel() throws Exception {

    }
    public void PolisaSaTerena() throws Exception {

    }
    public void PolisaSaTerenaLabel() throws Exception {

    }
    public void PolisaBezPoreza() throws Exception {

    }
    public void PolisaBezPrezaLabel() throws Exception {

    }
    public void WebShopLabel() throws Exception {

    }
    public void WebShopPolisa() throws Exception {

    }






}
