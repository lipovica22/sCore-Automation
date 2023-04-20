package cSore_Mapping.Common.Dialog.Iframe;

import cSore_Mapping.BasePage;
import core_class.ApplicationBase;

import core_class.CellCoordinateMatches.CellCoordinateMatchFactory;
import core_class.GridContols.GridControl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUpload extends BasePage {
    public FileUpload(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName =  "iframe")
    WebElement uploadframe;
    @FindBy(className= "ui-button-close")
    WebElement close;
    @FindBy(xpath= "/html/body/div[1]/div/div/a")
    WebElement scorelabel;
    @FindBy(id= "lblFullName")
    WebElement fullnamelabel;
 
    @FindBy(tagName= "table")
    WebElement grid;
 
    @FindBy(xpath= "//*[@id= 'fileupload']/div[3]/div/span[1]/input")
    WebElement fileInput;
    @FindBy(xpath= "//*[@id= 'fileupload']/div[3]/div/button[1]")
    WebElement start;
    @FindBy(xpath= "//*[@id= 'fileupload']/div[3]/div/button[2]")
    WebElement cancel;
    @FindBy(xpath= "//*[@id='upDocumentTypeDescription']/div[1]/label")
    WebElement documentTypeLabel;
    @FindBy(id= "ddlDocumentType")
    WebElement documentType;
    @FindBy(xpath= "//*[@id='upDocumentTypeDescription']/div[2]/label")
    WebElement documentDescriptionLabel;
    @FindBy(id= "txtDocumentDescription")
    WebElement documentDescription;
    @FindBy(xpath= "//*[@id='upDocumentTypeDescription']/div[2]/label")
    WebElement confidentialityLabel;
    @FindBy(id= "ddlConfidentiality_ConfidentialitiesDropList")
    WebElement confidentiality;
 
    @FindBy(id= "lbUcitaniDokumenti")
    WebElement uploadedDocumentslabel;
 
    //@FindBy(= "")   WebElement stripedtable;
 
    @FindBy(xpath= "//*[@id='UploadedDocumentsListView_tbl1']")
    WebElement uploadedDocuments;
    @FindBy(id= "PolicyUploadedDocumentsView_tbl1")
    WebElement policyuploadeddocuments;
 
    @FindBy(id= "btnSave")
    WebElement save;
 
    @FindBy(id= "btnDownloadAll")
    WebElement downloadAll;

    public void UploadFrame() throws Exception {}
    public void clickClose() throws Exception {
        ClickWithScroll(close, "Click Close button");
    }
    public void ScoreLabel() throws Exception {}
    public void FullNameLabel() throws Exception {}
 
    public void Grid() throws Exception {}
 
    public void clickFileInput(String valueFileName) throws Exception {

        UploadFile(fileInput, "Upload pdf file for documentation", ApplicationBase.pathPDF(valueFileName));
    }
    public void clickStart() throws Exception {
        ClickWithScroll(start, "Click Start button");
    }
    public void clickCancel() throws Exception {
        ClickWithScroll(cancel, "Click Cancel button");
    }
    public void DocumentTypeLabel() throws Exception {}
    public void DocumentType(String docType) throws Exception {
        SelectOption(documentType, "Select Document type", docType);
    }
    public void DocumentDescriptionLabel() throws Exception {}
    public void DocumentDescription(String description) throws Exception {
        SetValue(documentDescription,"Input descritption", description);
    }
    public void ConfidentialityLabel() throws Exception {}
    public void Confidentiality(String confidentiality) throws Exception {
        SelectOption(documentType, "Select Document type", confidentiality);
    }
 
    public void UploadedDocumentsLabel() throws Exception {}
 
    public void StripedTable() throws Exception {}
 
    public void UploadedDocuments() throws Exception {
        //SelectCellOption(uploadedDocuments, CellCoordinateMatchFactory.createNumber(3, 1),"Identifikacioni dokument - Ugovarača");
        //gridUpload(uploadedDocuments,"","AML_Klijient.pdf","Identifikacioni dokument - Ugovarača","");
    }
    public void PolicyUploadedDocuments() throws Exception {}
 
    public void clickSave() throws Exception {
        ClickWithScroll(save, "Click Save button");
    }
 
    public void DownloadAll() throws Exception {
        ClickWithScroll(downloadAll, "Click Download All button");
    }

}

