import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 10;
        int rounds = 3;
        System.out.println("Welcome to Guess the Number!");
        System.out.println("Guess a number between " + lowerBound + " and " + upperBound);

        int totalScore = 0;

        for (int round = 1; round <= rounds; round++) {
            int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;
            int score = 0;

            System.out.println("\nRound " + round + ":");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    score = maxAttempts - attempts + 1;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            totalScore += score;
            System.out.println("The number was: " + targetNumber);
            System.out.println("Your score for this round: " + score);
        }

        System.out.println("\nGame over!");
        System.out.println("Total score: " + totalScore);

        scanner.close();
    }
}
