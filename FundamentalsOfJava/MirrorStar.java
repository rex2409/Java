package FundamentalsOfJava;

import java.util.Scanner;

public class MirrorStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n<=10 && n>=0 && n%2!=0) {
			int s = 1;
				
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n-i-(n/2); j++) {
					System.out.print(" \t");
				}
				for(int k=1; k<=s; k++) {
					System.out.print("*\t");
				}
				if(s==n)
					break;
				s +=2;
			System.out.println();
			}
			System.out.println();
			for(int i=1; i<=n/2; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print(" \t");
				}
				for(int k=1; k<=s-2; k++) {
					System.out.print("*\t");
				}
				s -= 2;
				System.out.println();
			}
		}
	}
}
