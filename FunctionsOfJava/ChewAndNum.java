package FunctionsOfJava;

import java.util.Scanner;

public class ChewAndNum {

	public static long chewNo(long n) {
		long num = 0, rem, place = 0;
		while(n!=0) {
			rem = n%10;
			if(rem>9-rem) {
				if(rem == 9 && (n/10)==0) {
					//nothing
				}
				else
					rem = 9 - rem;
			}
			num = (long) (num + rem*Math.pow(10, place));
			n/=10;
			place++;
			
		}
		return num;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long n;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextLong();
		
		long res = chewNo(n);
		
		System.out.println(res);
	}

}
