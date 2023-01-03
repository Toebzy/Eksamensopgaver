public class Main {
    public static void main(String[] args) {
        ProvisionsMedarbejder Morten = new ProvisionsMedarbejder();
        TimeLønnetMedarbejder Joe = new TimeLønnetMedarbejder();

        System.out.println(Morten.beregnLøn());
        System.out.println(Joe.beregnLøn());
    }
}