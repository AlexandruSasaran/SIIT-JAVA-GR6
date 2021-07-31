import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        PersonFiles ("src/main/resources/in.csv" , 10 , "src/main/resources/out.csv");
    }

    public static void PersonFiles (String fileIn , int month , String fileOut) throws FileNotFoundException {
        List<Person> personList = Person.readingFromFile (month, fileIn);
        Collections.sort (personList);
        sortingListFromFile (fileIn);
        writeToAnotherFile (personList , fileOut);
    }

    private static void writeToAnotherFile (List<Person> personList , String fileOut) {
        String filePath = fileOut;
        try (BufferedWriter writer = new BufferedWriter (new OutputStreamWriter (new FileOutputStream (filePath)))) {
            for (int i = 0; i < personList.size(); i++) {
                writer.write (String.valueOf( personList.get ( i ).getFirstName ( ) + " " + String.valueOf(personList.get (i).getLastName ()) + System.lineSeparator()));
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void sortingListFromFile (String fileIn) {
        String fileName = fileIn;
        List<String> list = new ArrayList<> ();
        try (Stream<String> stream = Files.lines (Paths.get(fileName))) {
            list = stream
                    .sorted ((o1,o2) -> o1.compareTo (o2))
                    .collect (Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
