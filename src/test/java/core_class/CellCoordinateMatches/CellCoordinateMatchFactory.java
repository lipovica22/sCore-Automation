package core_class.CellCoordinateMatches;

import core_class.GridContols.ICellCoordinateMatch;

public class CellCoordinateMatchFactory {

    public static ICellCoordinateMatch createNumber(int colNumber, int rowNumber) {
        return new NumberCellCoordinateMatch(colNumber, rowNumber);
    }

    public  ICellCoordinateMatch createName(String colName, int rowNumber) {
        return new NameCellCoordinateMatch(colName, rowNumber);
    }
}
