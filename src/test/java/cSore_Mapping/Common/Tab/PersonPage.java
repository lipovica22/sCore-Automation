package cSore_Mapping.Common.Tab;

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

    @FindBy(id= "Kol7")
    WebElement samePerson;
    @FindBy(css = "label[for='Kol7']")
    WebElement samePersonLabel;
    @FindBy(xpath= "//*[@id='Kol1']/div/div[1]/h4")
    WebElement policyHolder;
    @FindBy(xpath= "//*[@id='Kol1']/div/div[2]/div/div/a")
    WebElement addPersonPolicyHolder;
    @FindBy(id= "basic-grid_1")
    WebElement policyHolderGrid;
    @FindBy(xpath= "//*[@id='Kol6']/div/div[1]/h4")
    WebElement insuredPerson;
    @FindBy(xpath= "//*[@id='Kol6']/div/div[2]/div/div/a")
    WebElement addInsuredPerson;
    @FindBy(id= "basic-grid_6")
    WebElement insuredPersonGrid;
    @FindBy(id= "Kol20")
    WebElement addSamePerson;

    @FindBy(xpath= "//*[@id='Kol5']/div/div[2]/div/div")
    WebElement AddContactPerson;
    @FindBy(xpath= "//*[@id='Kol5']/div/div[1]/h4")
    WebElement ContactPersonLabel;
    @FindBy(id= "basic-grid_5")
    WebElement ContactPersonGrid;

    @FindBy(xpath= "//*[@id='Kol8']/div/div[1]/h4")
    WebElement SMSNotificationLabel;
    @FindBy(xpath= "//*[@id='Kol8']/div/div[2]/div/div")
    WebElement AddSMSNotification;


    //-------------------- Methods --------------------
    public void clickSamePerson() throws Exception {
        Click(samePersonLabel, "Click on same person");
        //SamePersonLabel.click();
    }
    public void clickPolicyHolder() throws Exception {
        Click(policyHolder, "Click on policy holder");
    }
    public void clickAddPersonPolicyHolder() throws Exception {
        Click(addPersonPolicyHolder, "Click on person policy holder");
    }
    public void clickInsuredPerson() throws Exception{
        Click(insuredPerson, "Click on insured person");
    }
    public void clickAddInsuredPerson() throws Exception {
        Click(addInsuredPerson, "Click on add insured person");
    }
    public void clickAddSamePerson() throws Exception {
        Click(addSamePerson, "Click on add same person");
    }
    public void AddSamePerson() throws Exception {
        addSamePerson.click();
    }

    //-------------------- End Methods --------------------
}

