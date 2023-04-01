package cSore_Mapping.Life.Page;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search extends BasePage {
    public Search(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='form1']/div[4]/div[2]/div/div/div[9]/div[1]/div/label")
    WebElement DateFromLabel;

    @FindBy(xpath = "//*[@id='form1']/div[4]/div[2]/div/div/div[9]/div[2]/div/label")
    WebElement DateToLabel;

    @FindBy(className = "ob_gH")
    WebElement SearchGridHeader;
    @FindBy(className = "ob_gFl")
    WebElement SearchGrid;
    @FindBy(className = "ob_gBody")
    WebElement SearchGridResult;
    @FindBy(id = "grid_menu_2_2")
    WebElement SearchGridAction;
    @FindBy(className = "ob_gMCont")
    WebElement FilterGrid;

    @FindBy(id = "selDocumentType")
    WebElement TipDokumenta;
    @FindBy(id = "ctl00$ContentPlaceHolder1$Kol2_uc$grid_2$ob_grid_2FilterContainer$ctl02$ob_grid_2FilterControl3")
    WebElement BrojDokumenta;
    @FindBy(id = "selStatus")
    WebElement Status;
    @FindBy(xpath = "//*[@id='ContentPlaceHolder1_Kol2_uc_grid_2_ob_grid_2BodyContainer']/div/table/tbody/tr[1]/td[33]/div/div/span/a/img")
    WebElement Tockic;
    @FindBy(xpath = "//*[@id='grid_row_button_14']/a")
    WebElement Akcije;


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

