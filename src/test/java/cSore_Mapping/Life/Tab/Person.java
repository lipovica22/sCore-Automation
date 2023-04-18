package cSore_Mapping.Life.Tab;

import cSore_Mapping.Common.Pages.BasePage;
import io.cucumber.java.an.E;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Person extends BasePage {


    public Person(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(id= "Kol17")
    WebElement PayerInsureeSamePerson;
    @FindBy(xpath= "//body/form[@id='form1']//div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]")
    WebElement PayerInsureeSamePersonLabel;
    @FindBy(xpath= "//*[@id='Kol16']/div/div[2]/div/div/a")
    WebElement AddPayer;
    @FindBy(xpath= "//*[@id='Kol16']/div/div[1]/h4")
    WebElement PayerLabel;
    @FindBy(id= "basic-grid_16")
    WebElement PayerGrid;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[7]/div/div/div/label")
    WebElement HasLegalRepresentativeLabel;
    @FindBy(id= "Kol15")
    WebElement HasLegalRepresentative;

    @FindBy(xpath= "//*[@id='Kol10']/div/div[2]/div/div/a")
    WebElement AddLegalRepresentative;
    @FindBy(xpath= "//*[@id='Kol10']/div/div[1]/h4")
    WebElement LegalRepresentativeLabel;
    @FindBy(id= "basic-grid_10")
    WebElement LegalRepresentativeGrid;

    @FindBy(xpath= "//*[@id='Kol2']/div/div[2]/div/div")
    WebElement BeneficiaryForDeath;
    @FindBy(xpath= "//*[@id='Kol2']/div/div[1]/h4")
    WebElement BeneficiaryForDeathLabel;
    @FindBy(id= "basic-grid_2")
    WebElement BeneficiaryForDeathGrid;

    @FindBy(xpath= "//*[@id='Kol3']/div/div[2]/div/div")
    WebElement BeneficiaryForSurvivor;
    @FindBy(id= "basic-grid_3")
    WebElement BeneficiaryForSurvivorGrid;
    @FindBy(xpath= "//*[@id='Kol3']/div/div[1]/h4")
    WebElement BeneficiaryForSurvivorLabel;

    @FindBy(xpath= "//*[@id='Kol4']/div/div[2]/div/div")
    WebElement BeneficiaryForIllness;
    @FindBy(xpath= "//*[@id='Kol4']/div/div[1]/h4")
    WebElement BeneficiaryForIllnessLabel;
    @FindBy(id= "basic-grid_4")
    WebElement BeneficiaryForIllnessGrid;




    public void clickPayerInsureeSamePerson() throws Exception {
        Click(PayerInsureeSamePersonLabel, "Click on Payer Insuree Same Person");
    }
    public void PayerInsureeSamePersonLabel() throws Exception {}
    public void clickAddPayer() throws Exception {
        Click(AddPayer, "Click on add Payer");
    }

    public void PayerLabel() throws Exception {}
    public void PayerGrid() throws Exception {}

    public void HasLegalRepresentativeLabel() throws Exception {}
    public void clickHasLegalRepresentative() throws Exception {
        Click(HasLegalRepresentative, "Click on Has Legal Representative");
    }

    public void clickAddLegalRepresentative() throws Exception {
        Click(AddLegalRepresentative, "Click on add Legal Representative");
    }
    public void LegalRepresentativeLabel() throws Exception {}
    public void LegalRepresentativeGrid() throws Exception {}

    public void addBeneficiaryForDeath() throws Exception {
        Click(BeneficiaryForDeath,"BeneficiaryForDeath");
    }
    public void BeneficiaryForDeathLabel() throws Exception {}
    public void BeneficiaryForDeathGrid() throws Exception {}

    public void addBeneficiaryForSurvivor() throws Exception {
        Click(BeneficiaryForSurvivor,"BeneficiaryForSurvivor");
    }
    public void BeneficiaryForSurvivorGrid() throws Exception {}
    public void BeneficiaryForSurvivorLabel() throws Exception {}

    public void addBeneficiaryForIllness() throws Exception {
        Click(BeneficiaryForIllness,"BeneficiaryForIllness");
    }
    public void BeneficiaryForIllnessLabel() throws Exception {}
    public void BeneficiaryForIllnessGrid() throws Exception {}

}

