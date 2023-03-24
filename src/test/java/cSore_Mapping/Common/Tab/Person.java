package cSore_Mapping.Common.Tab;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Person extends BasePage {


    public Person(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id= "Kol7")
    WebElement SamePerson;
    @FindBy(css = "label[for='Kol7']")
    WebElement SamePersonLabel;
    @FindBy(xpath= "//*[@id='Kol1']/div/div[1]/h4")
    WebElement PolicyHolder;
    @FindBy(xpath= "//*[@id='Kol1']/div/div[2]/div/div/a")
    WebElement AddPersonPolicyHolder;
    @FindBy(id= "basic-grid_1")
    WebElement PolicyHolderGrid;
    @FindBy(xpath= "//*[@id='Kol6']/div/div[1]/h4")
    WebElement InsuredPerson;
    @FindBy(xpath= "//*[@id='Kol6']/div/div[2]/div/div/a")
    WebElement AddInsuredPerson;
    @FindBy(id= "basic-grid_6")
    WebElement InsuredPersonGrid;
    @FindBy(id= "Kol20")
    WebElement AddSamePerson;

    public void clickSamePerson() throws Exception {
        SamePersonLabel.click();
    }
    public void SamePersonLabel() throws Exception {
        SamePersonLabel.click();
    }
    public void clickPolicyHolder() throws Exception {
        Thread.sleep(5000);
        PolicyHolder.click();
    }
    public void AddPersonPolicyHolder() throws Exception {
        Thread.sleep(5000);
        AddPersonPolicyHolder.click();
    }
    public void PolicyHolderGrid() throws Exception {

    }
    public void InsuredPerson() throws Exception{
        InsuredPerson.click();
    }
    public void AddInsuredPerson() throws Exception {
        AddInsuredPerson.click();
    }
    public void InsuredPersonGrid() throws Exception {

    }
    public void AddSamePerson() throws Exception {
        AddSamePerson.click();
    }


}

