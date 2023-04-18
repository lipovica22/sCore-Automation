package core_class.CellCoordinateMatches;

import core_class.GridContols.GridDataCollection;
import core_class.GridContols.ICellCoordinateMatch;

public class NumberCellCoordinateMatch implements ICellCoordinateMatch {

    private  int _rowNumber;
    private  int _colNumber;

    public NumberCellCoordinateMatch(int colNumber, int rowNumber)
    {
        _colNumber = colNumber;
        _rowNumber = rowNumber;
    }

    public boolean IsTarget(GridDataCollection cell)
    {
        return cell.getColNumber() == _colNumber && cell.getRowNumber() == _rowNumber;
    }

    @Override
    public boolean isTarget(GridDataCollection cell) {
        return false;
    }
}
