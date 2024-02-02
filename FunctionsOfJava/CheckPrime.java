package FunctionsOfJava;

import java.util.Scanner;

public class CheckPrime {

	public static boolean checkPrime(int n) {

		int i=2;
		
		while(i <= n-1) {
			if (n % i == 0) {
				//System.out.println("Not Prime");
				return false;
			}
			i++;
		}
		//if(n==i)
			//System.out.println("Prime");
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		boolean ans = checkPrime(num);
		if(ans == true) {//also can write just ans
			System.out.println("Prime!");
		}
		else
			System.out.println("Not Prime!");
		
		//System.out.println(ans);
	}

}
