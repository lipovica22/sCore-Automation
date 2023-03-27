package cSore_Mapping.Common.Menu;

import cSore_Mapping.Common.Pages.BasePage;
import io.cucumber.java.an.E;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftMenu extends BasePage {
    public LeftMenu(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(className= "ribbon_menu_area")
    WebElement LeftMenuButton;
    @FindBy(id= "mCSB_1_container")
    WebElement LeftMenuControls;

    public void clickLeftMenuButton(String typeDocument) throws Exception {
        Click(LeftMenuButton, "Click on left menu");
        ClickMenu(LeftMenuButton, "Clicked on new document", "Novi dokument");
        ClickMenu(LeftMenuButton, "Clicked on type document", typeDocument);
        //LeftMenuButton.click();
    }
    public void clickLeftMenuControls(String documentType) throws Exception {

    }



}

