package cSore_Mapping.Life.Tab;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class DocumentationsPage extends BasePage {


    public DocumentationsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath= "//*[@id='Kol1']/div/div[1]/h4")   WebElement DocumentationLabel;
    @FindBy(id= "basic-grid_1")   WebElement DocumentationGrid;
    @FindBy(xpath= "//*[@id='Kol2']/div/div[1]/h4")   WebElement ScannedDocumentationLabel;
    @FindBy(id= "basic-grid_2")   WebElement ScannedDocumentationGrid;

    public void DocumentationLabel() throws Exception {}
    public void DocumentationGrid() throws Exception {}
    public void ScannedDocumentationLabel() throws Exception {}
    public void ScannedDocumentationGrid() throws Exception {}


}

