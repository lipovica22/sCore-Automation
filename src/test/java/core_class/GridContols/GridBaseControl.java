package core_class.GridContols;

import cSore_Mapping.BasePage;
import org.openqa.selenium.*;
import java.util.ArrayList;
import java.util.List;

public class GridBaseControl extends BasePage {

    public static List<GridDataCollection> listGridDataCollection = new ArrayList<>();
    public int totalRows;
    public static int totalColumns;
    public WebDriver driver;

    public GridBaseControl(WebDriver webElement) {
        super(webElement);
    }

    public List<GridDataCollection> getListGridDataCollection() {
        return listGridDataCollection;
    }

    public void setListGridDataCollection(List<GridDataCollection> listGridDataCollection) {
        this.listGridDataCollection = listGridDataCollection;
    }

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    public static int getTotalColumns() {
        return totalColumns;
    }

    public void setTotalColumns(int totalColumns) {
        this.totalColumns = totalColumns;
    }

    /*public void readGrid(WebElement element) {
        try {
            List<WebElement> cells;
            List<WebElement> header;
            List<WebElement> rows;

            try {
                rows = element.findElements(By.tagName("tr"));
            } catch (NoSuchElementException ex) {
                rows = null;
            }

            try {
                header = rows.get(0).findElements(By.tagName("th"));
            } catch (NoSuchElementException ex) {
                header = null;
            }

            try {
                int colNumber1 = 0;
                int fieldIndex1 = 0;
                int n = 1;
                if (header.size() == 0) {
                    n = 0;
                }
                for (int rowNumber = n; rowNumber < rows.size(); rowNumber++) {
                    cells = rows.get(rowNumber).findElements(By.tagName("td"));
                    colNumber1 = 0;
                    for (WebElement cell : cells) {

                        GridDataCollection gridData = new GridDataCollection(cell);
                        gridData.setRowNumber(rowNumber);
                        gridData.setColNumber(colNumber1);
                        gridData.colName = (header.size() == 0 ? "" : header.get(colNumber1).getText());
                        gridData.fieldValue = cell.getText();
                        gridData.fieldIndex = fieldIndex1;
                    }
                    fieldIndex1++;
                    colNumber1++;
                }

                setTotalColumns(colNumber1);
                setTotalRows(rows.size());
            } catch (NoSuchElementException ex) {

            }
        } catch (NotFoundException ex) {
            throw new NotFoundException("Grid Control Read Grid Issue.", ex);
        }
    }*/

    public static WebElement findCell(WebElement element, ICellCoordinateMatch cellCoordinateMatch) {
        webElement = element;
        try {
            int index = listGridDataCollection.stream()
                    .filter(cellCoordinateMatch::isTarget)
                    .mapToInt(GridDataCollection::getFieldIndex)
                    .findFirst().orElse(-1);

            return listGridDataCollection.get(index).webElement;
        } catch (NotFoundException ex) {
            throw new NotFoundException("Grid Control Find Cell Issue.", ex);
        }
    }

    public boolean IsCellChecked(WebElement element, String log, ICellCoordinateMatch cellCoordinateMatch) {
        try {
            return findCell(element, cellCoordinateMatch).isSelected();
        } catch (NotFoundException e) {
            throw new NotFoundException("Grid Control Is Cell Checked Issue. " + log);
        } catch (org.openqa.selenium.ElementClickInterceptedException ex) {
            throw new ElementClickInterceptedException("Grid Control Is Cell Checked Issue. " + log);
        }
    }

    public static void ClickMenuCell(WebElement element, ICellCoordinateMatch cellCoordinateMatch, String elementName) {
        try {
            findCell(element.findElement(By.tagName("a")), cellCoordinateMatch);

            try {

                List<WebElement> menuList = new ArrayList<>(element.findElements(By.tagName("a")));
                for (WebElement element1 : menuList) {
                    if (element1.getText().equals(elementName)) {
                        element1.click();
                        break;
                    }
                }
            } catch (NotFoundException ex) {
                throw new NotFoundException("Menu Control Click Issue.", ex);
            }
        } catch (NotFoundException ex) {
            throw new NotFoundException("Grid Control Click Cell Issue.", ex);
        }
    }
/*
    public void ClicOnCell(WebElement element, int rowNumber, int cellNumber) {


        // Pronalaženje tablice po tagu "table"
        WebElement table = element;
        java.util.List<WebElement> rows = table.findElements(By.tagName("tr"));

        for (int i = 0; i < rows.size(); i++) {

            // Pronalaženje svih ćelija (kolona) u trenutnom redu
            java.util.List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));

            // Iteracija kroz sve kolone u trenutnom redu
            for (int j = 0; j < columns.size(); j++) {

                // Čitanje teksta u trenutnoj ćeliji
                String cellText = columns.get(j).getText();

                // Ispisivanje teksta u konzolu

            }System.out.println("Red " + (1) + ", Kolona " + (1) + ": " + cellText);
        }


        WaitTime.WaitForElementNotToBeVisible(driver, "id", "modal_mask");
    }*/
}