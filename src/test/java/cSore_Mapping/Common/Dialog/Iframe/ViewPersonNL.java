package cSore_Mapping.Common.Dialog.Iframe;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewPersonNL extends BasePage {
    public ViewPersonNL(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName= "iframe")
    WebElement addEditPersonMUFrame;
    @FindBy(id= "MainContent_IndividualClientNonLifeFormView_divAccept")
    WebElement acceptButton;
    @FindBy(id= "MainContent_IndividualClientNonLifeFormView_lbEdit")
    WebElement editButton;
    @FindBy(id= "MainContent_IndividualClientNonLifeFormView_hlSearch")
    WebElement search;
    @FindBy(xpath= "//*[@id='MainContent_IndividualClientNonLifeFormView_pnlFirstName']/label")
    WebElement firstNameLabel;
    @FindBy(xpath= "MainContent_IndividualClientNonLifeFormView_lbFirstName")
    WebElement firstName;
    @FindBy(xpath= "//*[@id='MainContent_IndividualClientNonLifeFormView_pnlSurname']/label")
    WebElement surnameLabel;
    @FindBy(xpath= "MainContent_IndividualClientNonLifeFormView_lbSurname")
    WebElement surname;
    @FindBy(xpath= "//*[@id='MainContent_IndividualClientNonLifeFormView_pnlGender']/label")
    WebElement genderLabel;
    @FindBy(xpath= "MainContent_IndividualClientNonLifeFormView_lbGender")
    WebElement gender;
    @FindBy(xpath= "//*[@id='MainContent_IndividualClientNonLifeFormView_pnlDateOfBirth']/label")
    WebElement dateOfBirthLabel;
    @FindBy(xpath= "MainContent_IndividualClientNonLifeFormView_lbDateOfBirth")
    WebElement dateOfBirth;
    @FindBy(xpath= "//*[@id='MainContent_IndividualClientNonLifeFormView_pnlIsForeigner']/div/span")
    WebElement foreingerLabel;
    @FindBy(xpath= "MainContent_IndividualClientNonLifeFormView_cbIsForeigner")
    WebElement foreinger;
    @FindBy(xpath= "//*[@id='MainContent_IndividualClientNonLifeFormView_divDeceased']/span")
    WebElement deceasedLabel;
    @FindBy(xpath= "MainContent_IndividualClientNonLifeFormView_ucBusinessEntityMarkId_cbBusinessEntityMark")
    WebElement deceased;
    @FindBy(xpath= "//*[@id='MainContent_IndividualClientNonLifeFormView_pnlJMBG']/label")
    WebElement jmbgLabel;
    @FindBy(xpath= "MainContent_IndividualClientNonLifeFormView_lbJMBG")
    WebElement jmbg;
    @FindBy(xpath= "//*[@id='MainContent_IndividualClientNonLifeFormView_pnlHealthCard']/label")
    WebElement healthCardLabel;
    @FindBy(xpath= "MainContent_IndividualClientNonLifeFormView_lbHealthCard")
    WebElement healthCard;
    @FindBy(xpath= "//*[@id='MainContent_IndividualClientNonLifeFormView_pnlPersonOccupation']/label")
    WebElement personOccupationLabel;
    @FindBy(xpath= "MainContent_IndividualClientNonLifeFormView_lbPersonOccupationName")
    WebElement occupation;
    @FindBy(xpath= "//*[@id='MainContent_divAddresses']/fieldset/legend")
    WebElement addressesLabel;
    @FindBy(id= "MainContent_BusinessEntityAddressListView_tbl1")
    WebElement addresses;
    @FindBy(xpath= "//*[@id='MainContent_divTelephones']/fieldset/legend")
    WebElement telephoneLabel;
    @FindBy(id= "MainContent_BusinessEntityTelephoneListView_tbl1")
    WebElement telephoneListViewTable;

    @FindBy(xpath= "//*[@id='MainContent_divEmails']/fieldset/legend")
    WebElement emailsLabel;
    @FindBy(id= "MainContent_BusinessEntityEmailListView_tbl1")
    WebElement emailListView;


    //-------------------- Methods ------------------------
    public void clickAcceptButton() throws Exception {
        Click(acceptButton, "Click on accept for person");
    }
    //-------------------- End Methods --------------------
}

