package cSore_Mapping.Common.View;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TehnicalPersonPage extends BasePage {
    public TehnicalPersonPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath= "//*[@id='ContentPlaceHolder1_wucTechnicalPersons_divTechnicalPersonsOnDocument']/fieldset/legend")
    WebElement TechnicalPersonsLabel;
    @FindBy(id= "tblTechnicalPersonsOnDocument")
    WebElement TechnicalPersonsGrid;

    @FindBy(xpath= "//*[@id='divAddTechnicalPerson']/fieldset/legend")
    WebElement AddTechnicalPersonLabel;
    @FindBy(xpath= "//*[@id='ContentPlaceHolder1_wucTechnicalPersons_DivTechnicalPersonType']/div[1]/text()")
    WebElement TechnicalPersonTypesLabel;
    @FindBy(id= "ContentPlaceHolder1_wucTechnicalPersons_wucTechnicalPersonTypesAdd_ddlTechnicalPersonTypes")
    WebElement TechnicalPersonTypes;
    @FindBy(xpath= "//*[@id='ContentPlaceHolder1_wucTechnicalPersons_DivAddTechnicalPersonLabel']")
    WebElement ExternalReferenceIDLabel;
    @FindBy(id= "ContentPlaceHolder1_wucTechnicalPersons_TbExternalReferenceID")
    WebElement ExternalReferenceID;
    @FindBy(id= "ContentPlaceHolder1_wucTechnicalPersons_TbName")
    WebElement TechnicalPersonsName;
    @FindBy(id= "ContentPlaceHolder1_wucTechnicalPersons_BtnOpenSearch")
    WebElement OpenSearchButton;
    @FindBy(id= "ContentPlaceHolder1_wucTechnicalPersons_BtnAddTechnicalPerson")
    WebElement AddTechnicalPersonButton;
    @FindBy(xpath= "ContentPlaceHolder1_wucTechnicalPersons_PnlTechnicalPersonSearchLegend")
    WebElement TechnicalPersonSearchLabel;
    @FindBy(xpath= "//*[@id='ContentPlaceHolder1_wucTechnicalPersons_BusinessEntityType']/label")
    WebElement BusinessEntityTypeLabel;
    @FindBy(id= "ContentPlaceHolder1_wucTechnicalPersons_DdlFP")
    WebElement BusinessEntityType;
    @FindBy(xpath= "//*[@id='ContentPlaceHolder1_wucTechnicalPersons_IdentificationNumber']/label")
    WebElement IdentificationNumberLabel;
    @FindBy(id= "ContentPlaceHolder1_wucTechnicalPersons_TbIdentificationNumber")
    WebElement IdentificationNumber;

    @FindBy(xpath= "//*[@id='ContentPlaceHolder1_wucTechnicalPersons_FirstName']/label")
    WebElement FirstNameLabel;
    @FindBy(id= "ContentPlaceHolder1_wucTechnicalPersons_TbFirstName")
    WebElement FirstName;
    @FindBy(xpath= "//*[@id='ContentPlaceHolder1_wucTechnicalPersons_Surname']/label")
    WebElement SurnameLabel;
    @FindBy(id= "ContentPlaceHolder1_wucTechnicalPersons_TbSurname")
    WebElement Surname;

    @FindBy(xpath= "//*[@id='ContentPlaceHolder1_wucTechnicalPersons_FullName']/label")
    WebElement FullNameLabel;
    @FindBy(id= "ContentPlaceHolder1_wucTechnicalPersons_TbFullName")
    WebElement FullName;

    @FindBy(xpath= "ContentPlaceHolder1_wucTechnicalPersons_SalesUnits")
    WebElement SalesUnitsLabel;
    @FindBy(id= "ContentPlaceHolder1_wucTechnicalPersons_WucSalesUnits_DdlSalesUnits")
    WebElement SalesUnits;
    @FindBy(id= "ContentPlaceHolder1_wucTechnicalPersons_BtnSearch")
    WebElement Search;
    @FindBy(id= "tblSearch")
    WebElement GridFinder;


    public void TechnicalPersonsLabel() throws Exception {}
    public void TechnicalPersonsGrid() throws Exception {}

    public void AddTechnicalPersonLabel() throws Exception {}
    public void TechnicalPersonTypesLabel() throws Exception {}
    public void TechnicalPersonTypes() throws Exception {}
    public void ExternalReferenceIDLabel() throws Exception {}
    public void ExternalReferenceID() throws Exception {}
    public void TechnicalPersonsName() throws Exception {}
    public void OpenSearchButton() throws Exception {}
    public void AddTechnicalPersonButton() throws Exception {}
    public void TechnicalPersonSearchLabel() throws Exception {}
    public void BusinessEntityTypeLabel() throws Exception {}
    public void BusinessEntityType() throws Exception {}
    public void IdentificationNumberLabel() throws Exception {}
    public void IdentificationNumber() throws Exception {}

    public void FirstNameLabel() throws Exception {}
    public void FirstName() throws Exception {}
    public void SurnameLabel() throws Exception {}
    public void Surname() throws Exception {}

    public void FullNameLabel() throws Exception {}
    public void FullName() throws Exception {}

    public void SalesUnitsLabel() throws Exception {}
    public void SalesUnits() throws Exception {}
    public void Search() throws Exception {}

    public void GridFinder() throws Exception {}


}

