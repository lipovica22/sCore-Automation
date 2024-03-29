package steps.Health.Meduniqa;


import cSore_Mapping.BasePage;
import cSore_Mapping.Common.Dialog.Iframe.SearchPersonTravelAssistancePage;
import cSore_Mapping.Common.Dialog.Iframe.ViewPersonPage;
import cSore_Mapping.Common.Menu.LeftMenuPage;
import cSore_Mapping.Common.Pages.ProductsPage;
import cSore_Mapping.Common.Tab.GeneralPage;
import cSore_Mapping.Common.Tab.PersonPage;
import cSore_Mapping.Common.View.DocumentInfoPage;
import cSore_Mapping.Common.View.TabView;
import cSore_Mapping.Common.View.TopButtonView;
import cSore_Mapping.Health.Page.AccidentHealthPage;
import cSore_Mapping.Health.Tab.ConcernsPage;
import cSore_Mapping.Health.Tab.GeneralMedUniqaPage;
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
import org.testng.asserts.SoftAssert;
import tests.BaseTest;


import java.io.IOException;
import java.util.Map;


public class MedUniqaSteps extends BaseTest {
    // naredne dve linije služe da iz xml file uzmemo parametre za cucumber
    String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
    String quit = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("quit");
    Map<String, String> data;
    String path = "/results/screenshots/";

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
    public void loginOnAppRSTest(String file, String sheet, String row) throws IOException {
        driver.get("https://t-score.uniqa.rs/POS/Serbia/NoAD");
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
        try {
            Assert.assertEquals(new LoginPage(driver).LoggedUser(), "sCoreAgent");
        } catch (AssertionError e) {
            System.out.println("Assertion failed: " + e.getMessage());
            reportAssertionError(e);
        }
    }

    @And("page is Products")
    public void pageIsProducts() {
        try {
            Assert.assertEquals(driver.getCurrentUrl(), "https://t-score.uniqa.rs/POS/Serbia/Products");
        } catch (AssertionError e) {
            System.out.println("Assertion failed: " + e.getMessage());
            reportAssertionError(e);
        }
    }
    @Then("choose LOB")
    public void chooseLOB() throws Exception {
        new ProductsPage(driver).selectLob(data.get("LOB"));
        Thread.sleep(2000);
    }

    @And("choose product")
    public void chooseProduct() throws Exception {
        new AccidentHealthPage(driver).selectProizvod(data.get("Proizvod"));
    }

    @And("choose Document type")
    public void chooseDocumentType()throws Exception {
        new LeftMenuPage(driver).clickLeftMenuButton(data.get("Vrsta dokumenta"));
    }

    @Then("input Duration of insurance")
    public void inputDurationOfInsurance() throws Exception {
        new GeneralPage(driver).inputDuration(data.get("Trajanje"));
    }

    @And("set Place")
    public void setPlace() throws Exception{
        new GeneralPage(driver).selectPlace(data.get("Mesto ugovaranja"),"11030 Beograd (Čukarica) - Beograd-Cukarica");
    }
    @Then("choose Tariff groups")
    public void chooseTariffGroups() throws Exception {
        new GeneralMedUniqaPage(driver).selectTariff(data.get("Tarifa osiguranja"));
    }

    @And("choose Classification types")
    public void chooseClassificationTypes() throws Exception{
        new GeneralMedUniqaPage(driver).selectTariffType(data.get("Vrsta tarife"));
    }

    @And("choose Premium calculation types")
    public void choosePremiumCalculationTypes() throws Exception {
        new GeneralMedUniqaPage(driver).selectPremiumCalculatonMethod(data.get("Način obračuna premije"));
    }


    @And("set Payment Method")
    public void setPaymentMethod() throws Exception {
        new GeneralPage(driver).selectDinamika(data.get("Metod plaćanja"));
    }

    @And("click on tab Persons")
    public void clickOnTabPersons() throws Exception{
        new TabView(driver).clickPersonsTab();
    }

    @Then("set Same person")
    public void setSamePerson() throws Exception{
        new PersonPage(driver).clickSamePerson();

    }

    @And("click on add button")
    public void clickOnAddButton() throws Exception{
        new PersonPage(driver).clickAddPersonPolicyHolder();
        Thread.sleep(2000);
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
        //prvo ugovarač pa posle dokument je sacuvan
        //Assert.assertEquals(new BasePage(driver).InfoMessage(),data.get("Poruke:"));
    }

    @When("click on Concerns tab")
    public void clickOnConcernsTab() throws Exception{
        new TabView(driver).clickConcernsTab();
    }

    @And("choose Package")
    public void choosePackage() throws Exception{
        new ConcernsPage(driver).selectPackage(data.get("Paketi"));

    }

    @And("choose Insured sum")
    public void chooseInsuredSum() throws Exception{
        new ConcernsPage(driver).selectInsuredSumList(data.get("Suma osiguranja"));
    }

    @And("choose Sum correction")
    public void chooseSumCorrection()throws Exception {
        new ConcernsPage(driver).selectCorrection(data.get("Korekcija OS"));
    }

    @And("choose Franchise")
    public void chooseFranchise() throws Exception{
       new ConcernsPage(driver).selectFranchise(data.get("Učešće u šteti"));
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
        }
        if(data.get("Tip ugovora").equals("Grupna")) {
            new ConcernsPage(driver).fileUpload("grupno");
            new ConcernsPage(driver).add();
            Thread.sleep(2000);
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
        Thread.sleep(5000);
    }

    @And("click on button Print PUI")
    public void clickOnButtonPrintPUI() throws Exception{
        new TopButtonView(driver).clickPrintPUI();
        Thread.sleep(5000);
    }

    @And("click on button Confirm Payment")
    public void clickOnButtonConfirmPayment() throws Exception{
        new TopButtonView(driver).clickConfirmPayment();
        Thread.sleep(5000);
    }

    @And("click on button Certification of signature")
    public void clickOnButtonCertificationOfSignature()throws Exception {
        new TopButtonView(driver).clickCertificationOfSignature();
        Thread.sleep(5000);
    }
    @Then("check Info message After Certification Of Signature")
    public void checkInfoMessageAfterCertificationOfSignature() throws Exception{
        new BasePage(driver).InfoMessage(data.get("Poruka nakon potvrde potpisa"), softAssert);

        //Assert.assertEquals(new BasePage(driver).InfoMessage(),data.get("Poruka nakon potvrde potpisa"));
    }
    @And("click on button Print conditions")
    public void clickOnButtonPrintConditions()throws Exception {
    }
    @Step("Assertion Error: {0}")
    public void reportAssertionError(AssertionError e) {
        throw e;
    }

    @And("choose entity type")
    public void chooseEntityType() throws Exception {
        new SearchPersonTravelAssistancePage(driver).setChooseEntityTypes(data.get("Ugovarač Pr/Fi lice"));
    }

    @Then("print offer document and health questionnaire")
    public void printOfferDocumentAndHealthQuestionnaire() {

    }

    @Then("input height")
    public void inputHeight() {
    }

    @And("input weight")
    public void inputWeight() {
    }

    @And("status of insured person")
    public void statusOfInsuredPerson() {
    }

    @And("choose insured risks and sums")
    public void chooseInsuredRisksAndSums() {
    }

    @And("fill health questionnaire")
    public void fillHealthQuestionnaire() {



    }

    @And("upload offer document")
    public void uploadOfferDocument() {
    }

    @Then("check Warring message After Certification Of Signature")
    public void checkWarringMessageAfterCertificationOfSignature() {
    }



}
