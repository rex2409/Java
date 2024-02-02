package FundamentalsOfJava;

import java.util.Scanner;

public class SumOddEvenPlaced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		int n1 = n;
		
		while(n!=0) {
			int rem = n%10;
			sum = sum + rem;
			n=n/100;
		}
		System.out.println(sum);
		
		sum = 0;
		while(n1!=0) {
			n1 = n1/10;
			int rem = n1%10;
			sum = sum+rem;
			n1=n1/10;
		}
		System.out.println(sum);
	}

}
