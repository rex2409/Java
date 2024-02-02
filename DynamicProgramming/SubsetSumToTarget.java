package DynamicProgramming;

import java.util.Scanner;

public class SubsetSumToTarget {

	   static boolean[][] dp;

	    static boolean subsetSum(int[] a, int n, int k) {
	        if (k == 0)
	            return true;

	        if (n <= 0 || k < 0)
	            return false;

	        if (dp[n][k])
	            return true;

	        if (k >= a[n - 1])
	            return dp[n][k] = subsetSum(a, n - 1, k - a[n - 1]) || subsetSum(a, n - 1, k);

	        return dp[n][k] = subsetSum(a, n - 1, k);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int k = scanner.nextInt();

	        int[] a = new int[n];
	        for (int i = 0; i < n; i++) {
	            a[i] = scanner.nextInt();
	        }

	        dp = new boolean[n + 1][k + 1];

	        if (subsetSum(a, n, k)) {
	            System.out.println("Yes");
	        } else {
	            System.out.println("No");
	        }
	    }
}
