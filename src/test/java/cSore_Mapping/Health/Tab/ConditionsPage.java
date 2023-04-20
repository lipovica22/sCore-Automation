package cSore_Mapping.Health.Tab;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConditionsPage extends BasePage {
    public ConditionsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/div/div/fieldset/legend")
    WebElement akcijeLabel;
    @FindBy(id= "")   
    WebElement akcije;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/fieldset/legend")   
    WebElement komercijalniPopustiLabel;
    @FindBy(id= "Kol6")   
    WebElement coupon;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/fieldset/div[2]/div/label")   
    WebElement couponLabel;
    @FindBy(id= "Kol7")   
    WebElement addCoupon;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/fieldset/div[5]/div/label")   
    WebElement commercialDiscountLabel;
    @FindBy(id= "Kol8")   
    WebElement commercialDiscount;
    @FindBy(id= "Kol9")   
    WebElement addCommercialDiscount;
    @FindBy(id= "basic-grid_10")   
    WebElement commercialDiscounts;
}
