package DeepDivingRecursion;

import java.util.Scanner;

public class ChaseCheese {

	 static boolean ratInMaze(char[][] a, int[][] sol, int i, int j, int m, int n) {

	        if (i == m && j == n) {
	            sol[i][j] = 1;

	            // print solution
	            for (int row = 0; row <= m; row++) {
	                for (int col = 0; col <= n; col++) {
	                    System.out.print(sol[row][col] + " ");
	                }
	                System.out.println();
	            }
	            System.out.println();
	            return true;
	        }

	        if (i > m || j > n || i < 0 || j < 0) {
	            return false;
	        }

	        // this is because you stuck in a loop
	        // first go left then up and then right then down and so on…
	        // you also have to handle this case
	        // to handle this case
	        // use this condition
	        // if(sol[i][j]==1) return false;

	        if (a[i][j] == 'X' || sol[i][j] == 1) {
	            return false;
	        }

	        sol[i][j] = 1;

	        boolean rightSuccess = ratInMaze(a, sol, i, j + 1, m, n);
	        boolean downSuccess = ratInMaze(a, sol, i + 1, j, m, n);
	        boolean leftSuccess = ratInMaze(a, sol, i, j - 1, m, n);
	        boolean upSuccess = ratInMaze(a, sol, i - 1, j, m, n);

	        if (rightSuccess || downSuccess || leftSuccess || upSuccess) {
	            return true;
	        }

	        sol[i][j] = 0;

	        return false;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the number of rows and columns:");
	        int m = scanner.nextInt();
	        int n = scanner.nextInt();

	        char[][] a = new char[m][n];
	        int[][] sol = new int[m][n];

	        System.out.println("Enter the maze:");
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                a[i][j] = scanner.next().charAt(0);
	            }
	        }

	        boolean k = ratInMaze(a, sol, 0, 0, m - 1, n - 1);

	        if (!k) {
	            System.out.println("NO PATH FOUND");
	        }
	    }
}
