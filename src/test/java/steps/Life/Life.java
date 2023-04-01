package steps.Life;

import cSore_Mapping.Common.Pages.BasePage;
import cSore_Mapping.Common.View.TopButtonView;
import cSore_Mapping.Life.Tab.General;
import cSore_Mapping.Common.View.TabView;
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
import cSore_Mapping.Life.View.LifeProductSelection;
import cSore_Mapping.Common.Pages.Login;
import cSore_Mapping.Common.Pages.Products;
import tests.BaseTest;


import java.io.IOException;
import java.util.Map;

public class Life extends BaseTest {
    // naredne dve linije služe da iz xml file uzmemo parametre za cucumber
    String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
    String quit = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("quit");
    Map<String, String> data;
    String path = "results/screenshots/";

    @Before
    public void setup() throws Exception {
        initialization(browser);
    }

    @After
    public void tearDown() throws IOException {
        takeScreenshot("slika" + System.currentTimeMillis());
        if (quit.equalsIgnoreCase("Yes")) {
            quit();
        }
    }
    @Step("Assertion Error: {0}")
    public void reportAssertionError(AssertionError e) {
        throw e;
    }

    @Given("login on app RS Test {string} {string} {string}")
    public void loginOnAppRSTest(String file, String sheet, String row) throws Exception {
        driver.get("https://t-score.uniqa.rs/POS/Serbia/NoAD");
        data = new ExcelReader().getRowData(file, sheet, Integer.parseInt(row));
    }

    @When("enter username")
    public void enterUsername() throws Exception {
        new Login(driver).setUsername(data.get("Username"));
    }

    @And("enter password")
    public void enterPassword() throws Exception {
        new Login(driver).setPassword(data.get("Password"));
    }

    @And("click on Submit button")
    public void clickOnSubmitButton() throws Exception {
        new Login(driver).clickSubmit();
    }

