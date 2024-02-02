package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class TillingProblem {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] studentMoney = new int[n];
        int[] bagMoney = new int[n];

        for (int i = 0; i < n; i++) {
            studentMoney[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            bagMoney[i] = scanner.nextInt();
        }

        // Sorting the arrays
        Arrays.sort(studentMoney);
        Arrays.sort(bagMoney);

        // Initialize dp array
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        // Dynamic Programming
        for (int i = 0; i < n; i++) {
            int sumitMoney = studentMoney[i];
            for (int j = k; j >= 1; j--) {  // Change here: j >= 1 instead of j >= 0
                if (dp[j - 1] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j], dp[j - 1] + bagMoney[i]);
                }
            }
        }

        // Finding the maximum achievable rank
        int maxRank = 0;
        for (int i = k; i >= 0; i--) {
            if (dp[i] <= studentMoney[0]) {
                maxRank = i;
                break;
            }
        }

        System.out.println(n - maxRank);
    }
}
