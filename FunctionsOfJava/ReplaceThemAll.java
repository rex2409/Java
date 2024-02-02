package FunctionsOfJava;

import java.util.Scanner;

public class ReplaceThemAll {
	
	public static long replace(long n) {
		long rem, new_num = 0, place = 0;
		
		if(n==0) {
			n=5;
		}
		while(n!=0) {
			rem = n%10;
			
			if(rem==0) {
				rem = 5;
			}
			n/=10;
			new_num=(long) (new_num + rem*Math.pow(10, place));
			place++;
		}
		System.out.println(new_num);
		return new_num;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long n;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextLong();
		
		replace(n);
		System.out.println();
	}

}
