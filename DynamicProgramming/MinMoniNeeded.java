package DynamicProgramming;

import java.util.Scanner;

public class MinMoniNeeded {

	  static long minCost(int[] val, int[] wt, int n, int W) {
	        long[] dp = new long[W + 1];
	        dp[0] = 0;

	        for (int i = 1; i <= W; i++) {
	            dp[i] = Long.MAX_VALUE;
	            for (int j = 0; j < n; j++) {
	                if (wt[j] <= i && val[j] != -1) {
	                    dp[i] = Math.min(dp[i], dp[i - wt[j]] + val[j]);
	                }
	            }
	        }
	        return dp[W] == Long.MAX_VALUE ? -1 : dp[W];
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int w = scanner.nextInt();

	        int[] val = new int[w];
	        int[] wt = new int[w];

	        for (int i = 0; i < w; i++) {
	            int currCost = scanner.nextInt();
	            if (currCost != -1) {
	                val[i] = currCost;
	                wt[i] = i + 1;
	            }
	        }

	        System.out.println(minCost(val, wt, w, w));
	    }
}
