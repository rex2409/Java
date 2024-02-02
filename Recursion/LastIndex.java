package Recursion;

import java.util.Scanner;

public class LastIndex {

	 static int lastIndex(int[] a, int n, int i, int M) {
	        // Base Case
	        if (i == n) {
	            return -1;
	        }

	        // Recursive Case
	        int index = lastIndex(a, n, i + 1, M);

	        if (index != -1) {
	            return index;
	        } else if (a[i] == M) {
	            return i;
	        } else {
	            return -1;
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       // System.out.println("Enter the size of the array:");
	        int n = scanner.nextInt();
	        int[] a = new int[n];

	        //System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            a[i] = scanner.nextInt();
	        }

	    //    System.out.println("Enter the element to find:");
	        int M = scanner.nextInt();

	        int ans = lastIndex(a, n, 0, M);

	        System.out.println(ans);
	    }

}
