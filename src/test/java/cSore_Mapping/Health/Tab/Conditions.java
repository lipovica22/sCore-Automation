package cSore_Mapping.Health.Tab;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Conditions extends BasePage {
    public Conditions(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/div/div/fieldset/legend")
    WebElement AkcijeLabel;

    @FindBy(id= "")   
    WebElement Akcije;

          
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/fieldset/legend")   
    WebElement KomercijalniPopustiLabel;
    @FindBy(id= "Kol6")   
    WebElement Coupon;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/fieldset/div[2]/div/label")   
    WebElement CouponLabel;
    @FindBy(id= "Kol7")   
    WebElement AddCoupon;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/fieldset/div[5]/div/label")   
    WebElement CommercialDiscountLabel;
    @FindBy(id= "Kol8")   
    WebElement CommercialDiscount;
    @FindBy(id= "Kol9")   
    WebElement AddCommercialDiscount;

    @FindBy(id= "basic-grid_10")   
    WebElement CommercialDiscounts;

    public void AkcijeLabel() throws Exception {

    }

    public void Akcije() throws Exception {

    }

    public void KomercijalniPopustiLabel() throws Exception {

    }
    public void Coupon() throws Exception {

    }
    public void CouponLabel() throws Exception {

    }
    public void AddCoupon() throws Exception {

    }

    public void CommercialDiscountLabel() throws Exception {

    }
    public void CommercialDiscount() throws Exception {

    }
    public void AddCommercialDiscount() throws Exception {

    }

    public void CommercialDiscounts() throws Exception {

    }


}
