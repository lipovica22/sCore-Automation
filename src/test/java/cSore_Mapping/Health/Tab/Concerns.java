package cSore_Mapping.Health.Tab;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Concerns extends BasePage {
    public Concerns(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/legend")
    WebElement OpstiUgovorniElementi;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/div[1]/div/label")
    WebElement PackageLabel;
    @FindBy(id= "Kol5")
    WebElement Package;
    @FindBy(id= "Kol12")
    WebElement PackageDescriptions;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/div[3]/div/label")
    WebElement InsuredSum;
    @FindBy(id= "Kol6")
    WebElement InsuredSumList;
    @FindBy(id= "Kol10")
    WebElement Currency;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/div[5]/div/label")
    WebElement CorrectionLabel;
    @FindBy(id= "Kol7")
    WebElement Correction;
    @FindBy(id= "Kol11")
    WebElement CorrectionCurrency;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/div[7]/div/label")
    WebElement FranchiseLabel;
    @FindBy(id= "Kol4")
    WebElement Franchise;
    @FindBy(id= "")
    WebElement FranchiseCurrency;
    @FindBy(xpath= "//*[@id='ContentPlaceHolder1_Kol8_uc_display_inline']/div[1]")
    WebElement FileUploadLabel;
    @FindBy(css= "input[name='file2Upload']")
    WebElement FileUpload;
    @FindBy(xpath= "//*[@id='ContentPlaceHolder1_Kol8_uc_div1']/div/a")
    WebElement Find;
    @FindBy(xpath= "//*[@id='ContentPlaceHolder1_Kol8_uc_divButton1']/div/a")
    WebElement Add;
    @FindBy(id= "Kol2")
    WebElement AddConcern;
    @FindBy(id= "basic-grid_3")
    WebElement ConcernListGrid;

    @FindBy(xpath= "//*[@id='Kol5']")
    WebElement ConcernsLabel;

    @FindBy(id= "ContentPlaceHolder1_ucContainer1")
    WebElement SelectFP;
    @FindBy(id= "ContentPlaceHolder1_Kol7_uc_wucBusinessEntityBaseSearch_tbExternalReferenceId")
    WebElement ExternalReferenceId;
    @FindBy(id= "ContentPlaceHolder1_Kol7_uc_wucBusinessEntityBaseSearch_tbName")
    WebElement Name;
    @FindBy(id= "ContentPlaceHolder1_Kol7_uc_wucBusinessEntityBaseSearch_search")
    WebElement Search;
    @FindBy(id= "ContentPlaceHolder1_Kol7_uc_wucBusinessEntityBaseSearch_tbIdentNumbers")
    WebElement IdentNumber;
    @FindBy(id= "ContentPlaceHolder1_Kol7_uc_wucBusinessEntityBaseSearch_addedit")
    WebElement Search_AddEdit;
    @FindBy(id= "ContentPlaceHolder1_Kol7_uc_wucBusinessEntityBaseSearch_tbAdress")
    WebElement Adress;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div/div[2]/fieldset/div[1]/div[2]/div[1]/div/label")
    WebElement DateOfBirthLabel;
    @FindBy(id= "Kol5")   WebElement DateOfBirth;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div/div[2]/fieldset/div[1]/div[2]/div[2]/div/label")
    WebElement AgeLabel;
    @FindBy(id= "Kol6")   WebElement Age;

    public void OpstiUgovorniElementi() throws Exception {

    }
    public void PackageLabel() throws Exception {

    }
    public void selectPackage(String valuePackage) throws Exception {
        SelectOption(Package, "Select package", valuePackage);
    }
    public void PackageDescriptions() throws Exception {

    }
    public void selectInsuredSumList(String valueSumList) throws Exception {
        SelectOption(InsuredSumList, "Select insured sum list", valueSumList);
    }
    public void InsuredSumList() throws Exception {

    }
    public void Currency() throws Exception {

    }
    public void CorrectionLabel() throws Exception {

    }
    public void selectCorrection(String valueCorrection) throws Exception {
        SelectOption(Correction, "Select correction", valueCorrection);
    }
    public void CorrectionCurrency() throws Exception {

    }
    public void FranchiseLabel() throws Exception {

    }
    public void selectFranchise(String valueFranchise) throws Exception {
        SelectOption(Franchise, "Select franchise", valueFranchise);
    }
    public void FranchiseCurrency() throws Exception {

    }
    public void FileUploadLabel() throws Exception {

    }
    public void fileUpload(String valueFileName) throws Exception {
        String valueSet= "C:/Users/srdjan.tanasijevic/IdeaProjects/sCore-Automation/src/test/FilesForUpload/" + valueFileName + ".xlsm";
        SetValue(FileUpload, "Set value file upload", valueSet);
        //FileUpload.sendKeys("C:/Users/srdjan.tanasijevic/IdeaProjects/sCore-Automation/src/test/FilesForUpload/" + valueFileName + ".xlsm");
    }
    public void clickFind() throws Exception {
        Find.click();
    }
    public void add() throws Exception {
        Click(Add, "Click on add");
    }
    public void clickAddConcern() throws Exception {
        Click(AddConcern, "Click on add concern");
    }
    public void ConcernListGrid() throws Exception {

    }

    public void ConcernsLabel() throws Exception {

    }

    public void SelectFP() throws Exception {

    }
    public void ExternalReferenceId() throws Exception {

    }
    public void Name() throws Exception {

    }
    public void search() throws Exception {
        Click(Search, "Click on search");
        //Search.click();
    }
    public void IdentNumber() throws Exception {

    }
    public void Search_AddEdit() throws Exception {

    }
    public void Adress() throws Exception {

    }

    public void DateOfBirthLabel() throws Exception {

    }
    public void DateOfBirth() throws Exception {

    }
    public void AgeLabel() throws Exception {

    }
    public void Age() throws Exception {

    }


    
}
