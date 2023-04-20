package cSore_Mapping.Common.Tab;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CalculationPage extends BasePage {


    public CalculationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }




}

