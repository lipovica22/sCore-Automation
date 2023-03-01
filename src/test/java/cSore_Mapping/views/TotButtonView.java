package cSore_Mapping.views;

import cSore_Mapping.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TotButtonView extends BasePage {

    public TotButtonView(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }







}
