import java.util.LinkedList;
import java.util.Queue;

public class FestivalGate {
    private Integer nrParticipanti = 0;
    private Integer nrBileteFull = 0;
    private Integer nrBileteFullVip = 0;
    private Integer nrBileteOneDay = 0;
    private Integer nrBileteOneDayVip = 0;
    Queue<TicketType> listaParticipanti = new LinkedList<>();

    public Integer getNrParticipanti(){
        this.nrParticipanti = listaParticipanti.size();
        return this.nrParticipanti;
    }

    public void updateQueue(TicketType bilet){
        listaParticipanti.add(bilet);
        switch (bilet){
            case FULL -> this.nrBileteFull++;
            case FULL_VIP -> this.nrBileteFullVip++;
            case ONE_DAY -> this.nrBileteOneDay++;
            case ONE_DAY_VIP -> this.nrBileteOneDayVip++;
            default -> System.out.println("Bilet invalid");
        }
    }

    public Integer getNrBileteFull() {
        return nrBileteFull;
    }

    public Integer getNrBileteFullVip() {
        return nrBileteFullVip;
    }

    public Integer getNrBileteOneDay() {
        return nrBileteOneDay;
    }

    public Integer getNrBileteOneDayVip() {
        return nrBileteOneDayVip;
    }
}
