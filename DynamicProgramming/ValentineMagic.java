package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class ValentineMagic {

	 public static long valentine(long[] a, int n, long[] b, int m) {
	        Arrays.sort(a);
	        Arrays.sort(b);

	        long[][] dp = new long[n + 1][m + 1];

	        for (int i = 0; i <= n; i++) {
	            for (int j = 0; j <= m; j++) {
	                if (i == 0) {
	                    dp[i][j] = 0;
	                } else if (j == 0) {
	                    dp[i][j] = 1000000000;
	                } else {
	                    long diff = Math.abs(a[i - 1] - b[j - 1]);
	                    long op1 = dp[i - 1][j - 1] + diff;
	                    long op2 = dp[i][j - 1];
	                    dp[i][j] = Math.min(op1, op2);
	                }
	            }
	        }

	        return dp[n][m];
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int m = scanner.nextInt();
	        long[] a = new long[n];
	        long[] b = new long[m];

	        for (int i = 0; i < n; i++) a[i] = scanner.nextLong();
	        for (int i = 0; i < m; i++) b[i] = scanner.nextLong();

	        System.out.println(valentine(a, n, b, m));
	    }
}
