package cSore_Mapping.Life.Tab;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VinculationPage extends BasePage {


    public VinculationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath= "//*[@id='Kol1']/div/div[1]/h4")   WebElement ViculationsLabel;
    @FindBy(className= "header_button")   WebElement AddVinculation;
    @FindBy(id= "basic-grid_1")   WebElement ViculationsGrid;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/div/div/label")   WebElement StatusLabel;
    @FindBy(id= "Kol6")   WebElement Status;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/div[1]/div/label")   WebElement IssuingDateLabel;
    @FindBy(id= "Kol2")   WebElement IssuingDate;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/div[2]/div/label")   WebElement StartDateLabel;
    @FindBy(id= "Kol3")   WebElement StartDate;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/div[3]/div/label")   WebElement EndDateLabel;
    @FindBy(id= "Kol5")   WebElement EndDate;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/div[4]/div/label")   WebElement LoanNumberLabel;
    @FindBy(id= "Kol15")   WebElement LoanNumber;
    @FindBy(xpath= "//*[@id='Kol7']/div/div[1]/h4")   WebElement ConcernsLabel;
    @FindBy(id= "basic-grid_7")   WebElement ConcernsGrid;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[5]/fieldset/legend")   WebElement CreditorLegend;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[5]/fieldset/div[1]/div[1]/div/label")   WebElement CreditorLabel;
    @FindBy(id= "Kol23")   WebElement Creditor;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[5]/fieldset/div[2]/div/div/label")   WebElement FirstBankLabel;
    @FindBy(id= "Kol8")   WebElement FirstBank;
    @FindBy(xpath= "//*[@id='basic-grid_7']/tbody/tr/td[7]/div/input")   WebElement VinculationsSum;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[8]/div/div/label")   WebElement NoteLabel;
    @FindBy(id= "Kol12")   WebElement Note;


    public void ViculationsLabel() throws Exception {}
    public void AddVinculation() throws Exception {}
    public void ViculationsGrid() throws Exception {}

    public void StatusLabel() throws Exception {}
    public void Status() throws Exception {}
    public void IssuingDateLabel() throws Exception {}
    public void IssuingDate() throws Exception {}
    public void StartDateLabel() throws Exception {}
    public void StartDate() throws Exception {}
    public void EndDateLabel() throws Exception {}
    public void EndDate() throws Exception {}
    public void LoanNumberLabel() throws Exception {}
    public void LoanNumber() throws Exception {}
    public void ConcernsLabel() throws Exception {}
    public void ConcernsGrid() throws Exception {}
    public void CreditorLegend() throws Exception {}
    public void CreditorLabel() throws Exception {}
    public void Creditor() throws Exception {}
    public void FirstBankLabel() throws Exception {}
    public void FirstBank() throws Exception {}
    public void VinculationsSum() throws Exception {}

    public void NoteLabel() throws Exception {}
    public void Note() throws Exception {}


}

