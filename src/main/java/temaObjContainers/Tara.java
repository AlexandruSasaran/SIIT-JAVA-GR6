package temaObjContainers;

import java.util.Objects;

public class Tara {
    private String nume;

    public Tara(String nume){
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tara tara = (Tara) o;
        return Objects.equals(nume, tara.nume);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
