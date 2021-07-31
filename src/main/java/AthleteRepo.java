import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class AthleteRepo {

    private AthleteRepo() {
    }

    private static List<Athlete> athleteList = new ArrayList<>();

    public static List readFromFileToList(String fileName) throws IOException {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
            String x;

            while ((x = reader.readLine()) != null) {
                if ((x.length() > 0)) {
                    String[] athletesArr = x.split(",");
                    athleteList.add(new Athlete(Integer.parseInt(athletesArr[0]), athletesArr[1], athletesArr[2], athletesArr[3], athletesArr[4], athletesArr[5], athletesArr[6]));
                }
            }
            for (Athlete a : athleteList) {
                System.out.println(a);
            }
        }
        return athleteList;
    }

    public static void calculareTimp(List<Athlete> athletesList) {
        System.out.println("Timpul final calculat (inclusiv ratari)."  + "\n" + "Clasamentul final: ");
        try {
            for (Athlete a : athletesList) {
                String[] string = a.getTime().split(":");
                int timeInSeconds = Integer.parseInt(string[0]) * 60 + Integer.parseInt(string[1]) + getLovituriRatate(a);
                int minutes = timeInSeconds / 60;
                int seconds = timeInSeconds % 60;
                String time = minutes + ":" + seconds;
                a.setTime(time);
            }
        } catch (NumberFormatException numEx) {
            System.out.println("Format incorect");
            numEx.printStackTrace();
        }
    }

    public static Athlete getCastigatori(List<Athlete> athleteList) {
        athleteList.sort(new AthleteComparator());
        int i = 0;
        while (i <= 2 && i < athleteList.size()) {
            switch (i) {
                case 0:
                    System.out.println("FirstPlace: " + athleteList.get(i));
                    break;
                case 1:
                    System.out.println("SecondPlace: " + athleteList.get(i));
                    break;
                case 2:
                    System.out.println("ThirdPlace: " + athleteList.get(i));
            }

            i++;
        }
        return athleteList.get(0);

    }

    private static int getLovituriRatate(Athlete athlete) {
        int timeInSeconds = 0;
        String[] stringA = athlete.getFirstShootingRange().split("");
        for (String s : stringA) {
            if (!(s.equals("o") || s.equals("x")))
                throw new IllegalArgumentException("Verificati poligonul 1 de trage din lista");
            if (s.equals("o"))
                timeInSeconds += 10;
        }
        String[] stringB = athlete.getSecondShootingRange().split("");
        for (String s : stringB) {
            if (!(s.equals("o") || s.equals("x")))
                throw new IllegalArgumentException("Verificati poligonul 2 de trage din lista");
            if (s.equals("o"))
                timeInSeconds += 10;
        }
        String[] stringC = athlete.getThirdShootingRange().split("");
        for (String s : stringC) {
            if (!(s.equals("o") || s.equals("x")))
                throw new IllegalArgumentException("Verificati poligonul 3 de trage din lista");
            if (s.equals("o"))
                timeInSeconds += 10;
        }
        return timeInSeconds;
    }

    public static List<Athlete> getAthleteList() {
        return athleteList;
    }
}

