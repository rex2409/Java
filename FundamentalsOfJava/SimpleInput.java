package FundamentalsOfJava;

import java.util.Scanner;

public class SimpleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int i,no,sum = 0;
		int n= 10000;
		
		for(i=0;i<n;i++) {
			no = sc.nextInt();
			
			sum = sum+no;
			if(sum<0) {
				break;
			}
			System.out.println(no);
		}
	}

}
