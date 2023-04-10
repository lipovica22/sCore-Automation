package core_class;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class GridBaseControl extends BasePage {

    public List<GridDataCollection> ListGridDataCollection = new ArrayList<GridDataCollection>();
    public int TotalRows;
    public int TotalColumns;

    WebDriver driver;

    public GridBaseControl(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    /*
    public void ReadGrid(WebElement element, String log)
    {
        try
        {
            List<WebElement> cells = new ArrayList<>();
            List<WebElement> header = new ArrayList<>();
            List<WebElement> rows = new ArrayList<>();

            try {
                rows = element.findElements(By.tagName("tr"));
            } catch (Exception ex) {
                rows = null;
            }

            try {
                header = rows.get(0).findElements(By.tagName("th"));
            } catch (Exception ex) {
                header = null;
            }

            try {
                int colNumber = 0;
                int fieldIndex = 0;
                int n = 1;
                if (header.size() == 0){
                    n = 0;
                }

                for (int rowNumber = n; rowNumber < rows.size(); rowNumber++) {
                    cells = rows.get(rowNumber).findElements(By.tagName("td"));
                    colNumber = 0;
                    for (WebElement cell: cells) {
                        ListGridDataCollection.add(new GridDataCollection(rowNumber, colNumber, header.size() == 0 ? "" : header.get(0).getText(), cell.getText(), fieldIndex, driver));

                        fieldIndex++;
                        colNumber++;
                    }
                }
                TotalColumns = colNumber;
                TotalRows = rows.size();
            } catch (Exception ex) {

            }
        } catch (NotFoundException ex) {
            throw new NotFoundException("Grid Control Read Grid Issue. " + ex.getMessage());
        }
    }
*/

}
