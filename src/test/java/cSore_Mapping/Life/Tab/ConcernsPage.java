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
    WebElement RiziciLabel;

    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/legend")
    WebElement CalculationDirectionHeaderLabel;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[1]/div/label")
    WebElement CalculationDirectionLabel;
    @FindBy(id= "Kol1")
    WebElement CalculationDirection;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[2]/div/label")
    WebElement InsuredSumOrPremiumLabel;
    @FindBy(id= "Kol2")
    WebElement InsuredSumOrPremium;

    @FindBy(id= "ContentPlaceHolder1_Kol5_uc_wucBusinessEntityBaseSearch_selectFP")
    WebElement BaseSearchFP;
    @FindBy(id= "ContentPlaceHolder1_Kol5_uc_wucBusinessEntityBaseSearch_tbExternalReferenceId")
    WebElement BaseSearchReferenceId;
    @FindBy(id= "ContentPlaceHolder1_Kol5_uc_wucBusinessEntityBaseSearch_tbName")
    WebElement BaseSearchName;

    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[1]/div/label")
    WebElement DateOfBirthLabel;
    @FindBy(id= "Kol7")
    WebElement DateOfBirth;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[2]/div/label")
    WebElement EntryAgeLabel;
    @FindBy(id= "Kol12")
    WebElement EntryAge;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[3]/div/label")
    WebElement GenderLabel;
    @FindBy(id= "Kol8")
    WebElement Gender;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[4]/div/label")
    WebElement HeightLabel;
    @FindBy(id= "Kol3")
    WebElement Height;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[5]/div/label")
    WebElement WeightLabel;
    @FindBy(id= "Kol4")
    WebElement Weight;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[6]/div/label")
    WebElement BMILabel;
    @FindBy(id= "Kol16")
    WebElement BMI;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[7]/div/label")
    WebElement InterestLabel;
    @FindBy(id= "Kol13")
    WebElement Interest;

    @FindBy(id= "basic-grid_3")
    WebElement ConcernListGrid;

    public void RiziciLabel() throws Exception {}

    public void CalculationDirectionHeaderLabel() throws Exception {}
    public void CalculationDirectionLabel() throws Exception {}
    public void selectCalculationDirection(String calculationDirection) throws Exception {
        SelectOption(CalculationDirection, "Select Calculation direction", calculationDirection);
    }
    public void InsuredSumOrPremiumLabel() throws Exception {}
    public void inputInsuredSumOrPremium(String sumOrPremium) throws Exception {
        SetValue(InsuredSumOrPremium, "Input insured sum or premium", sumOrPremium);
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
    public void inputHeight(String height) throws Exception {
        SetValue(Height, "Input height", height);
    }
    public void WeightLabel() throws Exception {}
    public void inputWeight(String weight) throws Exception {
        SetValue(Weight, "Input height", weight);
    }
    public void BMILabel() throws Exception {}
    public void BMI() throws Exception {

    }
    public void InterestLabel() throws Exception {}
    public void inputInterest(String interest) throws Exception {
        SetValue(Interest, "Input height",interest );
    }

    public void ConcernListGrid() throws Exception {}

}

