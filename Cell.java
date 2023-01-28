import java.util.*;

public class Cell {

    private Set<Integer> candidates;
    

    public Cell(int dimension) {
        this.candidates = new HashSet<Integer>();
        for (int i = 0; i < dimension; i++) {
            candidates.add(i + 1);
        }
    }

    public void izpisKandidatov() {
        System.out.println(candidates);
    }
    
    
    //known number in this cell -> set candidates to this num only
    public void setCandidates(Integer element) {
        this.candidates.clear();
        this.candidates.add(element);
        System.out.println(this.candidates);
    }

    public String toString() {
        return String.format("%s", candidates.toString());
    }




}