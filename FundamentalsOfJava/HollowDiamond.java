package FundamentalsOfJava;

import java.util.Scanner;

public class HollowDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int i;//row
		int j;//col
		int k=0;//factor of col
		
		for(i=1;i<=n;i++) {
			if(i<=n/2+1) {
				k++;
			}
			else
				k--;
			for(j=1;j<=n;j++) {
				if(j<=((n/2)+2)-k || j>=n/2+k)
					System.out.print("*\t");
				else
					System.out.print(" \t");
			}
			System.out.println();
		}
	}

}
