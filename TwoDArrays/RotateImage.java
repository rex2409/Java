package TwoDArrays;

import java.util.Scanner;

public class RotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][]arr = new int[n][n];
		
		for(int r = 0; r <n; r++) {
			for(int c = 0; c<n; c++) {
				arr[r][c]=sc.nextInt();
			}
		}
		
		for(int r = 0; r<n ; r++) {
			int s = 0;
			int e = n-1;
			
			while(s<e) {
				int temp = arr[r][s];
				arr[r][s] = arr[r][e];
				arr[r][e] = temp;
				s++;
				e--;
			}
		}
		
		
		for(int r = 0; r<n;r++) {
			for(int c = 0;c<n;c++) {
				int temp = arr[r][c];
				arr[r][c] = arr[c][r];
				arr[c][r] = temp;
			}
		}
		
		for(int r= 0; r<n;r++) {
			for (int c = 0; c<n;c++) {
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
	}

}
