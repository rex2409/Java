package DynamicProgramming;

import java.util.Scanner;

public class OptimalGameStrat {

	 static long[][] dp;

	    static long maxScore(long[] a, int i, int j) {
	        // base case
	        if (i > j) {
	            return 0;
	        }
	        if (dp[i][j] != -1) {
	            return dp[i][j];
	        }
	        // recursive case
	        long op1 = a[i] + Math.min(maxScore(a, i + 2, j), maxScore(a, i + 1, j - 1));
	        long op2 = a[j] + Math.min(maxScore(a, i, j - 2), maxScore(a, i + 1, j - 1));
	        long ans = Math.max(op1, op2);
	        return dp[i][j] = ans;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int n = scanner.nextInt();
	        long[] a = new long[n];

	        dp = new long[n][n];
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                dp[i][j] = -1;
	            }
	        }

	        for (int i = 0; i < n; i++) {
	            a[i] = scanner.nextLong();
	        }

	        System.out.println(maxScore(a, 0, n - 1));

	        scanner.close();
	    }
}
