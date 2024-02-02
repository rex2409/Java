package FundamentalsOfJava;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int i=2;
		
		while(i <= num-1) {
			if (num % i == 0) {
				System.out.println("Not Prime");
				break;
			}
			i++;
		}
		if(num==i)
			System.out.println("Prime");
	}

}
