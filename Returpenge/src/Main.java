public class Main {
    public static void main(String[] args) {
        int pris = 100;
        int betalt =230;
        try {
            System.out.println(Butik.køb(pris, betalt));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}