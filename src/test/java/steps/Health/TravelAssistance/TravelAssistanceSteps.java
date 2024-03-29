package steps.Health.TravelAssistance;

import cSore_Mapping.Common.Dialog.Iframe.SearchPersonTravelAssistancePage;
import cSore_Mapping.Common.Dialog.Iframe.ViewPersonPage;
import cSore_Mapping.Common.Menu.LeftMenuPage;
import cSore_Mapping.BasePage;
import cSore_Mapping.Common.Tab.GeneralPage;
import cSore_Mapping.Common.Tab.PersonPage;
import cSore_Mapping.Common.View.DocumentInfoPage;
import cSore_Mapping.Common.View.TabView;
import cSore_Mapping.Common.View.TopButtonView;
import cSore_Mapping.Health.Page.AccidentHealthPage;
import cSore_Mapping.Health.Tab.ConcernsPage;
import cSore_Mapping.Health.Tab.GeneralTravelAssistancePage;
import cSore_Mapping.Common.Tab.PrintoutsPage;
import core_class.WaitTime;
import excel.ExcelReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.Reporter;
import cSore_Mapping.Common.Pages.LoginPage;
import cSore_Mapping.Common.Pages.ProductsPage;
import org.testng.asserts.SoftAssert;
import tests.BaseTest;

import java.io.IOException;
import java.util.Map;

public class TravelAssistanceSteps extends BaseTest{
    // naredne dve linije služe da iz xml file uzmemo parametre za cucumber
    String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
    String quit = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("quit");
    String environment = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("environment");
    Map<String, String> data;
    String path = "results/screenshots/";
    private SoftAssert softAssert;

    @Before
    public void setup() throws Exception {
        initialization(browser);
        softAssert = new SoftAssert();
    }

    @After
    public void tearDown() throws IOException {
        takeScreenshot("slika" + System.currentTimeMillis());

        if (quit.equalsIgnoreCase("Yes")) {
            quit();
        }

        if (softAssert != null) {
            softAssert.assertAll();
        }
    }

    @Given("login on app RS Test {string} {string} {string}")
    public void loginOnAppBATest(String file, String sheet, String row) throws Exception {
        openApp(environment);
        //driver.get("https://t-score.uniqa.rs/POS/Serbia/NoAD");
        data = new ExcelReader().getRowData(file, sheet, Integer.parseInt(row));
    }

    @When("enter username")
    public void enterUsername() throws Exception {
        new LoginPage(driver).setUsername(data.get("Username"));
    }

    @And("enter password")
    public void enterPassword() throws Exception {
        new LoginPage(driver).setPassword(data.get("Password"));
    }

    @And("click on Submit button")
    public void clickOnSubmitButton() throws Exception {
        new LoginPage(driver).clickSubmit();
    }

    @Then("Logged in")
    public void loggedIn() throws Exception {
        new LoginPage(driver).assertUser(data.get("AssertUser"), softAssert);
    }

    @And("page is Products")
    public void pageIsProducts() throws Exception {
        new LoginPage(driver).assertUrl("https://t-score.uniqa.rs/POS/Serbia/Products", softAssert);
    }

    @Then("choose LOB")
    public void chooseLOB() throws Exception {
        new ProductsPage(driver).selectLob(data.get("LOB"));
        //Thread.sleep(2000);
    }

    @And("choose product")
    public void chooseProduct() throws Exception {
        new AccidentHealthPage(driver).selectProizvod(data.get("Proizvod"));
    }

    @And("choose Document type")
    public void chooseDocumentType()throws Exception {
        new LeftMenuPage(driver).clickLeftMenuButton(data.get("Vrsta dokumenta"));
    }

    @Then("choose Contract type")
    public void chooseContractType() throws Exception{
        new GeneralTravelAssistancePage(driver).selectContractType(data.get("Tip ugovora"));
    }

    @And("choose Destination")
    public void chooseDestination() throws Exception{
        new GeneralTravelAssistancePage(driver).selectDestination(data.get("Odredište"));
    }

