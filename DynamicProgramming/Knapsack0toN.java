package DynamicProgramming;

import java.util.Scanner;

public class Knapsack0toN {

	 public static int knapSack01(int[] wt, int[] val, int W, int n, int[][] dp) {
	        if (n == 0 || W == 0) {
	            return 0;
	        }

	        if (dp[n][W] != -1) return dp[n][W];

	        if (wt[n - 1] <= W) {
	            int op1 = val[n - 1] + knapSack01(wt, val, W - wt[n - 1], n, dp);
	            int op2 = knapSack01(wt, val, W, n - 1, dp);
	            return dp[n][W] = Math.max(op1, op2);
	        }

	        return dp[n][W] = knapSack01(wt, val, W, n - 1, dp);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int w = scanner.nextInt();
	        int[] wt = new int[n];
	        int[] val = new int[n];
	        int[][] dp = new int[n + 1][w + 1];

	        for (int i = 0; i < n; i++) {
	            wt[i] = scanner.nextInt();
	        }

	        for (int i = 0; i < n; i++) {
	            val[i] = scanner.nextInt();
	        }

	        for (int i = 0; i < n + 1; i++) {
	            for (int j = 0; j < w + 1; j++) {
	                dp[i][j] = -1;
	            }
	        }

	        System.out.println(knapSack01(wt, val, w, n, dp));
	    }
}
