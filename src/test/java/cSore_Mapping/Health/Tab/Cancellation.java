package cSore_Mapping.Health.Tab;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cancellation extends BasePage {
    public Cancellation(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/legend")
    WebElement PassengersListLabel;
    @FindBy(xpath= "//*[@id='Kol1']/div/div[2]/div/div/a")
    WebElement ListDateLabel;
    @FindBy(id= "basic-grid_1")
    WebElement PassengersGrid;

    public void PassengersListLabel() throws Exception {

    }
    public void ListDateLabel() throws Exception {

    }
    public void PassengersGrid() throws Exception {

    }


}
