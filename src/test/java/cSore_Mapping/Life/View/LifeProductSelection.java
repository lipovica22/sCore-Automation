package cSore_Mapping.Life.View;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LifeProductSelection extends BasePage {
    public LifeProductSelection(WebDriver driver) {
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

    public void narednoPitanje() throws Exception {
        narednoPitanje.click();
        Thread.sleep(2000);
    }

    public void selectProductType(String productType) throws InterruptedException {
       // new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(NoviUgovor));
        switch (productType) {
            case "Novi ugovor": {
                noviUgovor.click();
            }
            break;
            case "Info ponuda": {
                infoPonuda.click();
            }
            default:
                break;
        }
    }

    public void selectInfoPonuda() throws Exception {
        infoPonuda.click();
    }

    public void selectNoviUgovor() throws Exception {
        noviUgovor.click();
    }

    public void selectDozivotniRiziko() throws Exception {
        dozivotnoDA.click();
    }

    public void selectFavorit() throws Exception {
        dozivotnoNE.click();
        narednoPitanje();
        favoritPremiumDA.click();
    }

    public void selectRizikoKredit() throws Exception {
        dozivotnoNE.click();
        narednoPitanje();
        favoritPremiumNE.click();
        narednoPitanje();
        rizikoKreditDA.click();
    }

    public void selectJoker() throws Exception {
        dozivotnoNE.click();
        narednoPitanje();
        favoritPremiumNE.click();
        narednoPitanje();
        rizikoKreditNE.click();
        narednoPitanje();
        jokerPremiumDA.click();
    }

    public void selectSpectar() throws Exception {
        dozivotnoNE.click();
        narednoPitanje();
        favoritPremiumNE.click();
        narednoPitanje();
        rizikoKreditNE.click();
        narednoPitanje();
        jokerPremiumNE.click();
        narednoPitanje();
        spektarPremiumNE.click();
    }

    public void selectRizikoMix() throws Exception {
        dozivotnoNE.click();
        narednoPitanje();
        favoritPremiumNE.click();
        narednoPitanje();
        rizikoKreditNE.click();
        narednoPitanje();
        jokerPremiumNE.click();
        narednoPitanje();
        spektarPremiumDA.click();
        narednoPitanje();
        rizikoMixDA.click();
    }

    public void selectRiziko() throws Exception {
        dozivotnoNE.click();
        narednoPitanje();
        favoritPremiumNE.click();
        narednoPitanje();
        rizikoKreditNE.click();
        narednoPitanje();
        jokerPremiumNE.click();
        narednoPitanje();
        spektarPremiumDA.click();
        narednoPitanje();
        rizikoMixNE.click();
        narednoPitanje();
        unitLinkedNeRiziko.click();
    }

    public void clickProductIcon(String Proizvod) throws Exception {
        switch (Proizvod) {
            case "Doživotni riziko": {
                dozivotniRiziko.click();
            }
            break;
            case "Favorit": {
                favoritPremium.click();
            }
            break;
            case "Riziko kredit": {
                rizikoKredit.click();
            }
            break;
            case "Joker": {
                jokerPremium.click();
            }
            break;
            case "Spektar": {
                spektarPremium.click();
            }
            break;
            case "Riziko Mix": {
                rizikoMix.click();
            }
            break;
            case "Riziko": {
                riziko.click();
            }
            break;
            default:
                break;
        }
    }

    public void selectProizvod(String Proizvod) throws Exception {

        switch (Proizvod) {
            case "Doživotni riziko": {
                selectDozivotniRiziko();
            }
            break;
            case "Favorit": {
                selectFavorit();
            }
            break;
            case "Riziko kredit": {
                selectRizikoKredit();
            }
            break;
            case "Joker": {
                selectJoker();
            }
            break;
            case "Spektar": {
                selectSpectar();
            }
            break;
            case "Riziko Mix": {
                selectRizikoMix();
            }
            break;
            case "Riziko": {
                selectRiziko();
            }
            break;
            default:
                break;
        }
    }
}

