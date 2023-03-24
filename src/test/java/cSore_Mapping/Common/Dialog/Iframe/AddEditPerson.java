package cSore_Mapping.Common.Dialog.Iframe;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEditPerson extends BasePage {


    public AddEditPerson(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName= "iframe")
    WebElement AddEditPersonFrame;

    @FindBy(id= "MainContent_IndividualClientLifeFormView_SaveButton")
    WebElement SaveButtonFL;
    @FindBy(id= "MainContent_IndividualClientNonLifeFormView_UpdateButton")
    WebElement SaveButtonUpdateFL;

    @FindBy(id= "MainContent_IndividualClientNonLifeFormView_hlSearch")
    WebElement Search;

    @FindBy(id= "MainContent_IndividualClientLifeFormView_tbSurname")
    WebElement Surname;
    @FindBy(id= "MainContent_IndividualClientLifeFormView_tbFirstName")
    WebElement FirstName;
    @FindBy(id= "MainContent_IndividualClientLifeFormView_ucGender_ddlGenders")
    WebElement Gender;
    @FindBy(id= "MainContent_IndividualClientLifeFormView_tbDateOfBirth")
    WebElement DateOfBirth;
    @FindBy(id= "MainContent_IndividualClientLifeFormView_ucPlaceOfBirth_tbStates")
    WebElement States;
    @FindBy(id= "MainContent_IndividualClientLifeFormView_ucPlaceOfBirth_tbPlaces")
    WebElement Places;
    @FindBy(className= "checkbox_label_aspx")
    WebElement ForeingerLabel;
    @FindBy(id= "MainContent_IndividualClientLifeFormView_cbIsForeigner")
    WebElement Foreinger;
    @FindBy(id= "MainContent_IndividualClientLifeFormView_tbJMBG")
    WebElement JMBG;
    @FindBy(xpath= "//*[@id='MainContent_IndividualClientLifeFormView_pnlJMBG']/div[1]/label")
    WebElement JMBGLabel;
    @FindBy(xpath= "//*[@id='MainContent_IndividualClientLifeFormView_pnlIDCard']/div[1]/label")
    WebElement IDCardLabel;
    @FindBy(id= "MainContent_IndividualClientLifeFormView_tbIDCardNumber")
    WebElement IDCard;
    @FindBy(id= "MainContent_IndividualClientLifeFormView_tbIDCardIssuingDate")
    WebElement IDCardIssuingDate;
    @FindBy(id= "MainContent_IndividualClientLifeFormView_ucIDCardIssuingPlace_tbStates")
    WebElement IDCardIssuingPlaceState;
    @FindBy(id= "MainContent_IndividualClientLifeFormView_ucIDCardIssuingPlace_tbPlaces")
    WebElement IDCardIssuingPlacePlace;
    @FindBy(id= "MainContent_IndividualClientLifeFormView_tbIDCardIssuedBy")
    WebElement IDCardIssuedBy;
    @FindBy(xpath= "//*[@id='pnlPersonOccupationOnTheListLabel']/label")
    WebElement PersonOccupationLabel;
    @FindBy(id= "MainContent_IndividualClientLifeFormView_ucPersonOccupation_tbOccupation")
    WebElement Occupation;
    @FindBy(id= "MainContent_IndividualClientLifeFormView_cbPersonOccupationNotOnTheList")
    WebElement PersonOccupationNotOnTheList;
    @FindBy(xpath= "//*[@id='MainContent_IndividualClientLifeFormView_pnlPersonOccupation']/div[3]/div/span")
    WebElement PersonOccupationNotOnTheListLabel;

    @FindBy(id= "MainContent_LegalClientLifeFormView_SaveButton")
    WebElement SaveButtonPL;
    @FindBy(id= "MainContent_LegalClientLifeFormView_hlSearch")
    WebElement SearchPL;

    @FindBy(xpath= "//*[@id='MainContent_LegalClientLifeFormView_pnlFullName']/label[1]")
    WebElement NazivLabela;
    @FindBy(id= "MainContent_LegalClientLifeFormView_tbFullName")
    WebElement Naziv;
    @FindBy(xpath= "//*[@id='MainContent_LegalClientLifeFormView_pnlPIB']/label[1]")
    WebElement PIBLabel;
    @FindBy(id= "MainContent_LegalClientLifeFormView_tbPIB")
    WebElement PIB;
    @FindBy(id= "MainContent_LegalClientLifeFormView_tbMBR")
    WebElement MBR;
    @FindBy(xpath= "//*[@id='MainContent_LegalClientLifeFormView_pnlMBR']/label[1]")
    WebElement MBRLabel;
    @FindBy(xpath= "//*[@id='MainContent_LegalClientLifeFormView_pnlBaseIndustryCode']/label[1]")
    WebElement PrimarnaDelatnostLabel;
    @FindBy(id= "MainContent_LegalClientLifeFormView_ucBaseIndustryCode_tbIndustryCode")
    WebElement PrimarnaDelatnost;
    @FindBy(id= "MainContent_LegalClientLifeFormView_ucIndustryCode_tbIndustryCode")
    WebElement Delatnost;
    @FindBy(xpath= "//*[@id='MainContent_LegalClientLifeFormView_pnlIndustryCode']/label[1]")
    WebElement DelatnostLabel;
    @FindBy(xpath= "//*[@id='MainContent_LegalClientLifeFormView_pnlEnterpriseType']/label[1]")
    WebElement TipPreduzecaLabel;
    @FindBy(id= "MainContent_LegalClientLifeFormView_ucEnterpriseType_ddlEnterpriseTypes")
    WebElement TipPreduzeca;

    public void AddEditPersonFrame() throws Exception {

    }

    public void SaveButtonFL() throws Exception {

    }
    public void SaveButtonUpdateFL() throws Exception {

    }

    public void clickSearch() throws Exception {
        Search.click();
    }

    public void Surname() throws Exception {

    }
    public void FirstName() throws Exception {

    }
    public void Gender() throws Exception {

    }
    public void DateOfBirth() throws Exception {

    }
    public void States() throws Exception {

    }
    public void Places() throws Exception {

    }
    public void ForeingerLabel() throws Exception {}
    public void Foreinger() throws Exception {}
    public void JMBG() throws Exception {

    }
    public void JMBGLabel() throws Exception {}
    public void IDCardLabel() throws Exception {}
    public void IDCard() throws Exception {}
    public void IDCardIssuingDate() throws Exception {}
    public void IDCardIssuingPlaceState() throws Exception {}
    public void IDCardIssuingPlacePlace() throws Exception {}
    public void IDCardIssuedBy() throws Exception {}
    public void PersonOccupationLabel() throws Exception {}
    public void Occupation() throws Exception {}
    public void PersonOccupationNotOnTheList() throws Exception {}
    public void PersonOccupationNotOnTheListLabel() throws Exception {}

    public void SaveButtonPL() throws Exception {}
    public void clickSearchPL() throws Exception {
        SearchPL.click();
    }

    public void NazivLabela() throws Exception {}
    public void Naziv() throws Exception {}
    public void PIBLabel() throws Exception {}
    public void PIB() throws Exception {}
    public void MBR() throws Exception {}
    public void MBRLabel() throws Exception {}
    public void PrimarnaDelatnostLabel() throws Exception {}
    public void PrimarnaDelatnost() throws Exception {}
    public void Delatnost() throws Exception {}
    public void DelatnostLabel() throws Exception {}
    public void TipPreduzecaLabel() throws Exception {}
    public void TipPreduzeca() throws Exception {}

}

