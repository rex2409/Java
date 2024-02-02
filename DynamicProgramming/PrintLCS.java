package DynamicProgramming;

import java.util.Scanner;

public class PrintLCS {

	  public static void printLCS(String x, String y) {
	        int l1 = x.length();
	        int l2 = y.length();

	        int[][] dp = new int[l1 + 1][l2 + 1];
	        for (int i = 0; i <= l1; i++) {
	            for (int j = 0; j <= l2; j++) {
	                if (i == 0 || j == 0) {
	                    dp[i][j] = 0;
	                } else if (x.charAt(i - 1) == y.charAt(j - 1)) {
	                    dp[i][j] = dp[i - 1][j - 1] + 1;
	                } else {
	                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
	                }
	            }
	        }

	        StringBuilder result = new StringBuilder();
	        int i = l1;
	        int j = l2;

	        while (i > 0 && j > 0) {
	            if (x.charAt(i - 1) == y.charAt(j - 1)) {
	                result.append(x.charAt(i - 1));
	                i--;
	                j--;
	            } else {
	                if (dp[i - 1][j] > dp[i][j - 1]) {
	                    i--;
	                } else {
	                    j--;
	                }
	            }
	        }

	        System.out.println(result.reverse().toString());
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String x = scanner.next();
	        String y = scanner.next();
	        printLCS(x, y);
	    }
}
