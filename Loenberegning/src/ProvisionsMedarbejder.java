public class ProvisionsMedarbejder implements Betaling{
    private int grundLøn=20000;
    private int salg=10000;
    private double provision=0.2;

    @Override
    public double beregnLøn() {
        double løn = (salg*provision)+grundLøn;
        return løn;
    }
}
