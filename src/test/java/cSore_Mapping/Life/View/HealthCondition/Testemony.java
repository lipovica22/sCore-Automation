package cSore_Mapping.Life.View.HealthCondition;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testemony extends BasePage {
    public Testemony(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div/div[3]/fieldset/legend")   WebElement Upitnik;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div/div[3]/fieldset/div[1]/div/div/label")   WebElement QuestionnaireTypeLabel;
    @FindBy(id= "Kol10")   WebElement QuestionnaireType;
 
    @FindBy(xpath= "//*[@id='Kol6']/fieldset/legend")   WebElement PodUpitnik;
    @FindBy(css= "label[for='qnn_6_0']")   WebElement Izjava;
    @FindBy(id= "qnn_6_0")   WebElement IzjavaDa;



    //-------------------- Methods --------------------
    public void Upitnik() throws Exception {}
    public void QuestionnaireTypeLabel() throws Exception {}
    public void QuestionnaireType() throws Exception {}
 
    public void PodUpitnik() throws Exception {}
    public void Izjava() throws Exception {}
    public void IzjavaDa() throws Exception {}



    //-------------------- End Methods --------------------

}
