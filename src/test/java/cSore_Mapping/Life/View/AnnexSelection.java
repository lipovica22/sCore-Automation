package cSore_Mapping.Life.View;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnnexSelection extends BasePage {
    public AnnexSelection(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/div[1]/div/label")   WebElement AnnexIssuingDateLabel;
    @FindBy(id= "Kol1")   WebElement AnnexIssuingDate;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/legend")   WebElement DatesLabel;
    @FindBy(className= "ui-state-default")   WebElement AnnexIssuingDateList;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/div[2]/div/label")   WebElement AnnexCalculationDateLabel;
    @FindBy(id= "Kol4")   WebElement AnnexCalculationDate;
    @FindBy(className= "ui-state-default")
    WebElement AnnexCalculationDateList;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/legend")
    WebElement NonPremiumLabel;
    @FindBy(id= "li_Kol2_46")
    WebElement PromenaKorisnika;
    @FindBy(css= "label[for='Kol2_46']")
    WebElement PromenaKorisnikaLabel;
    @FindBy(css= "label[for='Kol2_47']")
    WebElement PromenaValutneKlauzuleLabel;
    @FindBy(id= "li_Kol2_47")
    WebElement PromenaValutneKlauzule;
    @FindBy(id= "li_Kol2_50")
    WebElement PromenaNacinaPlacanja;
    @FindBy(css= "label[for='Kol2_50']")
    WebElement PromenaNacinaPlacanjaLabel;
    @FindBy(id= "li_Kol2_45")
    WebElement PromenaLicnihPodataka;
    @FindBy(css= "label[for='Kol2_45']")
    WebElement PromenaLicnihPodatakaLabel;
    @FindBy(css= "label[for='Kol2_49']")
    WebElement PromenaUgovaracaLabel;
    @FindBy(id= "li_Kol2_49")
    WebElement PromenaUgovaraca;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/fieldset/legend")
    WebElement PremiumLabel;
    @FindBy(id= "Kol3_75")
    WebElement IskljucenjeDodatnihRizka;
    @FindBy(css= "label[for='Kol3_75']")
    WebElement IskljucenjeDodatnihRizkaLabel;
    @FindBy(id= "Kol3_74")
    WebElement UkljucenjeDodatnihRizika;
    @FindBy(css= "label[for='Kol3_74']")
    WebElement UkljucenjeDodatnihRizikaLabel;
    @FindBy(css= "label[for='Kol3_73']")
    WebElement SmanjenjeTrajanjaLabel;
    @FindBy(id= "Kol3_73")
    WebElement SmanjenjeTrajanja;
    @FindBy(id= "Kol3_72")
    WebElement PovecanjeTrajanja;
    @FindBy(css= "label[for='Kol3_72']")
    WebElement PovecanjeTrajanjaLabel;
    @FindBy(id= "Kol3_2")
    WebElement PromenaSportaZanimanjaHobija;
    @FindBy(css= "label[for='Kol3_2']")
    WebElement PromenaSportaZanimanjaHobijaLabel;
    @FindBy(id= "Kol3_3")
    WebElement PromenaDinamike;
    @FindBy(css= "label[for='Kol3_3']")
    WebElement PromenaDinamikeLabel;
    @FindBy(css= "label[for='Kol3_70']")
    WebElement SmanjenjePremijeLabel;
    @FindBy(id= "Kol3_70")
    WebElement SmanjenjePremije;
    @FindBy(id= "Kol3_71")
    WebElement PovecanjePremije;
    @FindBy(css= "label[for='Kol3_71']")
    WebElement PovecanjePremijeLabel;
    @FindBy(id= "Kol3_8")
    WebElement Redukcija;
    @FindBy(css= "label[for='Kol3_8']")
    WebElement RedukcijaLabel;
    @FindBy(id= "Kol3_69")
    WebElement SmanjenjeOsiguraneSume;
    @FindBy(css= "label[for='Kol3_69']")
    WebElement SmanjenjeOsiguraneSumeLabel;
    @FindBy(css= "label[for='Kol3_68']")
    WebElement PovecanjeOsiguraneSumeLabel;
    @FindBy(id= "Kol3_68")
    WebElement PovecanjeOsiguraneSume;


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
