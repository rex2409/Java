package DynamicProgramming;

import java.util.Arrays;

public class FibN {

	private static int fib(int n, int[] dp) {//Top Down
		// TODO Auto-generated method stub

		if(n == 0 || n == 1) {
			return n;
		}
		
		if(dp[n] != -1) {
			return dp[n];
		}
		int fibN = fib(n-1,dp) + fib(n-2,dp);
		dp[n] = fibN;
		return fibN;//we can also write return dp[n] = fibN, removing the above line
		
	}
	
	private static int fibNIter(int n) {//bottom up
		// TODO Auto-generated method stub

		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i = 2; i<=n; i++) {
			//int fibN = fib(n-1,dp) + fib(n-2,dp);
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		return dp[n];
	}
	
	public static void main(String[] args) {
		int n = 45;
		
//		int[] dp = new int[n+1];
		
//		Arrays.fill(dp, -1);
//		System.out.println(fib(n,dp));// only used in top down
		System.out.println(fibNIter(n));
	}
}
