import java.sql.*;

public class AccomodationFairRelation extends Thread {
    public void run() {
        try {
            sleep(1000);
            try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Admin")) {
                PreparedStatement preparedStatement3 = connection.prepareStatement("INSERT INTO accomodation_fair_relation "
                        + "(id, id_accomodation, id_room_fair) values (?,?,?)");

                for (int i = 1; i <= 10; i++) {
                    preparedStatement3.setInt(1, i);
                    preparedStatement3.setInt(2, i);
                    preparedStatement3.setInt(3, i);
                    preparedStatement3.executeUpdate();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
