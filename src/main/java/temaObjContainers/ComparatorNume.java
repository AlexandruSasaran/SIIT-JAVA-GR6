package temaObjContainers;

import java.util.Comparator;

public class ComparatorNume implements Comparator<Persoana> {

    public int compare(Persoana o1, Persoana o2){
        return  o1.getNume().compareTo(o2.getNume());
    }
}
