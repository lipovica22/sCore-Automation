package cSore_Mapping.Health.Tab;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpecificationFormDocumentation extends BasePage {
    public SpecificationFormDocumentation(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath= "//*[@id='Kol1']/div/div[1]/h4")
    WebElement documentationLabel;
    @FindBy(id= "basic-grid_1")
    WebElement documentationGrid;
    @FindBy(xpath= "//*[@id='Kol1']/div/div[1]/h4")
    WebElement printOutDocumentationLabel;
    @FindBy(id= "basic-grid_2")
    WebElement printOutDocumentationGrid;
}
