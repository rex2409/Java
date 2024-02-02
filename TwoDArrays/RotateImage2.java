package TwoDArrays;

import java.util.Collections;
import java.util.Scanner;

public class RotateImage2 {

	public static void rotate(int[][] a,int n) {
		
		for (int row = 0; row < n; row++) {
            for (int col = 0; col < n / 2; col++) {
                // Swap elements using a temporary variable
                int temp = a[row][col];
                a[row][col] = a[row][n - 1 - col];
                a[row][n - 1 - col] = temp;
            }
        }
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n;j++) {
				if(i<j) {
					 int temp = a[i][j];
	                 a[i][j] = a[j][i];
	                 a[j][i] = temp;
				}
			}
		}
		for(int row = 0;row<n;row++) {
			for(int col=0;col<n;col++) {
				System.out.print(a[row][col]+" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][]a = new int[n][n];
		
		for(int r = 0; r <n; r++) {
			for(int c = 0; c<n; c++) {
				a[r][c]=sc.nextInt();
			}
		}
		rotate(a,n);
	}

}
