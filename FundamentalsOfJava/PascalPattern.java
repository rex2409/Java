package FundamentalsOfJava;

import java.util.Scanner;

public class PascalPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		/*
		 * for(int i = 0; i < n; i++) {
			int k = 1;
			for(int j = 0; j <= i; j++) {
				System.out.print(k+"\t");
				k = k*(i-j)/(j+1);
			}
			System.out.println();
		}
		*/
		int i,j;
		
		for(i=0;i<n;i++) {
			for(j=0;j<n-i;j++) {
				System.out.print("  ");
			}
			int no=1;
			for(j=0;j<=i;j++) {
				if(j==0||i==0)
					System.out.print(no + "   ");
				else {
					no=no*(i-j+1)/j;
					System.out.print(no + "   ");
				}
			}
			System.out.println();
		}
	}

}
