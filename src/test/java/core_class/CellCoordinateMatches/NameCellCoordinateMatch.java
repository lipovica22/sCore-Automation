package core_class.CellCoordinateMatches;

import core_class.GridContols.GridDataCollection;
import core_class.GridContols.ICellCoordinateMatch;

public class NameCellCoordinateMatch implements ICellCoordinateMatch {

    private  int _rowNumber;
    private  String _colName;

    public NameCellCoordinateMatch(String colName, int rowNumber)
    {
        _colName = colName;
        _rowNumber = rowNumber;
    }

    public boolean IsTarget(GridDataCollection cell)
    {
        return cell.getColName() == _colName && cell.getRowNumber() == _rowNumber;
    }

    @Override
    public boolean isTarget(GridDataCollection cell) {
        return false;
    }
}
