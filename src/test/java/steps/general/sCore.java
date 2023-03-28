package steps.general;

import cSore_Mapping.Common.Pages.BasePage;
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
import cSore_Mapping.Life.LifeProductSelection;
import cSore_Mapping.Common.Pages.Login;
import cSore_Mapping.Common.Pages.Products;
import tests.BaseTest;


import java.io.IOException;
import java.util.Map;

public class sCore extends BaseTest {
    // naredne dve linije služe da iz xml file uzmemo parametre za cucumber
    String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
    String quit = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("quit");
    Map<String, String> data;
    String path = "src/results/screenshots/";

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

    @And("Choose NewContract")
    public void ChooseNewContract() throws Exception {

        new LifeProductSelection(driver).selectNoviUgovor();
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

    @Then("tab is PersonConcerns")
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

    @And("Choose Product type")
    public void chooseProductType() throws InterruptedException {
        new LifeProductSelection(driver).selectProductType(data.get("Vrsta dokumenta"));
    }

    @Step("Assertion Error: {0}")
    public void reportAssertionError(AssertionError e) {
        throw e;
    }


}
