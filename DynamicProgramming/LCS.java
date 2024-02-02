package DynamicProgramming;

public class LCS {

	public static int LCS(String s1, String s2, int i, int j, int[][] dp) {
		// TODO Auto-generated constructor stub
		
		if(i==s1.length()||j==s2.length()) {
			return 0;
		}
		
		if(s1.charAt(i)==s2.charAt(j)) {
			dp[i][j] = 1 + LCS(s1, s2, i+1, j+1,dp);
			
			return dp[i][j];
		}
		else {
			int sp1 = LCS(s1, s2, i+1, j, dp);
			int sp2 = LCS(s1, s2, i, j+1, dp);
			dp[i][j] = Math.max(sp1, sp2);
			return Math.max(sp1, sp2);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abc";
		String s2 = "acb";
		int[][] dp = new int[s1.length()][s2.length()];
		for(int r = 0; r<dp.length; r++) {
			for(int c=0;c<dp.length;c++) {
				dp[r][c] = -1;
			}
		}
		System.out.println(LCS(s1, s2, 0, 0, dp));
	}

}
