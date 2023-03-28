package cSore_Mapping.Common.View;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    //-------------------- End Methods --------------------
}
