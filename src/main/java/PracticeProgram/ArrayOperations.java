package PracticeProgram;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 15, 8};

        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            sum += num;

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        double average = (double) sum / numbers.length;

        System.out.print("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nSum of elements: " + sum);
        System.out.println("Average of elements: " + average);
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}

