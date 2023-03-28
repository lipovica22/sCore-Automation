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
    WebElement technicalPersonsLabel;
    @FindBy(id= "tblTechnicalPersonsOnDocument")
    WebElement technicalPersonsGrid;
    @FindBy(xpath= "//*[@id='divAddTechnicalPerson']/fieldset/legend")
    WebElement addTechnicalPersonLabel;
    @FindBy(xpath= "//*[@id='ContentPlaceHolder1_wucTechnicalPersons_DivTechnicalPersonType']/div[1]/text()")
    WebElement technicalPersonTypesLabel;
    @FindBy(id= "ContentPlaceHolder1_wucTechnicalPersons_wucTechnicalPersonTypesAdd_ddlTechnicalPersonTypes")
    WebElement technicalPersonTypes;
    @FindBy(xpath= "//*[@id='ContentPlaceHolder1_wucTechnicalPersons_DivAddTechnicalPersonLabel']")
    WebElement externalReferenceIDLabel;
    @FindBy(id= "ContentPlaceHolder1_wucTechnicalPersons_TbExternalReferenceID")
    WebElement externalReferenceID;
    @FindBy(id= "ContentPlaceHolder1_wucTechnicalPersons_TbName")
    WebElement technicalPersonsName;
    @FindBy(id= "ContentPlaceHolder1_wucTechnicalPersons_BtnOpenSearch")
    WebElement openSearchButton;
    @FindBy(id= "ContentPlaceHolder1_wucTechnicalPersons_BtnAddTechnicalPerson")
    WebElement addTechnicalPersonButton;
}
