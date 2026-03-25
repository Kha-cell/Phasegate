
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int targetNumber = generateRandomNumber();
        playGame(targetNumber);
    }

    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;

    private static void playGame(int targetNumber) {
        int attempts = 0;
        int maxAttempts = 5;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome");
        System.out.println("enter a  1 and 100.");

        while (attempts < maxAttempts) {
            int guess = getUserGuess(scanner);
            if (guess == -1) {
                continue;
            }

            attempts++;

            if (guess == targetNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                printRating(attempts);
                printSummary(targetNumber, attempts);
                return;
            } else if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        
        System.out.println("Sorry, you didn't guess the number. The correct answer was " + targetNumber);
        printRating(maxAttempts + 1);
        printSummary(targetNumber, maxAttempts);
    }

    