import lombok.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Getter
@Setter
public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private BirthDate dateOfBirth;

    public Person (String firstName, String lastName, BirthDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public static List<Person> readingFromFile (int month, String fileIn) throws FileNotFoundException {
        List<Person> listPerson = new ArrayList<>();
        Scanner reader = new Scanner (new FileReader (fileIn));
        reader.useDelimiter ("\\s");

        while (reader.hasNextLine()){
            String line = reader.nextLine().trim();
            String[] words = line.split (" ");

            String firstName = words[0];
            String lastName = words[1];
            BirthDate dateOfBirth = new BirthDate (words[2].substring (0, 4), words[2].substring (5, 7), words[2].substring(8, 10));
            if (Integer.parseInt(dateOfBirth.month) == month) {
                listPerson.add (new Person(firstName, lastName, dateOfBirth));
            }
        }
        reader.close();
        return listPerson;
    }

    @Override
    public int compareTo (Person o) {
        return this.firstName.compareTo(o.firstName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
