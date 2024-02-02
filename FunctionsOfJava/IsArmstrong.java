package FunctionsOfJava;

import java.util.Scanner;

public class IsArmstrong {

	public static int numOfDigits(long n) {
		int order = 0;
		while(n!=0) {
			n/=10;
			++order;
		}
		return order;
	}
	public static void isArm(long n) {
		int order = numOfDigits(n);
		long num = 0;
		long temp = n;
		
		while(temp!=0) {
			int rem = (int) (temp % 10);
			num+= Math.pow(rem, order);
			temp/=10;
		}
		if(n==num) {
			System.out.println("true");
		}
		else
			System.out.println("false");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long n;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextLong();
		
		isArm(n);
	}

}
