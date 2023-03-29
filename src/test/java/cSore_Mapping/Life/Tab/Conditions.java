package cSore_Mapping.Life.Tab;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Conditions extends BasePage {


    public Conditions(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/div/div/fieldset/legend")
    WebElement AkcijeLabel;
    @FindBy(id= "chk_box_list_1")
    WebElement Akcije;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/fieldset/legend")
    WebElement KomercijalniPopustiLabel;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/fieldset/div[2]/div/label")
    WebElement KuponPolisaLabel;
    @FindBy(id= "Kol6")
    WebElement KuponPolisa;
    @FindBy(id= "Kol7")
    WebElement KuponPolisaAddButton;
    @FindBy(id= "basic-grid_10")
    WebElement CommercialDiscountsGrid;

    public void AkcijeLabel() throws Exception {}
    public void Akcije() throws Exception {}

    public void KomercijalniPopustiLabel() throws Exception {}
    public void KuponPolisaLabel() throws Exception {}
    public void KuponPolisa() throws Exception {}
    public void KuponPolisaAddButton() throws Exception {}
    public void CommercialDiscountsGrid() throws Exception {}


}

