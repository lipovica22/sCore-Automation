package cSore_Mapping.Health.Tab;

import cSore_Mapping.Common.Pages.BasePage;
import core_class.ApplicationBase;
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
    WebElement opstiUgovorniElementi;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/div[1]/div/label")
    WebElement packageLabel;
    @FindBy(id= "Kol5")
    WebElement packages;
    @FindBy(id= "Kol12")
    WebElement packageDescriptions;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/div[3]/div/label")
    WebElement insuredSum;
    @FindBy(id= "Kol6")
    WebElement insuredSumList;
    @FindBy(id= "Kol10")
    WebElement currency;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/div[5]/div/label")
    WebElement correctionLabel;
    @FindBy(id= "Kol7")
    WebElement correction;
    @FindBy(id= "Kol11")
    WebElement correctionCurrency;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/div[7]/div/label")
    WebElement franchiseLabel;
    @FindBy(id= "Kol4")
    WebElement franchise;
    @FindBy(id= "")
    WebElement franchiseCurrency;
    @FindBy(xpath= "//*[@id='ContentPlaceHolder1_Kol8_uc_display_inline']/div[1]")
    WebElement fileUploadLabel;
    @FindBy(css= "input[name='file2Upload']")
    WebElement fileUpload;
    @FindBy(xpath= "//*[@id='ContentPlaceHolder1_Kol8_uc_div1']/div/a")
    WebElement find;
    @FindBy(xpath= "//*[@id='ContentPlaceHolder1_Kol8_uc_divButton1']/div/a")
    WebElement add;
    @FindBy(id= "Kol2")
    WebElement addConcern;
    @FindBy(id= "basic-grid_3")
    WebElement concernListGrid;
    @FindBy(xpath= "//*[@id='Kol5']")
    WebElement concernsLabel;
    @FindBy(id= "ContentPlaceHolder1_ucContainer1")
    WebElement selectFP;
    @FindBy(id= "ContentPlaceHolder1_Kol7_uc_wucBusinessEntityBaseSearch_tbExternalReferenceId")
    WebElement externalReferenceId;
    @FindBy(id= "ContentPlaceHolder1_Kol7_uc_wucBusinessEntityBaseSearch_tbName")
    WebElement name;
    @FindBy(id= "ContentPlaceHolder1_Kol7_uc_wucBusinessEntityBaseSearch_search")
    WebElement search;
    @FindBy(id= "ContentPlaceHolder1_Kol7_uc_wucBusinessEntityBaseSearch_tbIdentNumbers")
    WebElement identNumber;
    @FindBy(id= "ContentPlaceHolder1_Kol7_uc_wucBusinessEntityBaseSearch_addedit")
    WebElement search_AddEdit;
    @FindBy(id= "ContentPlaceHolder1_Kol7_uc_wucBusinessEntityBaseSearch_tbAdress")
    WebElement adress;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div/div[2]/fieldset/div[1]/div[2]/div[1]/div/label")
    WebElement dateOfBirthLabel;
    @FindBy(id= "Kol5")
    WebElement dateOfBirth;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div/div[2]/fieldset/div[1]/div[2]/div[2]/div/label")
    WebElement ageLabel;
    @FindBy(id= "Kol6")
    WebElement age;

    //-------------------- Methods --------------------
    public void selectPackage(String valuePackage) throws Exception {
        SelectOption(packages, "Select package", valuePackage);
    }
    public void selectInsuredSumList(String valueSumList) throws Exception {
        SelectOption(insuredSumList, "Select insured sum list", valueSumList);
    }
    public void selectCorrection(String valueCorrection) throws Exception {
        int ifValueZero = Integer.parseInt(valueCorrection);

        if (ifValueZero != 0){
            SelectOption(correction, "Select correction", valueCorrection);
        }
    }
    public void selectFranchise(String valueFranchise) throws Exception {
        SelectOption(franchise, "Select franchise", valueFranchise);
    }
    public void fileUpload(String valueFileName) throws Exception {
        //String valueSet= "C:/Users/rss0105/IdeaProjects/DemoProject/sCore-Automation/src/test/FilesForUpload/" + valueFileName + ".xlsm";
        //fileUpload.sendKeys(valueSet);
        SetValuePackage(fileUpload, "Upload excel file for package", ApplicationBase.pathXlsm(valueFileName));
    }
    public void clickFind() throws Exception {
        Click(find, "Click on find");
    }
    public void add() throws Exception {
        Click(add, "Click on add");
    }
    public void clickAddConcern() throws Exception {
        Click(addConcern, "Click on add concern");
    }
    public void search() throws Exception {
        Click(search, "Click on search");
    }
    //-------------------- End Methods --------------------
}
