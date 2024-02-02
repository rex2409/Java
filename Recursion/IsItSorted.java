package Recursion;

import java.util.Scanner;

public class IsItSorted {
	  static boolean isSorted(int[] a, int n, int i) {
	        // Base case
	        if (i == n - 1) {
	            return true;
	        }

	        // Recursive case
	        boolean isSmallerSorted = isSorted(a, n, i + 1);

	        return isSmallerSorted && (a[i] <= a[i + 1]);
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

	        boolean ans = isSorted(a, n, 0);

	        if (ans) {
	            System.out.println("true");
	        } else {
	            System.out.println("false");
	        }
	    }

}
