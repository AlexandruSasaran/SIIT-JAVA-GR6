package temaObjContainers;

import java.util.Objects;

public class Adresa {
    private String locatieHobby;
    private Tara tara;

    public Adresa(String locatieHobby, Tara tara){
        this.locatieHobby = locatieHobby;
        this.tara = tara;
    }

    public Tara getTara(){
        return tara;
    }

    public String getLocatieHobby() {
        return locatieHobby;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adresa adresa = (Adresa) o;
        return Objects.equals(locatieHobby, adresa.locatieHobby) && Objects.equals(tara, adresa.tara);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locatieHobby, tara);
    }
}
