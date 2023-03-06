package cSore_Mapping.views;

import cSore_Mapping.pages.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TabView extends BasePage {
    public TabView(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy (id = "tab_General")
    WebElement GeneralTab;
    @FindBy (id = "tab_Persons")
    WebElement PersonsTab;
    @FindBy (id = "tab_Concerns")
    WebElement ConsernsTab;
    @FindBy (id = "tab_Conditions")
    WebElement ConditionsTab;
    @FindBy (id = "tab_Annulation")
    WebElement AnnulationTab;


    public void clickGeneralTab() throws Exception {
        clickWithScroll(GeneralTab);
    }
    public void clickPersonsTab() throws Exception {

        clickWithScroll(PersonsTab);
    }
    public void clickConcernsTab() throws Exception {
        clickWithScroll(ConsernsTab);
    }
    public void clickConditionsTab() throws Exception {
        clickWithScroll(ConditionsTab);
    }
    public void clickAnnulationTab() throws Exception {
        clickWithScroll(AnnulationTab);
    }




}
