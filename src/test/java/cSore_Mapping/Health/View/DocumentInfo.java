package cSore_Mapping.Health.View;

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
    WebElement BrojDokumentaLabel;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/div/div[2]/div[1]")
    WebElement BrojDokumenta;
    @FindBy(css= "Saradnik:")   
    WebElement SaradnikLabel;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/div/div[1]/div[3]/a")
    WebElement Saradnik;

    @FindBy(css= "")   
    WebElement Ugovarac;
    @FindBy(css= "Status:")   
    WebElement StatusLabel;
    @FindBy(css= "div[class='sixteen columns padding_left_10 document_info'] div:nth-child(1) div:nth-child(5)")   
    WebElement Status;
    @FindBy(css= ".five.columns.policy_header_id")   
    WebElement StatusSpisakPutnika;

    @FindBy(css= "")   
    WebElement Promena;
    //@FindBy(= "")
    WebElement DatumPocetka;
   // @FindBy(link= "Rata premije:")
    WebElement RatePremijeLabel;
    @FindBy(css= "div[class='sixteen columns padding_left_10 document_info'] div:nth-child(1) div:nth-child(7)")
    WebElement RatePremije;
    @FindBy(xpath= "//*[@id='custom-tab-nav']/div/div/div[1]/div[6]")
    WebElement RatePremijeSpisak;
    //@FindBy(= "")
    WebElement DinamikaPlacanja;
    //@FindBy(= "")
    WebElement Trajanje;

    public void BrojDokumentaLabel() throws Exception {

    }
    public void getBrojDokumenta() throws Exception {
        BrojDokumenta.getText();
    }
    public void SaradnikLabel() throws Exception {

    }
    public void Saradnik() throws Exception {

    }
    public void UgovaracLabel() throws Exception {

    }

    public void Ugovarac() throws Exception {

    }
    public void StatusLabel() throws Exception {

    }
    public void Status() throws Exception {

    }
    public void StatusSpisakPutnika() throws Exception {

    }
    public void PromenaLabel() throws Exception {

    }
    public void Promena() throws Exception {

    }
    public void DatumPocetkaLabel() throws Exception {

    }

    public void DatumPocetka() throws Exception {

    }
    public void RatePremijeLabel() throws Exception {

    }
    public String getRatePremije() throws Exception {
        String premija = RatePremije.getText();
        return premija;
    }
    public void RatePremijeSpisak() throws Exception {

    }
    public void DinamikaPlacanjaLabel() throws Exception {

    }

    public void DinamikaPlacanja() throws Exception {

    }
    public void TrajanjeLabel() throws Exception {

    }

    public void Trajanje() throws Exception {

    }


}
