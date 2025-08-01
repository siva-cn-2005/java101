package PracticeProgram;

public class MatrixOperation {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {4, 5, 6, 3},
                {7, 8, 9, 6}};

        int totalSum = 0;

        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
                totalSum += matrix[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum of all elements: " + totalSum);

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Sum of Row " + i + ": " + rowSum);
        }
        for (int j = 0; j < matrix[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < matrix.length; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Sum of Column " + j + ": " + colSum);
        }
    }
}
