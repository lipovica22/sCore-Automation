package core_class.GridContols;

import core_class.CellCoordinateMatches.CellCoordinateMatchFactory;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class GridControl extends GridBaseControl {

    protected GridControl(WebElement webElement) {
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
}
