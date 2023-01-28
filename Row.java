import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Row {
    
    private Cell[] rowCells;

    public Row(Cell[] row) {
        this.rowCells = row;
    }

    public void eliminateCandidates() {
        Set<Integer> usedNums = new TreeSet<>();
        for (Cell cell: rowCells) {
            int numOfCandidates = cell.numberOfCandidates();
            //guaranteed element in row
            if (numOfCandidates == 1) {
                int num = cell.getFirst();
                usedNums.add(num);
            }
        }
        System.out.println(usedNums);
    }
}
