package cSore_Mapping.Health.Tab;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AnnulationNonLife extends BasePage {
    public AnnulationNonLife(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
}
