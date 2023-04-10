package cSore_Mapping.Common.Dialog.Iframe;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEditPersonPage extends BasePage {
    public AddEditPersonPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName= "iframe")
    WebElement addEditPersonFrame;
    @FindBy(id= "MainContent_IndividualClientLifeFormView_SaveButton")
    WebElement saveButtonFL;
    @FindBy(id= "MainContent_IndividualClientNonLifeFormView_UpdateButton")
    WebElement saveButtonUpdateFL;
    @FindBy(id= "MainContent_IndividualClientNonLifeFormView_hlSearch")
    WebElement search;
    @FindBy(id= "MainContent_IndividualClientLifeFormView_tbSurname")
    WebElement surname;
    @FindBy(id= "MainContent_IndividualClientLifeFormView_tbFirstName")
    WebElement firstName;
    @FindBy(id= "MainContent_IndividualClientLifeFormView_ucGender_ddlGenders")
    WebElement gender;
    @FindBy(id= "MainContent_IndividualClientLifeFormView_tbDateOfBirth")
    WebElement dateOfBirth;
    @FindBy(id= "MainContent_IndividualClientLifeFormView_ucPlaceOfBirth_tbStates")
    WebElement states;
    @FindBy(id= "MainContent_IndividualClientLifeFormView_ucPlaceOfBirth_tbPlaces")
    WebElement places;
    @FindBy(className= "checkbox_label_aspx")
    WebElement foreingerLabel;
    @FindBy(id= "MainContent_IndividualClientLifeFormView_cbIsForeigner")
    WebElement foreinger;
    @FindBy(id= "MainContent_IndividualClientLifeFormView_tbJMBG")
    WebElement jmbg;
    @FindBy(xpath= "//*[@id='MainContent_IndividualClientLifeFormView_pnlJMBG']/div[1]/label")
    WebElement jmbgLabel;
    @FindBy(xpath= "//*[@id='MainContent_IndividualClientLifeFormView_pnlIDCard']/div[1]/label")
    WebElement idCardLabel;
    @FindBy(id= "MainContent_IndividualClientLifeFormView_tbIDCardNumber")
    WebElement idCard;
    @FindBy(id= "MainContent_IndividualClientLifeFormView_tbIDCardIssuingDate")
    WebElement idCardIssuingDate;
    @FindBy(id= "MainContent_IndividualClientLifeFormView_ucIDCardIssuingPlace_tbStates")
    WebElement IdCardIssuingPlaceState;
    @FindBy(id= "MainContent_IndividualClientLifeFormView_ucIDCardIssuingPlace_tbPlaces")
    WebElement idCardIssuingPlacePlace;
    @FindBy(id= "MainContent_IndividualClientLifeFormView_tbIDCardIssuedBy")
    WebElement idCardIssuedBy;
    @FindBy(xpath= "//*[@id='pnlPersonOccupationOnTheListLabel']/label")
    WebElement personOccupationLabel;
    @FindBy(id= "MainContent_IndividualClientLifeFormView_ucPersonOccupation_tbOccupation")
    WebElement occupation;
    @FindBy(id= "MainContent_IndividualClientLifeFormView_cbPersonOccupationNotOnTheList")
    WebElement personOccupationNotOnTheList;
    @FindBy(xpath= "//*[@id='MainContent_IndividualClientLifeFormView_pnlPersonOccupation']/div[3]/div/span")
    WebElement personOccupationNotOnTheListLabel;
    @FindBy(id= "MainContent_LegalClientLifeFormView_SaveButton")
    WebElement saveButtonPL;
    @FindBy(id= "MainContent_LegalClientLifeFormView_hlSearch")
    WebElement searchPL;
    @FindBy(xpath= "//*[@id='MainContent_LegalClientLifeFormView_pnlFullName']/label[1]")
    WebElement nazivLabela;
    @FindBy(id= "MainContent_LegalClientLifeFormView_tbFullName")
    WebElement naziv;
    @FindBy(xpath= "//*[@id='MainContent_LegalClientLifeFormView_pnlPIB']/label[1]")
    WebElement pibLabel;
    @FindBy(id= "MainContent_LegalClientLifeFormView_tbPIB")
    WebElement pib;
    @FindBy(id= "MainContent_LegalClientLifeFormView_tbMBR")
    WebElement mbr;
    @FindBy(xpath= "//*[@id='MainContent_LegalClientLifeFormView_pnlMBR']/label[1]")
    WebElement mbrLabel;
    @FindBy(xpath= "//*[@id='MainContent_LegalClientLifeFormView_pnlBaseIndustryCode']/label[1]")
    WebElement primarnaDelatnostLabel;
    @FindBy(id= "MainContent_LegalClientLifeFormView_ucBaseIndustryCode_tbIndustryCode")
    WebElement primarnaDelatnost;
    @FindBy(id= "MainContent_LegalClientLifeFormView_ucIndustryCode_tbIndustryCode")
    WebElement delatnost;
    @FindBy(xpath= "//*[@id='MainContent_LegalClientLifeFormView_pnlIndustryCode']/label[1]")
    WebElement delatnostLabel;
    @FindBy(xpath= "//*[@id='MainContent_LegalClientLifeFormView_pnlEnterpriseType']/label[1]")
    WebElement tipPreduzecaLabel;
    @FindBy(id= "MainContent_LegalClientLifeFormView_ucEnterpriseType_ddlEnterpriseTypes")
    WebElement tipPreduzeca;

}

