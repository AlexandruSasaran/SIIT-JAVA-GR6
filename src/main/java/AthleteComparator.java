import java.util.Comparator;

public class AthleteComparator implements Comparator<Athlete> {

    @Override
    public int compare(Athlete athlete, Athlete t1) {
        return athlete.getTime().compareTo(t1.getTime());
    }
}
