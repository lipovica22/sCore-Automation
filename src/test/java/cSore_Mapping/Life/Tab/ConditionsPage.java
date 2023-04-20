package cSore_Mapping.Life.Tab;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class ConditionsPage extends BasePage {
    public ConditionsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/div/div/fieldset/legend")
    WebElement akcijeLabel;
    @FindBy(id= "chk_box_list_1")
    WebElement akcije;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/fieldset/legend")
    WebElement komercijalniPopustiLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/fieldset/div[2]/div/label")
    WebElement kuponPolisaLabel;
    @FindBy(id= "Kol6")
    WebElement kuponPolisa;
    @FindBy(id= "Kol7")
    WebElement kuponPolisaAddButton;
    @FindBy(id= "basic-grid_10")
    WebElement commercialDiscountsGrid;

    //-------------------- Methods --------------------
    public void AkcijeLabel() throws Exception {}
    public void Akcije() throws Exception {}

    public void KomercijalniPopustiLabel() throws Exception {}
    public void KuponPolisaLabel() throws Exception {}
    public void KuponPolisa() throws Exception {}
    public void KuponPolisaAddButton() throws Exception {}
    public void CommercialDiscountsGrid() throws Exception {}
    //-------------------- End Methods --------------------
}

