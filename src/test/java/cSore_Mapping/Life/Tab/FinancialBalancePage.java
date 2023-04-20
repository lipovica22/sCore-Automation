package cSore_Mapping.Life.Tab;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinancialBalancePage extends BasePage {
    public FinancialBalancePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath= "//*[@id='Kol1']/div/div[1]/h4")
    WebElement policyHolderLabel;
    @FindBy(id= "basic-grid_1")
    WebElement policyHolderGrid;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/div/label")
    WebElement dateToLabel;
    @FindBy(id= "Kol3")
    WebElement dateTo;
    @FindBy(css= "label[for='Kol4']")
    WebElement prikaziSumarnoLabel;
    @FindBy(id= "Kol4")
    WebElement prikaziSumarno;
    @FindBy(xpath= "//*[@id='Kol2']/div/div[1]/h4")
    WebElement balanceGridLabel;
    @FindBy(id= "basic-grid_2")
    WebElement balanceGrid;

    //-------------------- Methods --------------------
    public void PolicyHolderLabel() throws Exception {}
    public void PolicyHolderGrid() throws Exception {}

    public void DateToLabel() throws Exception {}
    public void DateTo() throws Exception {}

    public void PrikaziSumarnoLabel() throws Exception {}
    public void PrikaziSumarno() throws Exception {}

    public void BalanceGridLabel() throws Exception {}
    public void BalanceGrid() throws Exception {}

    //-------------------- End Methods --------------------
}

