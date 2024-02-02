package TwoDArrays;

import java.util.Scanner;

public class ColumnWavePrint {

	public static void wave(int[][] a, int m, int n) {
		for(int col = 0;col < n; col++) {
			if(col%2==0) {
				for(int row = 0; row<m;row++) {
					System.out.print(a[row][col]+", ");
				}
			}
			else {
				for(int row = m-1; row>=0; row--) {
					System.out.print(a[row][col]+", ");
				}
			}
		}
		System.out.print("END");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] a = new int[m][n];
		
		for(int r = 0; r < m; r++) {
			for(int c = 0; c < n; c++) {
				a[r][c] = sc.nextInt();
			}
		}
		wave(a,m,n);
	}
}
