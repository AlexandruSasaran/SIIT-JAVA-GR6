package temaObjContainers;

import java.util.Comparator;

public class ComparatorVarsta implements Comparator<Persoana> {

    @Override
    public int compare(Persoana o1, Persoana o2) {
        Integer comparedVarsta = o1.getVarsta();
        Integer comparedToVarsta = o2.getVarsta();
        return  comparedVarsta.compareTo(comparedToVarsta);
    }
}
