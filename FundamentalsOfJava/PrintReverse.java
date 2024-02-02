package FundamentalsOfJava;

import java.util.Scanner;

public class PrintReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num =0, count = 0;
		int n = sc.nextInt();
		int n1 = n;
		
		while(n!=0) {
			n/=10;
			count++;
		}
		while(n1!=0) {
			int rem = n1 % 10;
			count--;
			num = (int) (num +rem*Math.pow(10, count));
			n1 = n1/10;
		}
		System.out.println(num);
	}

}
