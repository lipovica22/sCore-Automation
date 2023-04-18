package cSore_Mapping.Life.Tab;

import cSore_Mapping.Common.Pages.BasePage;
import core_class.CellCoordinateMatches.CellCoordinateMatchFactory;
import core_class.GridContols.GridBaseControl;
import core_class.GridContols.GridControl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Printouts  extends BasePage {


    public Printouts(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath= "//*[@id='Kol1']/div/div[1]/h4")
    WebElement PrintoutsLabel;
    @FindBy(id= "basic-grid_1")   WebElement PrintoutsGrid;

    public void PrintoutsLabel() throws Exception {}
    public void PrintoutsGrid(int colnumber, int rowNumber , String valuePrints) throws Exception {
       // List<int> brojReda = GridControl.getRowIndexByTextValue(PrintoutsGrid,3, new List<String>() { "saradnici" });
       // int odabraniRed = brojReda[0];
        GridBaseControl.ClickMenuCell(PrintoutsGrid, CellCoordinateMatchFactory.createNumber(colnumber, rowNumber), valuePrints);
    }

}