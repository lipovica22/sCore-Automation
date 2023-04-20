package cSore_Mapping.Common.Tab;

import cSore_Mapping.BasePage;
import core_class.CellCoordinateMatches.CellCoordinateMatchFactory;
import core_class.GridContols.GridBaseControl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrintoutsPage extends BasePage {
    public PrintoutsPage(WebDriver driver) {
                super(driver);
                PageFactory.initElements(driver, this);
            }

            @FindBy(xpath = "//*[@id='Kol1']/div/div[1]/h4")
            WebElement printoutsLabel;
            @FindBy(id = "basic-grid_1")
            WebElement printoutsGrid;

    @FindBy(css = "tbody[class='basic_grid_body']")
    WebElement  printGrid;
            //--------------------- Methods -----------------------

            public void PrintoutsLabel() throws Exception {
            }

            public void PrintoutsGrid() throws Exception {
            }

            public void PrintoutsGrid ( int colnumber, int rowNumber, String valuePrints) throws Exception {
                // List<int> brojReda = GridControl.getRowIndexByTextValue(PrintoutsGrid,3, new List<String>() { "saradnici" });
                // int odabraniRed = brojReda[0];
                GridBaseControl.ClickMenuCell(printoutsGrid, CellCoordinateMatchFactory.createNumber(colnumber, rowNumber), valuePrints);
            }
    public void printDocuments(String valuePrints) throws Exception {
        gridPrinting( printGrid, "Print: ", valuePrints);
    }

        //--------------------- EndMethods -----------------------
}

