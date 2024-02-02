package TwoDArrays;

import java.util.Scanner;

public class MatrixSearch {

	public static void matrixSearch(int[][] a, int m, int n, int Key) {
		boolean isnumfound = false;
		for(int i = 0; i<m ; i++) {
			for(int j = 0; j<n ; j++) {
				if(a[i][j] == Key) {
					isnumfound = true;
					System.out.print(1);
				}
			}
		}
		if(isnumfound == false) {
			System.out.println(0);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][]a = new int[m][n];
		
		for(int r = 0; r < m; r++) {
			for(int c = 0; c < n; c++) {
				a[r][c]=sc.nextInt();
			}
		}
		int x = sc.nextInt();
		
		matrixSearch(a,m,n,x);
	}

}
