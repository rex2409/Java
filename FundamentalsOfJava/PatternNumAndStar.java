package FundamentalsOfJava;

import java.util.Scanner;

public class PatternNumAndStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 1;
		int j = 1;
		int k = 1;
		int s = 1;
			
		for(i=1; i<=n; i++) {
			for(j=1; j<=n-i+1; j++) {
				System.out.print(j);
			}
			if(i != 1) {
				for(k=1; k<=s; k++) {
					System.out.print("*");
				}
				s += 2;
			}
			System.out.println();
		}
		
	}

}
