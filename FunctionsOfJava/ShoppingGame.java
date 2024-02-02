package FunctionsOfJava;

import java.util.Scanner;

public class ShoppingGame {

	public static void shopping(int m,int n) {
		int i, j, sum1 = 0, sum2 = 0;
		
		for(i = 1; sum1<=m; i = i+2) {
			sum1 = sum1 + i;
		}
		for(j = 2; sum2<=n; j = j+2) {
			sum2 = sum2 + j;
		}
		if(i>j) {
			System.out.println("Aayush");
		}
		else
			System.out.println("Harshit");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t,m,n;
		
		Scanner sc = new Scanner(System.in);
		
		t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			m = sc.nextInt();
			n = sc.nextInt();
			shopping(m,n);
		}
	}

}
