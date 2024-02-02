package FundamentalsOfJava;

import java.util.Scanner;

public class LowerUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		char c = sc.next().charAt(0);

		if(c>='a' && c<='z')
			System.out.println("lowercase");
		else if(c>='A' && c<='Z')
			System.out.println("UPPERCASE");
		else
			System.out.println("Invalid");
	}

}
