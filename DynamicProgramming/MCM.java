package DynamicProgramming;

public class MCM {

	private static int mcmTopDown(int[] arr, int i, int j, int[][] dp) {
		// TODO Auto-generated method stub

		if(i == j) {
			return 0;
		}
		
		if(dp[i][j] != -1) {
			return dp[i][j];
		}
		
		int minCost = Integer.MAX_VALUE;
		for(int k = i; k<j; k++) {
			int p1 = mcmTopDown(arr, i, k, dp);
			int p2 = mcmTopDown(arr, k+1, j, dp);
			
			int C = arr[i-1]*arr[k] * arr[j];
			
			int tot = p1 + p2 + C;
			minCost = Math.min(minCost, tot);
		}
		
		return dp[i][j] = minCost;
	}
	
	private static int mcmBUP(int[] arr, int n) {
		// TODO Auto-generated method stub

		int[][] dp = new int[n][n];
		
		for(int i = 1; i<=n-1; i++) {
			dp[i][i] = 0;
		}
		
		for(int L = 2; L<n;L++) {
			for(int i = 1; i<= n- L; i++) {
				int j = i+L-1;
				dp[i][j] = Integer.MAX_VALUE;
				for(int k = i; k<j;k++) {
					int p1 = dp[i][k];
					int p2 = dp[k+1][j];
					
					int C = arr[i-1]*arr[k]*arr[j];
					
					int tot = p1+p2+C;
					
					dp[i][j] = Math.min(dp[i][j], tot);
				}
			}
		}
		
		return dp[1][n-1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10,20,30,40};
		int n = arr.length;
		
//		int[][] dp = new int[n][n];
//		
//		for(int i=0; i<n;i++) {
//			for(int j = 0; j<n;j++) {
//				dp[i][j] = -1;
//			}
//		}
//		
//		
//		System.out.println(mcmTopDown(arr, 1, arr.length - 1, dp));
		
		System.out.println(mcmBUP(arr, n));
	}

}
