package cSore_Mapping.Life;

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
    WebElement DozivotnoDA;
    @FindBy(css = "div[id='1']>div[class='answer']>label:nth-child(2)")
    WebElement DozivotnoNE;
    @FindBy(css = "div[id='2']>div[class='answer']>label:nth-child(1)")
    WebElement FavoritPremiumDA;
    @FindBy(css = "div[id='2']>div[class='answer']>label:nth-child(2)")
    WebElement FavoritPremiumNE;
    @FindBy(css = "div[id='3']>div[class='answer']>label:nth-child(1)")
    WebElement RizikoKreditDA;
    @FindBy(css = "div[id='3']>div[class='answer']>label:nth-child(2)")
    WebElement RizikoKreditNE;
    @FindBy(css = "div[id='4']>div[class='answer']>label:nth-child(1)")
    WebElement JokerPremiumDA;
    @FindBy(css = "div[id='4']>div[class='answer']>label:nth-child(2)")
    WebElement JokerPremiumNE;
    @FindBy(css = "div[id='5']>div[class='answer']>label:nth-child(1)")
    WebElement SpektarPremiumDA;
    @FindBy(css = "div[id='5']>div[class='answer']>label:nth-child(2)")
    WebElement SpektarPremiumNE;
    @FindBy(css = "div[id='6']>div[class='answer']>label:nth-child(1)")
    WebElement RizikoMixDA;
    @FindBy(css = "div[id='6']>div[class='answer']>label:nth-child(2)")
    WebElement RizikoMixNE;

    @FindBy(css = "div[id='7']>div[class='answer']>label:nth-child(1)")
    WebElement UnitLinkedDA;
    @FindBy(css = "div[id='7']>div[class='answer']>label:nth-child(2)")
    WebElement UnitLinkedNeRiziko;

    @FindBy(id = "nextBtn")
    WebElement NarednoPitanje;
    @FindBy(id = "backBtn")
    WebElement PrethodnoPitanje;

    @FindBy(css = ".ico_dozivotniriziko")
    WebElement DozivotniRiziko;
    @FindBy(css = ".ico_favoritpremium")
    WebElement FavoritPremium;
    @FindBy(css = ".ico_rizikokredit")
    WebElement RizikoKredit;
    @FindBy(css = ".ico_jokerpremium")
    WebElement JokerPremium;
    @FindBy(css = ".ico_spektarpremium")
    WebElement SpektarPremium;
    @FindBy(css = ".ico_mozaik")
    WebElement RizikoMix;
    @FindBy(css = ".ico_riziko")
    WebElement Riziko;

    @FindBy(css = "div[id='productTypeChoice']>label:nth-child(1)")
    WebElement InfoPonuda;
    @FindBy(css = "div[id='productTypeChoice']>label:nth-child(2)")
    WebElement NoviUgovor;

    public void narednoPitanje() throws Exception {
        NarednoPitanje.click();
        Thread.sleep(2000);
    }

    public void selectProductType(String productType) throws InterruptedException {
       // new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(NoviUgovor));
        switch (productType) {
            case "Novi ugovor": {

                NoviUgovor.click();
            }
            break;
            case "Info ponuda": {

                InfoPonuda.click();
            }
            default:
                break;
        }
    }

    public void selectInfoPonuda() throws Exception {
        InfoPonuda.click();

    }

    public void selectNoviUgovor() throws Exception {
        NoviUgovor.click();
    }

    public void selectDozivotniRiziko() throws Exception {
        DozivotnoDA.click();
    }

    public void selectFavorit() throws Exception {
        DozivotnoNE.click();
        narednoPitanje();
        FavoritPremiumDA.click();
    }

    public void selectRizikoKredit() throws Exception {
        DozivotnoNE.click();
        narednoPitanje();
        FavoritPremiumNE.click();
        narednoPitanje();
        RizikoKreditDA.click();
    }

    public void selectJoker() throws Exception {
        DozivotnoNE.click();
        narednoPitanje();
        FavoritPremiumNE.click();
        narednoPitanje();
        RizikoKreditNE.click();
        narednoPitanje();
        JokerPremiumDA.click();
    }

    public void selectSpectar() throws Exception {
        DozivotnoNE.click();
        narednoPitanje();
        FavoritPremiumNE.click();
        narednoPitanje();
        RizikoKreditNE.click();
        narednoPitanje();
        JokerPremiumNE.click();
        narednoPitanje();
        SpektarPremiumNE.click();
    }

    public void selectRizikoMix() throws Exception {
        DozivotnoNE.click();
        narednoPitanje();
        FavoritPremiumNE.click();
        narednoPitanje();
        RizikoKreditNE.click();
        narednoPitanje();
        JokerPremiumNE.click();
        narednoPitanje();
        SpektarPremiumDA.click();
        narednoPitanje();
        RizikoMixDA.click();
    }

    public void selectRiziko() throws Exception {
        DozivotnoNE.click();
        narednoPitanje();
        FavoritPremiumNE.click();
        narednoPitanje();
        RizikoKreditNE.click();
        narednoPitanje();
        JokerPremiumNE.click();
        narednoPitanje();
        SpektarPremiumDA.click();
        narednoPitanje();
        RizikoMixNE.click();
        narednoPitanje();
        UnitLinkedNeRiziko.click();
    }

    public void clickProductIcon(String Proizvod) throws Exception {
        switch (Proizvod) {
            case "Doživotni riziko": {
                DozivotniRiziko.click();
            }
            break;
            case "Favorit": {
                FavoritPremium.click();
            }
            break;
            case "Riziko kredit": {
                RizikoKredit.click();
            }
            break;
            case "Joker": {
                JokerPremium.click();
            }
            break;
            case "Spektar": {
                SpektarPremium.click();
            }
            break;
            case "Riziko Mix": {
                RizikoMix.click();
            }
            break;
            case "Riziko": {
                Riziko.click();
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

