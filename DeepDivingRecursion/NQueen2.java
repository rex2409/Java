package DeepDivingRecursion;

import java.util.Scanner;

public class NQueen2 {

	static int cnt = 0;

    // Helper function to check if it is safe to place the Queen in the board at cell i, j
    static boolean canPlace(int n, int i, int j, int[][] board) {
        // Check for column
        for (int row = 0; row < i; row++) {
            if (board[row][j] == 1) {
                return false;
            }
        }

        // Check for left diagonal
        int x = i, y = j;
        while (x >= 0 && y >= 0) {
            if (board[x][y] == 1) {
                return false;
            }
            x--;
            y--;
        }

        // Check for right diagonal
        x = i;
        y = j;
        while (x >= 0 && j < n) {
            if (board[x][y] == 1) {
                return false;
            }
            x--;
            y++;
        }

        // The position is safe
        return true;
    }

    static void NQueen(int n, int i, int[][] board) {
        // Base case
        if (i == n) {
            // Successfully placed all Queens
            // Print answer
            for (int row = 0; row < n; row++) {
                for (int col = 0; col < n; col++) {
                    if (board[row][col] == 1) {
                        System.out.print("{" + (row + 1) + "-" + (col + 1) + "} ");
                    }
                }
            }
            System.out.print(" ");
            cnt++;
            return;
        }

        // Recursive case
        // Try to place the queen in the current row and call on the remaining part

        for (int j = 0; j < n; j++) {
            // Check if i and jth position are safe or not for the queen
            if (canPlace(n, i, j, board)) {
                // Place the Queen -- Assuming that i, j is the right position
                board[i][j] = 1;

                NQueen(n, i + 1, board);

                // If isNextQueenValid is false, so we try for the next position using a loop
                // means i, j is not the right position (i.e., assumption is wrong)

                // Backtracking for the right position
                board[i][j] = 0;
            }
        }
        // You have tried all positions in the current row but couldn't place the queen
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Enter the number of Queens (N):");
        int n = scanner.nextInt();

        int[][] board = new int[100][100];
        NQueen(n, 0, board);

        System.out.println("\n" + cnt);
    }

}
