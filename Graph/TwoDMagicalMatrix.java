package Graph;

import java.util.Scanner;

public class TwoDMagicalMatrix {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int T = scanner.nextInt(); // Number of test cases

	        if (T <= 0 || T >= 6) {
	          //  System.out.println("Number of test cases (T) should be between 1 and 5 (exclusive).");
	            return;
	        }

	        for (int t = 0; t < T; t++) {
	            int N = scanner.nextInt(); // Dimension of the matrix N X N

	            if (N <= 0 || N >= 1009) {
	               // System.out.println("Dimension of the matrix (N) should be between 1 and 1008 (exclusive).");
	                return;
	            }

	            int[][] matrix = new int[N][N];

	            // Input matrix values
	            for (int i = 0; i < N; i++) {
	                for (int j = 0; j < N; j++) {
	                    matrix[i][j] = scanner.nextInt();
	                }
	            }

	            int result = countConnectedSets(matrix);
	            System.out.println(result);
	        }

	        scanner.close();
	    }

	    public static int countConnectedSets(int[][] matrix) {
	        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
	            return 0;
	        }

	        int rows = matrix.length;
	        int cols = matrix[0].length;
	        int count = 0;

	        boolean[][] visited = new boolean[rows][cols];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                if (matrix[i][j] == 1 && !visited[i][j]) {
	                    dfs(matrix, visited, i, j);
	                    count++;
	                }
	            }
	        }

	        return count;
	    }

	    private static void dfs(int[][] matrix, boolean[][] visited, int row, int col) {
	        int[] rowOffsets = {-1, -1, -1, 0, 1, 1, 1, 0};
	        int[] colOffsets = {-1, 0, 1, 1, 1, 0, -1, -1};

	        visited[row][col] = true;

	        for (int i = 0; i < 8; i++) {
	            int newRow = row + rowOffsets[i];
	            int newCol = col + colOffsets[i];

	            if (isValid(matrix, newRow, newCol) && matrix[newRow][newCol] == 1 && !visited[newRow][newCol]) {
	                dfs(matrix, visited, newRow, newCol);
	            }
	        }
	    }

	    private static boolean isValid(int[][] matrix, int row, int col) {
	        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[0].length;
	    }
}
