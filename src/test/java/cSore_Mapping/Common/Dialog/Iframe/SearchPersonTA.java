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

    @FindBy(tagName= "iframe")   WebElement PersonFrame;
    @FindBy(id= "linkAdd")   WebElement AddNewButton;
    @FindBy(id= "MainContent_wucBusinessEntityTypes_ddlBusinessEntityTypes")   WebElement EntityTypes;
    @FindBy(xpath= "//*[@id='MainContent_wucIndividualBusinessEntitySearch_divSurname']/label")   WebElement SurnameLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_tbSurname")   WebElement Surname;
    @FindBy(xpath= "//*[@id='MainContent_wucIndividualBusinessEntitySearch_divFirstName']/label")   WebElement FirstNameLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_tbFirstName")   WebElement FirstName;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/fieldset/div[1]/div[3]/div[1]/label")   WebElement IdentificationNumberLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_tbIdentificationNumber")   WebElement IdentificationNumber;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/fieldset/div[1]/div[3]/div[2]/label")   WebElement PassportNumberLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_tbPassportNumber")   WebElement PassportNumber;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/fieldset/div[1]/div[4]/div[1]/label")   WebElement StreetLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_tbStreet")   WebElement Street;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/fieldset/div[1]/div[3]/div[3]/label")   WebElement TelephoneLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_tbTelephone")   WebElement Telephone;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/fieldset/div[1]/div[4]/div[2]/label")   WebElement HouseNumberLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_tbHouseNumber")   WebElement HouseNumber;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/fieldset/div[1]/div[4]/div[3]/label")   WebElement PlaceLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_tbPlace")   WebElement Place;
    @FindBy(xpath= "//*[@id='MainContent_wucIndividualBusinessEntitySearch_divOnlyIntermediaries']/span")   WebElement IntermediariesLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_cbIntermediaries")   WebElement Intermediaries;
    @FindBy(xpath= "//*[@id='MainContent_wucIndividualBusinessEntitySearch_divOnlyEmployees']/div/span")   WebElement EmployeesLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_cbEmployees")   WebElement Employees;
    @FindBy(xpath= "//*[@id='MainContent_wucIndividualBusinessEntitySearch_divOnlySuppliers']/span")   WebElement SuppliersLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_cbSuppliers")   WebElement Suppliers;
    @FindBy(xpath= "//*[@id='MainContent_wucIndividualBusinessEntitySearch_divOnlyEntrepreneurs']/span")   WebElement EntrepreneursLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_cbEntrepreneurs")   WebElement Entrepreneurs;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_cbOnlyActive")   WebElement Active;
    @FindBy(xpath= "//*[@id='MainContent_wucIndividualBusinessEntitySearch_divOnlyActive']/span")   WebElement ActiveLabel;
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_SearchButton")   WebElement SearchButtonFL;

    //@FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_IndividualBusinessEntitiesListView_tblBE")
    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_IndividualBusinessEntitiesListView_ProcessingButton_0")
    WebElement SearchResultGridFL;

    @FindBy(id= "MainContent_wucIndividualBusinessEntitySearch_IndividualBusinessEntitiesListView_dpIndividualBusinessEntities")   WebElement FooterGridFL;

    @FindBy(id= "Addlink")   WebElement AddNewButtonPL;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/div[2]/fieldset/legend")   WebElement SearchPLLabel;

    @FindBy(xpath= "//*[@id='MainContent_wucLegalBusinessEntitySearch_divFullName']/label")   WebElement NazivLabela;
    @FindBy(id= "ctl00$MainContent$wucLegalBusinessEntitySearch$tbFullName")   WebElement Naziv;
    @FindBy(xpath= "//*[@id='MainContent_wucLegalBusinessEntitySearch_divIdentificationNumber']/label")   WebElement PIBLabel;
    @FindBy(id= "MainContent_wucLegalBusinessEntitySearch_tbIdentificationNumber")   WebElement PIB;
    @FindBy(xpath= "//*[@id='MainContent_wucLegalBusinessEntitySearch_divMBR']/label")   WebElement MBRLabel;
    @FindBy(id= "MainContent_wucLegalBusinessEntitySearch_tbMBR")   WebElement MBR;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/div[2]/fieldset/div[1]/div[2]/div[1]/label")   WebElement PlaceLabelPL;
    @FindBy(id= "MainContent_wucLegalBusinessEntitySearch_tbPlace")   WebElement PlacePL;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/div[2]/fieldset/div[1]/div[2]/div[3]/label")   WebElement HouseNumberLabelPL;
    @FindBy(id= "MainContent_wucLegalBusinessEntitySearch_tbHouseNumber")   WebElement HouseNumberPL;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/div[2]/fieldset/div[1]/div[2]/div[2]/label")   WebElement StreetLabelPL;
    @FindBy(id= "MainContent_wucLegalBusinessEntitySearch_tbStreet")   WebElement StreetPL;
    @FindBy(xpath= "//*[@id='MainContent_wucLegalBusinessEntitySearch_divTelephone']/label")   WebElement TelephoneLabelPL;
    @FindBy(id= "MainContent_wucLegalBusinessEntitySearch_tbTelephone")   WebElement TelephonePL;

    @FindBy(xpath= "//*[@id='MainContent_wucLegalBusinessEntitySearch_divOnlyBanks']/span")   WebElement BanksLabel;
    @FindBy(id= "MainContent_wucLegalBusinessEntitySearch_cbBanks")   WebElement Banks;
    @FindBy(xpath= "//*[@id='MainContent_wucLegalBusinessEntitySearch_divOnlyIntermediaries']/span")   WebElement IntermediariesLabelPL;
    @FindBy(id= "MainContent_wucLegalBusinessEntitySearch_cbIntermediaries")   WebElement IntermediariesPL;
    @FindBy(xpath= "//*[@id='MainContent_wucLegalBusinessEntitySearch_divOnlyAgencies']/span")   WebElement AgenciesLabel;
    @FindBy(id= "MainContent_wucLegalBusinessEntitySearch_cbAgencies")   WebElement Agencies;
    @FindBy(xpath= "//*[@id='MainContent_wucLegalBusinessEntitySearch_divOnlySuppliers']/span")   WebElement SuppliersLabelPL;
    @FindBy(id= "MainContent_wucLegalBusinessEntitySearch_cbSuppliers")   WebElement SuppliersPL;
    @FindBy(xpath= "//*[@id='MainContent_wucLegalBusinessEntitySearch_divOnlyActive']/span")   WebElement ActivePersonsLabel;
    @FindBy(id= "MainContent_wucLegalBusinessEntitySearch_cbOnlyActive")   WebElement ActivePersons;
    @FindBy(xpath= "//*[@id='MainContent_wucLegalBusinessEntitySearch_divOnlyAgricultureEntities']/span")   WebElement AgricultureEntitiesLabel;
    @FindBy(id= "MainContent_wucLegalBusinessEntitySearch_cbAgricultureEntities")   WebElement AgricultureEntities;

    @FindBy(id= "MainContent_wucLegalBusinessEntitySearch_SearchButton")   WebElement SearchButtonPL;
    @FindBy(id= "MainContent_wucLegalBusinessEntitySearch_LegalBusinessEntitiesListView_tblBE")   WebElement SearchResultGridPL;
    @FindBy(id= "MainContent_wucLegalBusinessEntitySearch_LegalBusinessEntitiesListView_dpLegalBusinessEntities")   WebElement FooterGridPL;

    public void PersonFrame() throws Exception {}
    public void AddNewButton() throws Exception {}
    public void chooseEntityTypes(String entity) throws Exception {
        SetValue(EntityTypes, "Set entity types", entity);
    }
    public void SurnameLabel() throws Exception {}
    public void Surname() throws Exception {}
    public void FirstNameLabel() throws Exception {}
    public void FirstName() throws Exception {}
    public void IdentificationNumberLabel() throws Exception {}
    public void inputIdentificationNumber(String valueJmbg) throws Exception {
        SetValue(IdentificationNumber, "Set value JMBG", valueJmbg);
        //IdentificationNumber.sendKeys(JMBG);
    }
    public void PassportNumberLabel() throws Exception {

    }
    public void PassportNumber() throws Exception {}
    public void StreetLabel() throws Exception {}
    public void Street() throws Exception {}
    public void TelephoneLabel() throws Exception {}
    public void Telephone() throws Exception {}
    public void HouseNumberLabel() throws Exception {}
    public void HouseNumber() throws Exception {}
    public void PlaceLabel() throws Exception {}
    public void Place() throws Exception {}
    public void IntermediariesLabel() throws Exception {}
    public void Intermediaries() throws Exception {}
    public void EmployeesLabel() throws Exception {}
    public void Employees() throws Exception {}
    public void SuppliersLabel() throws Exception {}
    public void Suppliers() throws Exception {}
    public void EntrepreneursLabel() throws Exception {}
    public void Entrepreneurs() throws Exception {}
    public void Active() throws Exception {}
    public void ActiveLabel() throws Exception {}
    public void clickSearchButtonFL() throws Exception {
        Click(SearchButtonFL, "Click on search FL");
        //SearchButtonFL.click();
    }

    public void clickSearchResultGridFL() throws Exception {
        Click(SearchResultGridFL, "Click on grid FL");
        //SearchResultGridFL.click();
    }

    public void FooterGridFL() throws Exception {}

    public void AddNewButtonPL() throws Exception {}
    public void SearchPLLabel() throws Exception {}

    public void NazivLabela() throws Exception {}
    public void Naziv() throws Exception {}
    public void PIBLabel() throws Exception {}
    public void inputPIB(String pib) throws Exception {
        PIB.sendKeys(pib);
    }
    public void MBRLabel() throws Exception {}
    public void MBR() throws Exception {}
    public void PlaceLabelPL() throws Exception {}
    public void PlacePL() throws Exception {}
    public void HouseNumberLabelPL() throws Exception {}
    public void HouseNumberPL() throws Exception {}
    public void StreetLabelPL() throws Exception {}
    public void StreetPL() throws Exception {}
    public void TelephoneLabelPL() throws Exception {}
    public void TelephonePL() throws Exception {}

    public void BanksLabel() throws Exception {}
    public void Banks() throws Exception {}
    public void IntermediariesLabelPL() throws Exception {}
    public void IntermediariesPL() throws Exception {}
    public void AgenciesLabel() throws Exception {}
    public void Agencies() throws Exception {}
    public void SuppliersLabelPL() throws Exception {}
    public void SuppliersPL() throws Exception {}
    public void ActivePersonsLabel() throws Exception {}
    public void ActivePersons() throws Exception {}
    public void AgricultureEntitiesLabel() throws Exception {}
    public void AgricultureEntities() throws Exception {}

    public void clickSearchButtonPL() throws Exception {
        SearchButtonPL.click();
    }
    public void SearchResultGridPL() throws Exception {}
    public void FooterGridPL() throws Exception {}







}

