package cSore_Mapping.Life.View;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancellationPage extends BasePage {
    public CancellationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/legend")
    WebElement DocumentsLabel;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div[1]/div[1]/div/label")
    WebElement TypeOfCancellationLabel;
    @FindBy(id= "Kol1")
    WebElement TypeOfCancellation;

    @FindBy(id= "Kol2")
    WebElement CancellationReason;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div[1]/div[2]/div/label")
    WebElement CancellationReasonLabel;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div[2]/div[1]/div/label")
    WebElement DateOfCancellationLabel;
    @FindBy(id= "Kol3")
    WebElement DateOfCancellation;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div[2]/div[2]/div/label")
    WebElement DateCancellationFromLabel;
    @FindBy(id= "Kol4")
    WebElement DateCancellationFrom;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div[3]/div[2]/div/label")
    WebElement OverpaidAmountLabel;
    @FindBy(id= "Kol6")
    WebElement OverpaidAmount;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div[3]/div[1]/div/label")
    WebElement AmountOfPaidPremiumLabel;
    @FindBy(id= "Kol5")
    WebElement AmountOfPaidPremium;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div[3]/div[3]/div/label")
    WebElement DebtAmountLabel;
    @FindBy(id= "Kol7")
    WebElement DebtAmount;
    @FindBy(id= "Kol9")
    WebElement TechnicalPremiumAmount;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div[3]/div[5]/div/label")
    WebElement TechnicalPremiumAmountLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div[4]/div[1]/div/label")
    WebElement CancellationOptionLabel;
    @FindBy(id= "Kol10")
    WebElement CancellationOption;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div[4]/div[4]/div/label")
    WebElement SurrenderLabel;
    @FindBy(id= "Kol34")
    WebElement Surrender;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div[4]/div[2]/div/label")
    WebElement AmountLabel;
    @FindBy(id= "Kol11")
    WebElement Amount;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div[5]/div[1]/div/label")
    WebElement CancellationNoteLabel;
    @FindBy(id= "Kol12")
    WebElement CancellationNote;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div[5]/div[2]/div/label")
    WebElement CancellationRequestStatusLabel;
    @FindBy(id= "Kol29")
    WebElement CancellationRequestStatus;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[3]/fieldset/div[1]/div[1]/div/label")
    WebElement DateOfReactivationLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[3]/fieldset/legend")
    WebElement ReactivationLabel;
    @FindBy(id= "Kol15")
    WebElement DateOfReactivation;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[3]/fieldset/div[1]/div[2]/div/label")
    WebElement TotalDebtLabel;
    @FindBy(id= "Kol16")
    WebElement TotalDebt;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[3]/fieldset/div[1]/div[3]/div/label")
    WebElement PayedBeforeSRLabel;
    @FindBy(id= "Kol17")
    WebElement PayedBeforeSR;
    @FindBy(id= "Kol18")
    WebElement PayedAfterSR;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[3]/fieldset/div[1]/div[4]/div/label")
    WebElement PayedAfterSRLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[3]/fieldset/div[1]/div[5]/div/label")
    WebElement ToPayLabel;
    @FindBy(id= "Kol19")
    WebElement ToPay;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[3]/fieldset/div[2]/div[1]/div/label")
    WebElement ReactivationNoteLabel;
    @FindBy(id= "Kol20")
    WebElement ReactivationNote;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[3]/fieldset/div[2]/div[2]/div/label")
    WebElement ReactivationReasonLabel;
    @FindBy(id= "Kol15")
    WebElement ReactivationReason;
    @FindBy(id= "Kol22")
    WebElement HealthChanged;
    @FindBy(css="label[for='Kol22']")
    WebElement HealthChangedLabel;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[3]/fieldset/div[4]/div/label")
    WebElement ReactivationRequestStatusLabel;
    @FindBy(id= "Kol24")
    WebElement ReactivationRequestStatus;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[4]/fieldset/legend")
    WebElement ReactivationHistoryLabel;

    @FindBy(id= "basic-grid_25")
    WebElement ReactivationHistoryGrid;




    //-------------------- Methods --------------------
    public void DocumentsLabel() throws Exception {}

    public void TypeOfCancellationLabel() throws Exception {}
    public void TypeOfCancellation() throws Exception {}

    public void CancellationReason() throws Exception {}
    public void CancellationReasonLabel() throws Exception {}

    public void DateOfCancellationLabel() throws Exception {}
    public void DateOfCancellation() throws Exception {}
    public void DateCancellationFromLabel() throws Exception {}
    public void DateCancellationFrom() throws Exception {}

    public void OverpaidAmountLabel() throws Exception {}
    public void OverpaidAmount() throws Exception {}
    public void AmountOfPaidPremiumLabel() throws Exception {}
    public void AmountOfPaidPremium() throws Exception {}
    public void DebtAmountLabel() throws Exception {}
    public void DebtAmount() throws Exception {}
    public void TechnicalPremiumAmount() throws Exception {}
    public void TechnicalPremiumAmountLabel() throws Exception {}
    public void CancellationOptionLabel() throws Exception {}
    public void CancellationOption() throws Exception {}

    public void SurrenderLabel() throws Exception {}
    public void Surrender() throws Exception {}
    public void AmountLabel() throws Exception {}
    public void Amount() throws Exception {}
    public void CancellationNoteLabel() throws Exception {}
    public void CancellationNote() throws Exception {}
    public void CancellationRequestStatusLabel() throws Exception {}
    public void CancellationRequestStatus() throws Exception {}

    public void DateOfReactivationLabel() throws Exception {}
    public void ReactivationLabel() throws Exception {}
    public void DateOfReactivation() throws Exception {}

    public void TotalDebtLabel() throws Exception {}
    public void TotalDebt() throws Exception {}
    public void PayedBeforeSRLabel() throws Exception {}
    public void PayedBeforeSR() throws Exception {}
    public void PayedAfterSR() throws Exception {}
    public void PayedAfterSRLabel() throws Exception {}
    public void ToPayLabel() throws Exception {}
    public void ToPay() throws Exception {}
    public void ReactivationNoteLabel() throws Exception {}
    public void ReactivationNote() throws Exception {}
    public void ReactivationReasonLabel() throws Exception {}
    public void ReactivationReason() throws Exception {}
    public void HealthChanged() throws Exception {}
    public void HealthChangedLabel() throws Exception {}

    public void ReactivationRequestStatusLabel() throws Exception {}
    public void ReactivationRequestStatus() throws Exception {}

    public void ReactivationHistoryLabel() throws Exception {}

    public void ReactivationHistoryGrid() throws Exception {}



    //-------------------- End Methods --------------------

}
