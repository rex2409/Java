package FundamentalsOfJava;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int num = 0,place = 0;
		while(n!=0) {
			int rem = n%8;
			num = (int) (num + rem*Math.pow(10,place));
			place++;
			n/=8;
		}
		System.out.println(num);
	}

}
