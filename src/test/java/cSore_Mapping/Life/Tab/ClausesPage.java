package cSore_Mapping.Life.Tab;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClausesPage extends BasePage {
    public ClausesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/div/div/label")
    WebElement additionalClausesAndExclusionsLabel;
    @FindBy(id= "Kol1")
    WebElement additionalClausesAndExclusions;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/div[1]/div/label")
    WebElement documentNoteLabel;
    @FindBy(id= "Kol3")
    WebElement documentNote;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[3]/div[3]/div/label")
    WebElement documentNote2Label;
    @FindBy(id= "Kol11")
    WebElement documentNote2;
    @FindBy(id= "Kol10")
    WebElement addNote;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[8]/div/div/label")
    WebElement invoiceNoteLabel;
    @FindBy(id= "Kol8")
    WebElement invoiceNote;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[6]/div/div/label")
    WebElement internalNoteLabel;
    @FindBy(id= "Kol5")
    WebElement internalNote;
    @FindBy(css= "label[for='li_Kol2_45']")
    WebElement tridesetDanaStornoLabel;
    @FindBy(id= "li_Kol2_45")
    WebElement tridesetDanaStorno;
    @FindBy(id= "li_Kol2_51")
    WebElement valutnaKlauzula;
    @FindBy(css= "label[for='li_Kol2_51']")
    WebElement valutnaKlauzulaLabel;
    @FindBy(id= "li_Kol2_2018")
    WebElement zastitaPodataka;
    @FindBy(css= "label[for='li_Kol2_2018']")
    WebElement zastitaPodatakaLabel;
    @FindBy(id= "li_Kol2_71")
    WebElement zastitaPotrosaca;
    @FindBy(css= "label[for='li_Kol2_71']")
    WebElement zastitaPotrosacaLabel;
    @FindBy(id= "li_Kol2_1786")
    WebElement informacijeZaUgovaraca;
    @FindBy(css= "label[for='li_Kol2_1786']")
    WebElement informacijeZaUgovaracaLabel;

    //-------------------- Methods --------------------
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
    //-------------------- End Methods --------------------
}

