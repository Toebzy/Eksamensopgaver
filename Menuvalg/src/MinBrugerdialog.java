import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MinBrugerdialog {
    public static void menuvalg(ArrayList<String> list) {
        int i = 1;
        for (String s : list) {
            System.out.println(i + "." + s);
            i++;
        }

        try {
            Scanner scan = new Scanner(System.in);
            int scannerInt = scan.nextInt();

            if (scannerInt == 1) {
                System.out.println("Agurk");
            }
            if (scannerInt == 2) {
                System.out.println("Tomat");
            }
            if (scannerInt == 3) {
                System.out.println("Salat");
            } else if (scannerInt < 1 || scannerInt > 3) {
                System.out.println("No such menu item");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
