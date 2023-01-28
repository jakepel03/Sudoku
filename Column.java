import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Column {

    private List<Cell> columnCells;

    public Column(List<Cell> columnCells) {
        this.columnCells = columnCells;
    }

    public void eliminateCandidates() {
        Set<Integer> usedNums = new TreeSet<>();
        for(Cell cell: columnCells) {
            int numberOfCandidates = cell.numberOfCandidates();
            //guaranteed element in column
            if (numberOfCandidates == 1) {
                int num = cell.getFirst();
                usedNums.add(num);
            }
        }
        //removing usedNums from each cell's candidates
        for (Cell cell: columnCells) {
            if (cell.numberOfCandidates() > 1) {
                cell.removeCandidates(usedNums);
            }
        }
    }
    
}
