package temaObjContainers;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Persoana {
    private String nume;
    private int varsta;
    private List<Hobby> listaHobby = new ArrayList<>();

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public boolean addHobby(Hobby hobby){
        if (listaHobby.contains(hobby)) {
            return false;
        }
        listaHobby.add(hobby);
        return true;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public List<Hobby> getListaHobby() {
        return listaHobby;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoana persoana = (Persoana) o;
        return varsta == persoana.varsta && Objects.equals(nume, persoana.nume) && Objects.equals(listaHobby, persoana.listaHobby);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, varsta, listaHobby);
    }
}
