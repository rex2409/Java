package ArraysInJava;

import java.util.Scanner;

public class FindLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr  = new int[n];
		
		for(int i = 0; i<n ; i++) {
			arr[i] = sc.nextInt();
		}
				
		int largest = Integer.MIN_VALUE;
		
		for(int i = 0; i<=n-1 ; i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}
		}
		System.out.println(largest);
	}

}
