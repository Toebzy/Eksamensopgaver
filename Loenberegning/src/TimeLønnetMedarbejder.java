public class TimeLønnetMedarbejder implements Betaling {
    private int antalTimer=12;
    private int timeLøn=200;


    @Override
    public double beregnLøn() {
        double løn = antalTimer*timeLøn;
        return løn;
    }
}
