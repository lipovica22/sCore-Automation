package cSore_Mapping.Life.View;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TehnicalPersonPage extends BasePage {
    public TehnicalPersonPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div[id='1']>div[class='answer']>label:nth-child(1)")
    WebElement dozivotnoDA;
    @FindBy(css = "div[id='1']>div[class='answer']>label:nth-child(2)")
    WebElement dozivotnoNE;
    @FindBy(css = "div[id='2']>div[class='answer']>label:nth-child(1)")
    WebElement favoritPremiumDA;
    @FindBy(css = "div[id='2']>div[class='answer']>label:nth-child(2)")
    WebElement favoritPremiumNE;
    @FindBy(css = "div[id='3']>div[class='answer']>label:nth-child(1)")
    WebElement rizikoKreditDA;
    @FindBy(css = "div[id='3']>div[class='answer']>label:nth-child(2)")
    WebElement rizikoKreditNE;
    @FindBy(css = "div[id='4']>div[class='answer']>label:nth-child(1)")
    WebElement jokerPremiumDA;
    @FindBy(css = "div[id='4']>div[class='answer']>label:nth-child(2)")
    WebElement jokerPremiumNE;
    @FindBy(css = "div[id='5']>div[class='answer']>label:nth-child(1)")
    WebElement spektarPremiumDA;
    @FindBy(css = "div[id='5']>div[class='answer']>label:nth-child(2)")
    WebElement spektarPremiumNE;
    @FindBy(css = "div[id='6']>div[class='answer']>label:nth-child(1)")
    WebElement rizikoMixDA;
    @FindBy(css = "div[id='6']>div[class='answer']>label:nth-child(2)")
    WebElement rizikoMixNE;
    @FindBy(css = "div[id='7']>div[class='answer']>label:nth-child(1)")
    WebElement unitLinkedDA;
    @FindBy(css = "div[id='7']>div[class='answer']>label:nth-child(2)")
    WebElement unitLinkedNeRiziko;
    @FindBy(id = "nextBtn")
    WebElement narednoPitanje;
    @FindBy(id = "backBtn")
    WebElement prethodnoPitanje;
    @FindBy(css = ".ico_dozivotniriziko")
    WebElement dozivotniRiziko;
    @FindBy(css = ".ico_favoritpremium")
    WebElement favoritPremium;
    @FindBy(css = ".ico_rizikokredit")
    WebElement rizikoKredit;
    @FindBy(css = ".ico_jokerpremium")
    WebElement jokerPremium;
    @FindBy(css = ".ico_spektarpremium")
    WebElement spektarPremium;
    @FindBy(css = ".ico_mozaik")
    WebElement rizikoMix;
    @FindBy(css = ".ico_riziko")
    WebElement riziko;
    @FindBy(css = "div[id='productTypeChoice']>label:nth-child(1)")
    WebElement infoPonuda;
    @FindBy(css = "div[id='productTypeChoice']>label:nth-child(2)")
    WebElement noviUgovor;

    //-------------------- Methods --------------------
    public void narednoPitanje() throws Exception {
        Click(narednoPitanje, "Click on next question");
    }

    public void selectProductType(String productType) throws Exception {
        switch (productType) {
            case "Novi ugovor": {
                Click(noviUgovor, "Click on new contract");
            }
            break;
            case "Info ponuda": {
                Click(infoPonuda, "Click on info offer");
            }
        }
    }

    public void clickInfoOffer() throws Exception {
        Click(infoPonuda, "Click on info offer");
    }

    public void clickNoviUgovor() throws Exception {
        Click(noviUgovor, "Click on new contract");
    }

    public void clickDozivotniRiziko() throws Exception {
        Click(dozivotnoDA, "Click on for life yes - dozivotni riziko");
    }

    public void clickFavorit() throws Exception {
        Click(dozivotnoNE, "Click on for life no - favorit");
        narednoPitanje();
        Click(favoritPremiumDA, "Click on favorit premium yes");
    }

    public void clickRizikoKredit() throws Exception {
        Click(dozivotnoNE, "Click on for life no - riziko kredit");
        narednoPitanje();
        Click(favoritPremiumNE, "Click on favorit premium no");
        narednoPitanje();
        Click(rizikoKreditDA, "Click on riziko kredit yes");
    }

    public void clickJoker() throws Exception {
        Click(dozivotnoNE, "Click on for life no - joker");
        narednoPitanje();
        Click(favoritPremiumNE, "Click on favorit premium no");
        narednoPitanje();
        Click(rizikoKreditNE, "Click on riziko kredit no");
        narednoPitanje();
        Click(jokerPremiumDA, "Click on joker premium yes");
    }

    public void clickSpectar() throws Exception {
        Click(dozivotnoNE, "Click on for life no - spectar");
        narednoPitanje();
        Click(favoritPremiumNE, "Click on favorit premium no");
        narednoPitanje();
        Click(rizikoKreditNE, "Click on riziko kredit no");
        narednoPitanje();
        Click(jokerPremiumNE, "Click on joker premium no");
        narednoPitanje();
        Click(spektarPremiumNE, "Click on spektar premium no");
    }

    public void clickRizikoMix() throws Exception {
        Click(dozivotnoNE, "Click on for life no - riziko mix");
        narednoPitanje();
        Click(favoritPremiumNE, "Click on davorit premium no");
        narednoPitanje();
        Click(rizikoKreditNE, "Click on riziko kredit no");
        narednoPitanje();
        Click(jokerPremiumNE, "Click on joker premium no");
        narednoPitanje();
        Click(spektarPremiumDA, "Click on spektar pramium yes");
        narednoPitanje();
        Click(rizikoMixDA, "Click on riziko mix yes");
    }

    public void clickRiziko() throws Exception {
        Click(dozivotnoNE, "Click on for life no - riziko");
        narednoPitanje();
        Click(favoritPremiumNE, "Click on favorit premium no");
        narednoPitanje();
        Click(rizikoKreditNE, "Click on riziko kredit no");
        narednoPitanje();
        Click(jokerPremiumNE, "Click on joker premium no");
        narednoPitanje();
        Click(spektarPremiumDA, "Click on spektar premium yes");
        narednoPitanje();
        Click(rizikoMixNE, "Click on riziko kredit no");
        narednoPitanje();
        Click(unitLinkedNeRiziko, "Click on unit Linked no riziko");
    }

    public void clickProductIcon(String Proizvod) throws Exception {
        switch (Proizvod) {
            case "Doživotni riziko": {
                Click(dozivotniRiziko, "Click on for life riziko");
            }
            break;
            case "Favorit": {
                Click(favoritPremium, "Click on favorit premium");
            }
            break;
            case "Riziko kredit": {
                Click(rizikoKredit, "Click on riziko kredit");
            }
            break;
            case "Joker": {
                Click(jokerPremium, "Click on joker premium");
            }
            break;
            case "Spektar": {
                Click(spektarPremium, "Click on spektar premium");
            }
            break;
            case "Riziko Mix": {
                Click(rizikoMix, "Click on riziko mix");
            }
            break;
            case "Riziko": {
                Click(riziko, "Click on riziko");
            }
            break;
        }
    }

    public void selectProizvod(String Proizvod) throws Exception {

        switch (Proizvod) {
            case "Doživotni riziko": {
                clickDozivotniRiziko();
            }
            break;
            case "Favorit": {
                clickFavorit();
            }
            break;
            case "Riziko kredit": {
                clickRizikoKredit();
            }
            break;
            case "Joker": {
                clickJoker();
            }
            break;
            case "Spektar": {
                clickSpectar();
            }
            break;
            case "Riziko Mix": {
                clickRizikoMix();
            }
            break;
            case "Riziko": {
                clickRiziko();
            }
            break;
        }
    }

    //-------------------- End Methods --------------------
}

