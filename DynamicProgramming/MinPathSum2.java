package DynamicProgramming;

public class MinPathSum2 {

	private static int minCost(int[][] arr, int m, int n, int[][] dp) {
		// TODO Auto-generated method stub
		
		if(m==1 && n==1) {
			return arr[0][0];
		}
		
		if(m==0||n==0) {
			return Integer.MAX_VALUE;
		}
		if(dp[m][n] != -1) {
			return dp[m][n];
		}
		
		int up = minCost(arr,m-1,n,dp);
		int left = minCost(arr,m,n-1,dp);
		
		return dp[m][n] = Math.min(up,left) + arr[m-1][n-1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = {{1,3,1},{1,5,1},{4,2,1}};
		int[][] dp = new int[arr.length+1][arr[0].length+1];
		for(int r = 0; r< dp.length;r++) {
			for(int c = 0; c<dp[0].length;c++) {
				dp[r][c] = -1;
			}
		}
		System.out.println(minCost(arr,arr.length,arr[0].length,dp));
	}

}
