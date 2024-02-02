package DynamicProgramming;

public class KnapSack {

	private static int maxProfit(int[] weight, int[] price, int cap, int n, int[][] dp) {
		// TODO Auto-generated method stub

		if(cap == 0|| n== 0) {
			return 0;
		}
		
		if(dp[n][cap] != -1) {
			return dp[n][cap];
		}
		
		int rob = 0, leave = 0;
		
		if(weight[n-1]<=cap) {
			rob = maxProfit(weight, price, cap - weight[n-1], n-1, dp) + price[n-1];
		}
		
		leave = maxProfit(weight, price, cap, n-1, dp);
		
		return dp[n][cap] = Math.max(leave, rob);
	}
	
	private static int knapsackBU(int[] weight, int[] price, int cap, int n) {
		// TODO Auto-generated method stub

		int[][] dp = new int[n+1][cap+1];
		
		for(int r = 0; r<= n; r++) {
			dp[r][0] = 0;
		}
		
		for(int r = 1; r<=n; r++) {
			for(int c = 1; c<= cap; c++) {
				int rob = 0, leave = 0;
				
				if(weight[r-1]<=c) {
					rob = dp[r-1][c - weight[r-1]] + price[r-1];
				}
				leave = dp[r-1][c];
				
				dp[r][c] = Math.max(leave, rob);
			}
		}
		
		return dp[n][cap];
	}
	
	public static void main(String[] args) {
		
		
		int[] wt = {1,1,1};
		int[] price = {10,20,30};
		
		int n = 3;
		int cap = 2;
		
//		int[][] dp = new int[n+1][cap+1];
//		for(int i = 0; i< dp.length; i++) {
//			for(int j=0; j<dp[0].length;j++) {
//				dp[i][j] = -1;
//			}
//		}
//		
//		System.out.println(maxProfit(wt,price,cap,n,dp));
		
		System.out.println(knapsackBU(wt, price, cap, n));
	}
	
	
}
