import java.util.Random;
import java.util.Scanner;

public class Menneskespiller implements Spiller {
    @Override
    public void gætEtTal(int max) {
        int input =-1;
        Random rand = new Random();     //new random
        int number = rand.nextInt(max);

        while(input!=number) {
            Scanner scan = new Scanner(System.in);
            input = scan.nextInt();     //scanner

            if (input == number) {
                System.out.println("You guessed correctly");
            }
            if(input>max){
                System.out.println("You guessed above the max");
            }else {
                System.out.println("you guessed incorrectly");
            }

        }

        System.out.println(number);     //system check
    }
}
