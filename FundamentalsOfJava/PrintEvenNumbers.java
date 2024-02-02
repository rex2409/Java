package FundamentalsOfJava;

import java.util.Scanner;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // n is the range
		
		int i = 2;
		
		while (i <= n) {
			
			System.out.println(i + " is even");
			
			i += 2;
		}
	}

}
