import java.util.*;

public class Celica {

    private Set<Integer> kandidati;
    private int vrstica;
    private int stolpec;
    

    public Celica(int vrstica, int stolpec, int dimenzija) {
        this.kandidati = new HashSet<Integer>();
        for (int i = 0; i < dimenzija; i++) {
            kandidati.add(i + 1);
        }
        this.vrstica = vrstica;
        this.stolpec = stolpec;
    }

    public void izpisKandidatov() {
        System.out.println(kandidati);
    }
    
    //ce vemo, katera stevilka je v tej celici
    /**
     * @param gotovElement
     */
    public void nastaviKandidate(Integer gotovElement) {
        this.kandidati.clear();
        this.kandidati.add(gotovElement);
        System.out.println(this.kandidati);
    }

    public String toString() {
        return String.format("%s", kandidati.toString());
    }




}