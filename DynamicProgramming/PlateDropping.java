package DynamicProgramming;

import java.util.Scanner;

public class PlateDropping {

	static int[][] DP;

    static int eggDropBUDP(int n, int k) {
        DP = new int[n + 1][k + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                DP[i][j] = 0;
            }
        }

        for (int i = 0; i <= n; i++) {
            DP[i][0] = 0;
            DP[i][1] = 1;
        }

        for (int i = 0; i <= k; i++) {
            DP[0][i] = 0;
            DP[1][i] = i;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= k; j++) {
                if (i > j) {
                    DP[i][j] = DP[i - 1][j];
                } else {
                    DP[i][j] = Integer.MAX_VALUE;
                    for (int x = 1; x <= j; x++) {
                        int retval = Math.max(DP[i - 1][x - 1], DP[i][j - x]);
                        if (retval < DP[i][j])
                            DP[i][j] = retval;
                    }
                    DP[i][j] = DP[i][j] + 1;
                }
            }
        }
        return DP[n][k];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            System.out.println(eggDropBUDP(n, k));
        }
    }
}
