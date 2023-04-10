package cSore_Mapping.Life.Tab;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrintoutsPage extends BasePage {


    public PrintoutsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath= "//*[@id='Kol1']/div/div[1]/h4")
    WebElement PrintoutsLabel;
    @FindBy(id= "basic-grid_1")   WebElement PrintoutsGrid;

    public void PrintoutsLabel() throws Exception {}
    public void PrintoutsGrid() throws Exception {}


}

