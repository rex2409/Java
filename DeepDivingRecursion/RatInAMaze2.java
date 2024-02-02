package DeepDivingRecursion;

import java.util.Scanner;

public class RatInAMaze2 {

	 static boolean ratInAMaze(char[][] maze, int[][] soln, int i, int j, int n, int m) {
	        // base case
	        if (i == n && j == m) {
	            soln[n][m] = 1;
	            // print solution
	            for (int row = 0; row <= n; row++) {
	                for (int col = 0; col <= m; col++) {
	                    System.out.print(soln[row][col] + " ");
	                }
	                System.out.println();
	            }
	            System.out.println();
	            return true;
	        }

	        // recursive case
	        // Rat should be inside the grid
	        if (i > n || j > m) return false;

	        // cell is blocked
	        if (maze[i][j] == 'X') return false;

	        // Assume the solution exists through the current cell
	        soln[i][j] = 1;

	        boolean rightSuccess = ratInAMaze(maze, soln, i, j + 1, n, m);
	        if (rightSuccess) {
	            soln[i][j] = 0;
	            return true;
	        }

	        boolean downSuccess = ratInAMaze(maze, soln, i + 1, j, n, m);
	        if (downSuccess) {
	            soln[i][j] = 0;
	            return true;
	        }

	        // backtracking
	        soln[i][j] = 0;

	        return false;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       // System.out.println("Enter the number of rows and columns:");
	        int N = scanner.nextInt();
	        int M = scanner.nextInt();

	        char[][] maze = new char[N][M];
	        int[][] soln = new int[N][M];

	        //System.out.println("Enter the maze:");
	        for (int i = 0; i < N; i++) {
	            String row = scanner.next();
	            maze[i] = row.toCharArray();
	        }

	        boolean ans = ratInAMaze(maze, soln, 0, 0, N - 1, M - 1);

	        if (!ans) System.out.println("-1");
	    }
}
