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

    @FindBy(xpath = "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/legend")
    WebElement documentsLabel;
    @FindBy(xpath = "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div[1]/div[1]/div/label")
    WebElement typeOfCancellationLabel;
    @FindBy(css = "select[id='Kol1']")
    WebElement typeOfCancellation;
    @FindBy(xpath = "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div[1]/div[2]/div/label")
    WebElement cancellationReasonLabel;
    @FindBy(id = "Kol2")
    WebElement cancellationReason;
    @FindBy(xpath = "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div[2]/div[1]/div/label")
    WebElement dateOfCancellationLabel;
    @FindBy(id = "Kol3")
    WebElement dateOfCancellation;
    @FindBy(xpath = "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div[2]/div[2]/div/label")
    WebElement dateCancellationFromLabel;
    @FindBy(id = "Kol4")
    WebElement dateCancellationFrom;
    @FindBy(xpath = "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div[3]/div[1]/div/label")
    WebElement amountOfPaidPremiumLabel;
    @FindBy(id = "Kol5")
    WebElement amountOfPaidPremium;
    @FindBy(xpath = "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div[3]/div[2]/div/label")
    WebElement overpaidAmountLabel;
    @FindBy(id = "Kol6")
    WebElement overpaidAmount;
    @FindBy(xpath = "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div[3]/div[3]/div/label")
    WebElement debtAmountLabel;
    @FindBy(id = "Kol7")
    WebElement debtAmount;
    @FindBy(xpath = "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div[3]/div[5]/div/label")
    WebElement technicalPremiumAmountLabel;
    @FindBy(id = "Kol9")
    WebElement technicalPremiumAmount;
    @FindBy(xpath = "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div[4]/div[1]/div/label")
    WebElement cancellationOptionLabel;
    @FindBy(id= "Kol10")
    WebElement cancellationOption;
    @FindBy(xpath = "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div[4]/div[2]/div/label")
    WebElement amountLabel;
    @FindBy(id = "Kol11")
    WebElement amount;
    @FindBy(xpath = "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div[4]/div[4]/div/label")
    WebElement surrenderLabel;
    @FindBy(id = "Kol34")
    WebElement surrender;
    @FindBy(xpath = "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div[5]/div[1]/div/label")
    WebElement cancellationNoteLabel;
    @FindBy(id = "Kol12")
    WebElement cancellationNote;
    @FindBy(xpath = "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div[5]/div[2]/div/label")
    WebElement cancellationRequestStatusLabel;
    @FindBy(id = "Kol29")
    WebElement cancellationRequestStatus;
    @FindBy(xpath = "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[3]/fieldset/div[1]/div[1]/div/label")
    WebElement dateOfReactivationLabel;
    @FindBy(id = "input[id='Kol15']")
    WebElement dateOfReactivation;
    @FindBy(xpath = "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[3]/fieldset/div[1]/div[2]/div/label")
    WebElement totalDebtLabel;
    @FindBy(id = "Kol16")
    WebElement totalDebt;
    @FindBy(xpath = "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[3]/fieldset/div[1]/div[3]/div/label")
    WebElement payedBeforeSRLabel;
    @FindBy(id = "Kol17")
    WebElement payedBeforeSR;
    @FindBy(xpath = "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[3]/fieldset/div[1]/div[4]/div/label")
    WebElement payedAfterSRLabel;
    @FindBy(id = "Kol18")
    WebElement payedAfterSR;
    @FindBy(xpath = "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[3]/fieldset/div[1]/div[5]/div/label")
    WebElement toPayLabel;
    @FindBy(id = "Kol19")
    WebElement toPay;
    @FindBy(xpath = "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[3]/fieldset/div[2]/div[1]/div/label")
    WebElement reactivationNoteLabel;
    @FindBy(css = "textarea[id='Kol20']")
    WebElement reactivationNote;
    @FindBy(id = "textarea[id='Kol33']")
    WebElement cancellationNote2;
    @FindBy(id = "a[id='Kol32']")
    WebElement addNote;
    @FindBy(xpath = "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[3]/fieldset/div[2]/div[2]/div/label")
    WebElement reactivationReasonLabel;
    @FindBy(css = "input[id='Kol21']")
    WebElement reactivationReason;
    @FindBy(css = "label[for='Kol22']")
    WebElement chkHealthChangedLabel;
    @FindBy(id = "Kol22")
    WebElement healthChanged;
    @FindBy(xpath = "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[3]/fieldset/div[4]/div/label")
    WebElement reactivationRequestStatusLabel;
    @FindBy(id = "Kol24")
    WebElement reactivationRequestStatus;
    @FindBy(xpath = "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[4]/fieldset/legend")
    WebElement reactivationHistoryLabel;
    @FindBy(id = "basic-grid_25")
    WebElement reactivationHistoryGrid;
    @FindBy(css = "label[for='Kol13_27']")
    WebElement chkAdvancePaymentInProgress;
    @FindBy(css = "label[for='Kol13_28']")
    WebElement chkNegotiatedDebtRecoveryInProgress;
    @FindBy(css = "label[for='Kol13_29']")
    WebElement chkReportedUnliquidatedClaim;
    @FindBy(css = "label[for='Kol13_48']")
    WebElement chkReportedUnliquidatedClaimUnderSupplementaryPolicy;

    //-------------------- Methods --------------------
    public void selectTypeOfCancellation(String valueTypeOfCancelation) throws Exception {
        SelectOption(typeOfCancellation, "Select type of cancellation", valueTypeOfCancelation);
    }
    public void selectCancellationReason(String valueCancellationReason) throws Exception {
        SelectOption(cancellationReason, "Select cancellation reason", valueCancellationReason);
    }
    public void setDateOfCancellation(String valueDateOfCancellation) throws Exception {
        SetValueDate(dateOfCancellation, "Set date of cancellation", valueDateOfCancellation);
    }
    public void setDateCancellationFrom(String valueDateCancellationFrom) throws Exception {
        SetValueDate(dateCancellationFrom, "Set date cancellation from", valueDateCancellationFrom);
    }
    public void selectCancellationOption(String valueCancellationOption) throws Exception {
        SelectOption(cancellationOption, "Select cancellation option", valueCancellationOption);
    }
    public void setAmount(String valueAmount) throws Exception {
        SetValue(amount, "Set amount", valueAmount);
    }
    public void setCancellationNote(String valueNote) throws Exception {
        SetValue(cancellationNote, "Set note", valueNote);
    }
    public void clickChkReportedUnliquidatedClaimUnderSupplementaryPolicy() throws Exception {
        ClickCheckbox(chkReportedUnliquidatedClaimUnderSupplementaryPolicy, "Click on checkbox 'Prijavljena, nelikvidirana steta po dopunskoj polisi'");
    }
    public void setDateOfReactivation(String valueDateOfReactivation) throws Exception {
        SetValueDate(dateOfReactivation, "Set date cancellation from", valueDateOfReactivation);
    }
    public void setReactivationReason(String valueReactivationReason) throws Exception {
        SetValue(reactivationReason, "Set reactivation reason", valueReactivationReason);
    }
    public void clickChkHealthChanged() throws Exception {
        ClickCheckbox(chkHealthChangedLabel, "Click on checkbox 'Promenjeno zdravstveno stanje'");
    }

    //-------------------- End Methods --------------------
}
