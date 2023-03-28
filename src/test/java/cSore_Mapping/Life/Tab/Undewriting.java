package cSore_Mapping.Life.Tab;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Undewriting extends BasePage {


    public Undewriting(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/div[1]/div[1]/div/div/label")   WebElement ApprovalLabel;
    @FindBy(id= "Kol1")
    WebElement Approval;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/div[1]/div[2]/fieldset/legend")   WebElement InsuredPersonDataLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/div[1]/div[2]/fieldset/div[1]/div[1]/div/label")   WebElement HeightLabel;
    @FindBy(id= "Kol6")   WebElement Height;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/div[1]/div[2]/fieldset/div[1]/div[2]/div/label")   WebElement WeightLabel;
    @FindBy(id= "Kol7")   WebElement Weight;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/div[1]/div[2]/fieldset/div[1]/div[3]/div/label")   WebElement BMILabel;
    @FindBy(id= "Kol8")   WebElement BMI;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/div[1]/div[2]/fieldset/div[1]/div[4]/div/label")   WebElement SumUnderRiskLabel;
    @FindBy(id= "Kol9")   WebElement SumUnderRisk;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/div[1]/div[2]/fieldset/div[1]/div[5]/div/label")   WebElement EntryAgeLabel;
    @FindBy(id= "Kol2")   WebElement EntryAge;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/div[1]/div[2]/fieldset/div[2]/div[1]/div/label")   WebElement PersonOccupationLabel;
    @FindBy(id= "Kol3")   WebElement Occupation;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/div[1]/div[2]/fieldset/div[2]/div[2]/div/label")   WebElement PersonOccupationNotOnTheListLabel;
    @FindBy(id= "Kol4")   WebElement PersonOccupationNotOnTheList;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/div[1]/div[2]/fieldset/div[2]/div[3]/div/label")   WebElement SportLabel;
    @FindBy(id= "Kol5")   WebElement Sport;

    @FindBy(id= "Kol23_1")   WebElement Odobreno;
    @FindBy(css= "label[for='Kol23_1']")   WebElement OdobrenoLabel;
    @FindBy(id= "Kol23_2")   WebElement PotrebnaIzmena;
    @FindBy(css= "label[for='Kol23_2']")   WebElement PotrebnaIzmenaLabel;
    @FindBy(id= "Kol_23_2_txt")   WebElement Napomena;
    @FindBy(id= "Kol23_3")   WebElement PonudaZaOdbijanje;
    @FindBy(css= "label[for='Kol23_3']")   WebElement PonudaZaOdbijanjeLabel;
    @FindBy(id= "Kol24")   WebElement ConfirmUWApprove;

    @FindBy(id= "ContentPlaceHolder1_ucContainer2")   WebElement UnderwriterRisks;

    @FindBy(id= "Kol_12_37_chk")   WebElement NapomenaZaZdravlje;
    @FindBy(id= "Kol_12_37_lbl")   WebElement NapomenaZaZdravljeeLabel;
    @FindBy(id= "Kol_12_37_txt")   WebElement NapomenaZaZdravljeNote;

    @FindBy(id= "Kol_12_38_chk")   WebElement NapomenaZaZanimanje;
    @FindBy(id= "Kol_12_38_lbl")   WebElement NapomenaZaZanimanjeLabel;
    @FindBy(id= "Kol_12_38_txt")   WebElement NapomenaZaZanimanjeNote;

    @FindBy(id= "Kol_12_39_chk")   WebElement NapomenaZaSport;
    @FindBy(id= "Kol_12_39_lbl")   WebElement NapomenaZaSportLabel;
    @FindBy(id= "Kol_12_39_txt")   WebElement NapomenaZaSportNote;

    @FindBy(id= "Kol_12_30_chk")   WebElement KlauzulaIskljucenja;
    @FindBy(id= "Kol_12_30_lbl")   WebElement KlauzulaIskljucenjaLabel;
    @FindBy(id= "Kol_12_30_txt")   WebElement KlauzulaIskljucenjaNote;

    @FindBy(id= "Kol_12_40_chk")   WebElement NapomenaZaFinansije;
    @FindBy(id= "Kol_12_40_lbl")   WebElement NapomenaZaFinansijeLabel;
    @FindBy(id= "Kol_12_40_txt")   WebElement NapomenaZaFinansijeNote;

    @FindBy(id= "Kol10_12")   WebElement Standard;
    @FindBy(css= "label[for='Kol10_12']")   WebElement StandardLabel;
    @FindBy(id= "Kol10_13")   WebElement DopunskaDokumentacija;
    @FindBy(css= "label[for='Kol10_13']")   WebElement DopunskaDokumentacijaLabel;
    @FindBy(id= "Kol10_14")   WebElement Korekcija;
    @FindBy(css= "label[for='Kol10_14']")   WebElement KorekcijaLabel;
    @FindBy(id= "Kol10_15")   WebElement Iskljucenje;
    @FindBy(css= "label[for='Kol10_15']")   WebElement IskljucenjeLabel;
    @FindBy(id= "Kol10_16")   WebElement Odlaganje;
    @FindBy(css= "label[for='Kol10_16']")   WebElement OdlaganjeLabel;
    @FindBy(id= "Kol10_17")   WebElement OdbijanjeUniqa;
    @FindBy(css= "label[for='Kol10_17']")   WebElement OdbijanjeUniqaLabel;
    @FindBy(id= "Kol10_18")   WebElement ObijanjeKlijent;
    @FindBy(css= "label[for='Kol10_18']")   WebElement ObijanjeKlijentLabel;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[15]/fieldset/legend")   WebElement OdlaganjeLabel1;
    @FindBy(id= "DurationMonthValue")   WebElement Trajanje;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/div[1]/div[2]/fieldset/div[2]/div[3]/div/label")   WebElement TrajanjeLabel;
    @FindBy(id= "Kol19")   WebElement DatumOdlaganja;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[15]/fieldset/div[2]/div/label")   WebElement DatumOdlaganjaLabel;

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



}

