package cSore_Mapping.Common.Dialog.Iframe;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPersonPage extends BasePage {
    public SearchPersonPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName= "iframe")
    WebElement personFrame;
    @FindBy(id= "linkAdd")
    WebElement addNewButton;
    @FindBy(id= "MainContent_wucBusinessEntityTypes_ddlBusinessEntityTypes")
    WebElement entityTypes;
    @FindBy(xpath= "//*[@id='MainContent_wucIndividualBusinessEntitySearch_divFirstName']/label")
    WebElement firstNameLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_tbFirstName")
    WebElement firstName;
    @FindBy(xpath= "//*[@id='MainContent_wucIndividualBusinessEntitySearch_divSurname']/label")
    WebElement surnameLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_tbSurname")
    WebElement surname;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/fieldset/div[1]/div[3]/div[1]/label")
    WebElement IdentificationNumberLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_tbIdentificationNumber")
    WebElement identificationNumber;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/fieldset/div[1]/div[3]/div[2]/label")
    WebElement passportNumberLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_tbPassportNumber")
    WebElement passportNumber;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/fieldset/div[1]/div[3]/div[3]/label")
    WebElement telephoneLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_tbTelephone")
    WebElement telephone;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/fieldset/div[1]/div[4]/div[1]/label")
    WebElement streetLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_tbStreet")
    WebElement street;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/fieldset/div[1]/div[4]/div[2]/label")
    WebElement houseNumberLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_tbHouseNumber")
    WebElement houseNumber;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/fieldset/div[1]/div[4]/div[3]/label")
    WebElement placeLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_tbPlace")
    WebElement place;
    @FindBy(xpath= "//*[@id='MainContent_wucIndividualBusinessEntitySearch_divOnlyEmployees']/div/span")
    WebElement employeesLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_cbEmployees")
    WebElement employees;
    @FindBy(xpath= "//*[@id='MainContent_wucIndividualBusinessEntitySearch_divOnlyIntermediaries']/span")
    WebElement intermediariesLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_cbIntermediaries")
    WebElement intermediaries;
    @FindBy(xpath= "//*[@id='MainContent_wucIndividualBusinessEntitySearch_divOnlySuppliers']/span")
    WebElement suppliersLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_cbSuppliers")
    WebElement suppliers;
    @FindBy(xpath= "//*[@id='MainContent_wucIndividualBusinessEntitySearch_divOnlyEntrepreneurs']/span")
    WebElement entrepreneursLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_cbEntrepreneurs")
    WebElement entrepreneurs;
    @FindBy(xpath= "//*[@id='MainContent_wucIndividualBusinessEntitySearch_divOnlyActive']/span")
    WebElement activeLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_cbOnlyActive")
    WebElement active;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_SearchButton")
    WebElement searchButton;

}

