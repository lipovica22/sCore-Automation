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
    @FindBy(xpath= "//*[@id='Kol1']/div/div[1]/h4")
    WebElement viculationsLabel;
    @FindBy(className= "header_button")
    WebElement addVinculation;
    @FindBy(id= "basic-grid_1")
    WebElement viculationsGrid;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/div/div/label")
    WebElement statusLabel;
    @FindBy(id= "Kol6")
    WebElement status;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/div[1]/div/label")
    WebElement issuingDateLabel;
    @FindBy(id= "Kol2")
    WebElement issuingDate;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/div[2]/div/label")
    WebElement startDateLabel;
    @FindBy(id= "Kol3")
    WebElement startDate;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/div[3]/div/label")
    WebElement endDateLabel;
    @FindBy(id= "Kol5")
    WebElement endDate;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/div[4]/div/label")
    WebElement loanNumberLabel;
    @FindBy(id= "Kol15")
    WebElement loanNumber;
    @FindBy(xpath= "//*[@id='Kol7']/div/div[1]/h4")
    WebElement concernsLabel;
    @FindBy(id= "basic-grid_7")
    WebElement concernsGrid;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[5]/fieldset/legend")
    WebElement creditorLegend;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[5]/fieldset/div[1]/div[1]/div/label")
    WebElement creditorLabel;
    @FindBy(id= "Kol23")
    WebElement creditor;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[5]/fieldset/div[2]/div/div/label")
    WebElement firstBankLabel;
    @FindBy(id= "Kol8")
    WebElement firstBank;
    @FindBy(xpath= "//*[@id='basic-grid_7']/tbody/tr/td[7]/div/input")
    WebElement vinculationsSum;
    @FindBy(id= "Kol16")   WebElement firstName;
    @FindBy(id= "Kol17")   WebElement surname;
    @FindBy(id= "Kol18")   WebElement jMBG;
    @FindBy(id= "Kol19")   WebElement legalName;
    @FindBy(id= "Kol20")   WebElement pIB;
    @FindBy(id= "Kol21")   WebElement mBR;


    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[8]/div/div/label")
    WebElement noteLabel;
    @FindBy(id= "Kol12")
    WebElement note;

    //--------------------- Methods -----------------------
    public void ViculationsLabel() throws Exception {}
    public void clickAddVinculation() throws Exception {
        Click(addVinculation,"Click on Add Vinculation");
    }
    public void ViculationsGrid() throws Exception {}
    public void StatusLabel() throws Exception {}
    public void Status() throws Exception {}
    public void IssuingDateLabel() throws Exception {}
    public void IssuingDate(String issuingDateValue) throws Exception {
        SetValueDate(issuingDate,"Set IssuingDate", issuingDateValue);
    }
    public void StartDateLabel() throws Exception {}
    public void StartDate(String startDatevalue) throws Exception {
        SetValueDate(startDate,"Set IssuingDate", startDatevalue);
    }
    public void EndDateLabel() throws Exception {}
    public void EndDate(String endDatevalue) throws Exception {
        SetValueDate(endDate,"Set IssuingDate", endDatevalue);
    }
    public void LoanNumberLabel() throws Exception {}
    public void setLoanNumber(String loanNumberV) throws Exception {
        SetValue(loanNumber,"Set LoanNumber",loanNumberV);
    }
    public void ConcernsLabel() throws Exception {}
    public void ConcernsGrid() throws Exception {}
    public void CreditorLegend() throws Exception {}
    public void CreditorLabel() throws Exception {}
    public void selectCreditor(String creditorv) throws Exception {
        SelectOption(creditor,"Select Creditor",creditorv);
    }
    public void FirstBankLabel() throws Exception {}
    public void selectFirstBank(String firstBankv) throws Exception {
        SelectOption(firstBank,"Select FirstBank",firstBankv);
    }
    public void setVinculationsSum(String vinculationsSumv) throws Exception {
        SetValue(vinculationsSum,"Set VinculationsSum",vinculationsSumv);
    }
    public void setFirstName(String firstNamev) throws Exception {
        SetValue(firstName,"Set FirstName",firstNamev);
    }
    public void setSurname(String surnamev) throws Exception {
        SetValue(surname,"Set Surname",surnamev);
    }
    public void setJMBG(String jMBGv) throws Exception {
        SetValue(jMBG,"Set JMBG",jMBGv);
    }
    public void setLegalName(String legalNamev) throws Exception {
        SetValue(legalName,"Set LegalName",legalNamev);
    }
    public void setPIB(String pIBv) throws Exception {
        SetValue(pIB,"Set PIB",pIBv);
    }
    public void setMBR(String mBR1) throws Exception {
        SetValue(mBR,"Set MBR",mBR1);
    }

    public void NoteLabel() throws Exception {}
    public void setNote(String notev) throws Exception {
        SetValue(note,"Set Note",notev);
    }

    //--------------------- End Methods -----------------------
}

