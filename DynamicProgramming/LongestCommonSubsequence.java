package DynamicProgramming;

public class LongestCommonSubsequence {

	
	private static int lCS2(String s1, String s2, int n, int m, int[][] dp) {
		// TODO Auto-generated method stub

		if(n==0||m==0) {
			return 0;
		}
		
		if(dp[n][m] != -1) {
			return dp[n][m];
		}
		
		if(s1.charAt(n-1) == s2.charAt(m-1)) {
			return dp[n][m] = 1 + lCS2(s1, s2, n-1, m-1, dp);
		}
		else {
			int c1 = lCS2(s1, s2, n-1, m, dp);
			int c2 = lCS2(s1, s2, n, m-1, dp);
			
			return dp[n][m] = Math.max(c1, c2);
		}
	}
	
	private static int lCS(String s1, String s2, int i, int j, int[][] dp){
		// TODO Auto-generated method stub

		if(i == s1.length()||j==s2.length()) {
			return 0;
		}
		
		if(dp[i][j] != -1) {
			return dp[i][j];
		}
		
		if(s1.charAt(i) == s2.charAt(j)) {
			return dp[i][j] = 1 + lCS(s1, s2, i+1, j+1, dp);
		}
		else {
			int c1 = lCS(s1, s2, i+1, j, dp);
			int c2 = lCS(s1, s2, i, j+1, dp);
			
			return dp[i][j] = Math.max(c1, c2);
		}
	}
	
	private static int lCSIter(String s1, String s2, int n, int m) {
		// TODO Auto-generated method stub

		int[][] dp = new int[n+1][m+1];
		for(int c = 0; c<=m;c++) {
			dp[0][c] = 0;
		}
		for(int r = 0; r<=n; r++) {
			dp[r][0] = 0;
		}
		
		for(int r = 1; r<=n; r++) {
			for(int c = 1; c<=m; c++) {
				
				if(s1.charAt(r-1)==s2.charAt(c-1)) {
					dp[r][c] = 1 + dp[r-1][c-1];
				}
				else {
					int c1 = dp[r-1][c];
					int c2 = dp[r][c-1];
					dp[r][c] = Math.max(c1, c2);
				}
			}
		}
		return dp[n][m];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abc";
		String s2 = "acb";
		
		int n = s1.length();
		int m = s2.length();
//		
//		int[][] dp = new int[n+1][m+1];
//		
//		for(int i = 0; i<=n; i++) {
//			for(int j=0; j<=m;j++) {
//				dp[i][j] = -1;
//			}
//		}
//		System.out.println(lCS2(s1,s2,n,m,dp));
		
		System.out.println(lCSIter(s1, s2, n, m));
	}

}
