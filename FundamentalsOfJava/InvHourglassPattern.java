package FundamentalsOfJava;

import java.util.Scanner;

public class InvHourglassPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i,j;
		
		for(i=0;i<=n;i++) {
			for(j=n;j>=n-i;j--) {
				System.out.print(j+" ");
			}
			for(j=0;j<2*(n-i)-1;j++) {
				System.out.print("  ");
			}
			for(j=n-i;j<=n;j++) {
				if(j!=0)
					System.out.print(j+" ");
			}
			System.out.println();
		}
		for(i=n-1;i>=0;i--) {
			for(j=n;j>=n-i;j--) {
				System.out.print(j+" ");
			}
			for(j=0;j<2*(n-i)-1;j++) {
				System.out.print("  ");
			}
			for(j=n-i;j<=n;j++)
				System.out.print(j+" ");
			System.out.println();
			}
	}

}
