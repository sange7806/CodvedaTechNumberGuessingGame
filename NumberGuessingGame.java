import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1; // Random number between 1–100
        int attempts = 7;
        int guess;

        System.out.println("=== NUMBER GUESSING GAME ===");
        System.out.println("Guess a number between 1 and 100.");
        System.out.println("You have " + attempts + " attempts.");

        while (attempts > 0) {

            System.out.print("Enter your guess: ");

            // Input validation
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                continue;
            }

            guess = scanner.nextInt();
            attempts--;

            if (guess == numberToGuess) {
                System.out.println("🎉 Congratulations! You guessed the correct number.");
                break;
            }
            else if (guess > numberToGuess) {
                System.out.println("Too high!");
            }
            else {
                System.out.println("Too low!");
            }

            System.out.println("Attempts remaining: " + attempts);
        }

        if (attempts == 0) {
            System.out.println("Game Over! The correct number was: " + numberToGuess);
        }

        scanner.close();
    }
}