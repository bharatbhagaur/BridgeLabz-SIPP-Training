import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static int generateGuess(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }

    public static String getUserFeedback() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Is my guess too high, too low, or correct? ");
        return sc.nextLine().toLowerCase();
    }

    public static void main(String[] args) {
        int min = 1, max = 100;
        int guess;
        String feedback;

        System.out.println("Think of a number between 1 and 100!");
        do {
            guess = generateGuess(min, max);
            System.out.println("Computer guesses: " + guess);
            feedback = getUserFeedback();

            if (feedback.equals("high")) {
                max = guess - 1;
            } else if (feedback.equals("low")) {
                min = guess + 1;
            }
        } while (!feedback.equals("correct"));

        System.out.println("Computer guessed your number!");
    }
}
