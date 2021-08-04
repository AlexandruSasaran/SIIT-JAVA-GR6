import org.junit.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class AthleteTest {

    List<Athlete> athleteList = new ArrayList<>();
    Athlete athlete1 = new Athlete(15, "athlete1", "US", "29:10", "xxoxx", "xxxxx", "xxxxx");
    Athlete athlete2 = new Athlete(20, "athlete2", "DE", "30:10", "oooxx", "xooxx", "xxooo");

    @Before
    public void setAthleteList() {
        athleteList.add(athlete1);
        athleteList.add(athlete2);
    }


    @Test(expected = FileNotFoundException.class)
    public void readFromFileNotFound() throws IOException {

        AthleteRepo.readFromFileToList("TestResources/Abc.csv");
    }

    @Test
    public void calculateTime() {

        AthleteRepo.calculareTimp(athleteList);
        String s = "29:20";
        Assert.assertEquals(s, athlete1.getTime());
    }

    @Test
    public void AthleteComparator() {
        AthleteComparator comparator = new AthleteComparator();
        AthleteRepo.calculareTimp(athleteList);
        int v = comparator.compare(athleteList.get(0), athleteList.get(1));
        Assert.assertTrue(v > 0);
    }


    @Test
    public void getCastigatori() {
        AthleteRepo.calculareTimp(athleteList);
        Athlete athlete = AthleteRepo.getCastigatori(athleteList);
        Assert.assertSame(athlete1, athlete);
    }
}