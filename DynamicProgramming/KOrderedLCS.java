package DynamicProgramming;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KOrderedLCS {
	 static long[][][] dp;

	    static long korderedLCS(int[] a, int[] b, int n, int m, int i, int j, int k) {
	        if (n == i || m == j) {
	            return 0;
	        }

	        if (dp[i][j][k] != -1) {
	            return dp[i][j][k];
	        }

	        long res = 0;

	        if (a[i] == b[j]) {
	            res = 1 + korderedLCS(a, b, n, m, i + 1, j + 1, k);
	        } else {
	            if (k > 0) {
	                res = 1 + korderedLCS(a, b, n, m, i + 1, j + 1, k - 1);
	            }
	            res = Math.max(res, korderedLCS(a, b, n, m, i + 1, j, k));
	            res = Math.max(res, korderedLCS(a, b, n, m, i, j + 1, k));
	        }

	        dp[i][j][k] = res;
	        return res;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int n = scanner.nextInt();
	        int m = scanner.nextInt();
	        int k = scanner.nextInt();

	        int[] a = new int[n];
	        int[] b = new int[m];

	        dp = new long[n + 1][m + 1][k + 1];
	        for (int i = 0; i <= n; i++) {
	            for (int j = 0; j <= m; j++) {
	                for (int p = 0; p <= k; p++) {
	                    dp[i][j][p] = -1;
	                }
	            }
	        }

	        for (int i = 0; i < n; i++) {
	            a[i] = scanner.nextInt();
	        }

	        for (int i = 0; i < m; i++) {
	            b[i] = scanner.nextInt();
	        }

	        long result = korderedLCS(a, b, n, m, 0, 0, k);
	        System.out.println(result);

	        scanner.close();
	    }
}
