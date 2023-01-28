import java.util.*;

public class Sudoku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dimenzija = sc.nextInt();   


        Celica[][] tabelaCelic = new Celica[dimenzija][dimenzija];
        for (int i = 0; i < tabelaCelic.length; i++) {
            for (int j = 0; j < tabelaCelic[i].length; j++) {
                tabelaCelic[i][j] = new Celica(i, j, dimenzija);
                tabelaCelic[i][j].izpisKandidatov();
            }
        }

        System.out.println(Arrays.deepToString(tabelaCelic));
        
        for (Celica[] vrstica: tabelaCelic) {
            for (Celica celica: vrstica) {
                int vnos = sc.nextInt();
                if (vnos != 0) {
                    celica.nastaviKandidate(vnos);
                }
            }
        }
        System.out.println(Arrays.deepToString(tabelaCelic));


        
        
        
    }
}