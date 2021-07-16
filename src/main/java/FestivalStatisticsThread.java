public class FestivalStatisticsThread extends  Thread {

    FestivalGate gate = new FestivalGate();

    public FestivalStatisticsThread(FestivalGate gate){
        this.gate = gate;
    }
    @Override
    public void run(){
        while (true){
            System.out.println("Participanti festival: ");
            System.out.println(gate.getNrParticipanti() + " people entered");
            System.out.println(gate.getNrBileteFull() + " people have full tickets");
            System.out.println(gate.getNrBileteFullVip()+ " have full VIP passes");
            System.out.println(gate.getNrBileteOneDay()+ " have one-day passes");
            System.out.println(gate.getNrBileteOneDayVip()+ " have one-day VIP passes");

            try{
                Thread.sleep(10*100);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
