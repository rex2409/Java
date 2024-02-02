package TwoDArrays;

import java.util.Scanner;

public class TransposeArray {

	public static void transpose(int[][] a, int n) {
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n;j++) {
				if(i<j) {
					 int temp = a[i][j];
	                 a[i][j] = a[j][i];
	                 a[j][i] = temp;
				}
			}
		}
		for(int i = 0; i<n; i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
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
		transpose(a,n);
	}

}
