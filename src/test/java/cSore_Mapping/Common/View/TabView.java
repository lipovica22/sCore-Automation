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
    WebElement GeneralTab;
    @FindBy(id= "tab_Persons")
    WebElement PersonTab;
    @FindBy(id= "tab_Concerns")
    WebElement ConcernsTab;
    @FindBy(id= "tab_Conditions")
    WebElement ConditionsTab;
    @FindBy(id= "tab_Calculation")
    WebElement CalculationTab;
    @FindBy(id= "tab_Clauses")
    WebElement ClausesTab;
    @FindBy(id= "tab_Printouts")
    WebElement PrintoutsTab;
    @FindBy(id= "tab_SpecificationFormDocumentation")
    WebElement SpecificationFormDocumentationTab;
    @FindBy(id= "tab_Documentation")
    WebElement DocumentationTab;
    @FindBy(id= "tab_PassengerListCancellation")
    WebElement PassengerListCancellationTab;
    @FindBy(id= "tab_Annulation")
    WebElement AnnulationTab;
    @FindBy(id= "tab_Underwriting")
    WebElement UnderwritingTab;
    @FindBy(id= "tab_Reclamation")
    WebElement ReclamationTab;
    @FindBy(id= "tab_CancellationNonLife")
    WebElement CancellationTab;
    @FindBy(id= "tab_Statements")
    WebElement StatementsTab;
    @FindBy(id= "tab_FinancialBalance")
    WebElement FinancialBalanceTab;



    public void clickGeneralTab() throws Exception {
        clickWithScroll(GeneralTab);
    }
    public void clickPersonsTab() throws Exception {

        clickWithScroll(PersonTab);
    }
    public void clickConcernsTab() throws Exception {
        clickWithScroll(ConcernsTab);
    }
    public void clickConditionsTab() throws Exception {
        clickWithScroll(ConditionsTab);
    }
    public void clickAnnulationTab() throws Exception {
        clickWithScroll(AnnulationTab);
    }
    public void clickPersonTab() throws Exception {

    }

    public void clickCalculationTab() throws Exception {

    }
    public void clickClausesTab() throws Exception {

    }
    public void clickPrintoutsTab() throws Exception {

    }
    public void clickSpecificationFormDocumentationTab() throws Exception {

    }
    public void clickDocumentationTab() throws Exception {

    }
    public void clickPassengerListCancellationTab() throws Exception {

    }
    public void clickUnderwritingTab() throws Exception {

    }
    public void clickReclamationTab() throws Exception {

    }
    public void clickCancellationTab() throws Exception {

    }
    public void clickStatementsTab() throws Exception {

    }
    public void clickFinancialBalanceTab() throws Exception {

    }



}
