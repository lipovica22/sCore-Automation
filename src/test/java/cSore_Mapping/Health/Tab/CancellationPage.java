package cSore_Mapping.Health.Tab;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancellationPage extends BasePage {
    public CancellationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/legend")
    WebElement passengersListLabel;
    @FindBy(xpath= "//*[@id='Kol1']/div/div[2]/div/div/a")
    WebElement listDateLabel;
    @FindBy(id= "basic-grid_1")
    WebElement passengersGrid;

}
