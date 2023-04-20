package steps.Life.NC;
import cSore_Mapping.Common.Dialog.Iframe.FileUpload;
import cSore_Mapping.Common.Dialog.Iframe.ViewPersonL;
import cSore_Mapping.Common.Pages.LoginPage;
import cSore_Mapping.Common.Pages.ProductsPage;
import cSore_Mapping.Common.Tab.PrintoutsPage;
import cSore_Mapping.Common.View.TopButtonView;
import cSore_Mapping.Life.Tab.*;
import cSore_Mapping.Common.View.TabView;
import cSore_Mapping.Life.View.HealthCondition.Questionnaire;
import cSore_Mapping.Life.View.LifeProductSelectionPage;
import excel.ExcelReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.Reporter;
import tests.BaseTest;
import java.io.IOException;
import java.util.Map;

public class NewContractSteps extends BaseTest {
    // naredne dve linije služe da iz xml file uzmemo parametre za cucumber
    String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
    String quit = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("quit");
    Map<String, String> data;
    Map<String, String> AML;
    Map<String, String> AMLS;
    String path = "results/screenshots/";
    Map<String, String> VINK;
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
        driver.get("https://s-dev-iis.stech.loc/POS/Serbia/Products");
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
            Assert.assertEquals(new LoginPage(driver).LoggedUser(), "scoreAgent");
        } catch (AssertionError e) {
             System.out.println("Assertion failed: " + e.getMessage());
            reportAssertionError(e);
        }
    }

    @And("page is Products")
    public void pageIsProducts() {
     try {
         //Assert.assertEquals(driver.getCurrentUrl(), "https://t-score.uniqa.rs/POS/Serbia/Products");
         Assert.assertEquals(driver.getCurrentUrl(), "https://s-dev-iis.stech.loc/POS/Serbia/Products");
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

    @Then("tab is GeneralPage")
    public void tabIsGeneralPage() {
        try {
            //Assert.assertEquals(driver.getCurrentUrl(), new GeneralPage(driver).url(data.get("Proizvod"), data.get("Vrsta dokumenta")));
            /*if (!new GeneralPage(driver).url(data.get("Proizvod"), data.get("Vrsta dokumenta")).equals(driver.getCurrentUrl())) {
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "Screenshot");
            }*/
        } catch (AssertionError e) {
            System.out.println("Assertion failed: " + e.getMessage());
            reportAssertionError(e);
        }

    }

    @Then("input duration of insurance and if product is Riziko kredit fill Izbor dužine trajanja")
    public void inputDurationOfInsurance() throws Exception {
        if (!data.get("Proizvod").equals("Doživotni riziko")) {
            new GeneralPage(driver).setTrajanje(data.get("Trajanje"));
            if (!data.get("Vrsta dokumenta").equals("Novi ugovor")) {
                new GeneralPage(driver).setClientInfo();
            }
            if (data.get("Proizvod").equals("Riziko kredit")) {
                new GeneralPage(driver).selectChoiceOfDuration(data.get("Izbor dužine trajanja"));
            }
        }
    }

    @And("set place")
    public void setPlace() throws Exception {
        //selectOptionAC(data.get("Mesto"), "11000 Beograd", new GeneralPage(driver).getMesto());
        new GeneralPage(driver).selectPlace(data.get("Mesto"), "11030 Beograd (Čukarica) - Beograd-Cukarica");
    }

    @And("set payment dynamic")
    public void setPaymentDynamic() throws Exception {
        new GeneralPage(driver).selectDynamics(data.get("Dinamika plaćanja"));
    }

    @And("set currency")
    public void setCurrency() throws Exception {
        //new GeneralPage(driver).selectCurrency(data.get("Valuta"));
    }

    @And("set FXClause")
    public void setFXClause() throws Exception {
        new GeneralPage(driver).selectCurrencyClause(data.get("Valutna klauzula"));
    }

    @And("set Payment Method and bank if method is Trajni nalog")
    public void setPaymentMethod() throws Exception {
        if (!data.get("Metod plaćanja").equals("Trajni nalog")) {
            new GeneralPage(driver).selectPaymentMethod(data.get("Metod plaćanja"));
        } else {
            new GeneralPage(driver).selectPaymentMethod(data.get("Metod plaćanja"));
            new GeneralPage(driver).selectBank(data.get("Banka"));
        }
    }
    @And("choose vinculation option")
    public void chooseVinculationOption() throws Exception {
        if (data.get("Vinkulacija").equals("false") ){
            new GeneralPage(driver).uNClickVinculation();
        }
        if (data.get("Vinkulacija").equals("true")) {
            new GeneralPage(driver).ClickVinculation();
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
                //Assert.assertEquals(new BasePage(driver).ErrorMessage("", "Nije moguće zaključiti Novi ugovor, jer proizvod osiguranja više nije aktivan. Molimo, odaberite neki drugi.",);
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
    public void setSamePerson() throws Exception {
        if (data.get("Ugovarač i osiguranik su isto lice").equals("true")) {
            new cSore_Mapping.Common.Tab.PersonPage(driver).clickSamePerson();
        }
    }

    @Then("click on add button")
    public void clickOnAddButton() throws Exception{
        new cSore_Mapping.Common.Tab.PersonPage(driver).clickAddPersonPolicyHolder();
        Thread.sleep(2000);
    }

    @And("on Iframe input Identification number")
    public void onIframeInputIdentificationNumber() throws Exception {
        JumpToFrame();
        new cSore_Mapping.Common.Dialog.Iframe.SearchPersonTravelAssistancePage(driver).setInputIdentificationNumber(data.get("Ugovarač"));
        // }else
        //   if(data.get("Ugovarač Pr/Fi lice").equals("Pravno")) {
        //       new cSore_Mapping.Common.Dialog.Iframe.SearchPersonTA(driver).inputPIB(data.get("Identifikacioni broj"));
        //   }
    }
    @And("click on button Search")
    public void clickOnButtonSearch() throws Exception{
        // if(data.get("Ugovarač Pr/Fi lice").equals("Fizičko")){
        new cSore_Mapping.Common.Dialog.Iframe.SearchPersonTravelAssistancePage(driver).clickSearchButtonFL();
        // }else
        // if(data.get("Ugovarač Pr/Fi lice").equals("Pravno")) {
        //    new cSore_Mapping.Common.Dialog.Iframe.SearchPersonTA(driver).clickSearchButtonPL();
        // }
    }

    @And("click on button Preview")
    public void clickOnButtonPreview() throws Exception{
        new cSore_Mapping.Common.Dialog.Iframe.SearchPersonTravelAssistancePage(driver).clickSearchResultGridFL();
    }

    @And("click on button Accept")
    public void clickOnButtonAccept() throws Exception{
        new ViewPersonL(driver).clickAcceptButton();
    }
    @Then("check Info message on top of page")
    public void checkInfoMessageOnTopOfPage() throws Exception{
        //prvo ugovarač pa posle dokument je sacuvan
        //Assert.assertEquals(new BasePage(driver).InfoMessage(),data.get("Poruke:"));
    }

    @And("select payer option")
    public void selectPayerOption() throws Exception {
        if (data.get("Ugovarač i platilac su isto lice").equals("true")) {
            new cSore_Mapping.Life.Tab.PersonPage(driver).clickPayerInsureeSamePerson();
        }
        if (data.get("Ugovarač i platilac su isto lice").equals("false")) {
            new cSore_Mapping.Life.Tab.PersonPage(driver).clickAddPayer();
            JumpToFrame();
            new cSore_Mapping.Common.Dialog.Iframe.SearchPersonTravelAssistancePage(driver).setInputIdentificationNumber(data.get("Platilac"));
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
            new cSore_Mapping.Common.Dialog.Iframe.SearchPersonTravelAssistancePage(driver).setInputIdentificationNumber(data.get("Zakonski zastupnik"));
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
        new cSore_Mapping.Life.Tab.ConcernsPage(driver).selectCalculationDirection(data.get("Osnov za kalkulaciju"));
    }
    @And("input insured sum or premium")
    public void inputInsuredSumOrPremium() throws Exception {
        new ConcernsPage(driver).setInsuredSumOrPremium(data.get("Iznos"));
    }
    @Then("input height if product is not Favorit or Dozivotni riziko")
    public void inputHeightIfProductIsntFavorit() throws Exception {
        if (!data.get("Proizvod").equals("Favorit") && !data.get("Proizvod").equals("Doživotni riziko")){
                new ConcernsPage(driver).setHeight(data.get("Visina"));
        }
    }
    @And("input weight if product is not Favorit or Dozivotni riziko")
    public void inputWeightIfProductIsNotFavorit()throws Exception {
        if (!data.get("Proizvod").equals("Favorit") && !data.get("Proizvod").equals("Doživotni riziko")){
                new ConcernsPage(driver).setWeight(data.get("Težina"));
            }
    }
    @And("input interest if product is Riziko kredit")
    public void inputInterestIfProductIsRisikoKredit() throws Exception {
        if (data.get("Proizvod").equals("Riziko kredit")) {
            new cSore_Mapping.Life.Tab.ConcernsPage(driver).setInterest(data.get("Kamatna stopa"));
        }
    }

    @And("check insured risks and sum or premium")
    public void checkInsuredRisksAndSumOrPremium() throws Exception {
        String proizvod=data.get("Proizvod");
        switch (proizvod) {
            case "Doživotni riziko": {
                if(data.get("Smrt usled nezgode").equals("true")){
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickSmrtUsledNezgode(proizvod, data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputSmrtUsledNezgodeValue(proizvod, data.get("Indeksacija"),data.get("Smrt usled nezgode - Suma"));
                }
                if(data.get("Trajni invaliditet").equals("true")) {
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickTrajniInvaliditet(proizvod, data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputTrajniInvaliditetValue(proizvod, data.get("Indeksacija"),data.get("Trajni invaliditet - Suma"));
                }
                if(data.get("Lom kostiju").equals("true")){
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickLomKostiju(proizvod, data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputLomKostijuValue(proizvod, data.get("Indeksacija"),data.get("Lom kostiju - Suma"));
                }
                if(data.get("Dnevna naknada -nezgoda").equals("true")){
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickDnevnaNaknadaNezgoda(proizvod, data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputDnevnaNaknadaNezgodaValue(proizvod, data.get("Indeksacija"),data.get("Dnevna naknada -nezgoda - Suma"));
                }
                if(data.get("Hirurške intervencije - nezgoda").equals("true")){
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickHirurskeIntervencijeNezgode(proizvod, data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputHirurskeIntervencijeNezgodeValue(proizvod, data.get("Indeksacija"),data.get("Hirurške intervencije - nezgoda - Suma"));
                }
            }
            break;
            case "Favorit": {
                new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputTrajniInvaliditetValue(proizvod, data.get("Indeksacija"),data.get("Trajni invaliditet - Suma"));
                if(data.get("Lom kostiju").equals("true")){
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickLomKostiju(proizvod, data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputLomKostijuValue(proizvod, data.get("Indeksacija"),data.get("Lom kostiju - Suma"));
                }
                if(data.get("Dnevna naknada -nezgoda").equals("true")){
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickDnevnaNaknadaNezgoda(proizvod, data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputDnevnaNaknadaNezgodaValue(proizvod, data.get("Indeksacija"),data.get("Dnevna naknada -nezgoda - Suma"));
                }
                if(data.get("Hirurške intervencije - nezgoda").equals("true")){
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickHirurskeIntervencijeNezgode(proizvod, data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputHirurskeIntervencijeNezgodeValue(proizvod, data.get("Indeksacija"),data.get("Hirurške intervencije - nezgoda - Suma"));
                }
            }
            break;
            case "Riziko kredit": {}
            break;
            case "Joker": {
                if(data.get("Teže bolesti").equals("true")){
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickTezeBolesti(proizvod,data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputTezeBolestiValue(proizvod, data.get("Indeksacija"),data.get("Teže bolesti - Suma"));
                }
                if(data.get("Smrt usled nezgode").equals("true")){
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickSmrtUsledNezgode(proizvod, data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputSmrtUsledNezgodeValue(proizvod, data.get("Indeksacija"),data.get("Smrt usled nezgode - Suma"));
                }
                new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputTrajniInvaliditetValue(proizvod, data.get("Indeksacija"),data.get("Trajni invaliditet - Suma"));
                if(data.get("Lom kostiju").equals("true")){
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickLomKostiju(proizvod, data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputLomKostijuValue(proizvod, data.get("Indeksacija"),data.get("Lom kostiju - Suma"));
                }
                if(data.get("Dnevna naknada -nezgoda").equals("true")){
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickDnevnaNaknadaNezgoda(proizvod, data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputDnevnaNaknadaNezgodaValue(proizvod, data.get("Indeksacija"),data.get("Dnevna naknada -nezgoda - Suma"));
                }
                if(data.get("Dnevna naknada  - bolest").equals("true")){
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickDnevnaNaknadaBolesti(proizvod, data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputDnevnaNaknadaBolestiValue(proizvod, data.get("Indeksacija"),data.get("Dnevna naknada  - bolest - Suma"));
                }
                if(data.get("Hirurške intervencije - nezgoda").equals("true")){
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickHirurskeIntervencijeNezgode(proizvod, data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputHirurskeIntervencijeNezgodeValue(proizvod, data.get("Indeksacija"),data.get("Hirurške intervencije - nezgoda - Suma"));
                }
                if(data.get("Hirurške intervencije - bolest").equals("true")){
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickHirurskeIntervencijeBolesti(proizvod, data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputHirurskeIntervencijeBolestiValue(proizvod, data.get("Indeksacija"),data.get("Hirurške intervencije - bolest - Suma"));
                }
                if(data.get("Bolovanje").equals("true")){
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickBolovanje42(proizvod, data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputBolovanje42Value(proizvod, data.get("Indeksacija"),data.get("Bolovanje - Suma"));
                }
            }
            break;
            case "Spektar":
            case "Riziko": {
                if(data.get("Teže bolesti").equals("true")){
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickTezeBolesti(proizvod, data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputTezeBolestiValue(proizvod, data.get("Indeksacija"),data.get("Teže bolesti - Suma"));
                }
                if(data.get("Smrt usled nezgode").equals("true")){
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickSmrtUsledNezgode(proizvod, data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputSmrtUsledNezgodeValue(proizvod, data.get("Indeksacija"),data.get("Smrt usled nezgode - Suma"));
                }
                if(data.get("Trajni invaliditet").equals("true")) {
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickTrajniInvaliditet(proizvod, data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputTrajniInvaliditetValue(proizvod, data.get("Indeksacija"),data.get("Trajni invaliditet - Suma"));
                }
                if(data.get("Lom kostiju").equals("true")){
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickLomKostiju(proizvod, data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputLomKostijuValue(proizvod, data.get("Indeksacija"),data.get("Lom kostiju - Suma"));
                }
                if(data.get("Dnevna naknada -nezgoda").equals("true")){
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickDnevnaNaknadaNezgoda(proizvod, data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputDnevnaNaknadaNezgodaValue(proizvod, data.get("Indeksacija"),data.get("Dnevna naknada -nezgoda - Suma"));
                }
                if(data.get("Dnevna naknada  - bolest").equals("true")){
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickDnevnaNaknadaBolesti(proizvod, data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputDnevnaNaknadaBolestiValue(proizvod, data.get("Indeksacija"),data.get("Dnevna naknada  - bolest - Suma"));
                }
                if(data.get("Hirurške intervencije - nezgoda").equals("true")){
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickHirurskeIntervencijeNezgode(proizvod, data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputHirurskeIntervencijeNezgodeValue(proizvod, data.get("Indeksacija"),data.get("Hirurške intervencije - nezgoda - Suma"));
                }
                if(data.get("Hirurške intervencije - bolest").equals("true")){
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickHirurskeIntervencijeBolesti(proizvod, data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputHirurskeIntervencijeBolestiValue(proizvod, data.get("Indeksacija"),data.get("Hirurške intervencije - bolest - Suma"));
                }
                if(data.get("Bolovanje").equals("true")){
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickBolovanje42(proizvod, data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputBolovanje42Value(proizvod, data.get("Indeksacija"),data.get("Bolovanje - Suma"));
                }
            }
            break;
            case "Riziko Mix": {
                if(data.get("Smrt usled nezgode").equals("true")){
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickSmrtUsledNezgode(proizvod, data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputSmrtUsledNezgodeValue(proizvod, data.get("Indeksacija"),data.get("Smrt usled nezgode - Suma"));
                }
                if(data.get("Trajni invaliditet").equals("true")) {
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickTrajniInvaliditet(proizvod, data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputTrajniInvaliditetValue(proizvod, data.get("Indeksacija"),data.get("Trajni invaliditet - Suma"));
                }
                if(data.get("Lom kostiju").equals("true")){
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickLomKostiju(proizvod, data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputLomKostijuValue(proizvod, data.get("Indeksacija"),data.get("Lom kostiju - Suma"));
                }
                if(data.get("Dnevna naknada -nezgoda").equals("true")){
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickDnevnaNaknadaNezgoda(proizvod, data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputDnevnaNaknadaNezgodaValue(proizvod, data.get("Indeksacija"),data.get("Dnevna naknada -nezgoda - Suma"));
                }
                if(data.get("Dnevna naknada  - bolest").equals("true")){
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickDnevnaNaknadaBolesti(proizvod, data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputDnevnaNaknadaBolestiValue(proizvod, data.get("Indeksacija"),data.get("Dnevna naknada  - bolest - Suma"));
                }
                if(data.get("Hirurške intervencije - nezgoda").equals("true")){
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickHirurskeIntervencijeNezgode(proizvod, data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputHirurskeIntervencijeNezgodeValue(proizvod, data.get("Indeksacija"),data.get("Hirurške intervencije - nezgoda - Suma"));
                }
                if(data.get("Hirurške intervencije - bolest").equals("true")){
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickHirurskeIntervencijeBolesti(proizvod, data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputHirurskeIntervencijeBolestiValue(proizvod, data.get("Indeksacija"),data.get("Hirurške intervencije - bolest - Suma"));
                }
                if(data.get("Bolovanje").equals("true")){
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).clickBolovanje42(proizvod, data.get("Indeksacija"));
                    new cSore_Mapping.Life.Tab.ConcernsPage(driver).inputBolovanje42Value(proizvod, data.get("Indeksacija"),data.get("Bolovanje - Suma"));
                }
            }
            break;
            default:
                break;
        }
    }

    @And("click on button Accept on top view")
    public void clickOnButtonAcceptOnTopView() throws Exception {
        new cSore_Mapping.Common.View.TopButtonView(driver).clickSubmit();
    }

    @And("fill health questionnaire")
    public void fillHealthQuestionnaire() throws Exception {
        try{
            //new Questionnaire(driver).selectQuestionnaireType(data.get("Vrsta upitnika"));
            new Questionnaire(driver).selectQuestionnaireType("Zdravstveni upitnik");
            if(data.get("Tip upitnika").equals("ZU-sveNE")) {
                new Questionnaire(driver).allNO();
            }
            if(data.get("Tip upitnika").equals("ZU-DA")) {
                new Questionnaire(driver).allYes();
            }
        }catch (Exception e){
            throw new Exception("Error: " + e.getMessage());
        }
    }
    @And("click on button Save Questionnaire")
    public void clickOnButtonSaveQuestionnaire() throws Exception {
        new cSore_Mapping.Common.View.TopButtonView(driver).clickSaveQuestionary();
    }

    @And("click on button Calculate")
    public void clickOnButtonCalculate() throws Exception{
        new TopButtonView(driver).clickCalculate();
    }
    @Then("check calculation")
    public void checkCalculation()throws Exception {
        // TODO: u zavisnosti od osnova za obračun
        //Assert.assertEquals(new DocumentInfo(driver).getRatePremije(),data.get("Premija"));
    }
    @And("click on button Activate")
    public void clickOnButtonActivate() throws Exception{
        new TopButtonView(driver).clickActivate();
        Thread.sleep(5000);
    }

    @And("fill Money laundry questionnaire")
    public void fillMoneyLaundryQuestionnaire() throws Exception {
        new TabView(driver).clickMoneyLaundryTab();
        switch (data.get("AML")) {
            case "AML1": {
                AML = new ExcelReader().getRowData("TestData", "AML", 1);
            }
            break;
            case "AML2": {
                AML = new ExcelReader().getRowData("TestData", "AML", 2);
            }
            break;
            case "3": {
                AML = new ExcelReader().getRowData("TestData", "AML", 3);
            }
            break;
        }
        new MoneyLaundry(driver).QNN_1_0Label(AML.get("1. Namena/svrha ugovaranja osiguranja?"));
        new MoneyLaundry(driver).QNN_1_1Label(AML.get("2. Zanimanje / registrovana delatnost"));
        new MoneyLaundry(driver).QNN_1_2Label(AML.get("3. Izvor sredstava plaćanja"));
        //new MoneyLaundry(driver).QNN_1_3Label(AML.get("4. Državljanstvo / zemlja registracije Ugovarača osiguranja?"));
        //new MoneyLaundry(driver).QNN_1_3_1Label(AML.get("4.1."));
        //new MoneyLaundry(driver).QNN_1_4Label(AML.get("5. Ugovarač je poreski obveznik koje države?"));
        //new MoneyLaundry(driver).QNN_1_4_1Label(AML.get("5.1."));
        new MoneyLaundry(driver).QNN_1_8Label(AML.get("9. Ima li član vaše porodice polisu kod UNIQA životnog osiguranja?"));
        new TopButtonView(driver).acceptMoneyLaundry();
    }

    @And("fill Associate money laundry questionnaire")
    public void fillAssociateMoneyLaundryQuestionnaire() throws Exception {
        new TabView(driver).clickAssociateMoneyLaundryTab();
        switch (data.get("AML - saradnik")) {
            case "AML-S1": {
                AMLS = new ExcelReader().getRowData("TestData", "AML - saradnik", 1);
                new AssociateMoneyLaundry(driver).QNN_1_0Label(AMLS.get("1. Izvori prihoda klijenta (zaokružiti) su:"));
            }break;
            case "AML-S2": {
                AMLS = new ExcelReader().getRowData("TestData", "AML - saradnik", 2);
                new AssociateMoneyLaundry(driver).QNN_1_0Label(AMLS.get("1. Izvori prihoda klijenta (zaokružiti) su:"));
            }break;
            case "AML-S3": {
                AMLS = new ExcelReader().getRowData("TestData", "AML - saradnik", 3);
                new AssociateMoneyLaundry(driver).QNN_1_0Label(AMLS.get("1. Izvori prihoda klijenta (zaokružiti) su:"));
            }break;
        }
        new AssociateMoneyLaundry(driver).QNN_1_1Label(AMLS.get("2. Da li je klijent lice koje ima lošu reputaciju ili su poznate nezakonite aktivnosti klijenta iz prošlosti ili je klijent lice koje se sa takvim licem može dovesti u vezu?"));
        new AssociateMoneyLaundry(driver).QNN_1_2Label(AMLS.get("3. Da li klijent insistira na tajnosti transakcije ili je nemoguće utvrditi prirodu i poreklo sredstava za transakciju?"));
        new AssociateMoneyLaundry(driver).QNN_1_3Label(AMLS.get("4. Da li klijent odbija ili pravi problem prilikom identifikacije?"));
        new AssociateMoneyLaundry(driver).QNN_1_4Label(AMLS.get("5. Da li sumnjate da u vezi sa ovim klijentom ili njegovom transakcijom postoji rizik od pranja novca i finansiranja terorizma?"));
        new AssociateMoneyLaundry(driver).QNN_1_5Label(AMLS.get("6. Nije bilo moguće dobiti navedene informacije od klijenta"));
        new TopButtonView(driver).acceptMoneyLaundry();
    }

    @Then("Print documents")
    public void printDocuments() throws Exception {
        new TabView(driver).clickPrintoutsTab();
        new PrintoutsPage(driver).printDocuments(data.get("Štampa"));
    }

    @And("upload documents on Documentation tab")
    public void uploadDocumentsOnDocumentationTab() throws Exception{
        new TabView(driver).clickDocumentationTab();
        new TopButtonView(driver).clickFileUpload();
        JumpToFrame();
        new FileUpload(driver).clickFileInput("Polisa");
        new FileUpload(driver).clickFileInput("AML_Klijent");
        new FileUpload(driver).clickFileInput("AML_Saradnik");
        new FileUpload(driver).clickStart();
        new FileUpload(driver).UploadedDocuments();
    }

    @When("click on Tile upload button")
    public void clickOnTileUploadButton() throws Exception{
    }

    @And("choose documents for upload")
    public void chooseDocumentsForUpload() throws Exception{
    }

    @And("click on button load all")
    public void clickOnButtonLoadAll()throws Exception {
    }

    @Then("select document type")
    public void selectDocumentType()throws Exception {
    }

    @And("select Confidentiality")
    public void selectConfidentiality()throws Exception {
    }

    @Then("click on button Save")
    public void clickOnButtonSave() throws Exception{
    }

    @And("leave a iframe click on X button in right corner")
    public void leaveAIframeClickOnXButtonInRightCorner() throws Exception{
    }

    @And("click on button Certification of signature")
    public void clickOnButtonCertificationOfSignature()throws Exception {
        new TopButtonView(driver).clickCertificationOfSignature();
        Thread.sleep(5000);
    }
    @Then("check Warring message After Certification Of Signature")
    public void checkWarringMessageAfterCertificationOfSignature()throws Exception {
    }
    @And("check Info message After Certification Of Signature")
    public void checkInfoMessageAfterCertificationOfSignature() throws Exception{

        //Assert.assertEquals(new BasePage(driver).InfoMessage(),data.get("Poruka nakon potvrde potpisa"));
    }


    @Then("check Warring message on top of page")
    public void checkWarringMessageOnTopOfPage()throws Exception {
    }


    @And("choose indexation option")
    public void chooseIndexationOption() throws Exception {
        switch (data.get("Proizvod")) {

            case "Favorit":
            case "Joker": {
                if(data.get("Indeksacija").equals("true")){
                    new GeneralPage(driver).clickIndexing();
                    new GeneralPage(driver).setIndexValue("3");
                }
            }
            break;
            case "Spektar":
            case "Riziko":
            case "Riziko Mix": {

            }
        break;
        }

    }

    @And("input Vinculation if product is not Favorit or Joker")
    public void inputVinculationIfProductIsNotFavoritOrJoker() throws Exception {
        if(data.get("Vinkulacija").equals("true")){
        new TabView(driver).clickVinculationsTab();
        new VinculationPage(driver).clickAddVinculation();
        switch (data.get("Vinkulacija")) {
            case "VINK1": {
                VINK = new ExcelReader().getRowData("TestData", "Vinkulacija", 1);
                new VinculationPage(driver).setLoanNumber(VINK.get("Broj ugovora o kreditu"));
                new VinculationPage(driver).setVinculationsSum(VINK.get("Vinkulirana suma"));
                new VinculationPage(driver).selectCreditor(VINK.get("Poverilac"));

                new VinculationPage(driver).selectFirstBank(VINK.get("Prva vinkulaciona banka"));
            }
            break;
            case "VINK2": {
                VINK = new ExcelReader().getRowData("TestData", "Vinkulacija", 2);
                new VinculationPage(driver).setLoanNumber(VINK.get("Broj ugovora o kreditu"));
                new VinculationPage(driver).setVinculationsSum(VINK.get("Vinkulirana suma"));
                new VinculationPage(driver).selectCreditor(VINK.get("Poverilac"));
                new VinculationPage(driver).setFirstName(VINK.get("Ime"));
                new VinculationPage(driver).setSurname(VINK.get("Prezime"));
                new VinculationPage(driver).setJMBG(VINK.get("JMBG"));
            }
            break;
            case "VINK3": {
                VINK = new ExcelReader().getRowData("TestData", "Vinkulacija", 3);

                new VinculationPage(driver).setLoanNumber(VINK.get("Broj ugovora o kreditu"));
                new VinculationPage(driver).setVinculationsSum(VINK.get("Vinkulirana suma"));
                new VinculationPage(driver).selectCreditor(VINK.get("Poverilac"));
                new VinculationPage(driver).setLegalName(VINK.get("Naziv"));
                new VinculationPage(driver).setPIB(VINK.get("PIB"));
                new VinculationPage(driver).setMBR(VINK.get("MBR"));
            }
            break;
        }
        }
    }
}
