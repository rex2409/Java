package DynamicProgramming;

import java.util.Scanner;

public class CountNumOfBinaryString {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int t = scanner.nextInt();
	        
	        while(t-- > 0){
	            int n = scanner.nextInt();
	            long[][] dp = new long[n + 1][2]; // dp[i][0] represents count of binary strings of length i ending with 0
	                                            // dp[i][1] represents count of binary strings of length i ending with 1

	            dp[1][0] = 1;
	            dp[1][1] = 1;

	            for (int i = 2; i <= n; i++) {
	                dp[i][0] = dp[i - 1][0] + dp[i - 1][1]; // Strings ending with 0 can be formed by adding 0 or 1 to the strings ending with 0 or 1 in the previous length.
	                dp[i][1] = dp[i - 1][0]; // Strings ending with 1 can be formed only by adding 0 to the strings ending with 0 in the previous length.
	            }

	            long result = dp[n][0] + dp[n][1];
	            System.out.println(result);
	        }
	    }
}
