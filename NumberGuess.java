import java.util.*;
public class NumberGuess {
    public static void numberGuessingGame() {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100, guess;
        String feedback;
        while (true) {
            guess = low + (high - low) / 2;
            System.out.println("Is your number " + guess + "? (higher/lower/correct)");
            feedback = sc.next();
            if (feedback.equals("correct")) break;
            else if (feedback.equals("higher")) low = guess + 1;
            else high = guess - 1;
        }
        System.out.println("Guessed it!");
    }

    public static void main(String[] args){
        System.out.println("1. Number Guessing Game");
        numberGuessingGame();

    }
}
