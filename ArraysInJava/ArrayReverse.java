package ArraysInJava;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		long[] arr  = new long[(int) n];
		
		for(long i = 0; i<n ; i++) {
			arr[(int) i] = sc.nextLong();
		}
		rev(arr);
	}
	
	public static void rev(long[] arr) {
		for(int i = arr.length-1; i>=0; i--) {
			System.out.println(arr[i]+" ");
		}
	}

}
