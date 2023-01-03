import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> ordleg = new ArrayList<>();
        ordleg.add("Hello");
        ordleg.add("World");
        int gentagninger = 5;
        try {
            System.out.println(Ordleg.gentagOrd(ordleg, gentagninger));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}