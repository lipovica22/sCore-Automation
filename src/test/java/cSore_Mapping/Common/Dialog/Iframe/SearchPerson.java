package cSore_Mapping.Common.Dialog.Iframe;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPerson extends BasePage {


    public SearchPerson(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName= "iframe")
    WebElement PersonFrame;
    @FindBy(id= "linkAdd")
    WebElement AddNewButton;
    @FindBy(id= "MainContent_wucBusinessEntityTypes_ddlBusinessEntityTypes")
    WebElement EntityTypes;
    @FindBy(xpath= "//*[@id='MainContent_wucIndividualBusinessEntitySearch_divFirstName']/label")
    WebElement FirstNameLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_tbFirstName")
    WebElement FirstName;
    @FindBy(xpath= "//*[@id='MainContent_wucIndividualBusinessEntitySearch_divSurname']/label")
    WebElement SurnameLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_tbSurname")
    WebElement Surname;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/fieldset/div[1]/div[3]/div[1]/label")
    WebElement IdentificationNumberLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_tbIdentificationNumber")
    WebElement IdentificationNumber;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/fieldset/div[1]/div[3]/div[2]/label")
    WebElement PassportNumberLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_tbPassportNumber")
    WebElement PassportNumber;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/fieldset/div[1]/div[3]/div[3]/label")
    WebElement TelephoneLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_tbTelephone")
    WebElement Telephone;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/fieldset/div[1]/div[4]/div[1]/label")
    WebElement StreetLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_tbStreet")
    WebElement Street;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/fieldset/div[1]/div[4]/div[2]/label")
    WebElement HouseNumberLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_tbHouseNumber")
    WebElement HouseNumber;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/fieldset/div[1]/div[4]/div[3]/label")
    WebElement PlaceLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_tbPlace")
    WebElement Place;
    @FindBy(xpath= "//*[@id='MainContent_wucIndividualBusinessEntitySearch_divOnlyEmployees']/div/span")
    WebElement EmployeesLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_cbEmployees")
    WebElement Employees;
    @FindBy(xpath= "//*[@id='MainContent_wucIndividualBusinessEntitySearch_divOnlyIntermediaries']/span")
    WebElement IntermediariesLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_cbIntermediaries")
    WebElement Intermediaries;
    @FindBy(xpath= "//*[@id='MainContent_wucIndividualBusinessEntitySearch_divOnlySuppliers']/span")
    WebElement SuppliersLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_cbSuppliers")
    WebElement Suppliers;
    @FindBy(xpath= "//*[@id='MainContent_wucIndividualBusinessEntitySearch_divOnlyEntrepreneurs']/span")
    WebElement EntrepreneursLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_cbEntrepreneurs")
    WebElement Entrepreneurs;
    @FindBy(xpath= "//*[@id='MainContent_wucIndividualBusinessEntitySearch_divOnlyActive']/span")
    WebElement ActiveLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_cbOnlyActive")
    WebElement Active;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_SearchButton")
    WebElement SearchButton;

    public void PersonFrame() throws Exception {}
    public void AddNewButton() throws Exception {}
    public void chooseEntityTypes(String entity) throws Exception {
        EntityTypes.sendKeys(entity);
    }
    public void FirstNameLabel() throws Exception {}
    public void FirstName() throws Exception {}
    public void SurnameLabel() throws Exception {}
    public void Surname() throws Exception {}
    public void IdentificationNumberLabel() throws Exception {}
    public void IdentificationNumber(String JMBG) throws Exception {
        IdentificationNumber.sendKeys(JMBG);
    }
    public void PassportNumberLabel() throws Exception {}
    public void PassportNumber() throws Exception {}
    public void TelephoneLabel() throws Exception {}
    public void Telephone() throws Exception {}
    public void StreetLabel() throws Exception {}
    public void Street() throws Exception {}
    public void HouseNumberLabel() throws Exception {}
    public void HouseNumber() throws Exception {}
    public void PlaceLabel() throws Exception {}
    public void Place() throws Exception {}
    public void EmployeesLabel() throws Exception {}
    public void Employees() throws Exception {}
    public void IntermediariesLabel() throws Exception {}
    public void Intermediaries() throws Exception {}
    public void SuppliersLabel() throws Exception {}
    public void Suppliers() throws Exception {}
    public void EntrepreneursLabel() throws Exception {}
    public void Entrepreneurs() throws Exception {}
    public void ActiveLabel() throws Exception {}
    public void Active() throws Exception {}
    public void clickSearchButton() throws Exception {
        SearchButton.click();
    }






}

