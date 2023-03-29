package cSore_Mapping.Life.Tab;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Statements extends BasePage {


    public Statements(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath= "//*[@id='Kol1']/div/div[1]/h4")
    WebElement StatementsLabel;
    @FindBy(id= "basic-grid_1")
    WebElement Statements;

    public void StatementsLabel() throws Exception {}
    public void Statements() throws Exception {}


}

