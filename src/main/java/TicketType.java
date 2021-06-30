import java.util.Random;

public enum TicketType {
    FULL,
    FULL_VIP,
    ONE_DAY,
    ONE_DAY_VIP
}

class RandomTicket {
    public static TicketType RandomTicket(){
        Integer random = new Random().nextInt(4);

        switch (random) {
            case 0:
                return TicketType.FULL;
            case 1:
                return TicketType.FULL_VIP;
            case 2:
                return TicketType.ONE_DAY;
            case 3:
                return TicketType.ONE_DAY_VIP;
            default: return null;
        }
    }
}
