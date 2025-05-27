package Q_6;

import java.util.Scanner;
import java.util.Random;

public class Q6  {
    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1; // random number between 1 and 100

        Scanner scanner = new Scanner(System.in);
        int guess = 0;

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        while (guess != randomNumber) {
            System.out.print("Enter your guess: ");

            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();

                if (guess < 1 || guess > 100) {
                    System.out.println("Please guess a number between 1 and 100.");
                } else if (guess < randomNumber) {
                    System.out.println("Too low! Try a higher number.");
                } else if (guess > randomNumber) {
                    System.out.println("Too high! Try a lower number.");
                } else {
                    System.out.println("Congratulations! You guessed the number.");
                }
            } else {
                System.out.println("That's not a valid number. Please enter an integer.");
                scanner.next();
            }
        }

        scanner.close();
    }
}
