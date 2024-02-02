package DeepDivingRecursion;

import java.util.Scanner;

public class SudokuSolver {

	// Helper function to check if a number can be placed in a given cell
    static boolean canPlace(int[][] mat, int i, int j, int n, int number) {
        // Check row and column
        for (int x = 0; x < n; x++) {
            if (mat[x][j] == number || mat[i][x] == number) {
                return false;
            }
        }

        // Check sub-grid
        int rn = (int) Math.sqrt(n);
        int sx = (i / rn) * rn;
        int sy = (j / rn) * rn;

        for (int x = sx; x < sx + rn; x++) {
            for (int y = sy; y < sy + rn; y++) {
                if (mat[x][y] == number) {
                    return false;
                }
            }
        }
        return true;
    }

    // Function to solve the Sudoku puzzle
    static boolean solveSudoku(int[][] mat, int i, int j, int n) {
        // Base case
        if (i == n) {
            // Print the Sudoku matrix
            for (int row = 0; row < n; row++) {
                for (int col = 0; col < n; col++) {
                    System.out.print(mat[row][col] + " ");
                }
                System.out.println();
            }
            return true;
        }

        // Case for when the row ends
        if (j == n) {
            return solveSudoku(mat, i + 1, 0, n);
        }

        // Skip pre-filled cells
        if (mat[i][j] != 0) {
            return solveSudoku(mat, i, j + 1, n);
        }

        // Recursive case
        // Fill the current cell with a possible option (number)
        for (int number = 1; number <= 9; number++) {
            // Check if the number can be placed in the current cell
            if (canPlace(mat, i, j, n, number)) {
                // Assume the current number is the answer (may be true or false)
                mat[i][j] = number;

                // Check if we are able to solve Sudoku
                boolean couldWeSolve = solveSudoku(mat, i, j + 1, n);

                if (couldWeSolve) {
                    return true;
                }
            }
        }

        // Backtrack here
        mat[i][j] = 0;
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      //  System.out.println("Enter the size of Sudoku (N):");
        int N = scanner.nextInt();
        int[][] mat = new int[N][N];

     //   System.out.println("Enter the Sudoku matrix (0 for empty cells):");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        if (!solveSudoku(mat, 0, 0, N)) {
            System.out.println("No solution exists.");
        }
    }

}
