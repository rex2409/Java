package Recursion;

import java.util.Scanner;

public class SubsetSumEasy {

	 static boolean subsetSumEasy(int[] v, int i, int sum, boolean included) {
	        if (i == v.length) {
	            return sum == 0 && included;
	        }

	        boolean inc = subsetSumEasy(v, i + 1, sum + v[i], true);
	        boolean exc = subsetSumEasy(v, i + 1, sum, included);

	        return inc || exc;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       // System.out.println("Enter the number of test cases:");
	        int testCases = scanner.nextInt();

	        while (testCases-- > 0) {
	         //   System.out.println("Enter the size of the array:");
	            int n = scanner.nextInt();
	            int[] v = new int[n];

	           // System.out.println("Enter the elements of the array:");
	            for (int i = 0; i < n; i++) {
	                v[i] = scanner.nextInt();
	            }

	            if (subsetSumEasy(v, 0, 0, false)) {
	                System.out.println("Yes");
	            } else {
	                System.out.println("No");
	            }
	        }
	    }

}
