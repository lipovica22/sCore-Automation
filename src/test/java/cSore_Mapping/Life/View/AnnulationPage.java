package cSore_Mapping.Life.View;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnnulationPage extends BasePage {
    public AnnulationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/legend")
    WebElement annulationLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div/div[1]/div[1]/div/label")
    WebElement causeOfAnnulationLabel;
    @FindBy(id= "Kol1")
    WebElement causeOfAnnulation;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div/div[1]/div[2]/div/label")
    WebElement causeOfCancellationLabel;
    @FindBy(id= "Kol7")
    WebElement causeOfCancellation;
    @FindBy(css= "label[for='Kol5']")
    WebElement chkAnnulationCancellationInd;
    @FindBy(id= "Kol5")
    WebElement storniranje;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div/div[2]/div[2]/div/label")
    WebElement dateOfAnnullationFromLabel;
    @FindBy(id= "Kol2")
    WebElement dateOfAnnullationFrom;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div/div[2]/div[2]/div/label")
    WebElement dateOfAnnullationLabel;
    @FindBy(id= "Kol4")
    WebElement dateOfAnnullation;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div/div[3]/div/div/label")
    WebElement annullationNoteLabel;
    @FindBy(id= "Kol3")
    WebElement annullationNote;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[2]/fieldset/legend")
    WebElement reactivationLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[2]/fieldset/div[1]/div[1]/div/label")
    WebElement dateOfActivationLabel;
    @FindBy(id= "Kol9")
    WebElement dateOfActivation;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[2]/fieldset/div[1]/div[2]/div/label")
    WebElement totalDebtLabel;
    @FindBy(id= "Kol10")
    WebElement totalDebt;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[2]/fieldset/div[1]/div[3]/div/label")
    WebElement payedBeforeSRLabel;
    @FindBy(id= "Kol11")
    WebElement payedBeforeSR;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[2]/fieldset/div[1]/div[4]/div/label")
    WebElement payedAfterSRLabel;
    @FindBy(id= "Kol12")
    WebElement payedAfterSR;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[2]/fieldset/div[1]/div[5]/div/label")
    WebElement toPayLabel;
    @FindBy(id= "Kol13")
    WebElement toPay;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[2]/fieldset/div[2]/div[1]/div/label")
    WebElement activationNoteLabel;
    @FindBy(id= "Kol14")
    WebElement activationNote;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[2]/fieldset/div[2]/div[2]/div/label")
    WebElement activationReasonLabel;
    @FindBy(id= "Kol15")
    WebElement activationReason;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[2]/fieldset/div[4]/div/label")
    WebElement reactivationRequestStatusLabel;
    @FindBy(id= "Kol18")
    WebElement reactivationRequestStatus;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[3]/fieldset/legend")
    WebElement reactivationHistoryLabel;
    @FindBy(id= "basic-grid_19")
    WebElement reactivationHistoryGrid;

    //-------------------- Methods --------------------
    public void selectCauseOfAnnulation(String valueCauseOfAnnulation) throws Exception {
        SelectOption(causeOfAnnulation, "Select reason for cancellation", valueCauseOfAnnulation);
    }
    public void selectCauseOfCancellation(String valueCauseOfCancellation) throws Exception {
        SelectOption(causeOfCancellation, "Select reason canceled", valueCauseOfCancellation);
    }
    public void clickChkAnnulationCancellationInd() throws Exception {
        ClickCheckbox(chkAnnulationCancellationInd, "Click on checkbox 'Storniranje'");
    }
    public void setDateOfAnnulationFrom(String valueDateOfAnnulationFrom) throws Exception {
        SetValueDate(dateOfAnnullationFrom, "Set date of annulation from", valueDateOfAnnulationFrom);
    }
    public void setDateOfAnnulation(String valueDateOfAnnulation) throws Exception {
        SetValueDate(dateOfAnnullation, "Set date of annulation", valueDateOfAnnulation);
    }
    public void setAnnulationNote(String valueAnnulationNote) throws Exception {
        SetValue(annullationNote, "Set value in annulation note", valueAnnulationNote);
    }

    //-------------------- End Methods --------------------

}
