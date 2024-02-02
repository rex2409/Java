package DynamicProgramming;

import java.util.Arrays;

public class ClimbingStairs {
	
	
	private static int countWaysIter(int n) {
		// TODO Auto-generated method stub

		int[] dp = new int[n+1];
		dp[0] = 1;
		dp[1] = 1;
		
		for(int i = 2; i<= n ; i++) {
			//return choice1 = countWays2(n-1,dp) + choice2 = countWays2(n-2,dp);
			
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[n];
	}

	private static int countWays2(int n, int[] dp) {
		// TODO Auto-generated method stub

		if(n==0 || n==1) {
			return 1;
		}
		
		if(n<0) {
			return 0;
		}
		
		if(dp[n] != -1) {
			return dp[n];
		}
		
		int choice1 = countWays2(n-1,dp);
		int choice2 = countWays2(n-2,dp);
		
		return dp[n] = choice1+choice2;
	}
	
	public static int countWays(int currStep, int n, int [] dp) {//top down
			
			//+ve
			if(currStep == n) {
				return 1;
			}
			
			//-ve
			if(currStep>n) {
				return 0;
			}
			
			if(dp[currStep] != -1) {
				return dp[currStep];
			}
			
			
			int left = countWays(currStep+1,n,dp);
			
			int right = countWays(currStep+2,n,dp);
			
			dp[currStep] = left+right;
			
			return dp[currStep];
		}


	public static void main(String[] args) {
		
		int n = 40;
//		int[] dp = new int[n+1];// for way 1 & 2
//		
//		Arrays.fill(dp, -1);
		//System.out.println(countWays(0,n,dp));//for countWays1
		//System.out.println(countWays2(n,dp));
		
		System.out.println(countWaysIter(n));
	}
}
