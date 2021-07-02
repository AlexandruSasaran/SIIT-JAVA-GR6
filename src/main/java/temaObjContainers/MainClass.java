package temaObjContainers;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        Persoana pers1 = new Persoana("Andrei", 16);
        Persoana pers2 = new Student("Razvan", 22);
        Persoana pers3 = new Angajat("Alexandru", 29);
        Persoana pers4 = new Somer("Ion", 42);

        System.out.println("\nPersoanele ordonate dupa varsta: ");
        comparatorVarsta(pers1, pers2, pers3, pers4);

        System.out.println("\nPersoanele ordonate dupa nume: ");
        comparatorNume(pers1, pers2, pers3, pers4);

        Map<Persoana, List<Hobby>> hobbyPersoane = getPersoanaListMap(pers1, pers2, pers3, pers4);

        System.out.println("\n");
        afisareHobbySiLocatie(hobbyPersoane, pers1);
        afisareHobbySiLocatie(hobbyPersoane, pers2);
        afisareHobbySiLocatie(hobbyPersoane, pers3);
        afisareHobbySiLocatie(hobbyPersoane, pers4);
    }

    private static Map<Persoana, List<Hobby>> getPersoanaListMap(Persoana pers1, Persoana pers2, Persoana pers3, Persoana pers4) {
        Map<Persoana, List<Hobby>> hobbyPersoane = new HashMap<>();
        Tara tara1 = new Tara("Norvegia");
        Tara tara2 = new Tara( "Romania");
        Tara tara3 = new Tara("Croatia");
        Tara tara4 = new Tara("Italia");

        Adresa adresa1 = new Adresa("Tromsø", tara1);
        Adresa adresa2 = new Adresa("Carpati", tara2);
        Adresa adresa3 = new Adresa("litoral", tara3);
        Adresa adresa4 = new Adresa("Florenta", tara4);

        Hobby hobby1 = new Hobby("visitFjords", 1);
        Hobby hobby2 = new Hobby("hiking", 3);
        Hobby hobby3 = new Hobby("goingBeach", 2);
        Hobby hobby4 = new Hobby("visitHistoricalCities", 4);
        hobby1.addAdresa(adresa1);
        hobby2.addAdresa(adresa2);
        hobby3.addAdresa(adresa3);
        hobby4.addAdresa(adresa4);

        pers1.addHobby(hobby2);
        pers2.addHobby(hobby1);
        pers3.addHobby(hobby3);
        pers4.addHobby(hobby4);

        hobbyPersoane.put(pers1, pers1.getListaHobby());
        hobbyPersoane.put(pers2, pers2.getListaHobby());
        hobbyPersoane.put(pers3, pers3.getListaHobby());
        hobbyPersoane.put(pers4, pers4.getListaHobby());
        return hobbyPersoane;
    }

    private static void comparatorNume(Persoana pers1, Persoana pers2, Persoana pers3, Persoana pers4) {
        Set<Persoana> comparatorNume = new TreeSet<>(new ComparatorNume());
        comparatorNume.add(pers1);
        comparatorNume.add(pers2);
        comparatorNume.add(pers3);
        comparatorNume.add(pers4);
        for (Persoana persoane : comparatorNume){
            System.out.println(persoane.getNume() + " in varsta de " + persoane.getVarsta() + " ani");
        }
    }

    private static void comparatorVarsta(Persoana pers1, Persoana pers2, Persoana pers3, Persoana pers4) {
        Set<Persoana> comparatorVarsta = new TreeSet<>(new ComparatorVarsta());
        comparatorVarsta.add(pers1);
        comparatorVarsta.add(pers2);
        comparatorVarsta.add(pers3);
        comparatorVarsta.add(pers4);
        for (Persoana persoane : comparatorVarsta){
            System.out.println(persoane.getNume() + " " + persoane.getVarsta() + " ani");
        }
    }

    public static void afisareHobbySiLocatie(Map<Persoana, List<Hobby>> hobbyPersoane, Persoana persoana){
        List<Hobby> hobbies = hobbyPersoane.get(persoana);
        for (Hobby hobby : hobbies){
            Set<String> locatieHobby = new HashSet<>();
            Set<String> numeTara = new HashSet<>();
            List<Adresa> adrese = hobby.getListaAdrese();
            for (Adresa adresa : adrese){
                numeTara.add(adresa.getTara().getNume());
                locatieHobby.add(adresa.getLocatieHobby());
                }
            for (String tara : numeTara){
                System.out.println( persoana.getNume() + " practica " + hobby.getHobbyNume() + "  in " +
                        locatieHobby + ", " + tara);
            }
        }
    }
}
