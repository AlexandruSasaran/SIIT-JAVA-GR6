package temaObjContainers;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Hobby {
    private String hobbyNume;
    private int frequency;
    private List<Adresa> listaAdrese = new ArrayList<>();

    public Hobby(String hobbyNume, int frequency) {
        this.hobbyNume = hobbyNume;
        this.frequency = frequency;
    }

    public boolean addAdresa(Adresa adresa){
        if (listaAdrese.contains(adresa)){
            return false;
        }
        listaAdrese.add(adresa);
        return true;
    }

    public String getHobbyNume() {
        return hobbyNume;
    }

    public List<Adresa> getListaAdrese() {
        return listaAdrese;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hobby hobby = (Hobby) o;
        return frequency == hobby.frequency &&
                Objects.equals(hobbyNume, hobby.hobbyNume) &&
                Objects.equals(listaAdrese, hobby.listaAdrese);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hobbyNume, frequency, listaAdrese);
    }
}

