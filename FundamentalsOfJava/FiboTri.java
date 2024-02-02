package FundamentalsOfJava;

import java.util.Scanner;

public class FiboTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(a+"\t");
				int sum = a+b;
				a = b;
				b = sum;
			}
			System.out.println();
		}
	}

}
