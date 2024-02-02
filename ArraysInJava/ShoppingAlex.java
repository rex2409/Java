package ArraysInJava;

import java.util.Scanner;

public class ShoppingAlex {

	public static void shopping(int[] arr, int n, int A, int k) {
		int count = 0;
		for(int i = 0; i<n; i++) {
			if((A%arr[i])==0) {
				count++;
			}
		}
		if(count >= k) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int [n];
		
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int q,A,k;
		
		q = sc.nextInt();
		
		for(int i = 0; i<q; i++) {
			A = sc.nextInt();
			k = sc.nextInt();
			shopping(arr,n,A,k);
		}
	}

}
