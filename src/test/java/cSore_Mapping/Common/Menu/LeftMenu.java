package cSore_Mapping.Common.Menu;

import cSore_Mapping.Common.Pages.BasePage;
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
    WebElement leftMenuButton;
    @FindBy(id= "mCSB_1_container")
    WebElement leftMenuControls;

    //-------------------- Methods ------------------------
    public void clickLeftMenuButton(String typeDocument) throws Exception {
        Click(leftMenuButton, "Click on left menu");
        ClickMenu(leftMenuButton, "Clicked on new document", "Novi dokument");
        ClickMenu(leftMenuButton, "Clicked on type document", typeDocument);
    }
    //-------------------- End Methods --------------------
}

