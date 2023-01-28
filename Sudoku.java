import java.util.*;

public class Sudoku {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int dimension = sc.nextInt();   


            Cell[][] arrayCells = new Cell[dimension][dimension];
            for (int i = 0; i < arrayCells.length; i++) {
                for (int j = 0; j < arrayCells[i].length; j++) {
                    arrayCells[i][j] = new Cell(dimension);
                }
            }
            
            for (Cell[] row: arrayCells) {
                for (Cell cell: row) {
                    int input = sc.nextInt();
                    if (input != 0) {
                        cell.setCandidates(input);
                    }
                }
            }
            System.out.println(Arrays.deepToString(arrayCells));
            
            //elimination of candidates in row
            for (Cell[] row: arrayCells) {
                Row currentRow = new Row(row);
                currentRow.eliminateCandidates();
            }

            //elimination of candidates in column
            for (int column = 0; column < arrayCells[0].length; column++) {
                List<Cell> columnCells = new ArrayList<>();
                for (int row = 0; row < arrayCells.length; row++) {
                    columnCells.add(arrayCells[row][column]);
                    Column currentColumn = new Column(columnCells);
                    currentColumn.eliminateCandidates();
                }
            }

            for (int i = 0; i < arrayCells.length; i++) {
                System.out.println(Arrays.toString(arrayCells[i]));
            }
        }
    }
}