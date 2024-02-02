package DynamicProgramming;

import java.util.Scanner;

public class Knapsack0to1 {

	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int s = scanner.nextInt();
	        int[] arr1 = new int[n];
	        int[] arr2 = new int[n];
	        long[][] dp = new long[n + 1][s + 1];

	        for (int i = 0; i < n; i++) {
	            arr1[i] = scanner.nextInt();
	        }

	        for (int i = 0; i < n; i++) {
	            arr2[i] = scanner.nextInt();
	        }

	        for (int i = 0; i <= n; i++) {
	            for (int j = 0; j <= s; j++) {
	                dp[i][j] = 0;
	            }
	        }

	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= s; j++) {
	                dp[i][j] = dp[i - 1][j]; // if j < arr1[i - 1] then also update
	                if (j >= arr1[i - 1]) {
	                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - arr1[i - 1]] + arr2[i - 1]);
	                }
	            }
	        }

	        System.out.println(dp[n][s]);
	    }
}
