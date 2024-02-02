package TwoDArrays;

import java.util.Scanner;

public class RowWavePrint {

	public static void wave(int[][] a, int m, int n) {
		int sr = 0, sc = 0, er = m-1, ec = n-1;
		while(sr<=er) {
			if(sr%2==0) {
				int col;
				for(col = sc; col<=ec; col++) {
					System.out.print(a[sr][col]+", ");
				}
				sr++;
			}
			else {
				int col;
				for(col = ec; col>=sc;col--) {
					System.out.print(a[sr][col]+", ");
				}
				sr++;
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
