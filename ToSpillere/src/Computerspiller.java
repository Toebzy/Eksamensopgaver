import java.util.ArrayList;
import java.util.Random;
public class Computerspiller implements Spiller {
public int i;
public ArrayList guesses = new ArrayList();
    @Override
    public void gætEtTal(int max) {
        Random rand = new Random();
        int correct =rand.nextInt(max);
        int guess = rand.nextInt(max);

        while(guess!=correct) {
            guess = rand.nextInt(max);
            while(guesses.contains(guess)){
                guess = rand.nextInt(max);
            }
            if (guess == correct) {
                System.out.println("I have guessed the number after "+i+ " guesses");
                break;
            } else {
                System.out.println("Incorrect "+ guess);
                guesses.add(guess);
                i++;
            }
        }
    }
}
