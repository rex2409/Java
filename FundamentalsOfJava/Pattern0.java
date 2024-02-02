package FundamentalsOfJava;

import java.util.Scanner;

public class Pattern0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,j;
			
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				if(i==j || j==1)
					System.out.print(i + "\t");
				else
					System.out.print("0\t");
			}
			System.out.println();
		}
	}

}
