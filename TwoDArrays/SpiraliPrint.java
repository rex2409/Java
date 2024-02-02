package TwoDArrays;

import java.util.Scanner;

public class SpiraliPrint {

	public static void spiralPrint(int[][] arr, int r, int c){
		
		int sr = 0, sc = 0, er = r-1, ec = c-1;
		while(sc<=ec&&sr<=er){
			//print sr(sc->ec) sr++
			int col,row;
			
			for(col = sc; col<=ec; col++) {
				System.out.print(arr[sr][col]+", ");
			}
			sr++;
			
			//print ec(sr->er) ec--
			
			for(row = sr; row<=er;row++) {
				System.out.print(arr[row][ec]+", ");
			}
			ec--;
			
			if(sr<=er) {
				//print er(ec->sc) er--
				for(col = ec; col>=sc;col--) {
					System.out.print(arr[er][col]+", ");
				}
				er--;
			}
			
			if(sc<=ec) {
				//print sc(er->sr)sc++
				for(row = er; row>=sr;row--) {
					System.out.print(arr[row][sc]+", ");
				}
				sc++;
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
		spiralPrint(arr,r,c);
		
	}

}
