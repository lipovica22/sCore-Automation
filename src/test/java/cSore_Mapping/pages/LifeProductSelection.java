package cSore_Mapping.pages;

import cSore_Mapping.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LifeProductSelection extends BasePage {


    public LifeProductSelection(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy (css="div[id='1']>div[class='answer']>label:nth-child(1)")
    WebElement DozivotnoDA;
    @FindBy (css="div[id='1']>div[class='answer']>label:nth-child(2)")
    WebElement DozivotnoNE;
    @FindBy (css="div[id='2']>div[class='answer']>label:nth-child(1)")
    WebElement FavoritPremiumDA;
    @FindBy (css="div[id='2']>div[class='answer']>label:nth-child(2)")
    WebElement FavoritPremiumNE;
    @FindBy (css="label>input.questionRadio_2[value='1']")
    WebElement RizikoKreditDA;
    @FindBy (css="label>input.questionRadio_2[value='2']")
    WebElement RizikoKreditNE;
    @FindBy (css="label>input.questionRadio_3[value='1']")
    WebElement JokerPremiumDA;
    @FindBy (css="input.questionRadio_3[value='2']")
    WebElement JokerPremiumNE;
    @FindBy (css="input.questionRadio_4[value='1']")
    WebElement SpektarPremiumDA;
    @FindBy (css="input.questionRadio_4[value='2']")
    WebElement SpektarPremiumNE;
    @FindBy (css="input.questionRadio_5[value='1']")
    WebElement RizikoMixDA;
    @FindBy (css="input.questionRadio_5[value='2']")
    WebElement RizikoMixNE;

    @FindBy (css="input.questionRadio_6[value='1']")
    WebElement UnitLinkedDA;
    @FindBy (css="input.questionRadio_6[value='2']")
    WebElement UnitLinkedNeRiziko;

    @FindBy (id="nextBtn")
    WebElement NarednoPitanje;
    @FindBy (id="backBtn")
    WebElement PrethodnoPitanje;

    @FindBy (css=".ico_dozivotniriziko")
    WebElement DozivotniRiziko;
    @FindBy (css=".ico_favoritpremium")
    WebElement FavoritPremium;
    @FindBy (css=".ico_rizikokredit")
    WebElement RizikoKredit;
    @FindBy (css=".ico_jokerpremium")
    WebElement JokerPremium;
    @FindBy (css=".ico_spektarpremium")
    WebElement SpektarPremium;
    @FindBy (css=".ico_mozaik")
    WebElement RizikoMix;
    @FindBy (css=".ico_riziko")
    WebElement Riziko;

    @FindBy (css="div[id='productTypeChoice']>label:nth-child(1)")
    WebElement InfoPonuda;
    @FindBy (css="div[id='productTypeChoice']>label:nth-child(2)")
    WebElement NoviUgovor;

    public void narednoPitanje() throws Exception {
        NarednoPitanje.click();
        Thread.sleep(2000);
        }

    public void selectInfoPonuda() throws Exception {
        InfoPonuda.click();

    }
    public void selectNoviUgovor() throws Exception {
        NoviUgovor.click();
    }
    public void selectDozivotniRiziko() throws Exception {
       DozivotnoDA.click();
       DozivotniRiziko.click();
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
        RizikoKredit.click();
      }

    public void selectJoker() throws Exception {
        DozivotnoNE.click();
        narednoPitanje();
        FavoritPremiumNE.click();
        narednoPitanje();
        RizikoKreditNE.click();
        narednoPitanje();
        JokerPremiumDA.click();
        JokerPremium.click();
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
        SpektarPremium.click();
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
        RizikoMix.click();
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
        Riziko.click();
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
        public void selectProizvod (String Proizvod) throws Exception {

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

