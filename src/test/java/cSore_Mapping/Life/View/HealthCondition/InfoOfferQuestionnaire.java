package cSore_Mapping.Life.View.HealthCondition;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InfoOfferQuestionnaire extends BasePage {
    public InfoOfferQuestionnaire(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div/div[3]/fieldset/legend")  
    WebElement Upitnik;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div/div[3]/fieldset/div[1]/div/div/label")  
    WebElement QuestionnaireTypeLabel;
    @FindBy(id= "Kol10")   
    WebElement QuestionnaireType;
    @FindBy(xpath= "//*[@id='Kol6']/fieldset/legend")
    WebElement PodUpitnik;
    @FindBy(xpath= "//*[@id='Kol6']/fieldset/div/div/div/div/label[1]")
    WebElement PrijavljenRizik;
    @FindBy(id= "qnn_6_0_0")  
    WebElement PrijavljenRizikNe;
    @FindBy(css= "label[for='qnn_6_0_0']")
    WebElement PrijavljenRizikNeLabel;
    @FindBy(id= "qnn_6_0_1")  
    WebElement PrijavljenRizikDa;
    @FindBy(css= "label[for='qnn_6_0_1']")
    WebElement PrijavljenRizikDaLabel;



    //-------------------- Methods --------------------
    public void Upitnik() throws Exception {}
    public void QuestionnaireTypeLabel() throws Exception {}
    public void QuestionnaireType() throws Exception {}
    public void PodUpitnik() throws Exception {}
    public void PrijavljenRizik() throws Exception {}
    public void PrijavljenRizikNe() throws Exception {}
    public void PrijavljenRizikNeLabel() throws Exception {}
    public void PrijavljenRizikDa() throws Exception {}
    public void PrijavljenRizikDaLabel() throws Exception {}



    //-------------------- End Methods --------------------

}
