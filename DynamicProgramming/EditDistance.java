package DynamicProgramming;

public class EditDistance {

	private static int eDTopDown(String s1, String s2, int n, int m, int[][] dp) {
		// TODO Auto-generated method stub

		if(n==0) {
			return m;
		}
		
		if(m==0) {
			return n;
		}
		
		if(dp[n][m] != -1) {
			return dp[n][m];
		}
		
		if(s1.charAt(n-1) == s2.charAt(m-1)) {
			return dp[n][m] = eDTopDown(s1, s2, n-1, m-1,dp);
		}
		else {
			int i = eDTopDown(s1, s2, n, m-1,dp);
			int d = eDTopDown(s1, s2, n-1, m,dp);
			int r = eDTopDown(s1, s2, n-1, m-1,dp);
			
			return dp[n][m] = Math.min(Math.min(i, d), r) + 1;
		}
	}
	
	private static int eDBU(String s1, String s2, int n, int m) {
		// TODO Auto-generated method stub

		int[][] dp = new int[n+1][m+1];
		for(int c = 0; c<=m; c++) {
			dp[0][c] = c;
		}
		
		for(int r = 1; r<=n; r++) {
			dp[r][0] = r;
		}
		
		for(int r = 1; r<=n; r++) {
			for(int c = 1; c<=m; c++) {
				
				if(s1.charAt(r-1)==s2.charAt(c-1)) {
					dp[r][c] = dp[r-1][c-1];
				}
				else {
					int i = dp[r][c-1];
					int d = dp[r-1][c];
					int re = dp[r-1][c-1];
					
					dp[r][c] = Math.min(i, Math.min(d, re))+1;
				}
			}
		}
		return dp[n][m];
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "horse";
		String s2 = "ros";
		int n = s1.length();
		int m = s2.length();
//		int[][] dp = new int[n+1][m+1];
//		for(int i = 0; i<=n; i++) {
//			for(int j = 0; j<=m ; j++) {
//				dp[i][j] = -1;
//			}
//		}
//		
//		//System.out.println(eDTopDown(s1, s2, n, m, dp));
		System.out.println(eDBU(s1, s2, n, m));
	}

}
