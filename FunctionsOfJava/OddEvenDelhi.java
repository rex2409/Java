package FunctionsOfJava;

import java.util.Scanner;

public class OddEvenDelhi {

	public static void oddEven(int no) {
		int e_sum=0;//even
		int o_sum=0;//odd
		while(no!=0) {
			int rem = no%10;
			if(no%2==0) {
				e_sum = e_sum+rem;
			}
			else
				o_sum=o_sum + rem;
			no/=10;
		}
		if(o_sum%3 == 0 || e_sum%4 == 0) {
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, no;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			no = sc.nextInt();
			
			oddEven(no);
		}
		System.out.println();
	}

}
