package core_class.GridContols;

import core_class.CellCoordinateMatches.CellCoordinateMatchFactory;
import org.openqa.selenium.*;

import java.util.ArrayList;
import java.util.List;

public class GridControl extends GridBaseControl {

    protected GridControl(WebDriver webElement) {
        super(webElement);
    }

    public static List<Integer> getRowIndexByTextValue(WebElement element, int columnIndex, List<String> textValue) {
        if (textValue.size() == 0) {
            return null;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < getTotalColumns(); i++) {
            boolean match = false;
            ICellCoordinateMatch cellCoordinateMatch = CellCoordinateMatchFactory.createNumber(columnIndex, i);
            String cellValue = findCell(element,cellCoordinateMatch).getText();
            if (cellValue != null) {
                match = true;
                for (String item : textValue) {
                    if (cellValue.contains(item)) {
                        match = match && true;
                    } else {
                        match = false;
                    }
                }
            }
            if (match) {
                result.add(i);
            }
        }
        return result;
    }
    public void SelectCellOption(WebElement element, ICellCoordinateMatch cellCoordinateMatch, String sel_option)
    {
        try
        {
            boolean isClicked = false;
            findCell(element,cellCoordinateMatch).click();
            List<WebElement> optionsToSelect = findCell(element,cellCoordinateMatch).findElements(By.cssSelector("option"));
            for (WebElement option : optionsToSelect)
            {
                if (option.getText() == sel_option)
                {
                    option.click();

                    isClicked = true;
                    break;
                }
            }
            if (!isClicked)
            {
                throw new NotFoundException("No such element to select.");
            }
        }

        catch (NotFoundException ex)
        {
            throw new NotFoundException("Grid Control  Select from List Cell Value Issue.", ex);
        }

        catch (ElementClickInterceptedException ex)
        {
            throw new ElementClickInterceptedException("Grid Control  Select from List Cell Value Issue.", ex);
        }
    }
}
