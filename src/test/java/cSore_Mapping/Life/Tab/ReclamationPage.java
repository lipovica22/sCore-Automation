package cSore_Mapping.Life.Tab;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReclamationPage extends BasePage {
    public ReclamationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/legend")
    WebElement reklamacijeLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/div[1]/div[1]/div/label")
    WebElement issuingDateLabel;
    @FindBy(id= "kol1")
    WebElement issuingDate;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/div[3]/div/div/label")
    WebElement noteLabel;
    @FindBy(id= "kol2")
    WebElement note;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/div[1]/div/label") 
    WebElement noteResponseLabel;
    @FindBy(id= "kol3")   
    WebElement noteResponse;
    @FindBy(id= "basic-grid_4")   
    WebElement gridReclamations;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/legend")
    WebElement label;

    //--------------------- Methods -----------------------
    public void ReklamacijeLabel() throws Exception {}
    public void IssuingDateLabel() throws Exception {}
    public void IssuingDate() throws Exception {}
    public void NoteLabel() throws Exception {}
    public void Note() throws Exception {}
    public void NoteResponseLabel() throws Exception {}
    public void NoteResponse() throws Exception {}
    public void GridReclamations() throws Exception {}
    public void Label() throws Exception {}
    //--------------------- End Methods -----------------------
}

