public class FestivalAttendeeThread extends Thread {

    TicketType ticketType;
    private Integer participantID = 0;
    FestivalGate gate = new FestivalGate();

    public FestivalAttendeeThread(TicketType ticket, FestivalGate gate){
        this.ticketType = ticket;
        this.gate = gate;
    }
    public void run(){
        gate.updateQueue(this.ticketType);
        this.participantID = gate.getNrParticipanti() + 1;
    }
}
