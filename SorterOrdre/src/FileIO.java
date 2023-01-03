import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class FileIO {
    public static Scanner scan;
    static File Ord = new File ("Data/ordFil.csv");
    static ArrayList<String> ord = new ArrayList();

    public static void toList(){
        try {
            scan = new Scanner(Ord);
            String[] values = scan.nextLine().split(",");
            for(String s : values){
                ord.add(s.toLowerCase());
            }
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println(ord);
    }
    public static void Sorter(ArrayList<String> toSort){
        int i = toSort.size();
        for(String s : toSort){
            //if (s)
        }
    }
}
