import java.sql.*;

public class Main {
    public static void main(String[] args) {

        AccomodationTable accomodationTable = new AccomodationTable();
        RoomFairTable roomFairTable = new RoomFairTable();
        AccomodationFairRelation accomodationFairRelation = new AccomodationFairRelation();

        accomodationTable.start();
        roomFairTable.start();
        accomodationFairRelation.start();

    }
}
