package cSore_Mapping.Life.Tab;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UndewritingPage extends BasePage {
    public UndewritingPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/div[1]/div[1]/div/div/label")
    WebElement approvalLabel;
    @FindBy(id= "Kol1")
    WebElement approval;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/div[1]/div[2]/fieldset/legend")
    WebElement insuredPersonDataLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/div[1]/div[2]/fieldset/div[1]/div[1]/div/label")
    WebElement heightLabel;
    @FindBy(id= "Kol6")
    WebElement height;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/div[1]/div[2]/fieldset/div[1]/div[2]/div/label")
    WebElement weightLabel;
    @FindBy(id= "Kol7")
    WebElement weight;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/div[1]/div[2]/fieldset/div[1]/div[3]/div/label")
    WebElement bmiLabel;
    @FindBy(id= "Kol8")
    WebElement bmi;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/div[1]/div[2]/fieldset/div[1]/div[4]/div/label")
    WebElement sumUnderRiskLabel;
    @FindBy(id= "Kol9")
    WebElement sumUnderRisk;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/div[1]/div[2]/fieldset/div[1]/div[5]/div/label")
    WebElement entryAgeLabel;
    @FindBy(id= "Kol2")
    WebElement entryAge;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/div[1]/div[2]/fieldset/div[2]/div[1]/div/label")
    WebElement personOccupationLabel;
    @FindBy(id= "Kol3")
    WebElement occupation;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/div[1]/div[2]/fieldset/div[2]/div[2]/div/label")
    WebElement personOccupationNotOnTheListLabel;
    @FindBy(id= "Kol4")
    WebElement personOccupationNotOnTheList;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/div[1]/div[2]/fieldset/div[2]/div[3]/div/label")
    WebElement sportLabel;
    @FindBy(id= "Kol5")
    WebElement sport;
    @FindBy(id= "Kol23_1")
    WebElement odobreno;
    @FindBy(css= "label[for='Kol23_1']")
    WebElement odobrenoLabel;
    @FindBy(id= "Kol23_2")
    WebElement potrebnaIzmena;
    @FindBy(css= "label[for='Kol23_2']")
    WebElement potrebnaIzmenaLabel;
    @FindBy(id= "Kol_23_2_txt")
    WebElement napomena;
    @FindBy(id= "Kol23_3")
    WebElement ponudaZaOdbijanje;
    @FindBy(css= "label[for='Kol23_3']")
    WebElement ponudaZaOdbijanjeLabel;
    @FindBy(id= "Kol24")
    WebElement confirmUWApprove;
    @FindBy(id= "ContentPlaceHolder1_ucContainer2")
    WebElement underwriterRisks;
    @FindBy(id= "Kol_12_37_chk")
    WebElement napomenaZaZdravlje;
    @FindBy(id= "Kol_12_37_lbl")
    WebElement napomenaZaZdravljeeLabel;
    @FindBy(id= "Kol_12_37_txt")
    WebElement napomenaZaZdravljeNote;
    @FindBy(id= "Kol_12_38_chk")
    WebElement napomenaZaZanimanje;
    @FindBy(id= "Kol_12_38_lbl")
    WebElement napomenaZaZanimanjeLabel;
    @FindBy(id= "Kol_12_38_txt")
    WebElement napomenaZaZanimanjeNote;
    @FindBy(id= "Kol_12_39_chk")
    WebElement napomenaZaSport;
    @FindBy(id= "Kol_12_39_lbl")
    WebElement napomenaZaSportLabel;
    @FindBy(id= "Kol_12_39_txt")
    WebElement napomenaZaSportNote;
    @FindBy(id= "Kol_12_30_chk")
    WebElement klauzulaIskljucenja;
    @FindBy(id= "Kol_12_30_lbl")
    WebElement klauzulaIskljucenjaLabel;
    @FindBy(id= "Kol_12_30_txt")
    WebElement klauzulaIskljucenjaNote;
    @FindBy(id= "Kol_12_40_chk")
    WebElement napomenaZaFinansije;
    @FindBy(id= "Kol_12_40_lbl")
    WebElement napomenaZaFinansijeLabel;
    @FindBy(id= "Kol_12_40_txt")
    WebElement napomenaZaFinansijeNote;
    @FindBy(id= "Kol10_12")
    WebElement standard;
    @FindBy(css= "label[for='Kol10_12']")
    WebElement standardLabel;
    @FindBy(id= "Kol10_13")
    WebElement dopunskaDokumentacija;
    @FindBy(css= "label[for='Kol10_13']")
    WebElement dopunskaDokumentacijaLabel;
    @FindBy(id= "Kol10_14")
    WebElement korekcija;
    @FindBy(css= "label[for='Kol10_14']")
    WebElement korekcijaLabel;
    @FindBy(id= "Kol10_15")
    WebElement iskljucenje;
    @FindBy(css= "label[for='Kol10_15']")
    WebElement iskljucenjeLabel;
    @FindBy(id= "Kol10_16")
    WebElement odlaganje;
    @FindBy(css= "label[for='Kol10_16']")
    WebElement odlaganjeLabel;
    @FindBy(id= "Kol10_17")
    WebElement odbijanjeUniqa;
    @FindBy(css= "label[for='Kol10_17']")
    WebElement odbijanjeUniqaLabel;
    @FindBy(id= "Kol10_18")
    WebElement obijanjeKlijent;
    @FindBy(css= "label[for='Kol10_18']")
    WebElement obijanjeKlijentLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[15]/fieldset/legend")
    WebElement odlaganjeLabel1;
    @FindBy(id= "DurationMonthValue")
    WebElement trajanje;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/div[1]/div[2]/fieldset/div[2]/div[3]/div/label")
    WebElement trajanjeLabel;
    @FindBy(id= "Kol19")
    WebElement datumOdlaganja;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[15]/fieldset/div[2]/div/label")
    WebElement datumOdlaganjaLabel;

    //--------------------- Methods -----------------------
    public void ApprovalLabel() throws Exception {}
    public void Approval() throws Exception {}
    public void InsuredPersonDataLabel() throws Exception {}
    public void HeightLabel() throws Exception {}
    public void Height() throws Exception {}
    public void WeightLabel() throws Exception {}
    public void Weight() throws Exception {}
    public void BMILabel() throws Exception {}
    public void BMI() throws Exception {}
    public void SumUnderRiskLabel() throws Exception {}
    public void SumUnderRisk() throws Exception {}
    public void EntryAgeLabel() throws Exception {}
    public void EntryAge() throws Exception {}
    public void PersonOccupationLabel() throws Exception {}
    public void Occupation() throws Exception {}
    public void PersonOccupationNotOnTheListLabel() throws Exception {}
    public void PersonOccupationNotOnTheList() throws Exception {}
    public void SportLabel() throws Exception {}
    public void Sport() throws Exception {}
    public void Odobreno() throws Exception {}
    public void OdobrenoLabel() throws Exception {}
    public void PotrebnaIzmena() throws Exception {}
    public void PotrebnaIzmenaLabel() throws Exception {}
    public void Napomena() throws Exception {}
    public void PonudaZaOdbijanje() throws Exception {}
    public void PonudaZaOdbijanjeLabel() throws Exception {}
    public void ConfirmUWApprove() throws Exception {}
    public void UnderwriterRisks() throws Exception {}
    public void NapomenaZaZdravlje() throws Exception {}
    public void NapomenaZaZdravljeeLabel() throws Exception {}
    public void NapomenaZaZdravljeNote() throws Exception {}
    public void NapomenaZaZanimanje() throws Exception {}
    public void NapomenaZaZanimanjeLabel() throws Exception {}
    public void NapomenaZaZanimanjeNote() throws Exception {}
    public void NapomenaZaSport() throws Exception {}
    public void NapomenaZaSportLabel() throws Exception {}
    public void NapomenaZaSportNote() throws Exception {}
    public void KlauzulaIskljucenja() throws Exception {}
    public void KlauzulaIskljucenjaLabel() throws Exception {}
    public void KlauzulaIskljucenjaNote() throws Exception {}
    public void NapomenaZaFinansije() throws Exception {}
    public void NapomenaZaFinansijeLabel() throws Exception {}
    public void NapomenaZaFinansijeNote() throws Exception {}
    public void Standard() throws Exception {}
    public void StandardLabel() throws Exception {}
    public void DopunskaDokumentacija() throws Exception {}
    public void DopunskaDokumentacijaLabel() throws Exception {}
    public void Korekcija() throws Exception {}
    public void KorekcijaLabel() throws Exception {}
    public void Iskljucenje() throws Exception {}
    public void IskljucenjeLabel() throws Exception {}
    public void Odlaganje() throws Exception {}
    public void OdlaganjeLabel() throws Exception {}
    public void OdbijanjeUniqa() throws Exception {}
    public void OdbijanjeUniqaLabel() throws Exception {}
    public void ObijanjeKlijent() throws Exception {}
    public void ObijanjeKlijentLabel() throws Exception {}
    public void OdlaganjeLabel1() throws Exception {}
    public void Trajanje() throws Exception {}
    public void TrajanjeLabel() throws Exception {}
    public void DatumOdlaganja() throws Exception {}
    public void DatumOdlaganjaLabel() throws Exception {}

    //--------------------- End Methods -----------------------
}

