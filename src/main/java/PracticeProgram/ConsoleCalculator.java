package PracticeProgram;

import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Console Calculator ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }

               System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                // Perform operation
                double result;
                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        System.out.println("Result: " + result);
                        break;
                    case 2:
                        result = num1 - num2;
                        System.out.println("Result: " + result);
                        break;
                    case 3:
                        result = num1 * num2;
                        System.out.println("Result: " + result);
                        break;
                    case 4:
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("Result: " + result);
                        } else {
                            System.out.println("Error: Cannot divide by zero.");
                        }
                        break;
                    default:
                        System.out.println("Invalid choice! Please select 1 to 5.");
                }

        } while (true);

        sc.close();
    }
}