package cSore_Mapping.Life.View;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LifeProducts extends BasePage {
    public LifeProducts(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy( className= "ico_impuls")   WebElement impuls;
    @FindBy( className= "ico_riziko")   WebElement riziko;
    @FindBy( className= "ico_fokus")   WebElement spektarOld;
    @FindBy( className= "ico_rizikokredit")   WebElement rizikoKredit;
    @FindBy( className= "ico_joker")   WebElement jokerOld;
    @FindBy( className= "ico_favorit")   WebElement favoritOld;
    @FindBy( className= "ico_paketi")   WebElement paketi;
    @FindBy( className= "ico_penzioneririziko")   WebElement penzioneriRiziko;
    @FindBy( className= "ico_mozaik")   WebElement rizikoMix;
    @FindBy( className= "ico_grouplife")   WebElement grouplife;
    @FindBy( className= "ico_favoritpremium")   WebElement favoritPremium;
    @FindBy( className= "ico_jokerpremium")   WebElement jokerPremium;
    @FindBy( className= "ico_spektarpremium")   WebElement spektarPremium;
    @FindBy(className= "ico_junior")   WebElement junior;
    @FindBy(className= "ico_senior")   WebElement senior;
    @FindBy(className = "ico_dozivotniriziko")
    WebElement dozivotniRiziko;

    public void clickImpuls() throws Exception {
        Click(impuls,"Clik on Impuls");
    }
    public void clickRiziko() throws Exception {
        Click(riziko,"Clik on Riziko");
    }
    public void clickSpektarOld() throws Exception {
        Click(spektarOld,"Clik on SpektarOld");
    }
    public void clickRizikoKredit() throws Exception {
        Click(rizikoKredit,"Clik on RizikoKredit");
    }
    public void clickJokerOld() throws Exception {
        Click(jokerOld,"Clik on JokerOld");
    }
    public void clickFavoritOld() throws Exception {
        Click(favoritOld,"Clik on FavoritOld");
    }
    public void clickPaketi() throws Exception {
        Click(paketi,"Clik on Paketi");
    }
    public void clickPenzioneriRiziko() throws Exception {
        Click(penzioneriRiziko,"Clik on PenzioneriRiziko");
    }
    public void clickRizikoMix() throws Exception {
        Click(rizikoMix,"Clik on RizikoMix");
    }
    public void clickGroupLife() throws Exception {
        Click(grouplife,"Clik on GroupLife");
    }
    public void clickFavoritPremium() throws Exception {
        Click(favoritPremium,"Clik on FavoritPremium");
    }
    public void clickJokerPremium() throws Exception {
        Click(jokerPremium,"Clik on JokerPremium");
    }
    public void clickSpektarPremium() throws Exception {
        Click(spektarPremium,"Clik on SpektarPremium");
    }
    public void clickJunior() throws Exception {
        Click(junior,"Clik on Junior");
    }
    public void clickSenior() throws Exception {
        Click(senior,"Clik on Senior");
    }
    public void clickDozivotniRiziko() throws Exception {
        Click(dozivotniRiziko,"Clik on DozivotniRiziko");
    }
    public void selectProizvod(String proizvod) throws Exception {

        switch (proizvod) {
            case "Smart": {
                clickJunior();
            }
            case "Aktiv": {
                clickSenior();
            }
            case "Impuls": {
                clickImpuls();
            }
            break;
            case "Paketi": {
                clickPaketi();
            }
            break;
            case "Penzioneri Riziko": {
                clickPenzioneriRiziko();
            }
            break;
            case "Grupno osiguranje ": {
                clickGroupLife();
            }
            break;
            case "Doživotni riziko": {
                clickDozivotniRiziko();
            }
            break;
            case "FavoritOld": {
                clickFavoritOld();
            }
            case "Favorit": {
                clickFavoritPremium();
            }
            break;
            case "Riziko kredit": {
                clickRizikoKredit();
            }
            break;
            case "Joker": {
                clickJokerPremium();
            }
            break;
            case "JokerOld": {
                clickJokerOld();
            }
            break;
            case "SpektarOld": {
                clickSpektarOld();
            }
            break;
            case "Spektar": {
                clickSpektarPremium();
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
            default:
                break;
        }
    }

}

