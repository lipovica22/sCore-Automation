package cSore_Mapping.Life.View.HealthCondition;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InfoOfferQuestionnairePage extends BasePage {
    public InfoOfferQuestionnairePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div/div[3]/fieldset/legend")  
    WebElement upitnik;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div/div[3]/fieldset/div[1]/div/div/label")  
    WebElement questionnaireTypeLabel;
    @FindBy(id= "Kol10")   
    WebElement questionnaireType;
    @FindBy(xpath= "//*[@id='Kol6']/fieldset/legend")
    WebElement podUpitnik;
    @FindBy(xpath= "//*[@id='Kol6']/fieldset/div/div/div/div/label[1]")
    WebElement prijavljenRizik;
    @FindBy(id= "qnn_6_0_0")  
    WebElement prijavljenRizikNe;
    @FindBy(css= "label[for='qnn_6_0_0']")
    WebElement prijavljenRizikNeLabel;
    @FindBy(id= "qnn_6_0_1")  
    WebElement prijavljenRizikDa;
    @FindBy(css= "label[for='qnn_6_0_1']")
    WebElement prijavljenRizikDaLabel;

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
