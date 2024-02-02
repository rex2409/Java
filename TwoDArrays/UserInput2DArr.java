package TwoDArrays;

import java.util.Scanner;

public class UserInput2DArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int[][]arr = new int[rows][cols];
		
		for(int r = 0; r <rows; r++) {
			for(int c = 0; c<cols; c++) {
				arr[r][c]=sc.nextInt();
			}
		}
		
		for(int r = 0; r <rows; r++) {
			for(int c = 0; c<cols; c++) {
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
		
	}

}
