package TwoDArrays;

import java.util.Scanner;

public class SpiraliAntiPrint {

	public static void antiSpiralPrint(int[][] arr, int r, int c){
		
		int sr = 0, sc = 0, er = r-1, ec = c-1;
		while(sc<=ec&&sr<=er){
			
			//int col,row;
			
			for(int row = sr; row<=er;row++) {
				System.out.print(arr[row][sc]+", ");
			}
			sc++;
			
			for(int col = sc; col<=ec; col++) {
				System.out.print(arr[er][col]+", ");
			}
			er--;
			
			
			
			if(sc<=ec) {
				for(int row = er; row>=sr;row--) {
					System.out.print(arr[row][ec]+", ");
				}
				ec--;	
			}
			
			if(sr<=er) {
				
				for(int col = ec; col>=sc;col--) {
					System.out.print(arr[sr][col]+", ");
				}
				sr++;
			}
			
			
		}
		System.out.println("END");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		int[][]arr = new int[r][c];
		
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		antiSpiralPrint(arr,r,c);
		
	}
}
