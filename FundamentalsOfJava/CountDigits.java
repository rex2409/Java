package FundamentalsOfJava;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,rem,count=0;
		
		Scanner sc = new Scanner(System.in);
		
		n=sc.nextInt();
		
		int digit = sc.nextInt();
		
		while(n!=0) {
			rem = n%10;
			n=n/10;
			if(rem == digit) {
				count++;
			}
		}
		System.out.println(count);
	}

}
