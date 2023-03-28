package cSore_Mapping.Life.Tab;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinancialBalance extends BasePage {


    public FinancialBalance(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath= "//*[@id='Kol1']/div/div[1]/h4")
    WebElement PolicyHolderLabel;
    @FindBy(id= "basic-grid_1")
    WebElement PolicyHolderGrid;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/div/label")
    WebElement DateToLabel;
    @FindBy(id= "Kol3")
    WebElement DateTo;

    @FindBy(css= "label[for='Kol4']")
    WebElement PrikaziSumarnoLabel;
    @FindBy(id= "Kol4")
    WebElement PrikaziSumarno;

    @FindBy(xpath= "//*[@id='Kol2']/div/div[1]/h4")
    WebElement BalanceGridLabel;
    @FindBy(id= "basic-grid_2")
    WebElement BalanceGrid;


    public void PolicyHolderLabel() throws Exception {}
    public void PolicyHolderGrid() throws Exception {}

    public void DateToLabel() throws Exception {}
    public void DateTo() throws Exception {}

    public void PrikaziSumarnoLabel() throws Exception {}
    public void PrikaziSumarno() throws Exception {}

    public void BalanceGridLabel() throws Exception {}
    public void BalanceGrid() throws Exception {}

}