    @Then("Logged in")
    public void loggedIn() throws Exception {
        try {
            Assert.assertEquals(new Login(driver).LoggedUser(), "sCoreAgent");
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


    @Then("Choose LOB")
    public void chooseLOB() throws Exception {
        new Products(driver).selectLob(data.get("LOB"));
        Thread.sleep(2000);
    }

    @And("Choose product")
    public void chooseProduct(String Proizvod) throws Exception {
        new LifeProductSelection(driver).selectProizvod(data.get("Proizvod"));
    }
    @And("Choose Product type")
    public void chooseProductType() throws InterruptedException {
        new LifeProductSelection(driver).selectProductType(data.get("Vrsta dokumenta"));
    }

    @And("click on product icon")
    public void clickOnProductIcon() throws Exception {
        new LifeProductSelection(driver).clickProductIcon(data.get("Proizvod"));
    }

    @Then("tab is General")
    public void tabIsGeneral() {
        try {
            Assert.assertEquals(driver.getCurrentUrl(), new General(driver).url(data.get("Proizvod"), data.get("Vrsta dokumenta")));
            /*if (!new General(driver).url(data.get("Proizvod"), data.get("Vrsta dokumenta")).equals(driver.getCurrentUrl())) {
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "Screenshot");
            }*/
        } catch (AssertionError e) {
            System.out.println("Assertion failed: " + e.getMessage());
            reportAssertionError(e);
        }

    }

    @Then("input duration of insurance")
    public void inputDurationOfInsurance() throws Exception {
        new General(driver).setTrajanje(data.get("Trajanje"));
        if (!data.get("Vrsta dokumenta").equals("Novi ugovor")) {
            new General(driver).inputClientInfo();
        }
        if (data.get("Proizvod").equals("Riziko kredit")){
            selectOption("Godine",new General(driver).IzborDuzineTrajanja());
        }
    }

    @And("set place")
    public void setPlace() throws Exception {
        selectOptionAC(data.get("Mesto"), "11000 Beograd", new General(driver).getMesto());
    }

    @And("set payment dynamic")
    public void setPaymentDynamic() throws Exception {
        selectOption(data.get("Dinamika placanja"), new General(driver).getDinamika());
    }

    @And("set currency")
    public void setCurrency() throws Exception {
        selectOption(data.get("Valuta"), new General(driver).getValuta());
    }

    @And("set FXClause")
    public void setFXClause() throws Exception {
        selectOption(data.get("Valutna klauzula"), new General(driver).getValutnaKlauzula());
    }

    @And("set Payment Method")
    public void setPaymentMethod() throws Exception {
        if (!data.get("Metod plaćanja").equals("Trajni nalog")) {
            selectOption(data.get("Metod plaćanja"), new General(driver).getMetodPlacanja());
        } else {
            selectOption(data.get("Metod placanja"), new General(driver).getMetodPlacanja());
            selectOption(data.get("Banka"), new General(driver).getBanka());
        }
    }

    @And("click on next tab")
    public void clickOnNexTab() throws Exception {
        if (data.get("Vrsta dokumenta").equals("Novi ugovor")) {
            new TabView(driver).clickPersonsTab();
        } else {
            new TabView(driver).clickConcernsTab();
        }
    }

    @When("tab is PersonConcerns")
    public void tabIsPersonConcerns() {
        try {
            if (data.get("Proizvod").equals("Riziko Mix")) {
                Assert.assertEquals(new BasePage(driver).ErrorMessage(), "Nije moguće zaključiti Novi ugovor, jer proizvod osiguranja više nije aktivan. Molimo, odaberite neki drugi.");
            } else {

                if (data.get("Vrsta dokumenta").equals("Novi ugovor")) {

                    Assert.assertTrue(driver.getCurrentUrl().contains("Persons"), "Nije prešao na tab Lica već " + driver.getCurrentUrl());
                } else {
                    Assert.assertTrue(driver.getCurrentUrl().contains("Concern"), "Nije prešao na tab Ugovornih elemenata već " + driver.getCurrentUrl());
                }
            }
        }  catch (AssertionError e) {
        System.out.println("Assertion failed: " + e.getMessage());
        reportAssertionError(e);
        }
    }

    @And("set Same person")
    public void setSamePerson() throws Exception{
        new cSore_Mapping.Common.Tab.Person(driver).clickSamePerson();
    }

    @Then("click on add button")
    public void clickOnAddButton() throws Exception{
        new cSore_Mapping.Common.Tab.Person(driver).clickAddPersonPolicyHolder();
        Thread.sleep(2000);
    }

    @And("on Iframe input Identification number")
    public void onIframeInputIdentificationNumber() throws Exception {
        JumpToFrame();
        new cSore_Mapping.Common.Dialog.Iframe.SearchPersonTA(driver).setInputIdentificationNumber(data.get("Identifikacioni broj"));
        // }else
        //   if(data.get("Ugovarač Pr/Fi lice").equals("Pravno")) {
        //       new cSore_Mapping.Common.Dialog.Iframe.SearchPersonTA(driver).inputPIB(data.get("Identifikacioni broj"));
        //   }
    }
    @And("click on button Search")
    public void clickOnButtonSearch() throws Exception{
        // if(data.get("Ugovarač Pr/Fi lice").equals("Fizičko")){
        new cSore_Mapping.Common.Dialog.Iframe.SearchPersonTA(driver).clickSearchButtonFL();
        // }else
        // if(data.get("Ugovarač Pr/Fi lice").equals("Pravno")) {
        //    new cSore_Mapping.Common.Dialog.Iframe.SearchPersonTA(driver).clickSearchButtonPL();
        // }
    }

    @And("click on button Preview")
    public void clickOnButtonPreview() throws Exception{
        new cSore_Mapping.Common.Dialog.Iframe.SearchPersonTA(driver).clickSearchResultGridFL();
    }

    @And("click on button Accept")
    public void clickOnButtonAccept() throws Exception{
        new cSore_Mapping.Common.Dialog.Iframe.ViewPerson(driver).clickAcceptButton();
    }
    @Then("check Info message on top of page")
    public void checkInfoMessageOnTopOfPage() throws Exception{
        //prvo ugovarač pa posle dokument je sacuvan
        //Assert.assertEquals(new BasePage(driver).InfoMessage(),data.get("Poruke:"));
    }

    @And("select payer option")
    public void selectPayerOption() {
    }

    @And("choose legal representative")
    public void chooseLegalRepresentative() {
    }

    @When("click on tab Concerns")
    public void clickOnTabConcerns() {
    }
    @Then("choose Calculation direction")
    public void chooseCalculationDirection() {
    }

    @And("input insured sum or premium")
    public void inputInsuredSumOrPremium() {
    }
    @Then("input height")
    public void inputHeight() {
    }

    @And("input weight")
    public void inputWeight() {
    }
    @And("fill health questionnaire")
    public void fillHealthQuestionnaire() {



    }
    @And("click on button Accept on top view")
    public void clickOnButtonAcceptOnTopView() throws Exception{
        new cSore_Mapping.Common.View.TopButtonView(driver).clickSubmit();
    }
    @And("click on button Calculate")
    public void clickOnButtonCalculate() throws Exception{
        new TopButtonView(driver).clickCalculate();
    }
    @Then("check calculation")
    public void checkCalculation()throws Exception {
        // TODO: u zavisnosti od osnova za obračun
        Assert.assertEquals(new cSore_Mapping.Health.View.DocumentInfo(driver).getRatePremije(),data.get("Premija"));
    }
    @And("click on button Activate")
    public void clickOnButtonActivate() throws Exception{
        new TopButtonView(driver).clickActivate();
        Thread.sleep(5000);
    }

    @And("fill Money laundry questionnaire")
    public void fillMoneyLaundryQuestionnaire() {
    }

    @And("fill Associate money laundry questionnaire")
    public void fillAssociateMoneyLaundryQuestionnaire() {
    }

    @Then("Print documents")
    public void printDocuments() {
    }

    @And("upload documents on Documentation tab")
    public void uploadDocumentsOnDocumentationTab() {
    }

    @When("click on Tile upload button")
    public void clickOnTileUploadButton() {
    }

    @And("choose documents for upload")
    public void chooseDocumentsForUpload() {
    }

    @And("click on button load all")
    public void clickOnButtonLoadAll() {
    }

    @Then("select document type")
    public void selectDocumentType() {
    }

    @And("select Confidentiality")
    public void selectConfidentiality() {
    }

    @Then("click on button Save")
    public void clickOnButtonSave() {
    }

    @And("leave a iframe click on X button in right corner")
    public void leaveAIframeClickOnXButtonInRightCorner() {
    }

    @And("click on button Certification of signature")
    public void clickOnButtonCertificationOfSignature()throws Exception {
        new TopButtonView(driver).clickCertificationOfSignature();
        Thread.sleep(5000);
    }
    @Then("check Warring message After Certification Of Signature")
    public void checkWarringMessageAfterCertificationOfSignature() {
    }
    @And("check Info message After Certification Of Signature")
    public void checkInfoMessageAfterCertificationOfSignature() throws Exception{

        Assert.assertEquals(new BasePage(driver).InfoMessage(),data.get("Poruka nakon potvrde potpisa"));
    }
}
