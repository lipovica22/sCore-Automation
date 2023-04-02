package cSore_Mapping.Common.View;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentInfo extends BasePage {


    public DocumentInfo(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(css= "Broj dokumenta:")   
    WebElement brojDokumentaLabel;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/div/div[2]/div[1]")
    WebElement brojDokumenta;
    @FindBy(css= "Saradnik:")   
    WebElement saradnikLabel;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/div/div[1]/div[3]/a")
    WebElement saradnik;
    @FindBy(css= "")   
    WebElement ugovarac;
    @FindBy(css= "Status:")   
    WebElement statusLabel;
    @FindBy(css= "div[class='sixteen columns padding_left_10 document_info'] div:nth-child(1) div:nth-child(5)")   
    WebElement status;
    @FindBy(css= ".five.columns.policy_header_id")   
    WebElement statusSpisakPutnika;
    @FindBy(css= "")   
    WebElement promena;
    //@FindBy(= "")
    WebElement datumPocetka;
   // @FindBy(link= "Rata premije:")
    WebElement ratePremijeLabel;
    @FindBy(css= "div[class='sixteen columns padding_left_10 document_info'] div:nth-child(1) div:nth-child(7)")
    WebElement ratePremije;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/div/div[1]/div[6]")
    WebElement ratePremijeSpisak;
    //@FindBy(= "")
    WebElement dinamikaPlacanja;
    //@FindBy(= "")
    WebElement trajanje;

    //--------------------- Methods -----------------------
    public String getRatePremije() throws Exception {
        String premija = ratePremije.getText();
        return premija;
    }
    //-------------------- End Methods --------------------
}
