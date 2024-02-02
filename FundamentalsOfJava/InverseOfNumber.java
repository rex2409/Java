package FundamentalsOfJava;

import java.util.*;
import java.lang.Math;

public class InverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int place = 1;
		int ans = 0;
		while(n!=0) {
			int rem = n%10;
			ans = (int) (ans+place*Math.pow(10,rem - 1));
			n = n/10;
			place++;
		}
		System.out.println(ans);
		
	}

}
