package cSore_Mapping.Health.Tab;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AnnulationNonLifePage extends BasePage {
    public AnnulationNonLifePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
}
