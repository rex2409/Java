package DynamicProgramming;

import java.util.Arrays;

public class HouseRobber {

	private static int maxProfit(int[] houses, int curr, int n, int[] dp) {
		// TODO Auto-generated method stub

		if(curr>=n){
			return 0;
		}
		
		if(dp[curr] != -1) {
			return dp[curr];
		}
		
		int rob = maxProfit(houses,curr+2, n, dp) + houses[curr];
		int dontRob = maxProfit(houses,curr+1,n,dp);
		
		return dp[curr] = Math.max(rob, dontRob);
	}
	
	private static int maxProfit2(int[] houses, int n, int[] dp) {
		// TODO Auto-generated method stub

		if(n<= 0) {
			return 0;
		}
		
		if(dp[n] != -1) {
			return dp[n];
		}
		
		int rob = maxProfit2(houses,n-2, dp) + houses[n-1];
		int dontRob = maxProfit2(houses, n-1, dp);
		
		return dp[n] = Math.max(rob, dontRob);
	}
	
	private static int maxProfitIter(int[] houses,int n) {
		// TODO Auto-generated method stub

		int[] dp = new int[n+1];
		
		dp[0] = 0;
		dp[1] = houses[0];
		
		for(int i = 2; i<=n; i++) {
			int rob = dp[i-2] + houses[i-1];
			int dontRob = dp[i-1];
			
			dp[i] = Math.max(rob, dontRob);
		}
		return dp[n];
	}
	
	public static void main(String[] args) {
		int[] houses = {1,2,3,1};
		int n = houses.length;
//		int[] dp = new int[n+1];
//		Arrays.fill(dp, -1);
		
		//System.out.println(maxProfit(houses,0, n, dp));
		//System.out.println(maxProfit2(houses, n, dp));
		
		System.out.println(maxProfitIter(houses, n));
	}
}
