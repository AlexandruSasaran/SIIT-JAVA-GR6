import junit.framework.TestCase;
import org.junit.Test;

public class FestivalMainTest extends TestCase {

    @Test
    public void testMain() {
        Integer nrParticipanti = 100;
        FestivalGate gate = new FestivalGate();
        FestivalStatisticsThread statsThread = new FestivalStatisticsThread(gate);

        for (int i = 0; i < nrParticipanti; i++) {
            TicketType ticketType = RandomTicket.RandomTicket();
            FestivalAttendeeThread festivalAttendee = new FestivalAttendeeThread(ticketType, gate);
            festivalAttendee.start();
        }
        statsThread.start();
        assertTrue(true);
    }
}