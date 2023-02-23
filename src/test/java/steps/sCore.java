package steps;

import cSore_Mapping.tabs.General;
import excel.ExcelReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.Reporter;
import cSore_Mapping.pages.LifeProductSelection;
import cSore_Mapping.pages.Login;
import cSore_Mapping.pages.Products;
import tests.BaseTest;

import java.io.IOException;
import java.util.Map;

public class sCore extends BaseTest {
    // naredne dve linije služe da iz xml file uzmemo parametre za cucumber
    String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
    String quit = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("quit");
    Map<String,String> data;

    @Before
    public void setup() throws Exception{
        initialization(browser);
    }

    @After
    public void tearDown () throws IOException {
        takeScreenshot("slika" + System.currentTimeMillis());
        if (quit.equalsIgnoreCase("Yes")) {
            quit();
        }
    }

    @Given("login on app RS Test {string} {string} {string}")
    public void loginOnAppBATest(String file, String sheet, String row)  throws Exception {
        driver.get("https://t-score.uniqa.rs/POS/Serbia/NoAD");
        data = new ExcelReader().getRowData(file,sheet,Integer.parseInt(row));
    }

    @When("enter username")
    public void enterUsername() throws Exception{
        new Login(driver).setUsername(data.get("Username"));
    }

    @And("enter password")
    public void enterPassword() throws Exception{
        new Login(driver).setPassword(data.get("Password"));
    }

    @And("click on Submit button")
    public void clickOnSubmitButton() throws Exception{
        new Login(driver).clickSubmit();
    }

    @Then("Logged in")
    public void loggedIn() {

    }

    @And("page is Products")
    public void pageIsProducts() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://t-score.uniqa.rs/POS/Serbia/Products");
    }


    @Then("Choose LOB")
    public void chooseLOB() throws Exception {
        new Products(driver).selectLob(data.get("LOB"));
        Thread.sleep(2000);
    }

    @And("Choose product")
    public void chooseProduct() throws Exception{
        new LifeProductSelection(driver).selectProizvod(data.get("Proizvod"));
    }

    @And("Choose NewContract")
    public void ChooseNewContract() throws Exception{
        new LifeProductSelection(driver).selectNoviUgovor();
    }

    @And("click on product icon")
    public void clickOnProductIcon() throws Exception{
        new LifeProductSelection(driver).clickProductIcon(data.get("Proizvod"));
    }

    @Then("opens a General tab")
    public void opensAGeneralTab() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://t-score.uniqa.rs/POS/Serbia/Life/FavoritPremium/NewContract/New/General");
    }

    @Then("input duration of insurance")
    public void inputDurationOfInsurance() throws Exception{
        new General(driver).setTrajanje(data.get("Trajanje"));

    }

    @And("set place")
    public void setPlace() throws Exception{
        new General(driver).setMesto(data.get("Mesto"));
    }

    @And("set payment dynamic")
    public void setPaymentDynamic() throws Exception{
        new General(driver).selectDinamika(data.get("Dinamika plaćanja"));
    }

    @And("set currency")
    public void setCurrency() throws Exception{
        new General(driver).selectValuta(data.get("Valuta"));
    }

    @And("set FXClause")
    public void setFXClause() throws Exception{
        new General(driver).selectValutnaKlauzula(data.get("Valutna klauzula"));
    }

    @And("set Payment Method")
    public void setPaymentMethod()throws Exception{
        new General(driver).selectMetodPlacanja(data.get("Metod plaćanja"));
    }

    @And("click on Tab Person")
    public void clickOnTabPerson()throws Exception {

    }

    @Then("we get info message and opens a Person tab")
    public void weGetInfoMessageAndOpensAPersonTab() {
    }
}
