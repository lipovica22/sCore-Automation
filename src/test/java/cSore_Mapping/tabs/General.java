package cSore_Mapping.tabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import cSore_Mapping.pages.BasePage;

public class General extends BasePage {


    public General(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy (css="input[class='spinner_year_3 input lift center ui-spinner-input']")
    WebElement Trajanje;
    @FindBy (css="div[id='1']>div[class='answer']>label:nth-child(2)")
    WebElement Drzava;
    @FindBy (css="div[id='2']>div[class='answer']>label:nth-child(1)")
    WebElement Mesto;
    @FindBy (css="div[id='2']>div[class='answer']>label:nth-child(2)")
    WebElement Dinamika;
    @FindBy (css="label>input.questionRadio_2[value='1']")
    WebElement Valuta;
    @FindBy (css="label>input.questionRadio_2[value='2']")
    WebElement ValutnaKlauzula;
    @FindBy (css="label>input.questionRadio_3[value='1']")
    WebElement MetodPlacanja;
    @FindBy (css="input.questionRadio_3[value='2']")
    WebElement Banka;
    @FindBy (css="input.questionRadio_4[value='1']")
    WebElement Indeksacija;
    @FindBy (css="input.questionRadio_4[value='2']")
    WebElement VrednostIndeksa;



    public void setTrajanje(String trajanje) throws Exception {
        Trajanje.clear();
        Trajanje.sendKeys(trajanje);
    }
    public void setDrzava(String drzava) throws Exception {
        Drzava.sendKeys(drzava);
    }
    public void setMesto(String mesto) throws Exception {
        Mesto.sendKeys(mesto);
    }
    public void selectDinamika(String dinamika) throws Exception {
        Dinamika.sendKeys(dinamika);
    }
    public void selectValuta(String valuta) throws Exception {
        Valuta.sendKeys(valuta);
    }
    public void selectValutnaKlauzula(String valutnaKlauzula) throws Exception {
        ValutnaKlauzula.sendKeys(valutnaKlauzula);
      }
    public void selectMetodPlacanja(String metodPlacanja) throws Exception {
        MetodPlacanja.sendKeys(metodPlacanja);
    }
    public void selectBanka(String banka) throws Exception {
        Banka.sendKeys(banka);
    }
    public void chackIndeksacija() throws Exception {
        Indeksacija.click();
    }
    public void selectVrednostIndeksa(String vrednostIndeksa) throws Exception {
        VrednostIndeksa.sendKeys(vrednostIndeksa);
    }


}