    @And("input Duration of insurance")
    public void inputDurationOfInsurance() throws Exception {
        if (data.get("Tip ugovora").equals("Individualna Multi Visa")) {
            new GeneralTravelAssistancePage(driver).setInputDurationMonths(data.get("Meseci"));
            new GeneralTravelAssistancePage(driver).setInputDurationDays(data.get("Dani"));
        }else {
            new GeneralTravelAssistancePage(driver).setInputDurationDays(data.get("Dani"));
        }

    }

    @And("set Country")
    public void setCountry() throws Exception{
        new GeneralPage(driver).selectCountry(data.get("Država ugovaranja"));
    }

    @And("set Place")
    public void setPlace() throws Exception{
        new GeneralPage(driver).selectPlace(data.get("Mesto ugovaranja"), "11000 Beograd");
    }

    @And("set Payment Method")
    public void setPaymentMethod() throws Exception {
        new GeneralTravelAssistancePage(driver).selectPaymentMethod(data.get("Metod plaćanja"));

        new GeneralTravelAssistancePage(driver).assertMarks(softAssert, data);
    }

    @And("click on tab Persons")
    public void clickOnTabPersons() throws Exception{
        new TabView(driver).clickPersonsTab();

        new TabView(driver).assertStatus(softAssert, data.get("PocetniStatus"));
    }

    @Then("set Same person")
    public void setSamePerson() throws Exception{
        new PersonPage(driver).clickSamePerson();
    }

    @And("click on add button")
    public void clickOnAddButton() throws Exception{
        new PersonPage(driver).clickAddPersonPolicyHolder();

    }

    @And("on Iframe input Identification number")
    public void onIframeInputIdentificationNumber() throws Exception{
        JumpToFrame();
        new SearchPersonTravelAssistancePage(driver).setInputIdentificationNumber(data.get("Identifikacioni broj"));
   // }else
     //   if(data.get("Ugovarač Pr/Fi lice").equals("Pravno")) {
     //       new cSore_Mapping.Common.Dialog.Iframe.SearchPersonTA(driver).inputPIB(data.get("Identifikacioni broj"));
     //   }
    }

    @And("click on button Search")
    public void clickOnButtonSearch() throws Exception{
       // if(data.get("Ugovarač Pr/Fi lice").equals("Fizičko")){
            new SearchPersonTravelAssistancePage(driver).clickSearchButtonFL();
       // }else
       // if(data.get("Ugovarač Pr/Fi lice").equals("Pravno")) {
        //    new cSore_Mapping.Common.Dialog.Iframe.SearchPersonTA(driver).clickSearchButtonPL();
       // }
    }

    @And("click on button Preview")
    public void clickOnButtonPreview() throws Exception{
        new SearchPersonTravelAssistancePage(driver).clickSearchResultGridFL();
    }

    @And("click on button Accept")
    public void clickOnButtonAccept() throws Exception{
        new ViewPersonPage(driver).clickAcceptButton();
    }

    @Then("check Info message on top of page")
    public void checkInfoMessageOnTopOfPage() throws Exception{
        new BasePage(driver).InfoMessage(data.get("Poruke:"), softAssert);
    }

    @When("click on Concerns tab")
    public void clickOnConcernsTab() throws Exception{
        new TabView(driver).clickConcernsTab();
    }

    @Then("check Info message after click on concerns tab on top of page")
    public void checkInfoMessageAfterClickOnConcernsTabOnTopOfPage() throws IOException {
        new BasePage(driver).InfoMessage(data.get("Poruka posle klika na tab Ug. Elementi"), softAssert);
    }

    @And("choose Package")
    public void choosePackage() throws Exception{
        new ConcernsPage(driver).selectPackage(data.get("Paketi"));
        //Thread.sleep(500);
    }

    @And("choose Insured sum")
    public void chooseInsuredSum() throws Exception{
        new ConcernsPage(driver).selectInsuredSumList(data.get("Suma osiguranja"));
        //selectOption(data.get("Suma osiguranja"), new cSore_Mapping.Health.Tab.Concerns(driver).selectInsuredSumList());
        //Thread.sleep(500);
    }

