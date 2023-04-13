package cSore_Mapping.Life.Tab;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class ConcernsPage extends BasePage {
    public ConcernsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[2]/div/fieldset/legend")
    WebElement riziciLabel;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/legend")
    WebElement calculationDirectionHeaderLabel;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[1]/div/label")
    WebElement calculationDirectionLabel;
    @FindBy(id= "Kol1")
    WebElement calculationDirection;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[2]/div/label")
    WebElement insuredSumOrPremiumLabel;
    @FindBy(id= "Kol2")
    WebElement insuredSumOrPremium;
    @FindBy(id= "ContentPlaceHolder1_Kol5_uc_wucBusinessEntityBaseSearch_selectFP")
    WebElement baseSearchFP;
    @FindBy(id= "ContentPlaceHolder1_Kol5_uc_wucBusinessEntityBaseSearch_tbExternalReferenceId")
    WebElement baseSearchReferenceId;
    @FindBy(id= "ContentPlaceHolder1_Kol5_uc_wucBusinessEntityBaseSearch_tbName")
    WebElement baseSearchName;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[1]/div/label")
    WebElement dateOfBirthLabel;
    @FindBy(id= "Kol7")
    WebElement dateOfBirth;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[2]/div/label")
    WebElement entryAgeLabel;
    @FindBy(id= "Kol12")
    WebElement entryAge;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[3]/div/label")
    WebElement genderLabel;
    @FindBy(id= "Kol8")
    WebElement gender;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[4]/div/label")
    WebElement heightLabel;
    @FindBy(id= "Kol3")
    WebElement height;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[5]/div/label")
    WebElement weightLabel;
    @FindBy(id= "Kol4")
    WebElement weight;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[6]/div/label")
    WebElement bmiLabel;
    @FindBy(id= "Kol16")
    WebElement bmi;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[7]/div/label")
    WebElement interestLabel;
    @FindBy(id= "Kol13")
    WebElement interest;
    @FindBy(id= "basic-grid_3")
    WebElement concernListGrid;

    //-------------------- Methods --------------------
    public void RiziciLabel() throws Exception {}
    public void CalculationDirectionHeaderLabel() throws Exception {}
    public void CalculationDirectionLabel() throws Exception {}
    public void selectCalculationDirection(String valueCalculationDirection) throws Exception {
        SelectOption(calculationDirection, "Select Calculation direction", valueCalculationDirection);
    }
    public void InsuredSumOrPremiumLabel() throws Exception {}
    public void setInsuredSumOrPremium(String sumOrPremium) throws Exception {
        SetValue(insuredSumOrPremium, "Input insured sum or premium", sumOrPremium);
    }

    public void BaseSearchFP() throws Exception {}
    public void BaseSearchReferenceId() throws Exception {}
    public void BaseSearchName() throws Exception {}

    public void DateOfBirthLabel() throws Exception {}
    public void DateOfBirth() throws Exception {}
    public void EntryAgeLabel() throws Exception {}
    public void EntryAge() throws Exception {}
    public void GenderLabel() throws Exception {}
    public void Gender() throws Exception {}
    public void HeightLabel() throws Exception {}
    public void setHeight(String valueHeight) throws Exception {
        SetValue(height, "Input height", valueHeight);
    }
    public void WeightLabel() throws Exception {}
    public void setWeight(String valueWeight) throws Exception {
        SetValue(weight, "Input height", valueWeight);
    }
    public void BMILabel() throws Exception {}
    public void BMI() throws Exception {

    }
    public void InterestLabel() throws Exception {}
    public void setInterest(String valueInterest) throws Exception {
        SetValue(interest, "Input height", valueInterest );
    }

    public void ConcernListGrid() throws Exception {}
    //-------------------- End Methods --------------------
}

