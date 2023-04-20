package steps.Life;

import cSore_Mapping.Common.Dialog.Iframe.SearchPersonTravelAssistancePage;
import cSore_Mapping.Common.Dialog.Iframe.ViewPersonPage;
import cSore_Mapping.Common.Tab.PersonPage;
import cSore_Mapping.Common.View.DocumentInfoPage;
import cSore_Mapping.Common.View.TopButtonView;
import cSore_Mapping.Life.Tab.ConcernsPage;
import cSore_Mapping.Life.Tab.GeneralPage;
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
import cSore_Mapping.Life.View.LifeProductSelectionPage;
import cSore_Mapping.Common.Pages.LoginPage;
import cSore_Mapping.Common.Pages.ProductsPage;
import tests.BaseTest;


import java.io.IOException;
import java.util.Map;

public class LifeSteps extends BaseTest {
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


    @Then("Choose LOB")
    public void chooseLOB() throws Exception {
        new ProductsPage(driver).selectLob(data.get("LOB"));
        Thread.sleep(2000);
    }

    @And("Choose product")
    public void chooseProduct() throws Exception {
        new LifeProductSelectionPage(driver).selectProizvod(data.get("Proizvod"));
    }
    @And("Choose Product type")
    public void chooseProductType() throws Exception {
        new LifeProductSelectionPage(driver).selectProductType(data.get("Vrsta dokumenta"));
    }

    @And("click on product icon")
    public void clickOnProductIcon() throws Exception {
        new LifeProductSelectionPage(driver).clickProductIcon(data.get("Proizvod"));
    }

    @Then("input duration of insurance")
    public void inputDurationOfInsurance() throws Exception {
        new GeneralPage(driver).setTrajanje(data.get("Trajanje"));
        if (!data.get("Vrsta dokumenta").equals("Novi ugovor")) {
            new GeneralPage(driver).setClientInfo();
        }
        if (data.get("Proizvod").equals("Riziko kredit")){
            new GeneralPage(driver).selectChoiceOfDuration(data.get("Izbor dužine trajanja"));
        }
    }

    @And("set place")
    public void setPlace() throws Exception {
        new GeneralPage(driver).selectPlace(data.get("Mesto"), data.get("Tačno mesto"));
    }

    @And("set payment dynamic")
    public void setPaymentDynamic() throws Exception {
        new cSore_Mapping.Common.Tab.GeneralPage(driver).selectDinamika(data.get("Dinamika plaćanja"));
    }

    @And("set currency")
    public void setCurrency() throws Exception {
        new cSore_Mapping.Common.Tab.GeneralPage(driver).selectValuta(data.get("Valuta"));
    }

    @And("set FXClause")
    public void setFXClause() throws Exception {
        new cSore_Mapping.Common.Tab.GeneralPage(driver).selectValutnaKlauzula(data.get("Valutna klauzula"));
    }

