package cSore_Mapping.Health.View;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TechnicalPersonAdd extends BasePage {


    public TechnicalPersonAdd(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
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


    public void TechnicalPersonsLabel() throws Exception {

    }
    public void TechnicalPersonsGrid() throws Exception {

    }

    public void AddTechnicalPersonLabel() throws Exception {


    }
    public void TechnicalPersonTypesLabel() throws Exception {

    }
    public void TechnicalPersonTypes() throws Exception {

    }
    public void ExternalReferenceIDLabel() throws Exception {

    }
    public void ExternalReferenceID() throws Exception {

    }
    public void TechnicalPersonsName() throws Exception {

    }
    public void OpenSearchButton() throws Exception {

    }
    public void AddTechnicalPersonButton() throws Exception {

    }

}
