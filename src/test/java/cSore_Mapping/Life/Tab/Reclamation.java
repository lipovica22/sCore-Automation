package cSore_Mapping.Life.Tab;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reclamation extends BasePage {


    public Reclamation(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/legend")
    WebElement ReklamacijeLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/div[1]/div[1]/div/label")
    WebElement IssuingDateLabel;
    @FindBy(id= "kol1")
    WebElement IssuingDate;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/div[3]/div/div/label")
    WebElement NoteLabel;
    @FindBy(id= "kol2")
    WebElement Note;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/div[1]/div/label") 
    WebElement NoteResponseLabel;
    @FindBy(id= "kol3")   
    WebElement NoteResponse;

    @FindBy(id= "basic-grid_4")   
    WebElement GridReclamations;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/legend")
    WebElement Label;


    public void ReklamacijeLabel() throws Exception {}
    public void IssuingDateLabel() throws Exception {}
    public void IssuingDate() throws Exception {}
    public void NoteLabel() throws Exception {}
    public void Note() throws Exception {}

    public void NoteResponseLabel() throws Exception {}
    public void NoteResponse() throws Exception {}

    public void GridReclamations() throws Exception {}

    public void Label() throws Exception {}

}

