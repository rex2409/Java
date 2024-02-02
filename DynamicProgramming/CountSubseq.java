package DynamicProgramming;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountSubseq {


    static final int MOD = 1000000007;
    static long[] dp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();
            dp = new long[s.length() + 1];
            Map<Character, Integer> lastOcc = new HashMap<>();
            dp[0] = 1;

            for (int i = 1; i <= s.length(); i++) {
                if (!lastOcc.containsKey(s.charAt(i - 1))) {
                    dp[i] = (dp[i - 1] * 2) % MOD;
                } else {
                    dp[i] = ((dp[i - 1] * 2) % MOD - dp[lastOcc.get(s.charAt(i - 1)) - 1] + MOD) % MOD;
                }
                lastOcc.put(s.charAt(i - 1), i);
            }

            System.out.println(dp[s.length()]);
        }
    }
}
