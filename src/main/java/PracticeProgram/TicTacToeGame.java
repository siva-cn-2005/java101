package PracticeProgram;

import java.util.Scanner;

public class TicTacToeGame {
    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        initializeBoard();

        System.out.println("Welcome to Tic-Tac-Toe!");
        printBoard();

        char currentPlayer = 'X';
        boolean gameEnded = false;

        while (!gameEnded) {
            System.out.println("\nPlayer " + currentPlayer + ", enter row (0-2): ");
            int row = sc.nextInt();
            System.out.println("Player " + currentPlayer + ", enter col (0-2): ");
            int col = sc.nextInt();

            if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != '-') {
                System.out.println("Invalid move! Try again.");
                continue;
            }

            board[row][col] = currentPlayer;
            printBoard();

            if (checkWin(currentPlayer)) {
                System.out.println("\nPlayer " + currentPlayer + " wins! Congratulations!");
                gameEnded = true;
            }

            else if (isBoardFull()) {
                System.out.println("\nIt's a draw!");
                gameEnded = true;
            }
            else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }

        sc.close();
    }

    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public static void printBoard() {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print("  ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Check if board is full
    public static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') return false;
            }
        }
        return true;
    }


    public static boolean checkWin(char player) {

        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player &&
                    board[i][1] == player &&
                    board[i][2] == player) ||

                    (board[0][i] == player &&
                            board[1][i] == player &&
                            board[2][i] == player)) {
                return true;
            }
        }

        if ((board[0][0] == player &&
                board[1][1] == player &&
                board[2][2] == player) ||

                (board[0][2] == player &&
                        board[1][1] == player &&
                        board[2][0] == player)) {
            return true;
        }

        return false;
    }
}

