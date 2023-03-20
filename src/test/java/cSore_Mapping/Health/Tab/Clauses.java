package cSore_Mapping.Health.Tab;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clauses extends BasePage {
    public Clauses(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/legend")
    WebElement AnnulationLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div[1]/div/label")   
    WebElement TypeOfAnnulationLabel;
    @FindBy(id= "Kol1")   
    WebElement TypeOfAnnulation;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[1]/div[2]/div/label")   
    WebElement AnnulationReasonLabel;
    @FindBy(id= "Kol2")   
    WebElement AnnulationReason;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[2]/div[1]/div/label")   
    WebElement DateOfAnnullationFromLabel;
    @FindBy(id= "Kol3")   
    WebElement DateOfAnnullationFrom;
    
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/fieldset/div[2]/div[2]/div/label")   
    WebElement AnnulationNoteLabel;
    @FindBy(id= "Kol4")   
    WebElement AnnulationNote;


    public void AnnulationLabel() throws Exception {

    }
    public void TypeOfAnnulationLabel() throws Exception {

    }
    public void TypeOfAnnulation() throws Exception {

    }
    public void AnnulationReasonLabel() throws Exception {

    }
    public void AnnulationReason() throws Exception {

    }

    public void DateOfAnnullationFromLabel() throws Exception {

    }
    public void DateOfAnnullationFrom() throws Exception {

    }

    public void AnnulationNoteLabel() throws Exception {

    }
    public void AnnulationNote() throws Exception {

    }

}
