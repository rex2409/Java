package TwoDArrays;

import java.util.Scanner;

public class DiagonalTraversal {

	public static void diagTraversal(int[][] a, int m, int n) {
		int i =0, j=0;
		
		boolean isUP = true;
		
		for(int k = 0;k<m*n;) {
			if(isUP) {
				for(;i>=0 && j<n; i--,j++) {
					System.out.print(a[i][j]+" ");
					k++;
				}
				if(i<0 && j<n) {
					i=0;
				}
				if(j==n) {
					i = i+2;
					j--;
				}
			}
			else {
				for(; j>=0&&i<m;j--,i++) {
					System.out.print(a[i][j]+" ");
					k++;
				}
				if(j<0&&i<m) {
					j=0;
				}
				if(i==m) {
					j = j+2;
					i--;
				}
			}
			isUP = !isUP;
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
		diagTraversal(a,m,n);
	}

}
