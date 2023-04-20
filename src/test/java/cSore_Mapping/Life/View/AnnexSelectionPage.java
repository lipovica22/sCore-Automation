package cSore_Mapping.Life.View;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnnexSelectionPage extends BasePage {
    public AnnexSelectionPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/div[1]/div/label")
    WebElement annexIssuingDateLabel;
    @FindBy(id= "Kol1")
    WebElement annexIssuingDate;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/legend")
    WebElement datesLabel;
    @FindBy(className= "ui-state-default")
    WebElement annexIssuingDateList;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/div[2]/div/label")
    WebElement annexCalculationDateLabel;
    @FindBy(id= "Kol4")
    WebElement annexCalculationDate;
    @FindBy(className= "ui-state-default")
    WebElement annexCalculationDateList;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/legend")
    WebElement nonPremiumLabel;
    @FindBy(id= "li_Kol2_46")
    WebElement promenaKorisnika;
    @FindBy(css= "label[for='Kol2_46']")
    WebElement promenaKorisnikaLabel;
    @FindBy(css= "label[for='Kol2_47']")
    WebElement promenaValutneKlauzuleLabel;
    @FindBy(id= "li_Kol2_47")
    WebElement promenaValutneKlauzule;
    @FindBy(id= "li_Kol2_50")
    WebElement promenaNacinaPlacanja;
    @FindBy(css= "label[for='Kol2_50']")
    WebElement promenaNacinaPlacanjaLabel;
    @FindBy(id= "li_Kol2_45")
    WebElement promenaLicnihPodataka;
    @FindBy(css= "label[for='Kol2_45']")
    WebElement promenaLicnihPodatakaLabel;
    @FindBy(css= "label[for='Kol2_49']")
    WebElement promenaUgovaracaLabel;
    @FindBy(id= "li_Kol2_49")
    WebElement promenaUgovaraca;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/fieldset/legend")
    WebElement premiumLabel;
    @FindBy(id= "Kol3_75")
    WebElement iskljucenjeDodatnihRizka;
    @FindBy(css= "label[for='Kol3_75']")
    WebElement iskljucenjeDodatnihRizkaLabel;
    @FindBy(id= "Kol3_74")
    WebElement ukljucenjeDodatnihRizika;
    @FindBy(css= "label[for='Kol3_74']")
    WebElement ukljucenjeDodatnihRizikaLabel;
    @FindBy(css= "label[for='Kol3_73']")
    WebElement smanjenjeTrajanjaLabel;
    @FindBy(id= "Kol3_73")
    WebElement smanjenjeTrajanja;
    @FindBy(id= "Kol3_72")
    WebElement povecanjeTrajanja;
    @FindBy(css= "label[for='Kol3_72']")
    WebElement povecanjeTrajanjaLabel;
    @FindBy(id= "Kol3_2")
    WebElement promenaSportaZanimanjaHobija;
    @FindBy(css= "label[for='Kol3_2']")
    WebElement promenaSportaZanimanjaHobijaLabel;
    @FindBy(id= "Kol3_3")
    WebElement promenaDinamike;
    @FindBy(css= "label[for='Kol3_3']")
    WebElement promenaDinamikeLabel;
    @FindBy(css= "label[for='Kol3_70']")
    WebElement smanjenjePremijeLabel;
    @FindBy(id= "Kol3_70")
    WebElement smanjenjePremije;
    @FindBy(id= "Kol3_71")
    WebElement povecanjePremije;
    @FindBy(css= "label[for='Kol3_71']")
    WebElement povecanjePremijeLabel;
    @FindBy(id= "Kol3_8")
    WebElement redukcija;
    @FindBy(css= "label[for='Kol3_8']")
    WebElement redukcijaLabel;
    @FindBy(id= "Kol3_69")
    WebElement smanjenjeOsiguraneSume;
    @FindBy(css= "label[for='Kol3_69']")
    WebElement smanjenjeOsiguraneSumeLabel;
    @FindBy(css= "label[for='Kol3_68']")
    WebElement povecanjeOsiguraneSumeLabel;
    @FindBy(id= "Kol3_68")
    WebElement povecanjeOsiguraneSume;

    //-------------------- Methods --------------------
    public void AnnexIssuingDateLabel() throws Exception {}
    public void AnnexIssuingDate() throws Exception {}
    public void DatesLabel() throws Exception {}
    public void AnnexIssuingDateList() throws Exception {}
    public void AnnexCalculationDateLabel() throws Exception {}
    public void AnnexCalculationDate() throws Exception {}
    public void AnnexCalculationDateList() throws Exception {}
    public void NonPremiumLabel() throws Exception {}
    public void PromenaKorisnika() throws Exception {}
    public void PromenaKorisnikaLabel() throws Exception {}
    public void PromenaValutneKlauzuleLabel() throws Exception {}
    public void PromenaValutneKlauzule() throws Exception {}
    public void PromenaNacinaPlacanja() throws Exception {}
    public void PromenaNacinaPlacanjaLabel() throws Exception {}
    public void PromenaLicnihPodataka() throws Exception {}
    public void PromenaLicnihPodatakaLabel() throws Exception {}
    public void PromenaUgovaracaLabel() throws Exception {}
    public void PromenaUgovaraca() throws Exception {}
    public void PremiumLabel() throws Exception {}
    public void IskljucenjeDodatnihRizka() throws Exception {}
    public void IskljucenjeDodatnihRizkaLabel() throws Exception {}
    public void UkljucenjeDodatnihRizika() throws Exception {}
    public void UkljucenjeDodatnihRizikaLabel() throws Exception {}
    public void SmanjenjeTrajanjaLabel() throws Exception {}
    public void SmanjenjeTrajanja() throws Exception {}
    public void PovecanjeTrajanja() throws Exception {}
    public void PovecanjeTrajanjaLabel() throws Exception {}
    public void PromenaSportaZanimanjaHobija() throws Exception {}
    public void PromenaSportaZanimanjaHobijaLabel() throws Exception {}
    public void PromenaDinamike() throws Exception {}
    public void PromenaDinamikeLabel() throws Exception {}
    public void SmanjenjePremijeLabel() throws Exception {}
    public void SmanjenjePremije() throws Exception {}
    public void PovecanjePremije() throws Exception {}
    public void PovecanjePremijeLabel() throws Exception {}
    public void Redukcija() throws Exception {}
    public void RedukcijaLabel() throws Exception {}
    public void SmanjenjeOsiguraneSume() throws Exception {}
    public void SmanjenjeOsiguraneSumeLabel() throws Exception {}
    public void PovecanjeOsiguraneSumeLabel() throws Exception {}
    public void PovecanjeOsiguraneSume() throws Exception {}

    //-------------------- End Methods --------------------

}
