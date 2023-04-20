package cSore_Mapping.Common.View;

import cSore_Mapping.BasePage;
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
    @FindBy(id= "btn_PrintConditions")   WebElement printConditions;




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



    public void clickSaveQuestionary() throws Exception {
        Click(saveQuestionary, "Click on Save Questionary");}
 
    public void acceptMoneyLaundry() throws Exception {
        Click(acceptMoneyLaundry, "Click on Accept Money Laundry");
    }
    public void clickSwitchDocumentType() throws Exception {
        ClickWithScroll(SwitchDocumentType, "Click SwitchDocumentType button");
    }
    public void clickCreateLifeAnnex() throws Exception {
        ClickWithScroll(CreateLifeAnnex, "Click CreateLifeAnnex button");
    }

    public void clickCalculateUW() throws Exception {
        ClickWithScroll(CalculateUW, "Click CalculateUW button");
    }
    public void CalculateAnnex() throws Exception {
        ClickWithScroll(CalculateAnnex, "Click CalculateAnnex button");
    }
    public void clickClose() throws Exception {
        ClickWithScroll(Close, "Click Close  button");
    }
    public void clickActivateLifeAnnex() throws Exception {
        ClickWithScroll(ActivateLifeAnnex, "Click ActivateLifeAnnex button");
    }
    public void clickActivateAnnex() throws Exception {
        ClickWithScroll(ActivateAnnex, "Click ActivateAnnex button");
    }
     public void clickCertificationOfSignatureAnnex() throws Exception {
        ClickWithScroll(CertificationOfSignatureAnnex, "Click CertificationOfSignatureAnnex button");
    }
    public void clickAnnule() throws Exception {
        ClickWithScroll(Annule, "Click Annule button");
    }
    public void clickEdit() throws Exception {
        ClickWithScroll(Edit, "Click Edit button");
    }

    public void clickAcceptCorrection() throws Exception {
        ClickWithScroll(AcceptCorrection, "Click AcceptCorrection button");
    }
    public void clickAccept() throws Exception {
        ClickWithScroll(Accept, "Click Accept button");
    }
    public void clickCorrection() throws Exception {
        ClickWithScroll(Correction, "Click Correction button");
    }

    public void clickCancel() throws Exception {
        ClickWithScroll(Cancel, "Click Cancel button");
    }

    public void clickSave() throws Exception {
        ClickWithScroll(Save, "Click Save button");
    }

    public void clickSaveCancellation() throws Exception {
        ClickWithScroll(SaveCancellation, "Click SaveCancellation button");
    }
    public void clickPrint() throws Exception {
        ClickWithScroll(Print, "Click Print button");
    }
    public void clickTestPrint() throws Exception {
        ClickWithScroll(TestPrint, "Click TestPrint button");
    }
    public void clickCreateNewContract() throws Exception {
        ClickWithScroll(CreateNewContract, "Click CreateNewContract button");
    }

    public void clickAcceptMoneyLaundry() throws Exception {
        ClickWithScroll(AcceptMoneyLaundry, "Click AcceptMoneyLaundry button");
    }

    public void clickCreateIndividualInvoices() throws Exception {
        ClickWithScroll(CreateIndividualInvoices, "Click CreateIndividualInvoices button");
    }
    public void clickFileUpload() throws Exception {
        ClickWithScroll(FileUpload, "Click FileUpload button");
    }
    public void clickCreateGroupInvoice() throws Exception {
        ClickWithScroll(CreateGroupInvoice, "Click CreateGroupInvoice button");
    }

    public void clickSearch() throws Exception {
        ClickWithScroll(Search, "Click Search button");
    }

    public void clickExport() throws Exception {
        ClickWithScroll(Export, "Click Export button");
    }

    public void clickSendUnderwriting() throws Exception {
        ClickWithScroll(SendUnderwriting, "Click SendUnderwriting button");
    }
    public void clickDecline() throws Exception {
        ClickWithScroll(Decline, "Click Decline button");
    }
    public void clickConfirmAnnex() throws Exception {
        ClickWithScroll(ConfirmAnnex, "Click ConfirmAnnex button");
    }

    public void clickCreatePolicy() throws Exception {
        ClickWithScroll(CreatePolicy, "Click CreatePolicy button");
    }
    public void clickConfirm() throws Exception {
        ClickWithScroll(Confirm, "Click Confirm button");
    }
    public void clickAcceptOfferWithoutCorrection() throws Exception {
        ClickWithScroll(AcceptOfferWithoutCorrection, "Click AcceptOfferWithoutCorrection button");
    }
    public void clickSendForApproval() throws Exception {
        ClickWithScroll(SendForApproval, "Click SendForApproval button");
    }
    public void clickPrintConditions() throws Exception {
        ClickWithScroll(printConditions, "Click PrintConditions button");
    }

    //-------------------- End Methods --------------------
}
