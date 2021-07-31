public class BirthDate {
    String year;
    String month;
    String day;

    public BirthDate(String year, String month ,String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString () {
        return "BirthDate{" +
                "year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'' +
                '}';
    }
}
