package FundamentalsOfJava;

import java.util.Scanner;

public class TakingUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ctrl + shift + o // this is for the java util package for scanner
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		System.out.println(p);
		
		boolean b = sc.nextBoolean();
		System.out.println(b);
		
		double d = sc.nextDouble();
		System.out.println(d);
		
		float f = sc.nextFloat();
		System.out.println(f);
		
	}

}
