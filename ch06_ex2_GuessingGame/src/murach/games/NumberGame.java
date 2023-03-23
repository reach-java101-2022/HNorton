package murach.games;

import java.util.Random;

public class NumberGame {
    private int number;
    private int guessCount;
    
    public NumberGame(int upperLimit) {
        Random random = new Random();
        number = random.nextInt(upperLimit + 1);
        guessCount = 1;
    }

    public int getNumber() {
        return number;
    }

    public int getGuessCount() {
        return guessCount;
    }
    
    public void incrementGuessCount() {
        guessCount = guessCount + 1;
    }
}