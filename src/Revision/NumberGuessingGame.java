package Revision;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;

        // Initialize the number of attempts
        int attempts = 0;

        // For Loop Example: Guess the number using a for loop
        System.out.println("Guessing the number using a for loop:");
        for (int i = 1; i <= 10; i++) {
            int guess = i;
            attempts++;
            if (guess == secretNumber) {
                System.out.println("You guessed it! The number was " + secretNumber);
                System.out.println("It took you " + attempts + " attempts.");
                break;
            } else {
                System.out.println("Try again! Your guess was " + guess);
            }
        }

        // While Loop Example: Guess the number using a while loop
        System.out.println("\nGuessing the number using a while loop:");
        int guess = 1;
        attempts = 0;
        while (guess <= 10) {
            attempts++;
            if (guess == secretNumber) {
                System.out.println("You guessed it! The number was " + secretNumber);
                System.out.println("It took you " + attempts + " attempts.");
                break;
            } else {
                System.out.println("Try again! Your guess was " + guess);
            }
            guess++;
        }

        // Do-While Loop Example: Guess the number using a do-while loop
        System.out.println("\nGuessing the number using a do-while loop:");
        guess = 1;
        attempts = 0;
        do {
            attempts++;
            if (guess == secretNumber) {
                System.out.println("You guessed it! The number was " + secretNumber);
                System.out.println("It took you " + attempts + " attempts.");
            } else {
                System.out.println("Try again! Your guess was " + guess);
            }
            guess++;
        } while (guess <= 10);

        // Interactive Guessing Game using a while loop
        System.out.println("\nLet's play an interactive guessing game!");
        Scanner scanner = new Scanner(System.in);
        attempts = 0;
        while (true) {
            System.out.print("Enter your guess (1-100): ");
            guess = scanner.nextInt();
            attempts++;
            if (guess == secretNumber) {
                System.out.println("You guessed it! The number was " + secretNumber);
                System.out.println("It took you " + attempts + " attempts.");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
    }
}
