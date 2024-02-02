package FunctionsOfJava;

import java.util.Scanner;

public class BostonNumbers {

	public static int sumDigit(int n) {
		int sum = 0;
		while(n!=0) {
			int rem = n%10;
			sum+=rem;
			n/=10;
		}
		return sum;
	}
	
	public static int primeFactor(int n) {
		int sum = 0;
		for(int i = 2; i*i<=n; i++) {
			while(n%i==0) {
				n/=i;
				sum+=sumDigit(i);
			}
		}
		if(sum==0) {
			return sum;
		}
		if(n>1) {
			sum+=sumDigit(n);
		}
		return sum;
	}
	
	public static void boston(int n) {
		int sumn, sumPrime;
		sumn = sumDigit(n);
		sumPrime = primeFactor(n);
		
		if(sumPrime == sumn) {
			System.out.print(1);
		}
		else
			System.out.print(0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		boston(n);
		System.out.println();
	}

}
