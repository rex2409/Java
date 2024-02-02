package FundamentalsOfJava;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner binaryinput=new Scanner(System.in);
		//System.out.println("Enter the binary number-");
		int n=binaryinput.nextInt();
		int decimalnumber=0,power=0;
		while(n!=0) {
			decimalnumber+=((n%10)*Math.pow(2,power));
			n=n/10;
			power++;
		}
		System.out.println(decimalnumber);
	}

}