    @And("set Payment Method")
    public void setPaymentMethod() throws Exception {
        if (!data.get("Metod plaćanja").equals("Trajni nalog")) {
            new cSore_Mapping.Common.Tab.GeneralPage(driver).selectMetodPlacanja(data.get("Metod plaćanja"));
        } else {
            new cSore_Mapping.Common.Tab.GeneralPage(driver).selectMetodPlacanja(data.get("Metod plaćanja"));
            new cSore_Mapping.Common.Tab.GeneralPage(driver).selectBanka(data.get("Banka"));
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
                //Assert.assertEquals(new BasePage(driver).ErrorMessage(), "Nije moguće zaključiti Novi ugovor, jer proizvod osiguranja više nije aktivan. Molimo, odaberite neki drugi.");
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
        new PersonPage(driver).clickSamePerson();
    }

    @Then("click on add button")
    public void clickOnAddButton() throws Exception{
        new PersonPage(driver).clickAddPersonPolicyHolder();
        Thread.sleep(2000);
    }

    @And("on Iframe input Identification number")
    public void onIframeInputIdentificationNumber() throws Exception {
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

    @And("select payer option")
    public void selectPayerOption() throws Exception {
        if (data.get("Ugovarač i platilac su isto lice").equals("Da")) {
            new cSore_Mapping.Life.Tab.PersonPage(driver).clickPayerInsureeSamePerson();
        }
        if (data.get("Ugovarač i platilac su isto lice").equals("Ne")) {
            new cSore_Mapping.Life.Tab.PersonPage(driver).clickAddPayer();
            JumpToFrame();
            new SearchPersonTravelAssistancePage(driver).setInputIdentificationNumber(data.get("Platilac"));
            // }else
            //   if(data.get("Ugovarač Pr/Fi lice").equals("Pravno")) {
            //       new cSore_Mapping.Common.Dialog.Iframe.SearchPersonTA(driver).inputPIB(data.get("Identifikacioni broj"));
            //   }
            clickOnButtonSearch();
            clickOnButtonPreview();
            clickOnButtonAccept();
            checkInfoMessageOnTopOfPage();
        }
    }

    @And("choose legal representative")
    public void chooseLegalRepresentative() throws Exception {
        if (data.get("Ugovarač/Osiguranik imaju zakonskog zastupnika").equals("Da")) {
            new cSore_Mapping.Life.Tab.PersonPage(driver).clickHasLegalRepresentative();
        }
        if (data.get("Ugovarač/Osiguranik imaju zakonskog zastupnika").equals("Ne")) {
            new cSore_Mapping.Life.Tab.PersonPage(driver).clickAddLegalRepresentative();
            JumpToFrame();
            new SearchPersonTravelAssistancePage(driver).setInputIdentificationNumber(data.get("Zakonski zastupnik"));
            // }else
            //   if(data.get("Ugovarač Pr/Fi lice").equals("Pravno")) {
            //       new cSore_Mapping.Common.Dialog.Iframe.SearchPersonTA(driver).inputPIB(data.get("Identifikacioni broj"));
            //   }
            clickOnButtonSearch();
            clickOnButtonPreview();
            clickOnButtonAccept();
            checkInfoMessageOnTopOfPage();
        }
    }

    @When("click on tab Concerns")
    public void clickOnTabConcerns() throws Exception {
        new TabView(driver).clickConcernsTab();
    }
    @Then("choose Calculation direction")
    public void chooseCalculationDirection() throws Exception {
        new ConcernsPage(driver).selectCalculationDirection(data.get("Osnov za kalkulaciju"));
    }

    @And("input insured sum or premium")
    public void inputInsuredSumOrPremium() throws Exception {
        new ConcernsPage(driver).setInsuredSumOrPremium(data.get("Iznos"));

    }
    @Then("input height")
    public void inputHeight() throws Exception {
        new ConcernsPage(driver).setHeight(data.get("Visina"));
    }

    @And("input weight")
    public void inputWeight()throws Exception  {
        new ConcernsPage(driver).setWeight(data.get("Težina"));
    }

    @And("input interest")
    public void inputInterest() throws Exception {
        new ConcernsPage(driver).setInterest(data.get("Kamatna stopa"));
    }
    @And("fill health questionnaire")
    public void fillHealthQuestionnaire() throws Exception {



    }
    @And("click on button Accept on top view")
    public void clickOnButtonAcceptOnTopView() throws Exception{
        new TopButtonView(driver).clickSubmit();
    }
    @And("click on button Calculate")
    public void clickOnButtonCalculate() throws Exception{
        new TopButtonView(driver).clickCalculate();
    }
    @Then("check calculation")
    public void checkCalculation()throws Exception {
        // TODO: u zavisnosti od osnova za obračun
        Assert.assertEquals(new DocumentInfoPage(driver).getRatePremije(),data.get("Premija"));
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

        //Assert.assertEquals(new BasePage(driver).InfoMessage(),data.get("Poruka nakon potvrde potpisa"));
    }
}
