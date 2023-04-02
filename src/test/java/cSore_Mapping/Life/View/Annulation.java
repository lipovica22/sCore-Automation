package cSore_Mapping.Life.View;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Annulation extends BasePage {
    public Annulation(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/legend")
    WebElement AnnulationLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div/div[1]/div[1]/div/label")
    WebElement CauseOfAnnulationLabel;
    @FindBy(id= "Kol1")
    WebElement CauseOfAnnulation;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div/div[1]/div[2]/div/label")
    WebElement CauseOfCancellationLabel;
    @FindBy(id= "Kol7")
    WebElement CauseOfCancellation;
    @FindBy(css= "label[for='Kol5']")
    WebElement StorniranjeLabel;
    @FindBy(id= "Kol5")
    WebElement Storniranje;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div/div[2]/div[2]/div/label")
    WebElement DateOfAnnullationFromLabel;
    @FindBy(id= "Kol2")
    WebElement DateOfAnnullationFrom;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div/div[2]/div[2]/div/label")
    WebElement DateOfAnnullationLabel;
    @FindBy(id= "Kol4")
    WebElement DateOfAnnullation;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div/div[3]/div/div/label")
    WebElement AnnullationNoteLabel;
    @FindBy(id= "Kol3")
    WebElement AnnullationNote;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[2]/fieldset/legend")
    WebElement ReactivationLabel;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[2]/fieldset/div[1]/div[1]/div/label")
    WebElement DateOfActivationLabel;
    @FindBy(id= "Kol9")
    WebElement DateOfActivation;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[2]/fieldset/div[1]/div[2]/div/label")
    WebElement TotalDebtLabel;
    @FindBy(id= "Kol10")
    WebElement TotalDebt;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[2]/fieldset/div[1]/div[3]/div/label")
    WebElement PayedBeforeSRLabel;
    @FindBy(id= "Kol11")
    WebElement PayedBeforeSR;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[2]/fieldset/div[1]/div[4]/div/label")
    WebElement PayedAfterSRLabel;
    @FindBy(id= "Kol12")
    WebElement PayedAfterSR;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[2]/fieldset/div[1]/div[5]/div/label")
    WebElement ToPayLabel;
    @FindBy(id= "Kol13")
    WebElement ToPay;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[2]/fieldset/div[2]/div[1]/div/label")
    WebElement ActivationNoteLabel;
    @FindBy(id= "Kol14")
    WebElement ActivationNote;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[2]/fieldset/div[2]/div[2]/div/label")
    WebElement ActivationReasonLabel;
    @FindBy(id= "Kol15")
    WebElement ActivationReason;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[2]/fieldset/div[4]/div/label")
    WebElement ReactivationRequestStatusLabel;
    @FindBy(id= "Kol18")
    WebElement ReactivationRequestStatus;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[3]/fieldset/legend")
    WebElement ReactivationHistoryLabel;

    @FindBy(id= "basic-grid_19")
    WebElement ReactivationHistoryGrid;

    //-------------------- Methods --------------------
    public void AnnulationLabel() throws Exception {}
    public void CauseOfAnnulationLabel() throws Exception {}
    public void CauseOfAnnulation() throws Exception {}
    public void CauseOfCancellationLabel() throws Exception {}
    public void CauseOfCancellation() throws Exception {}
    public void StorniranjeLabel() throws Exception {}
    public void Storniranje() throws Exception {}
    public void DateOfAnnullationFromLabel() throws Exception {}
    public void DateOfAnnullationFrom() throws Exception {}
    public void DateOfAnnullationLabel() throws Exception {}
    public void DateOfAnnullation() throws Exception {}
    public void AnnullationNoteLabel() throws Exception {}
    public void AnnullationNote() throws Exception {}

    public void ReactivationLabel() throws Exception {}

    public void DateOfActivationLabel() throws Exception {}
    public void DateOfActivation() throws Exception {}
    public void TotalDebtLabel() throws Exception {}
    public void TotalDebt() throws Exception {}
    public void PayedBeforeSRLabel() throws Exception {}
    public void PayedBeforeSR() throws Exception {}
    public void PayedAfterSRLabel() throws Exception {}
    public void PayedAfterSR() throws Exception {}
    public void ToPayLabel() throws Exception {}
    public void ToPay() throws Exception {}
    public void ActivationNoteLabel() throws Exception {}
    public void ActivationNote() throws Exception {}
    public void ActivationReasonLabel() throws Exception {}
    public void ActivationReason() throws Exception {}
    public void ReactivationRequestStatusLabel() throws Exception {}
    public void ReactivationRequestStatus() throws Exception {}

    public void ReactivationHistoryLabel() throws Exception {}

    public void ReactivationHistoryGrid() throws Exception {}




    //-------------------- End Methods --------------------

}
