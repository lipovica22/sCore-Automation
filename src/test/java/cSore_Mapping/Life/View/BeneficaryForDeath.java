package cSore_Mapping.Life.View;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BeneficaryForDeath extends BasePage {
    public BeneficaryForDeath(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath= "//*[@id='Kol5']")
    WebElement PersonLabel;

    @FindBy(id= "ContentPlaceHolder1_Kol1_uc_wucBusinessEntityBaseSearch_selectFP")
    WebElement SelectFP;
    @FindBy(id= "ContentPlaceHolder1_Kol1_uc_wucBusinessEntityBaseSearch_tbExternalReferenceId")
    WebElement ExternalReferenceId;
    @FindBy(id= "ContentPlaceHolder1_Kol1_uc_wucBusinessEntityBaseSearch_tbName")
    WebElement Name;
    @FindBy(id= "ContentPlaceHolder1_Kol1_uc_wucBusinessEntityBaseSearch_spanSearch")
    WebElement Search;
    @FindBy(id= "ContentPlaceHolder1_Kol1_uc_wucBusinessEntityBaseSearch_tbIdentNumbers")
    WebElement IdentNumber;
    @FindBy(id= "ContentPlaceHolder1_Kol1_uc_wucBusinessEntityBaseSearch_addedit")
    WebElement Search_AddEdit;
    @FindBy(id= "ContentPlaceHolder1_Kol1_uc_wucBusinessEntityBaseSearch_tbAdress")
    WebElement Adress;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/div[1]/div/label")
    WebElement RelationLabel;
    @FindBy(id= "Kol2")
    WebElement Relation;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/div[2]/div/label")
    WebElement PercentageLabel;
    @FindBy(id= "Kol3")
    WebElement Percentage;


    //-------------------- Methods --------------------
    public void PersonLabel() throws Exception {}

    public void SelectFP() throws Exception {}
    public void ExternalReferenceId() throws Exception {}
    public void Name() throws Exception {}
    public void Search() throws Exception {}
    public void IdentNumber() throws Exception {}
    public void Search_AddEdit() throws Exception {}
    public void Adress() throws Exception {}

    public void RelationLabel() throws Exception {}
    public void inputRelation(String relation) throws Exception {
        SetValue(Relation,"Set relation",relation);

    }
    public void PercentageLabel() throws Exception {}
    public void inputPercentage(String persetnage) throws Exception {
        SetValue(Percentage,"Set relation",persetnage);
    }

    //-------------------- End Methods --------------------

}
