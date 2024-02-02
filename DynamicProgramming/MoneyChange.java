package DynamicProgramming;

import java.util.Scanner;

public class MoneyChange {

	 static final int mod = 1000000007;

	    static long coinChangeBottomUp(int[] coins, int value, int n) {
	        long[] dp = new long[value + 1];
	        dp[0] = 1;

	        for (int i = 0; i < n; i++) {
	            for (int j = coins[i]; j <= value; j++) {
	                dp[j] = (dp[j] + dp[j - coins[i]]) % mod;
	            }
	        }

	        return dp[value];
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int t = scanner.nextInt();
	        while (t-- > 0) {
	            int n = scanner.nextInt();
	            int[] coins = new int[n];
	            for (int i = 0; i < n; i++) {
	                coins[i] = scanner.nextInt();
	            }
	            int s = scanner.nextInt();
	            System.out.println(coinChangeBottomUp(coins, s, n));
	        }
	    }
}
