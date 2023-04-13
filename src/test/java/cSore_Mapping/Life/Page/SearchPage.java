package cSore_Mapping.Life.Page;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='form1']/div[4]/div[2]/div/div/div[9]/div[1]/div/label")
    WebElement dateFromLabel;
    @FindBy(xpath = "//*[@id='form1']/div[4]/div[2]/div/div/div[9]/div[2]/div/label")
    WebElement dateToLabel;
    @FindBy(className = "ob_gH")
    WebElement searchGridHeader;
    @FindBy(className = "ob_gFl")
    WebElement searchGrid;
    @FindBy(className = "ob_gBody")
    WebElement searchGridResult;
    @FindBy(id = "grid_menu_2_2")
    WebElement searchGridAction;
    @FindBy(className = "ob_gMCont")
    WebElement filterGrid;
    @FindBy(id = "selDocumentType")
    WebElement tipDokumenta;
    @FindBy(id = "ctl00$ContentPlaceHolder1$Kol2_uc$grid_2$ob_grid_2FilterContainer$ctl02$ob_grid_2FilterControl3")
    WebElement brojDokumenta;
    @FindBy(id = "selStatus")
    WebElement status;
    @FindBy(xpath = "//*[@id='ContentPlaceHolder1_Kol2_uc_grid_2_ob_grid_2BodyContainer']/div/table/tbody/tr[1]/td[33]/div/div/span/a/img")
    WebElement tockic;
    @FindBy(xpath = "//*[@id='grid_row_button_14']/a")
    WebElement akcije;


    //-------------------- Methods --------------------
    public void DateFromLabel() throws Exception {
    }

    public void DateFrom() throws Exception {
    }

    public void DateToLabel() throws Exception {
    }

    public void DateTo() throws Exception {
    }

    public void SearchGridHeader() throws Exception {
    }

    public void SearchGrid() throws Exception {
    }

    public void SearchGridResult() throws Exception {
    }

    public void SearchGridAction() throws Exception {
    }

    public void FilterGrid() throws Exception {
    }

    public void TipDokumenta() throws Exception {
    }

    public void BrojDokumenta() throws Exception {
    }

    public void Status() throws Exception {
    }

    public void Tockic() throws Exception {
    }

    public void Akcije() throws Exception {
    }


    //-------------------- End Methods --------------------
}

