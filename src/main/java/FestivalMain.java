public class FestivalMain {
    public static void main(String[] args) {
        Integer nrParticipanti = 100;
        FestivalGate gate = new FestivalGate();
        FestivalStatisticsThread statsThread = new FestivalStatisticsThread(gate);

        statsThread.start();

        for (int i = 0; i < nrParticipanti; i++){
            TicketType ticketType = RandomTicket.RandomTicket();
            FestivalAttendeeThread festivalAttendee = new FestivalAttendeeThread(ticketType, gate);
            festivalAttendee.start();
        }
    }
}
