package cSore_Mapping.Common.Dialog.Iframe;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewPerson extends BasePage {


    public ViewPerson(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName= "iframe")
    WebElement AddEditPersonMUFrame;
    @FindBy(id= "MainContent_IndividualClientNonLifeFormView_divAccept")
    WebElement AcceptButton;
    @FindBy(id= "MainContent_IndividualClientNonLifeFormView_lbEdit")
    WebElement EditButton;
    @FindBy(id= "MainContent_IndividualClientNonLifeFormView_hlSearch")
    WebElement Search;
    @FindBy(xpath= "//*[@id='MainContent_IndividualClientNonLifeFormView_pnlFirstName']/label")
    WebElement FirstNameLabel;
    @FindBy(xpath= "MainContent_IndividualClientNonLifeFormView_lbFirstName")
    WebElement FirstName;
    @FindBy(xpath= "//*[@id='MainContent_IndividualClientNonLifeFormView_pnlSurname']/label")
    WebElement SurnameLabel;
    @FindBy(xpath= "MainContent_IndividualClientNonLifeFormView_lbSurname")
    WebElement Surname;
    @FindBy(xpath= "//*[@id='MainContent_IndividualClientNonLifeFormView_pnlGender']/label")
    WebElement GenderLabel;
    @FindBy(xpath= "MainContent_IndividualClientNonLifeFormView_lbGender")
    WebElement Gender;
    @FindBy(xpath= "//*[@id='MainContent_IndividualClientNonLifeFormView_pnlDateOfBirth']/label")
    WebElement DateOfBirthLabel;
    @FindBy(xpath= "MainContent_IndividualClientNonLifeFormView_lbDateOfBirth")
    WebElement DateOfBirth;
    @FindBy(xpath= "//*[@id='MainContent_IndividualClientNonLifeFormView_pnlIsForeigner']/div/span")
    WebElement ForeingerLabel;
    @FindBy(xpath= "MainContent_IndividualClientNonLifeFormView_cbIsForeigner")
    WebElement Foreinger;
    @FindBy(xpath= "//*[@id='MainContent_IndividualClientNonLifeFormView_divDeceased']/span")
    WebElement DeceasedLabel;
    @FindBy(xpath= "MainContent_IndividualClientNonLifeFormView_ucBusinessEntityMarkId_cbBusinessEntityMark")
    WebElement Deceased;
    @FindBy(xpath= "//*[@id='MainContent_IndividualClientNonLifeFormView_pnlJMBG']/label")
    WebElement JMBGLabel;
    @FindBy(xpath= "MainContent_IndividualClientNonLifeFormView_lbJMBG")
    WebElement JMBG;
    @FindBy(xpath= "//*[@id='MainContent_IndividualClientNonLifeFormView_pnlHealthCard']/label")
    WebElement HealthCardLabel;
    @FindBy(xpath= "MainContent_IndividualClientNonLifeFormView_lbHealthCard")
    WebElement HealthCard;
    @FindBy(xpath= "//*[@id='MainContent_IndividualClientNonLifeFormView_pnlPersonOccupation']/label")
    WebElement PersonOccupationLabel;
    @FindBy(xpath= "MainContent_IndividualClientNonLifeFormView_lbPersonOccupationName")
    WebElement Occupation;

    @FindBy(xpath= "//*[@id='MainContent_divAddresses']/fieldset/legend")
    WebElement AddressesLabel;
    @FindBy(id= "MainContent_BusinessEntityAddressListView_tbl1")
    WebElement Addresses;

    @FindBy(xpath= "//*[@id='MainContent_divTelephones']/fieldset/legend")
    WebElement TelephoneLabel;
    @FindBy(id= "MainContent_BusinessEntityTelephoneListView_tbl1")
    WebElement TelephoneListViewTable;

    @FindBy(xpath= "//*[@id='MainContent_divEmails']/fieldset/legend")
    WebElement EmailsLabel;
    @FindBy(id= "MainContent_BusinessEntityEmailListView_tbl1")
    WebElement EmailListView;

    public void AddEditPersonMUFrame() throws Exception {}
    public void clickAcceptButton() throws Exception {
        Click(AcceptButton, "Click on accept for person");
        //AcceptButton.click();
    }
    public void EditButton() throws Exception {}
    public void Search() throws Exception {}
    public void FirstNameLabel() throws Exception {}
    public void FirstName() throws Exception {}
    public void SurnameLabel() throws Exception {}
    public void Surname() throws Exception {}
    public void GenderLabel() throws Exception {}
    public void Gender() throws Exception {}
    public void DateOfBirthLabel() throws Exception {}
    public void DateOfBirth() throws Exception {}
    public void ForeingerLabel() throws Exception {}
    public void Foreinger() throws Exception {}
    public void DeceasedLabel() throws Exception {}
    public void Deceased() throws Exception {}
    public void JMBGLabel() throws Exception {}
    public void JMBG() throws Exception {}
    public void HealthCardLabel() throws Exception {}
    public void HealthCard() throws Exception {}
    public void PersonOccupationLabel() throws Exception {}
    public void Occupation() throws Exception {}

    public void AddressesLabel() throws Exception {}
    public void Addresses() throws Exception {}

    public void TelephoneLabel() throws Exception {}
    public void TelephoneListViewTable() throws Exception {}

    public void EmailsLabel() throws Exception {}
    public void EmailListView() throws Exception {}

}

