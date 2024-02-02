package DynamicProgramming;

import java.util.Arrays;

public class CoinChangeWays {

	private static int ways(int[] coins, int n, int am, int[][] dp){
		// TODO Auto-generated method stub

		
		if(am == 0) {
			return 1;
		}
		
		if(n == 0) {
			return 0;
		}
		
		if(dp[am][n] != -1) {
			return dp[am][n];
		}
		
		int inc = 0, exc = 0;
		
		if(coins[n-1]<=am) {
			inc = ways(coins,n,am-coins[n-1],dp);
		}
		exc = ways(coins, n-1, am, dp);
		
		return dp[am][n]=inc+exc;
	}
	
	private static int waysBUP(int[] coins, int n, int am) {
		// TODO Auto-generated method stub

		int[][] dp = new int[am+1][n+1];
		for(int r=0; r<=am; r++) {
			dp[r][0] = 0;
		}
		for(int c = 0; c<=n; c++) {
			dp[0][c] = 1;
		}
		
		
		for(int r = 1; r<=am;r++) {
			for(int c = 1; c<=n; c++) {
				
				int inc = 0, exc = 0;
				
				if(coins[c-1]<=r) {
					inc = dp[r-coins[c-1]][c];
				}
				exc = dp[r][c-1];
				dp[r][c] = inc + exc;
				
			}
		}
		return dp[am][n];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] coins = {1,2,3};
		
		int n = coins.length;
		int am = 3;
		
//		int[][] dp = new int[am+1][n+1];
//		
//		for(int i = 0; i<=am ; i++) {
//			for(int j = 0; j<=n; j++) {
//				dp[i][j] = -1;
//			}
//		}
//		System.out.println(ways(coins, n, am, dp));
//		
//		System.out.println(Arrays.deepToString(dp));
		
		System.out.println(waysBUP(coins, n, am));
	}

}
