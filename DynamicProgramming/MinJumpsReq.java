package DynamicProgramming;

import java.util.Scanner;

public class MinJumpsReq {

	static int minJumpsReq(int n, int[] a) {
        if (n == 0 || a[0] == 0) {
            return Integer.MAX_VALUE;
        }

        int[] dp = new int[n];
        for (int i = 1; i < n; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (dp[j] != Integer.MAX_VALUE && a[j] + j >= i) {
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            System.out.println(minJumpsReq(n, a));
        }
    }
}
