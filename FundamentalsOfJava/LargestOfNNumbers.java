package FundamentalsOfJava;

import java.util.Scanner;

public class LargestOfNNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 0;
		int largest = Integer.MIN_VALUE;//- infinite integer range
		
		while(i < n) {
			int num = sc.nextInt();
			//System.out.println(num);
			
			if(num>largest) {
				largest = num;
			}
			i++;
		}
		System.out.println(largest);
		
	}

}
