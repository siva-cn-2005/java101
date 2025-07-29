package PracticeProgram;

public class LoopPractice {
    public static void main(String[] args){
        System.out.println("Number from 1 to 10:");
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println();


        int sum = 0, i = 1;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("Sum of numbers from 1 to 100: " + sum);
        System.out.println();

        System.out.println("Multiplication Table:");
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 10; col++) {
                System.out.print(row + " x " + col + " = " + (row * col) + "\t");
            }
        }
    }
}
