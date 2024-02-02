package Graph;

import java.util.Scanner;

public class CountIslands {
	  boolean isSafe(int M[][], int row, int col, boolean visited[][]) {
	        int ROW = M.length;
	        int COL = M[0].length;
	        return (row >= 0) && (row < ROW) && (col >= 0)
	                && (col < COL) && (M[row][col] == 1 && !visited[row][col]);
	    }

	    void DFS(int M[][], int row, int col, boolean visited[][]) {
	        int ROW = M.length;
	        int COL = M[0].length;

	        int rowNbr[] = { -1, -1, -1, 0, 0, 1, 1, 1 };
	        int colNbr[] = { -1, 0, 1, -1, 1, -1, 0, 1 };

	        visited[row][col] = true;

	        for (int k = 0; k < 8; ++k)
	            if (isSafe(M, row + rowNbr[k], col + colNbr[k], visited))
	                DFS(M, row + rowNbr[k], col + colNbr[k], visited);
	    }

	    int countConnectedSets(int M[][]) {
	        int ROW = M.length;
	        int COL = M[0].length;

	        boolean visited[][] = new boolean[ROW][COL];

	        int count = 0;
	        for (int i = 0; i < ROW; ++i)
	            for (int j = 0; j < COL; ++j)
	                if (M[i][j] == 1 && !visited[i][j]) {
	                    DFS(M, i, j, visited);
	                    ++count;
	                }

	        return count;
	    }

	    public static void main(String[] args) throws java.lang.Exception {
	        Scanner scanner = new Scanner(System.in);

	      //  System.out.println("Enter the number of rows (m) and columns (n):");
	        int m = scanner.nextInt();
	        int n = scanner.nextInt();

	        if (m < 0 || n < 0) {
	            System.out.println("Invalid input. Number of rows and columns should be non-negative.");
	            return;
	        }

	        int[][] matrix = new int[m][n];

	      //  System.out.println("Enter the matrix elements (0 or 1) separated by spaces:");
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                int element = scanner.nextInt();
	                if (element < 0 || element > 1) {
	                    System.out.println("Invalid input. Matrix elements should be 0 or 1.");
	                    return;
	                }
	                matrix[i][j] = element;
	            }
	        }

	        CountIslands connectedSets = new CountIslands();
	        int result = connectedSets.countConnectedSets(matrix);
	        System.out.println(result);

	        scanner.close();
	    }
}
