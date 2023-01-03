
import java.util.ArrayList;

public class Ordleg {
    public static ArrayList gentagOrd(ArrayList<String> list, int k) throws Exception {
        if(k<=0 ){
            throw new Exception("Nul eller negative gentagninger");
        }
        if(list == null){
            throw new Exception("Arraylist er tom");
        }
        ArrayList<String> refactor = new ArrayList<>();
        for (String s : list) {
            for (int i = 0; i < k; i++) {
                refactor.add(s);
            }
        }
        return refactor;
    }

}
