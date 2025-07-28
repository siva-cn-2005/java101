package PracticeProgram;

import java.util.Scanner;

public class EligibilityCheacker{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
        System.out.println(age);

        if (age < 13) {
            System.out.println("You are a child.");
        } else if (age >= 13 && age <= 19) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are an adult.");

            if (age >= 65) {
                System.out.println("You are a senior citizen.");
            }
        }
    }
}

