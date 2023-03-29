package cSore_Mapping.Life.Tab;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clauses extends BasePage {


    public Clauses(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/div/div/label")
    WebElement AdditionalClausesAndExclusionsLabel;
    @FindBy(id= "Kol1")
    WebElement AdditionalClausesAndExclusions;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/div[1]/div/label")
    WebElement DocumentNoteLabel;
    @FindBy(id= "Kol3")
    WebElement DocumentNote;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/div[3]/div/label")
    WebElement DocumentNote2Label;
    @FindBy(id= "Kol11")
    WebElement DocumentNote2;
    @FindBy(id= "Kol10")
    WebElement AddNote;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[8]/div/div/label")
    WebElement InvoiceNoteLabel;
    @FindBy(id= "Kol8")
    WebElement InvoiceNote;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[6]/div/div/label")
    WebElement InternalNoteLabel;
    @FindBy(id= "Kol5")
    WebElement InternalNote;

    @FindBy(id= "li_Kol2_45")
    WebElement _30DanaStorno;
    @FindBy(css= "label[for='li_Kol2_45']")
    WebElement _30DanaStornoLabel;
    @FindBy(id= "li_Kol2_51")
    WebElement ValutnaKlauzula;
    @FindBy(css= "label[for='li_Kol2_51']")
    WebElement ValutnaKlauzulaLabel;
    @FindBy(id= "li_Kol2_2018")
    WebElement ZastitaPodataka;
    @FindBy(css= "label[for='li_Kol2_2018']")
    WebElement ZastitaPodatakaLabel;
    @FindBy(id= "li_Kol2_71")
    WebElement ZastitaPotrosaca;
    @FindBy(css= "label[for='li_Kol2_71']")
    WebElement ZastitaPotrosacaLabel;
    @FindBy(id= "li_Kol2_1786")
    WebElement InformacijeZaUgovaraca;
    @FindBy(css= "label[for='li_Kol2_1786']")
    WebElement InformacijeZaUgovaracaLabel;

    public void AdditionalClausesAndExclusionsLabel() throws Exception {}
    public void AdditionalClausesAndExclusions() throws Exception {}

    public void DocumentNoteLabel() throws Exception {}
    public void DocumentNote() throws Exception {}

    public void DocumentNote2Label() throws Exception {}
    public void DocumentNote2() throws Exception {}
    public void AddNote() throws Exception {}

    public void InvoiceNoteLabel() throws Exception {}
    public void InvoiceNote() throws Exception {}

    public void InternalNoteLabel() throws Exception {}
    public void InternalNote() throws Exception {}

    public void _30DanaStorno() throws Exception {}
    public void _30DanaStornoLabel() throws Exception {}
    public void ValutnaKlauzula() throws Exception {}
    public void ValutnaKlauzulaLabel() throws Exception {}
    public void ZastitaPodataka() throws Exception {}
    public void ZastitaPodatakaLabel() throws Exception {}
    public void ZastitaPotrosaca() throws Exception {}
    public void ZastitaPotrosacaLabel() throws Exception {}
    public void InformacijeZaUgovaraca() throws Exception {}
    public void InformacijeZaUgovaracaLabel() throws Exception {}



}

