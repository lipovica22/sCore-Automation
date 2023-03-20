package cSore_Mapping.Common.View;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TotButtonView extends BasePage {

    public TotButtonView(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }







}
