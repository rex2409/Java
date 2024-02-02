package FundamentalsOfJava;

import java.util.Scanner;

public class PatternMagic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int i;//row
		int j;//col
		int k=0;//factor of col
		
		for(i=1;i<=n*2-1;i++) {
			if(i<=n) {
				k++;
			}
			else
				k--;
			for(j=1;j<=n*2-1;j++) {
				if(j<=n+1-k || j>=n-1+k)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

//https://www.youtube.com/watch?v=M2ofZTiLuBs for reference