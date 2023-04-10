package cSore_Mapping.Common.View;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopButtonViewPage extends BasePage {
    public TopButtonViewPage(WebDriver driver) {
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
    //-------------------- End Methods --------------------
}
