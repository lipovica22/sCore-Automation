package cSore_Mapping.Life.Tab;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonPage extends BasePage {
    public PersonPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id= "Kol17")
    WebElement payerInsureeSamePerson;
    @FindBy(xpath= "//body/form[@id='form1']//div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]")
    WebElement payerInsureeSamePersonLabel;
    @FindBy(xpath= "//*[@id='Kol16']/div/div[2]/div/div/a")
    WebElement addPayer;
    @FindBy(xpath= "//*[@id='Kol16']/div/div[1]/h4")
    WebElement payerLabel;
    @FindBy(id= "basic-grid_16")
    WebElement payerGrid;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[7]/div/div/div/label")
    WebElement hasLegalRepresentativeLabel;
    @FindBy(id= "Kol15")
    WebElement hasLegalRepresentative;
    @FindBy(xpath= "//*[@id='Kol10']/div/div[2]/div/div/a")
    WebElement addLegalRepresentative;
    @FindBy(xpath= "//*[@id='Kol10']/div/div[1]/h4")
    WebElement legalRepresentativeLabel;
    @FindBy(id= "basic-grid_10")
    WebElement legalRepresentativeGrid;
    @FindBy(xpath= "//*[@id='Kol2']/div/div[2]/div/div")
    WebElement beneficiaryForDeath;
    @FindBy(xpath= "//*[@id='Kol2']/div/div[1]/h4")
    WebElement beneficiaryForDeathLabel;
    @FindBy(id= "basic-grid_2")
    WebElement beneficiaryForDeathGrid;
    @FindBy(xpath= "//*[@id='Kol3']/div/div[2]/div/div")
    WebElement beneficiaryForSurvivor;
    @FindBy(id= "basic-grid_3")
    WebElement beneficiaryForSurvivorGrid;
    @FindBy(xpath= "//*[@id='Kol3']/div/div[1]/h4")
    WebElement beneficiaryForSurvivorLabel;
    @FindBy(xpath= "//*[@id='Kol4']/div/div[2]/div/div")
    WebElement beneficiaryForIllness;
    @FindBy(xpath= "//*[@id='Kol4']/div/div[1]/h4")
    WebElement beneficiaryForIllnessLabel;
    @FindBy(id= "basic-grid_4")
    WebElement beneficiaryForIllnessGrid;

//--------------------- Methods -----------------------
    public void clickPayerInsureeSamePerson() throws Exception {
        Click(payerInsureeSamePersonLabel, "Click on Payer Insuree Same Person");
    }
    public void PayerInsureeSamePersonLabel() throws Exception {}
    public void clickAddPayer() throws Exception {
        Click(addPayer, "Click on add Payer");
    }

    public void PayerLabel() throws Exception {}
    public void PayerGrid() throws Exception {}

    public void HasLegalRepresentativeLabel() throws Exception {}
    public void clickHasLegalRepresentative() throws Exception {
        Click(hasLegalRepresentative, "Click on Has Legal Representative");
    }

    public void clickAddLegalRepresentative() throws Exception {
        Click(addLegalRepresentative, "Click on add Legal Representative");
    }
    public void LegalRepresentativeLabel() throws Exception {}
    public void LegalRepresentativeGrid() throws Exception {}

    public void addBeneficiaryForDeath() throws Exception {
        Click(beneficiaryForDeath,"BeneficiaryForDeath");
    }
    public void BeneficiaryForDeathLabel() throws Exception {}
    public void BeneficiaryForDeathGrid() throws Exception {}

    public void addBeneficiaryForSurvivor() throws Exception {
        Click(beneficiaryForSurvivor,"BeneficiaryForSurvivor");
    }
    public void BeneficiaryForSurvivorGrid() throws Exception {}
    public void BeneficiaryForSurvivorLabel() throws Exception {}

    public void addBeneficiaryForIllness() throws Exception {
        Click(beneficiaryForIllness,"BeneficiaryForIllness");
    }
    public void BeneficiaryForIllnessLabel() throws Exception {}
    public void BeneficiaryForIllnessGrid() throws Exception {}

    //--------------------- End Methods -----------------------
}

