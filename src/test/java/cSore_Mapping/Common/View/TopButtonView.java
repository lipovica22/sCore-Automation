package cSore_Mapping.Common.View;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopButtonView extends BasePage {
    public TopButtonView(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id= "btn_Calculate")
    WebElement Calculate;
    @FindBy(id= "btn_Close")
    WebElement close;
    @FindBy(id= "btn_Activate")
    WebElement activate;
    @FindBy(id= "btn_ConfirmPayment")
    WebElement confirmPayment;
    @FindBy(id= "btn_CertificationOfSignature")
    WebElement certificationOfSignature;
    @FindBy(id= "btn_Annule")
    WebElement annule;
    @FindBy(id= "btn_Accept")
    WebElement submit;
    @FindBy(id= "btn_Cancel")
    WebElement cancel;
    @FindBy(id= "btn_Save")
    WebElement save;
    @FindBy(id= "btn_Back")
    WebElement back;
    @FindBy(id= "btn_SaveQuestionary")
    WebElement saveQuestionary;
    @FindBy(id= "btn_Print")
    WebElement print;
    @FindBy(id= "btn_TestPrint")
    WebElement testPrint;
    @FindBy(id= "btn_AcceptMoneyLaundry")
    WebElement acceptMoneyLaundry;
    @FindBy(id= "btn_FileUpload")
    WebElement fileUpload;
    @FindBy(id= "btn_CreateIndividualInvoices")
    WebElement createIndividualInvoices;
    @FindBy(id= "btn_CreateGroupInvoice")
    WebElement createGroupInvoice;
    @FindBy(id= "btn_CreateInvoice")
    WebElement createInvoice;
    @FindBy(id= "btn_CreateNewContract")
    WebElement createNewContract;
    @FindBy(id= "btn_PrintInvoice")
    WebElement printInvoice;
    @FindBy(id= "btn_Search")
    WebElement search;
    @FindBy(id= "btn_ExportToExcel")
    WebElement export;
    @FindBy(id= "btn_PrintPUI")
    WebElement printPUI;
    @FindBy(id= "btn_PaymentInstructions")
    WebElement paymentInstructions;
    @FindBy(id= "btn_SaveCancellationNonLife")
    WebElement cancellation;
    @FindBy(id= "btn_SaveCancellationNonLife")
    WebElement saveCancellationNonLife;
    @FindBy(id= "btn_CalculateCancellationNonLife")
    WebElement calculateCancellationNonLife;
    @FindBy(id= "btn_AnnulNonLife")
    WebElement annulationNonLife;
    @FindBy(id= "btn_CreateAnnex")
    WebElement createAnnex;
    @FindBy(id= "btn_CalculateAnnex")
    WebElement calculateAnnex;
    @FindBy(id= "btn_CreateIndividualPolicies")
    WebElement createIndividualPolicies;
    @FindBy(id= "btn_Conclude")
    WebElement conclude;
    @FindBy(id= "btn_CancelAll")
    WebElement cancelAll;
    @FindBy(id= "btn_CreateSpecificationForm")
    WebElement createSpecificationForm;
    @FindBy(id= "btn_CreatePolicy")
    WebElement createPolicy;
    @FindBy(id= "btn_ActivateAnnex")
    WebElement activateAnnex;
    @FindBy(id= "")
    WebElement certificationOfSignatureAnnex;
    @FindBy(id= "btn_NewYearlyStatement")
    WebElement newYearlyStatement;
    @FindBy(id= "btn_AnnulLastCancellation")
    WebElement annulLastCancellation;
    @FindBy(id= "btn_AcceptCorrection")
    WebElement acceptCorrection;
    @FindBy(id= "btn_SwitchDocumentType")   WebElement SwitchDocumentType;
    @FindBy(id= "btn_CreateLifeAnnex")   WebElement CreateLifeAnnex;

    @FindBy(id= "btn_CalculateUW")   WebElement CalculateUW;
    @FindBy(id= "btn_CalculateAnnex")   WebElement CalculateAnnex;
    @FindBy(id= "btn_Close")   WebElement Close;
    @FindBy(id= "btn_Activate")   WebElement Activate;
    @FindBy(id= "btn_ActivateLifeAnnex")   WebElement ActivateLifeAnnex;
    @FindBy(id= "btn_ActivateAnnex")   WebElement ActivateAnnex;

    @FindBy(id= "btn_ConfirmPayment")   WebElement ConfirmPayment;
    @FindBy(id= "btn_CertificationOfSignature")   WebElement CertificationOfSignature;
    @FindBy(id= "btn_CertificationOfSignatureLifeAnnex")   WebElement CertificationOfSignatureAnnex;
    @FindBy(id= "btn_Annule")   WebElement Annule;
    @FindBy(id= "btn_EditOfferOrPolicy")   WebElement Edit;

    @FindBy(id= "btn_AcceptCorrection")   WebElement AcceptCorrection;
    @FindBy(id= "btn_Accept")   WebElement Accept;
    @FindBy(id= "btn_Correction")   WebElement Correction;
    @FindBy(id= "btn_Accept")   WebElement Submit;
    @FindBy(id= "btn_Cancel")   WebElement Cancel;

    @FindBy(id= "btn_Save")   WebElement Save;

    @FindBy(id= "btn_SaveQuestionary")   WebElement SaveQuestionary;
    @FindBy(id= "btn_SaveCancellation")   WebElement SaveCancellation;
    @FindBy(id= "btn_Print")   WebElement Print;
    @FindBy(id= "btn_TestPrint")   WebElement TestPrint;
    @FindBy(id= "btn_CreateNewContract")   WebElement CreateNewContract;

    @FindBy(id= "btn_AcceptMoneyLaundry")   WebElement AcceptMoneyLaundry;

    @FindBy(id= "btn_CreateIndividualInvoices")   WebElement CreateIndividualInvoices;
    @FindBy(id= "btn_FileUpload")   WebElement FileUpload;
    @FindBy(id= "btn_CreateGroupInvoice")   WebElement CreateGroupInvoice;

    @FindBy(id= "btn_Search")   WebElement Search;

    @FindBy(id= "btn_ExportToExcel")   WebElement Export;

    @FindBy(id= "btn_SendUnderwriting")   WebElement SendUnderwriting;
    @FindBy(id= "btn_Decline")   WebElement Decline;
    @FindBy(id= "btn_ConfirmAnnex")   WebElement ConfirmAnnex;

    @FindBy(id= "btn_CreatePolicy")   WebElement CreatePolicy;
    @FindBy(id= "btn_Confirm")   WebElement Confirm;
    @FindBy(id= "btn_AcceptOfferWithoutCorrection")   WebElement AcceptOfferWithoutCorrection;
    @FindBy(id= "btn_SendForApproval")   WebElement SendForApproval;


    @FindBy(css = "tbody[class='basic_grid_body']")
    WebElement table;


    //-------------------- Methods --------------------
    public void clickCalculate() throws Exception {
        Click(Calculate, "Click on calculate");
    }
    public void clickActivate() throws Exception {
        Click(activate, "Click on activate");
    }
    public void clickConfirmPayment() throws Exception {
        Click(confirmPayment, "confirm payment");
    }
    public void clickCertificationOfSignature() throws Exception {
        Click(certificationOfSignature, "Click on certification of signature");
    }
    public void clickSubmit() throws Exception {
        Click(submit, "Click on Submit");
    }

    public void clickPrintPUI() throws Exception {
        Click(printPUI, "Click on print PUI");
    }

    public void print(String valuePrints) throws Exception {
        gridPrinting(table, "Print: ", valuePrints);
    }

    public void SwitchDocumentType() throws Exception {}
    public void CreateLifeAnnex() throws Exception {}
    public void Calculate() throws Exception {}
    public void CalculateUW() throws Exception {}
    public void CalculateAnnex() throws Exception {}
    public void Close() throws Exception {}
    public void Activate() throws Exception {}
    public void ActivateLifeAnnex() throws Exception {}
    public void ActivateAnnex() throws Exception {}

    public void ConfirmPayment() throws Exception {}
    public void CertificationOfSignature() throws Exception {}
    public void CertificationOfSignatureAnnex() throws Exception {}
    public void Annule() throws Exception {}
    public void Edit() throws Exception {}

    public void AcceptCorrection() throws Exception {}
    public void Accept() throws Exception {}
    public void Correction() throws Exception {}
    public void Submit() throws Exception {}
    public void Cancel() throws Exception {}

    public void Save() throws Exception {}

    public void clickSaveQuestionary() throws Exception {
        Click(saveQuestionary, "Click on Save Questionary");}
    public void SaveCancellation() throws Exception {}
    public void Print() throws Exception {}
    public void TestPrint() throws Exception {}
    public void CreateNewContract() throws Exception {}

    public void AcceptMoneyLaundry() throws Exception {}

    public void CreateIndividualInvoices() throws Exception {}
    public void FileUpload() throws Exception {}
    public void CreateGroupInvoice() throws Exception {}

    public void Search() throws Exception {}

    public void Export() throws Exception {}

    public void SendUnderwriting() throws Exception {}
    public void Decline() throws Exception {}
    public void ConfirmAnnex() throws Exception {}

    public void CreatePolicy() throws Exception {}
    public void Confirm() throws Exception {}
    public void AcceptOfferWithoutCorrection() throws Exception {}
    public void SendForApproval() throws Exception {}

    //-------------------- End Methods --------------------
}
