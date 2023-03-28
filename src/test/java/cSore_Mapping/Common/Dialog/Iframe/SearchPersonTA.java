package cSore_Mapping.Common.Dialog.Iframe;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPersonTA extends BasePage {
    public SearchPersonTA(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName= "iframe")
    WebElement personFrame;
    @FindBy(id= "linkAdd")
    WebElement addNewButton;
    @FindBy(id= "MainContent_wucBusinessEntityTypes_ddlBusinessEntityTypes")
    WebElement entityTypes;
    @FindBy(xpath= "//*[@id='MainContent_wucIndividualBusinessEntitySearch_divSurname']/label")
    WebElement surnameLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_tbSurname")
    WebElement surname;
    @FindBy(xpath= "//*[@id='MainContent_wucIndividualBusinessEntitySearch_divFirstName']/label")
    WebElement firstNameLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_tbFirstName")
    WebElement firstName;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/fieldset/div[1]/div[3]/div[1]/label")
    WebElement identificationNumberLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_tbIdentificationNumber")
    WebElement identificationNumber;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/fieldset/div[1]/div[3]/div[2]/label")
    WebElement passportNumberLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_tbPassportNumber")
    WebElement passportNumber;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/fieldset/div[1]/div[4]/div[1]/label")
    WebElement streetLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_tbStreet")
    WebElement street;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/fieldset/div[1]/div[3]/div[3]/label")
    WebElement telephoneLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_tbTelephone")
    WebElement telephone;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/fieldset/div[1]/div[4]/div[2]/label")
    WebElement houseNumberLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_tbHouseNumber")
    WebElement houseNumber;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/fieldset/div[1]/div[4]/div[3]/label")
    WebElement placeLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_tbPlace")
    WebElement place;
    @FindBy(xpath= "//*[@id='MainContent_wucIndividualBusinessEntitySearch_divOnlyIntermediaries']/span")
    WebElement intermediariesLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_cbIntermediaries")
    WebElement intermediaries;
    @FindBy(xpath= "//*[@id='MainContent_wucIndividualBusinessEntitySearch_divOnlyEmployees']/div/span")
    WebElement employeesLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_cbEmployees")
    WebElement employees;
    @FindBy(xpath= "//*[@id='MainContent_wucIndividualBusinessEntitySearch_divOnlySuppliers']/span")
    WebElement suppliersLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_cbSuppliers")
    WebElement suppliers;
    @FindBy(xpath= "//*[@id='MainContent_wucIndividualBusinessEntitySearch_divOnlyEntrepreneurs']/span")
    WebElement entrepreneursLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_cbEntrepreneurs")
    WebElement entrepreneurs;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_cbOnlyActive")
    WebElement active;
    @FindBy(xpath= "//*[@id='MainContent_wucIndividualBusinessEntitySearch_divOnlyActive']/span")
    WebElement activeLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_SearchButton")
    WebElement searchButtonFL;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_IndividualBusinessEntitiesListView_ProcessingButton_0")
    WebElement searchResultGridFL;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_IndividualBusinessEntitiesListView_dpIndividualBusinessEntities")
    WebElement footerGridFL;
    @FindBy(id= "Addlink")
    WebElement addNewButtonPL;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/div[2]/fieldset/legend")
    WebElement searchPLLabel;
    @FindBy(xpath= "//*[@id='MainContent_wucLegalBusinessEntitySearch_divFullName']/label")
    WebElement nazivLabela;
    @FindBy(id= "ctl00$MainContent$wucLegalBusinessEntitySearch$tbFullName")
    WebElement naziv;
    @FindBy(xpath= "//*[@id='MainContent_wucLegalBusinessEntitySearch_divIdentificationNumber']/label")
    WebElement pibLabel;
    @FindBy(id= "MainContent_wucLegalBusinessEntitySearch_tbIdentificationNumber")
    WebElement pib;
    @FindBy(xpath= "//*[@id='MainContent_wucLegalBusinessEntitySearch_divMBR']/label")
    WebElement mbrLabel;
    @FindBy(id= "MainContent_wucLegalBusinessEntitySearch_tbMBR")
    WebElement mbr;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/div[2]/fieldset/div[1]/div[2]/div[1]/label")
    WebElement placeLabelPL;
    @FindBy(id= "MainContent_wucLegalBusinessEntitySearch_tbPlace")
    WebElement placePL;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/div[2]/fieldset/div[1]/div[2]/div[3]/label")
    WebElement houseNumberLabelPL;
    @FindBy(id= "MainContent_wucLegalBusinessEntitySearch_tbHouseNumber")
    WebElement houseNumberPL;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/div[2]/fieldset/div[1]/div[2]/div[2]/label")
    WebElement streetLabelPL;
    @FindBy(id= "MainContent_wucLegalBusinessEntitySearch_tbStreet")
    WebElement streetPL;
    @FindBy(xpath= "//*[@id='MainContent_wucLegalBusinessEntitySearch_divTelephone']/label")
    WebElement telephoneLabelPL;
    @FindBy(id= "MainContent_wucLegalBusinessEntitySearch_tbTelephone")
    WebElement telephonePL;
    @FindBy(xpath= "//*[@id='MainContent_wucLegalBusinessEntitySearch_divOnlyBanks']/span")
    WebElement banksLabel;
    @FindBy(id= "MainContent_wucLegalBusinessEntitySearch_cbBanks")
    WebElement banks;
    @FindBy(xpath= "//*[@id='MainContent_wucLegalBusinessEntitySearch_divOnlyIntermediaries']/span")
    WebElement intermediariesLabelPL;
    @FindBy(id= "MainContent_wucLegalBusinessEntitySearch_cbIntermediaries")
    WebElement intermediariesPL;
    @FindBy(xpath= "//*[@id='MainContent_wucLegalBusinessEntitySearch_divOnlyAgencies']/span")
    WebElement agenciesLabel;
    @FindBy(id= "MainContent_wucLegalBusinessEntitySearch_cbAgencies")
    WebElement agencies;
    @FindBy(xpath= "//*[@id='MainContent_wucLegalBusinessEntitySearch_divOnlySuppliers']/span")
    WebElement suppliersLabelPL;
    @FindBy(id= "MainContent_wucLegalBusinessEntitySearch_cbSuppliers")
    WebElement suppliersPL;
    @FindBy(xpath= "//*[@id='MainContent_wucLegalBusinessEntitySearch_divOnlyActive']/span")
    WebElement activePersonsLabel;
    @FindBy(id= "MainContent_wucLegalBusinessEntitySearch_cbOnlyActive")
    WebElement activePersons;
    @FindBy(xpath= "//*[@id='MainContent_wucLegalBusinessEntitySearch_divOnlyAgricultureEntities']/span")
    WebElement agricultureEntitiesLabel;
    @FindBy(id= "MainContent_wucLegalBusinessEntitySearch_cbAgricultureEntities")
    WebElement agricultureEntities;
    @FindBy(id= "MainContent_wucLegalBusinessEntitySearch_SearchButton")
    WebElement searchButtonPL;
    @FindBy(id= "MainContent_wucLegalBusinessEntitySearch_LegalBusinessEntitiesListView_tblBE")
    WebElement searchResultGridPL;
    @FindBy(id= "MainContent_wucLegalBusinessEntitySearch_LegalBusinessEntitiesListView_dpLegalBusinessEntities")
    WebElement footerGridPL;


    //-------------------- Methods --------------------
    public void setChooseEntityTypes(String entity) throws Exception {
        SetValue(entityTypes, "Set entity types", entity);
    }
    public void setInputIdentificationNumber(String valueJmbg) throws Exception {
        SetValue(identificationNumber, "Set value JMBG", valueJmbg);
    }
    public void clickSearchButtonFL() throws Exception {
        Click(searchButtonFL, "Click on search FL");
    }
    public void clickSearchResultGridFL() throws Exception {
        Click(searchResultGridFL, "Click on grid FL");
    }
    public void setInputPIB(String valuePib) throws Exception {
        SetValue(pib, "Set pib", valuePib);
    }
    public void clickSearchButtonPL() throws Exception {
        Click(searchButtonPL, "Click on search PL");
    }
    //-------------------- End Methods --------------------
}

