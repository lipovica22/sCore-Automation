package steps.Life;
import cSore_Mapping.Common.Pages.BasePage;
import cSore_Mapping.Common.Dialog.Iframe.ViewPersonL;
import cSore_Mapping.Common.Dialog.Iframe.ViewPersonNL;
import cSore_Mapping.Common.View.DocumentInfo;
import cSore_Mapping.Common.View.TopButtonView;
import cSore_Mapping.Life.Tab.AssociateMoneyLaundry;
import cSore_Mapping.Life.Tab.General;
import cSore_Mapping.Common.View.TabView;
import cSore_Mapping.Life.Tab.MoneyLaundry;
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
    Map<String, String> AML;
    Map<String, String> AMLS;
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
        driver.get("https://s-dev-iis.stech.loc/POS/Serbia/Products");
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
            Assert.assertEquals(new Login(driver).LoggedUser(), "scoreAgent");
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
        new Products(driver).selectLob(data.get("LOB"));
        Thread.sleep(2000);
    }

    @And("Choose product")
    public void chooseProduct() throws Exception {
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
            //Assert.assertEquals(driver.getCurrentUrl(), new General(driver).url(data.get("Proizvod"), data.get("Vrsta dokumenta")));
            /*if (!new General(driver).url(data.get("Proizvod"), data.get("Vrsta dokumenta")).equals(driver.getCurrentUrl())) {
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
        new General(driver).setTrajanje(data.get("Trajanje"));
        if (!data.get("Vrsta dokumenta").equals("Novi ugovor")) {
            new General(driver).inputClientInfo();
        }
        if (data.get("Proizvod").equals("Riziko kredit")){
            new General(driver).selectIzborDuzineTrajanja(data.get("Izbor dužine trajanja"));
        }
    }

    @And("set place")
    public void setPlace() throws Exception {
        //selectOptionAC(data.get("Mesto"), "11000 Beograd", new General(driver).getMesto());
        selectOptionAC(data.get("Mesto"), "11030 Beograd (Čukarica) - Beograd-Cukarica", new General(driver).getMesto());
    }

    @And("set payment dynamic")
    public void setPaymentDynamic() throws Exception {
        new cSore_Mapping.Common.Tab.General(driver).selectDinamika(data.get("Dinamika plaćanja"));
    }

    @And("set currency")
    public void setCurrency() throws Exception {
        new cSore_Mapping.Common.Tab.General(driver).selectValuta(data.get("Valuta"));
    }

    @And("set FXClause")
    public void setFXClause() throws Exception {
        new cSore_Mapping.Common.Tab.General(driver).selectValutnaKlauzula(data.get("Valutna klauzula"));
    }

    @And("set Payment Method and bank if method is Trajni nalog")
    public void setPaymentMethod() throws Exception {
        if (!data.get("Metod plaćanja").equals("Trajni nalog")) {
            new cSore_Mapping.Common.Tab.General(driver).selectMetodPlacanja(data.get("Metod plaćanja"));
        } else {
            new cSore_Mapping.Common.Tab.General(driver).selectMetodPlacanja(data.get("Metod plaćanja"));
            new cSore_Mapping.Common.Tab.General(driver).selectBanka(data.get("Banka"));
        }
    }
    @And("choose vinculation option")
    public void chooseVinculationOption() throws Exception {
        if (data.get("Vinkulacija").equals("false")) {
            new General(driver).uNClickVinculation();
        }
        if (data.get("Vinkulacija").equals("true")) {
            new General(driver).ClickVinculation();
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
        if (data.get("Ugovarač i platilac su isto lice").equals("true")) {
            new cSore_Mapping.Common.Tab.Person(driver).clickSamePerson();
        }
    }

    @Then("click on add button")
    public void clickOnAddButton() throws Exception{
        new cSore_Mapping.Common.Tab.Person(driver).clickAddPersonPolicyHolder();
        Thread.sleep(2000);
    }

    @And("on Iframe input Identification number")
    public void onIframeInputIdentificationNumber() throws Exception {
        JumpToFrame();
        new cSore_Mapping.Common.Dialog.Iframe.SearchPersonTA(driver).setInputIdentificationNumber(data.get("Ugovarač"));
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
            new cSore_Mapping.Life.Tab.Person(driver).clickPayerInsureeSamePerson();
        }
        if (data.get("Ugovarač i platilac su isto lice").equals("false")) {
            new cSore_Mapping.Life.Tab.Person(driver).clickAddPayer();
            JumpToFrame();
            new cSore_Mapping.Common.Dialog.Iframe.SearchPersonTA(driver).setInputIdentificationNumber(data.get("Platilac"));
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
            new cSore_Mapping.Life.Tab.Person(driver).clickHasLegalRepresentative();
        }
        if (data.get("Ugovarač/Osiguranik imaju zakonskog zastupnika").equals("Ne")) {
            new cSore_Mapping.Life.Tab.Person(driver).clickAddLegalRepresentative();
            JumpToFrame();
            new cSore_Mapping.Common.Dialog.Iframe.SearchPersonTA(driver).setInputIdentificationNumber(data.get("Zakonski zastupnik"));
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
        new cSore_Mapping.Life.Tab.Concerns(driver).selectCalculationDirection(data.get("Osnov za kalkulaciju"));
    }

    @And("input insured sum or premium")
    public void inputInsuredSumOrPremium() throws Exception {
        new cSore_Mapping.Life.Tab.Concerns(driver).inputInsuredSumOrPremium(data.get("Iznos"));

    }
    @Then("input height if product is not Favorit")
    public void inputHeightIfProductIsntFavorit() throws Exception {
        if (!data.get("Proizvod").equals("Favorit")) {
            new cSore_Mapping.Life.Tab.Concerns(driver).inputHeight(data.get("Visina"));
        }
    }

    @And("input weight if product is not Favorit")
    public void inputWeightIfProductIsNotFavorit()throws Exception {
        if (!data.get("Proizvod").equals("Favorit")) {
            new cSore_Mapping.Life.Tab.Concerns(driver).inputWeight(data.get("Težina"));
        }
    }

    @And("input interest if product is Riziko kredit")
    public void inputInterestIfProductIsRisikoKredit() throws Exception {
        if (data.get("Proizvod").equals("Riziko kredit")) {
            new cSore_Mapping.Life.Tab.Concerns(driver).inputInterest(data.get("Kamatna stopa"));
        }
    }

    //@And("check insured risks and sum or premium")
    /*public void checkInsuredRisksAndSumOrPremium(String proizvod) throws Exception {
        switch (proizvod=data.get("Proizvod")) {
            case "Doživotni riziko": {
                if(data.get("Smrt usled nezgode").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickSmrtUsledNezgode(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputSmrtUsledNezgodeValue(data.get("Smrt usled nezgode - Suma"));
                }
                if(data.get("Trajni invaliditet").equals("true")) {
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickTrajniInvaliditet(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputTrajniInvaliditetValue(data.get("Trajni invaliditet - Suma"));
                }
                if(data.get("Lom kostiju").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickLomKostiju(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputLomKostijuValue(data.get("Lom kostiju - Suma"));
                }
                if(data.get("Dnevna naknada -nezgoda").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickDnevnaNaknadaNezgoda(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputDnevnaNaknadaNezgodaValue(data.get("Dnevna naknada -nezgoda - Suma"));
                }
                if(data.get("Hirurške intervencije - nezgoda").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickHirurskeIntervencijeNezgode(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputHirurskeIntervencijeNezgodeValue(data.get("Hirurške intervencije - nezgoda - Suma"));
                }
            }
            break;
            case "Favorit": {
                new cSore_Mapping.Life.Tab.Concerns(driver).inputTrajniInvaliditetValue(data.get("Trajni invaliditet - Suma"));
                if(data.get("Lom kostiju").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickLomKostiju(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputLomKostijuValue(data.get("Lom kostiju - Suma"));
                }
                if(data.get("Dnevna naknada -nezgoda").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickDnevnaNaknadaNezgoda(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputDnevnaNaknadaNezgodaValue(data.get("Dnevna naknada -nezgoda - Suma"));
                }
                if(data.get("Hirurške intervencije - nezgoda").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickHirurskeIntervencijeNezgode(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputHirurskeIntervencijeNezgodeValue(data.get("Hirurške intervencije - nezgoda - Suma"));
                }

            }
            break;
            case "Riziko kredit": {

            }
            break;
            case "Joker": {
                if(data.get("Teže bolesti").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickTezeBolesti(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputTezeBolestiValue(data.get("Teže bolesti - Suma"));
                }
                if(data.get("Smrt usled nezgode").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickSmrtUsledNezgode(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputSmrtUsledNezgodeValue(data.get("Smrt usled nezgode - Suma"));
                }
                new cSore_Mapping.Life.Tab.Concerns(driver).inputTrajniInvaliditetValue(data.get("Trajni invaliditet - Suma"));
                if(data.get("Lom kostiju").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickLomKostiju(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputLomKostijuValue(data.get("Lom kostiju - Suma"));
                }
                if(data.get("Dnevna naknada -nezgoda").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickDnevnaNaknadaNezgoda(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputDnevnaNaknadaNezgodaValue(data.get("Dnevna naknada -nezgoda - Suma"));
                }
                if(data.get("Dnevna naknada  - bolest").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickDnevnaNaknadaBolesti(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputDnevnaNaknadaBolestiValue(data.get("Dnevna naknada  - bolest - Suma"));
                }
                if(data.get("Hirurške intervencije - nezgoda").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickHirurskeIntervencijeNezgode(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputHirurskeIntervencijeNezgodeValue(data.get("Hirurške intervencije - nezgoda - Suma"));
                }
                if(data.get("Hirurške intervencije - bolest").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickHirurskeIntervencijeBolesti(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputHirurskeIntervencijeBolestiValue(data.get("Hirurške intervencije - bolest - Suma"));
                }
                if(data.get("Bolovanje").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickBolovanje42(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputBolovanje42Value(data.get("Bolovanje - Suma"));
                }

            }
            break;
            case "Spektar":
            case "Riziko": {
                if(data.get("Teže bolesti").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickTezeBolesti(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputTezeBolestiValue(data.get("Teže bolesti - Suma"));
                }
                if(data.get("Smrt usled nezgode").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickSmrtUsledNezgode(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputSmrtUsledNezgodeValue(data.get("Smrt usled nezgode - Suma"));
                }
                if(data.get("Trajni invaliditet").equals("true")) {
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickTrajniInvaliditet(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputTrajniInvaliditetValue(data.get("Trajni invaliditet - Suma"));
                }
                if(data.get("Lom kostiju").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickLomKostiju(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputLomKostijuValue(data.get("Lom kostiju - Suma"));
                }
                if(data.get("Dnevna naknada -nezgoda").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickDnevnaNaknadaNezgoda(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputDnevnaNaknadaNezgodaValue(data.get("Dnevna naknada -nezgoda - Suma"));
                }
                if(data.get("Dnevna naknada  - bolest").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickDnevnaNaknadaBolesti(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputDnevnaNaknadaBolestiValue(data.get("Dnevna naknada  - bolest - Suma"));
                }
                if(data.get("Hirurške intervencije - nezgoda").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickHirurskeIntervencijeNezgode(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputHirurskeIntervencijeNezgodeValue(data.get("Hirurške intervencije - nezgoda - Suma"));
                }
                if(data.get("Hirurške intervencije - bolest").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickHirurskeIntervencijeBolesti(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputHirurskeIntervencijeBolestiValue(data.get("Hirurške intervencije - bolest - Suma"));
                }
                if(data.get("Bolovanje").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickBolovanje42(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputBolovanje42Value(data.get("Bolovanje - Suma"));
                }

            }
            break;
            case "Riziko Mix": {
                if(data.get("Smrt usled nezgode").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickSmrtUsledNezgode(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputSmrtUsledNezgodeValue(data.get("Smrt usled nezgode - Suma"));
                }
                if(data.get("Trajni invaliditet").equals("true")) {
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickTrajniInvaliditet(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputTrajniInvaliditetValue(data.get("Trajni invaliditet - Suma"));
                }
                if(data.get("Lom kostiju").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickLomKostiju(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputLomKostijuValue(data.get("Lom kostiju - Suma"));
                }
                if(data.get("Dnevna naknada -nezgoda").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickDnevnaNaknadaNezgoda(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputDnevnaNaknadaNezgodaValue(data.get("Dnevna naknada -nezgoda - Suma"));
                }
                if(data.get("Dnevna naknada  - bolest").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickDnevnaNaknadaBolesti(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputDnevnaNaknadaBolestiValue(data.get("Dnevna naknada  - bolest - Suma"));
                }
                if(data.get("Hirurške intervencije - nezgoda").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickHirurskeIntervencijeNezgode(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputHirurskeIntervencijeNezgodeValue(data.get("Hirurške intervencije - nezgoda - Suma"));
                }
                if(data.get("Hirurške intervencije - bolest").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickHirurskeIntervencijeBolesti(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputHirurskeIntervencijeBolestiValue(data.get("Hirurške intervencije - bolest - Suma"));
                }
                if(data.get("Bolovanje").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickBolovanje42(proizvod);
                    new cSore_Mapping.Life.Tab.Concerns(driver).inputBolovanje42Value(data.get("Bolovanje - Suma"));
                }
            }
            break;
            default:
                break;
        }
    }*/
    @And("check insured risks and sum or premium")
    public void checkInsuredRisksAndSumOrPremium() throws Exception {
        switch (data.get("Proizvod")) {
            case "Doživotni riziko": {
                if(data.get("Smrt usled nezgode").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickSmrtUsledNezgode();
                    //new cSore_Mapping.Life.Tab.Concerns(driver).inputSmrtUsledNezgodeValue(data.get("Smrt usled nezgode - Suma"));
                }
                if(data.get("Trajni invaliditet").equals("true")) {
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickTrajniInvaliditet();
                    //new cSore_Mapping.Life.Tab.Concerns(driver).inputTrajniInvaliditetValue(data.get("Trajni invaliditet - Suma"));
                }
                if(data.get("Lom kostiju").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickLomKostiju();
                    //new cSore_Mapping.Life.Tab.Concerns(driver).inputLomKostijuValue(data.get("Lom kostiju - Suma"));
                }
                if(data.get("Dnevna naknada -nezgoda").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickDnevnaNaknadaNezgoda();
                    //new cSore_Mapping.Life.Tab.Concerns(driver).inputDnevnaNaknadaNezgodaValue(data.get("Dnevna naknada -nezgoda - Suma"));
                }
                if(data.get("Hirurške intervencije - nezgoda").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickHirurskeIntervencijeNezgode();
                    //new cSore_Mapping.Life.Tab.Concerns(driver).inputHirurskeIntervencijeNezgodeValue(data.get("Hirurške intervencije - nezgoda - Suma"));
                }
            }
            break;
            case "Favorit": {
                //new cSore_Mapping.Life.Tab.Concerns(driver).inputTrajniInvaliditetValue(data.get("Trajni invaliditet - Suma"));
                if(data.get("Lom kostiju").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickLomKostiju();
                  //  new cSore_Mapping.Life.Tab.Concerns(driver).inputLomKostijuValue(data.get("Lom kostiju - Suma"));
                }
                if(data.get("Dnevna naknada -nezgoda").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickDnevnaNaknadaNezgoda();
                  //  new cSore_Mapping.Life.Tab.Concerns(driver).inputDnevnaNaknadaNezgodaValue(data.get("Dnevna naknada -nezgoda - Suma"));
                }
                if(data.get("Hirurške intervencije - nezgoda").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickHirurskeIntervencijeNezgode();
                  //  new cSore_Mapping.Life.Tab.Concerns(driver).inputHirurskeIntervencijeNezgodeValue(data.get("Hirurške intervencije - nezgoda - Suma"));
                }

            }
            break;
            case "Joker": {
                if(data.get("Teže bolesti").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickTezeBolesti();
                   // new cSore_Mapping.Life.Tab.Concerns(driver).inputTezeBolestiValue(data.get("Teže bolesti - Suma"));
                }
                if(data.get("Smrt usled nezgode").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickSmrtUsledNezgode();
                  //  new cSore_Mapping.Life.Tab.Concerns(driver).inputSmrtUsledNezgodeValue(data.get("Smrt usled nezgode - Suma"));
                }
                //new cSore_Mapping.Life.Tab.Concerns(driver).inputTrajniInvaliditetValue(data.get("Trajni invaliditet - Suma"));
                if(data.get("Lom kostiju").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickLomKostiju();
                 //   new cSore_Mapping.Life.Tab.Concerns(driver).inputLomKostijuValue(data.get("Lom kostiju - Suma"));
                }
                if(data.get("Dnevna naknada -nezgoda").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickDnevnaNaknadaNezgoda();
                  //  new cSore_Mapping.Life.Tab.Concerns(driver).inputDnevnaNaknadaNezgodaValue(data.get("Dnevna naknada -nezgoda - Suma"));
                }
                if(data.get("Dnevna naknada  - bolest").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickDnevnaNaknadaBolesti();
                 //   new cSore_Mapping.Life.Tab.Concerns(driver).inputDnevnaNaknadaBolestiValue(data.get("Dnevna naknada  - bolest - Suma"));
                }
                if(data.get("Hirurške intervencije - nezgoda").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickHirurskeIntervencijeNezgode();
                 //   new cSore_Mapping.Life.Tab.Concerns(driver).inputHirurskeIntervencijeNezgodeValue(data.get("Hirurške intervencije - nezgoda - Suma"));
                }
                if(data.get("Hirurške intervencije - bolest").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickHirurskeIntervencijeBolesti();
                 //   new cSore_Mapping.Life.Tab.Concerns(driver).inputHirurskeIntervencijeBolestiValue(data.get("Hirurške intervencije - bolest - Suma"));
                }
                if(data.get("Bolovanje").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickBolovanje42();
                //    new cSore_Mapping.Life.Tab.Concerns(driver).inputBolovanje42Value(data.get("Bolovanje - Suma"));
                }

            }
            break;
            case "Spektar":
            case "Riziko": {
                if(data.get("Teže bolesti").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickTezeBolesti();
                 //   new cSore_Mapping.Life.Tab.Concerns(driver).inputTezeBolestiValue(data.get("Teže bolesti - Suma"));
                }
                if(data.get("Smrt usled nezgode").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickSmrtUsledNezgode();
                 //   new cSore_Mapping.Life.Tab.Concerns(driver).inputSmrtUsledNezgodeValue(data.get("Smrt usled nezgode - Suma"));
                }
                if(data.get("Trajni invaliditet").equals("true")) {
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickTrajniInvaliditet();
                 //   new cSore_Mapping.Life.Tab.Concerns(driver).inputTrajniInvaliditetValue(data.get("Trajni invaliditet - Suma"));
                }
                if(data.get("Lom kostiju").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickLomKostiju();
                 //   new cSore_Mapping.Life.Tab.Concerns(driver).inputLomKostijuValue(data.get("Lom kostiju - Suma"));
                }
                if(data.get("Dnevna naknada -nezgoda").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickDnevnaNaknadaNezgoda();
                  //  new cSore_Mapping.Life.Tab.Concerns(driver).inputDnevnaNaknadaNezgodaValue(data.get("Dnevna naknada -nezgoda - Suma"));
                }
                if(data.get("Dnevna naknada  - bolest").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickDnevnaNaknadaBolesti();
                  //  new cSore_Mapping.Life.Tab.Concerns(driver).inputDnevnaNaknadaBolestiValue(data.get("Dnevna naknada  - bolest - Suma"));
                }
                if(data.get("Hirurške intervencije - nezgoda").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickHirurskeIntervencijeNezgode();
                   // new cSore_Mapping.Life.Tab.Concerns(driver).inputHirurskeIntervencijeNezgodeValue(data.get("Hirurške intervencije - nezgoda - Suma"));
                }
                if(data.get("Hirurške intervencije - bolest").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickHirurskeIntervencijeBolesti();
                   // new cSore_Mapping.Life.Tab.Concerns(driver).inputHirurskeIntervencijeBolestiValue(data.get("Hirurške intervencije - bolest - Suma"));
                }
                if(data.get("Bolovanje").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickBolovanje42();
                   // new cSore_Mapping.Life.Tab.Concerns(driver).inputBolovanje42Value(data.get("Bolovanje - Suma"));
                }

            }
            break;
            case "Riziko Mix": {
                if(data.get("Smrt usled nezgode").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickSmrtUsledNezgode();
                  //  new cSore_Mapping.Life.Tab.Concerns(driver).inputSmrtUsledNezgodeValue(data.get("Smrt usled nezgode - Suma"));
                }
                if(data.get("Trajni invaliditet").equals("true")) {
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickTrajniInvaliditet();
                  //  new cSore_Mapping.Life.Tab.Concerns(driver).inputTrajniInvaliditetValue(data.get("Trajni invaliditet - Suma"));
                }
                if(data.get("Lom kostiju").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickLomKostiju();
                  //  new cSore_Mapping.Life.Tab.Concerns(driver).inputLomKostijuValue(data.get("Lom kostiju - Suma"));
                }
                if(data.get("Dnevna naknada -nezgoda").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickDnevnaNaknadaNezgoda();
                  //  new cSore_Mapping.Life.Tab.Concerns(driver).inputDnevnaNaknadaNezgodaValue(data.get("Dnevna naknada -nezgoda - Suma"));
                }
                if(data.get("Dnevna naknada  - bolest").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickDnevnaNaknadaBolesti();
                  //  new cSore_Mapping.Life.Tab.Concerns(driver).inputDnevnaNaknadaBolestiValue(data.get("Dnevna naknada  - bolest - Suma"));
                }
                if(data.get("Hirurške intervencije - nezgoda").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickHirurskeIntervencijeNezgode();
                  //  new cSore_Mapping.Life.Tab.Concerns(driver).inputHirurskeIntervencijeNezgodeValue(data.get("Hirurške intervencije - nezgoda - Suma"));
                }
                if(data.get("Hirurške intervencije - bolest").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickHirurskeIntervencijeBolesti();
                   // new cSore_Mapping.Life.Tab.Concerns(driver).inputHirurskeIntervencijeBolestiValue(data.get("Hirurške intervencije - bolest - Suma"));
                }
                if(data.get("Bolovanje").equals("true")){
                    new cSore_Mapping.Life.Tab.Concerns(driver).clickBolovanje42();
                   // new cSore_Mapping.Life.Tab.Concerns(driver).inputBolovanje42Value(data.get("Bolovanje - Suma"));
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
                new MoneyLaundry(driver).QNN_1_0Label(AML.get("1. Namena/svrha ugovaranja osiguranja?"));
                new MoneyLaundry(driver).QNN_1_1Label(AML.get("2. Zanimanje / registrovana delatnost"));
                new MoneyLaundry(driver).QNN_1_2Label(AML.get("3. Izvor sredstava plaćanja"));
                //new MoneyLaundry(driver).QNN_1_3Label(AML.get("4. Državljanstvo / zemlja registracije Ugovarača osiguranja?"));
                //new MoneyLaundry(driver).QNN_1_3_1Label(AML.get("4.1."));
                //new MoneyLaundry(driver).QNN_1_4Label(AML.get("5. Ugovarač je poreski obveznik koje države?"));
                //new MoneyLaundry(driver).QNN_1_4_1Label(AML.get("5.1."));
                new MoneyLaundry(driver).QNN_1_8Label(AML.get("9. Ima li član vaše porodice polisu kod UNIQA životnog osiguranja?"));
            }
            break;
            case "2": {
                AML = new ExcelReader().getRowData("TestData", "AML", 2);
                new MoneyLaundry(driver).QNN_1_0Label(AML.get("1. Namena/svrha ugovaranja osiguranja?"));
                new MoneyLaundry(driver).QNN_1_1Label(AML.get("2. Zanimanje / registrovana delatnost"));
                new MoneyLaundry(driver).QNN_1_2Label(AML.get("3. Izvor sredstava plaćanja"));
                new MoneyLaundry(driver).QNN_1_8Label(AML.get("9. Ima li član vaše porodice polisu kod UNIQA životnog osiguranja?"));
            }
            break;
            case "3": {
                AML = new ExcelReader().getRowData("TestData", "AML", 3);
                new MoneyLaundry(driver).QNN_1_0Label(AML.get("1. Namena/svrha ugovaranja osiguranja?"));
                new MoneyLaundry(driver).QNN_1_1Label(AML.get("2. Zanimanje / registrovana delatnost"));
                new MoneyLaundry(driver).QNN_1_2Label(AML.get("3. Izvor sredstava plaćanja"));
                new MoneyLaundry(driver).QNN_1_8Label(AML.get("9. Ima li član vaše porodice polisu kod UNIQA životnog osiguranja?"));
            }
            break;
        }new TopButtonView(driver).acceptMoneyLaundry();
    }

    @And("fill Associate money laundry questionnaire")
    public void fillAssociateMoneyLaundryQuestionnaire() throws Exception {
        new TabView(driver).clickAssociateMoneyLaundryTab();
        switch (data.get("AML - saradnik")) {
            case "AML-S1": {
                AMLS = new ExcelReader().getRowData("TestData", "AML - saradnik", 1);
                new AssociateMoneyLaundry(driver).QNN_1_0Label(AMLS.get("1. Izvori prihoda klijenta (zaokružiti) su:"));
                new AssociateMoneyLaundry(driver).QNN_1_1Label(AMLS.get("2. Da li je klijent lice koje ima lošu reputaciju ili su poznate nezakonite aktivnosti klijenta iz prošlosti ili je klijent lice koje se sa takvim licem može dovesti u vezu?"));
                new AssociateMoneyLaundry(driver).QNN_1_2Label(AMLS.get("3. Da li klijent insistira na tajnosti transakcije ili je nemoguće utvrditi prirodu i poreklo sredstava za transakciju?"));
                new AssociateMoneyLaundry(driver).QNN_1_3Label(AMLS.get("4. Da li klijent odbija ili pravi problem prilikom identifikacije?"));
                new AssociateMoneyLaundry(driver).QNN_1_4Label(AMLS.get("5. Da li sumnjate da u vezi sa ovim klijentom ili njegovom transakcijom postoji rizik od pranja novca i finansiranja terorizma?"));
                new AssociateMoneyLaundry(driver).QNN_1_5Label(AMLS.get("6. Nije bilo moguće dobiti navedene informacije od klijenta"));
            }break;
        }new TopButtonView(driver).acceptMoneyLaundry();
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


    @Then("check Warring message on top of page")
    public void checkWarringMessageOnTopOfPage() {
    }


}
