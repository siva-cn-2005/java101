package PracticeProgram;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have picked a number between 1 and 100. Try to guess it!");

        int target = (int)(Math.random() * 100) + 1;
        int guess;
        int attempts = 0;
        int maxAttempts = 4;

        while (attempts < maxAttempts) {
            System.out.print("\nEnter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < target) {
                System.out.println("Too low! Try again.");
            } else if (guess > target) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Correct! You guessed the number " + target + " in " + attempts + " attempts.");
                break;
            }

            // If it's the last attempt and still incorrect
            if (attempts == maxAttempts) {
                System.out.println("\nYou've used all 4 attempts. The number was: " + target);
            }
        }

        scanner.close();
    }
}

