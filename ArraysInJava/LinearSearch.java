package ArraysInJava;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		long[] arr  = new long[(int) n];
		
		for(long i = 0; i<n ; i++) {
			arr[(int) i] = sc.nextLong();
		}
		
		long size = arr.length;
		
		long key = sc.nextInt();
		long i;
		
		for(i = 0; i<size; i++) {
			if(arr[(int) i]==key) {
				System.out.println(i);
				break;
			}
		}
		//if(i==size)
			//System.out.println("Not present");
	}

}