    @And("choose Sum correction")
    public void chooseSumCorrection()throws Exception {
        new ConcernsPage(driver).selectCorrection(data.get("Korekcija OS"));
        //selectOption(data.get("Korekcija OS"), new cSore_Mapping.Health.Tab.Concerns(driver).selectCorrection());
        //Thread.sleep(500);
    }

    @And("choose Franchise")
    public void chooseFranchise() throws Exception{
        new ConcernsPage(driver).selectFranchise(data.get("Učešće u šteti"));
        //selectOption(data.get("Učešće u šteti"), new cSore_Mapping.Health.Tab.Concerns(driver).selectFranchise());
        //Thread.sleep(1000);
    }

    @Then("add insured persons")
    public void addInsuredPersons() throws Exception{
        if(data.get("Tip ugovora").equals("Porodična")) {
            new ConcernsPage(driver).clickAddConcern();
            new ConcernsPage(driver).search();
            JumpToFrame();
            new SearchPersonTravelAssistancePage(driver).setInputIdentificationNumber(data.get("Osiguranici"));
            new SearchPersonTravelAssistancePage(driver).clickSearchButtonFL();
            new SearchPersonTravelAssistancePage(driver).clickSearchResultGridFL();
            new ViewPersonPage(driver).clickAcceptButton();
            new TopButtonView(driver).clickSubmit();

            //new cSore_Mapping.Common.View.TotButtonView(driver).clickCalculate();
            //new cSore_Mapping.Common.View.TotButtonView(driver).clickActivate();
            //new cSore_Mapping.Common.View.TotButtonView(driver).clickCertificationOfSignature();
        }
        if(data.get("Tip ugovora").equals("Grupna")) {
            new ConcernsPage(driver).fileUpload("grupno");
            new ConcernsPage(driver).add();
            //Thread.sleep(2000);
        }
    }

    @And("click on button Calculate")
    public void clickOnButtonCalculate() throws Exception{
        new TopButtonView(driver).clickCalculate();
    }

    @Then("check calculated Premium")
    public void checkCalculatedPremium()throws Exception {
        Assert.assertEquals(new DocumentInfoPage(driver).getRatePremije(),data.get("Premija"));
    }

    @And("click on button Activate")
    public void clickOnButtonActivate() throws Exception{
        new TopButtonView(driver).clickActivate();
        //Thread.sleep(5000);
    }

    @And("click on button Print PUI")
    public void clickOnButtonPrintPUI() throws Exception{
        new TopButtonView(driver).clickPrintPUI();
        WaitTime.WaitForElementNotToBeVisible(driver, "id", "modal_mask");
        //Thread.sleep(5000);

    }

    @And("click on button Confirm Payment")
    public void clickOnButtonConfirmPayment() throws Exception{
        new TopButtonView(driver).clickConfirmPayment();
        //Thread.sleep(5000);
    }

    @And("click on button Certification of signature")
    public void clickOnButtonCertificationOfSignature()throws Exception {
        new TopButtonView(driver).clickCertificationOfSignature();

        new PrintoutsPage(driver).printDocuments(data.get("Štampa"));
        //Thread.sleep(5000);
    }
    @Then("check Info message After Certification Of Signature")
    public void checkInfoMessageAfterCertificationOfSignature() throws Exception{
        new BasePage(driver).InfoMessage(data.get("Poruka nakon potvrde potpisa"), softAssert);
    }

    @And("click on button Print conditions")
    public void clickOnButtonPrintConditions()throws Exception {
        new TopButtonView(driver).clickPrintConditions();
    }

    @Step("Assertion Error: {0}")
    public void reportAssertionError(AssertionError e) {
        throw e;
    }

    @And("choose entity type")
    public void chooseEntityType() throws Exception {
        new SearchPersonTravelAssistancePage(driver).setChooseEntityTypes(data.get("Ugovarač Pr/Fi lice"));
    }
}
