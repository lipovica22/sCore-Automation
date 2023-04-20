package cSore_Mapping.Common.View;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class TabView extends BasePage {
    public TabView(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(id= "tab_General")
    WebElement generalTab;
    @FindBy(id= "tab_Persons")
    WebElement personTab;
    @FindBy(id= "tab_Concerns")
    WebElement concernsTab;
    @FindBy(id= "tab_Conditions")
    WebElement conditionsTab;
    @FindBy(id= "tab_Calculation")
    WebElement calculationTab;
    @FindBy(id= "tab_Clauses")
    WebElement clausesTab;
    @FindBy(id= "tab_Printouts")
    WebElement printoutsTab;
    @FindBy(id= "tab_SpecificationFormDocumentation")
    WebElement specificationFormDocumentationTab;
    @FindBy(id= "tab_Documentation")
    WebElement documentationTab;
    @FindBy(id= "tab_PassengerListCancellation")
    WebElement passengerListCancellationTab;
    @FindBy(id= "tab_Annulation")
    WebElement annulationTab;
    @FindBy(id= "tab_Underwriting")
    WebElement underwritingTab;
    @FindBy(id= "tab_Reclamation")
    WebElement reclamationTab;
    @FindBy(id= "tab_CancellationNonLife")
    WebElement cancellationTab;
    @FindBy(id= "tab_Statements")
    WebElement statementsTab;
    @FindBy(id= "tab_FinancialBalance")
    WebElement financialBalanceTab;
    @FindBy(id= "tab_Vinculations")
    WebElement vinculationsTab;

    @FindBy(id= "tab_MoneyLaundry")
    WebElement moneyLaundryTab;
    @FindBy(id= "tab_AssociateMoneyLaundry")
    WebElement associateMoneyLaundryTab;

    @FindBy(css = "div[class='sixteen columns padding_left_10 document_info'] div:nth-child(1) div:nth-child(5)")
    WebElement status;

    //-------------------- Methods --------------------
    public void clickGeneralTab() throws Exception {
        ClickWithScroll(generalTab, "Click general tab");
    }
    public void clickPersonsTab() throws Exception {

        ClickWithScroll(personTab, "Click person tab");
    }
    public void clickConcernsTab() throws Exception {
        ClickWithScroll(concernsTab, "Click concerns tab");
    }
    public void clickConditionsTab() throws Exception {
        ClickWithScroll(conditionsTab, "Click conditions tab");
    }
    public void clickAnnulationTab() throws Exception {
        ClickWithScroll(annulationTab, "Click annulation tab");
    }
    public void clickMoneyLaundryTab() throws Exception {
        ClickWithScroll(moneyLaundryTab, "Click MoneyLaundry tab");
    }
    public void clickAssociateMoneyLaundryTab() throws Exception {
        ClickWithScroll(associateMoneyLaundryTab, "Click AssociateMoneyLaundry tab");
    }
    public void assertStatus(SoftAssert softAssert, String valueExpected) throws Exception {
        AreEqual(status, "Message status", valueExpected, softAssert);
    }
    public void clickCalculationTab() throws Exception {
        ClickWithScroll(calculationTab, "Click Calculation tab");
    }
    public void clickClausesTab() throws Exception {
        ClickWithScroll(clausesTab, "Click Clauses tab");
    }
    public void clickPrintoutsTab() throws Exception {
        ClickWithScroll(printoutsTab, "Click Printouts tab");
    }
    public void clickDocumentationTab() throws Exception {
        ClickWithScroll(documentationTab, "Click Documentation tab");
    }
    public void clickUnderwritingTab() throws Exception {
        ClickWithScroll(underwritingTab, "Click Underwriting tab");
    }
    public void clickReclamationTab() throws Exception {
        ClickWithScroll(reclamationTab, "Click Reclamation tab");
    }
    public void clickCancellationTab() throws Exception {
        ClickWithScroll(cancellationTab, "Click Cancellation tab");
    }
    public void clickStatementsTab() throws Exception {
        ClickWithScroll(statementsTab, "Click Statements tab");
    }
    public void clickVinculationsTab() throws Exception {
        ClickWithScroll(vinculationsTab, "Click Vinculations tab");
    }
    public void clickFinancialBalanceTab() throws Exception {
        ClickWithScroll(financialBalanceTab, "Click FinancialBalance tab");
    }





    //-------------------- End Methods --------------------
}
