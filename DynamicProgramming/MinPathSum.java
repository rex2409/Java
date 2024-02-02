package DynamicProgramming;

public class MinPathSum {

	
	private static int minCost(int[][] arr, int cr, int cc, int er, int ec, int[][] dp) {
		// TODO Auto-generated method stub
		
		if(cr==er & cc==ec) {
			return arr[cr][cc];
		}
		
		if(cr>er || cc>ec) {
			return Integer.MAX_VALUE;
		}
		
		if(dp[cr][cc] != -1) {
			return dp[cr][cc];
		}
		
		int right = minCost(arr,cr,cc+1,er,ec, dp);
		int down = minCost(arr,cr+1,cc,er,ec, dp);
		
		return dp[cr][cc] = Math.min(right, down) + arr[cr][cc];
	}
	
	private static int iterMinCost(int[][] arr, int m, int n) {
		// TODO Auto-generated method stub

		int[][] dp = new int[m+1][n+1];
		
		for(int c = 0; c<=n; c++) {
			dp[0][c] = Integer.MAX_VALUE;
		}
		
		for(int r = 0; r<=m; r++) {
			dp[r][0] = Integer.MAX_VALUE;
		}
		
		dp[1][1] = arr[0][0];
		
		for(int r = 1; r<=m; r++) {
			for(int c=1;c<=n;c++) {
				if(r==1 && c==1) {
					continue;
				}
				
				dp[r][c] = Math.min(dp[r-1][c], dp[r][c-1]) + arr[r-1][c-1];
			}
		}
		return dp[m][n];
	}
	
	public static void main(String[] args) {
		int[][] arr = {{1,3,1},{1,5,1},{4,2,1}};
		
		int m = arr.length;
		int n = arr[0].length;
//		int[][] dp = new int[m+1][n+1];
//		
//		for(int i = 0; i<=m; i++) {
//			for(int j = 0; j<=n; j++) {
//				dp[i][j] = -1;
//			}
//		}
//		
//		System.out.println(minCost(arr,0,0,m-1,n-1,dp));
		
		System.out.println(iterMinCost(arr,m,n));
	}
}
