package cSore_Mapping.Health.Tab;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClausesPage extends BasePage {
    public ClausesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/legend")
    WebElement annulationLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div[1]/div/label")   
    WebElement typeOfAnnulationLabel;
    @FindBy(id= "Kol1")   
    WebElement typeOfAnnulation;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div[2]/div/label")   
    WebElement annulationReasonLabel;
    @FindBy(id= "Kol2")   
    WebElement annulationReason;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[2]/div[1]/div/label")   
    WebElement dateOfAnnullationFromLabel;
    @FindBy(id= "Kol3")   
    WebElement dateOfAnnullationFrom;
    
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[2]/div[2]/div/label")   
    WebElement annulationNoteLabel;
    @FindBy(id= "Kol4")   
    WebElement annulationNote;
}
