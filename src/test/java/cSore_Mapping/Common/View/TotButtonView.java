package cSore_Mapping.Common.View;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TotButtonView extends BasePage {

    public TotButtonView(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id= "btn_Calculate")
    WebElement Calculate;
    @FindBy(id= "btn_Close")   WebElement Close;
    @FindBy(id= "btn_Activate")   WebElement Activate;
    @FindBy(id= "btn_ConfirmPayment")   WebElement ConfirmPayment;
    @FindBy(id= "btn_CertificationOfSignature")   WebElement CertificationOfSignature;
    @FindBy(id= "btn_Annule")   WebElement Annule;
    @FindBy(id= "btn_Accept")   WebElement Submit;
    @FindBy(id= "btn_Cancel")   WebElement Cancel;

    @FindBy(id= "btn_Save")   WebElement Save;
    @FindBy(id= "btn_Back")   WebElement Back;

    @FindBy(id= "btn_SaveQuestionary")   WebElement SaveQuestionary;

    @FindBy(id= "btn_Print")   WebElement Print;
    @FindBy(id= "btn_TestPrint")   WebElement TestPrint;

    @FindBy(id= "btn_AcceptMoneyLaundry")   WebElement AcceptMoneyLaundry;

    @FindBy(id= "btn_FileUpload")   WebElement FileUpload;

    @FindBy(id= "btn_CreateIndividualInvoices")   WebElement CreateIndividualInvoices;
    @FindBy(id= "btn_CreateGroupInvoice")   WebElement CreateGroupInvoice;
    @FindBy(id= "btn_CreateInvoice")   WebElement CreateInvoice;
    @FindBy(id= "btn_CreateNewContract")   WebElement CreateNewContract;
    @FindBy(id= "btn_PrintInvoice")   WebElement PrintInvoice;
    @FindBy(id= "btn_Search")   WebElement Search;
    @FindBy(id= "btn_ExportToExcel")   WebElement Export;
    @FindBy(id= "btn_PrintPUI")   WebElement PrintPUI;
    @FindBy(id= "btn_PaymentInstructions")   WebElement PaymentInstructions;
    @FindBy(id= "btn_SaveCancellationNonLife")   WebElement Cancellation;
    @FindBy(id= "btn_SaveCancellationNonLife")   WebElement SaveCancellationNonLife;
    @FindBy(id= "btn_CalculateCancellationNonLife")   WebElement CalculateCancellationNonLife;

    @FindBy(id= "btn_AnnulNonLife")   WebElement AnnulationNonLife;
    @FindBy(id= "btn_CreateAnnex")   WebElement CreateAnnex;
    @FindBy(id= "btn_CalculateAnnex")   WebElement CalculateAnnex;
    @FindBy(id= "btn_CreateIndividualPolicies")   WebElement CreateIndividualPolicies;
    @FindBy(id= "btn_Conclude")   WebElement Conclude;
    @FindBy(id= "btn_CancelAll")   WebElement CancelAll;

    @FindBy(id= "btn_CreateSpecificationForm")   WebElement CreateSpecificationForm;
    @FindBy(id= "btn_CreatePolicy")   WebElement CreatePolicy;
    @FindBy(id= "btn_ActivateAnnex")   WebElement ActivateAnnex;
    @FindBy(id= "")   WebElement CertificationOfSignatureAnnex;
    @FindBy(id= "btn_NewYearlyStatement")   WebElement NewYearlyStatement;
    @FindBy(id= "btn_AnnulLastCancellation")   WebElement AnnulLastCancellation;
    @FindBy(id= "btn_AcceptCorrection")   WebElement AcceptCorrection;


    public void clickCalculate() throws Exception {
        Click(Calculate, "Click on calculate");
    }
    public void Close() throws Exception {}
    public void activate() throws Exception {
        Click(Activate, "Click on activate");
    }
    public void confirmPayment() throws Exception {
        Click(ConfirmPayment, "confirm payment");
    }
    public void CertificationOfSignature() throws Exception {
        Click(CertificationOfSignature, "Click on certification of signature");
    }
    public void Annule() throws Exception {}
    public void Submit() throws Exception {
        Click(Submit, "Click on Submit");
        //Submit.click();
    }
    public void Cancel() throws Exception {}

    public void Save() throws Exception {}
    public void Back() throws Exception {}

    public void SaveQuestionary() throws Exception {}

    public void Print() throws Exception {}
    public void TestPrint() throws Exception {}

    public void AcceptMoneyLaundry() throws Exception {}

    public void FileUpload() throws Exception {}

    public void CreateIndividualInvoices() throws Exception {}
    public void CreateGroupInvoice() throws Exception {}
    public void CreateInvoice() throws Exception {}
    public void CreateNewContract() throws Exception {}
    public void PrintInvoice() throws Exception {}
    public void Search() throws Exception {}
    public void Export() throws Exception {}
    public void PrintPUI() throws Exception {
        Click(PrintPUI, "Click on print");
    }
    public void PaymentInstructions() throws Exception {}
    public void Cancellation() throws Exception {}
    public void SaveCancellationNonLife() throws Exception {}
    public void CalculateCancellationNonLife() throws Exception {}

    public void AnnulationNonLife() throws Exception {}
    public void CreateAnnex() throws Exception {}
    public void CalculateAnnex() throws Exception {}
    public void CreateIndividualPolicies() throws Exception {}
    public void Conclude() throws Exception {}
    public void CancelAll() throws Exception {}

    public void CreateSpecificationForm() throws Exception {}
    public void CreatePolicy() throws Exception {}
    public void ActivateAnnex() throws Exception {}
    public void CertificationOfSignatureAnnex() throws Exception {}
    public void NewYearlyStatement() throws Exception {}
    public void AnnulLastCancellation() throws Exception {}
    public void AcceptCorrection() throws Exception {}




}
