import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        AthleteRepo.readFromFileToList("src/main/resources/AthleteList.csv");
        AthleteRepo.calculareTimp(AthleteRepo.getAthleteList());
        AthleteRepo.getCastigatori(AthleteRepo.getAthleteList());
    }
}