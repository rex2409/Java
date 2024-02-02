package DynamicProgramming;

import java.util.Scanner;

public class UglyNum {

	public static long uglyNumber(long n) {
        long[] dp = new long[(int) (n + 1)];
        int i2 = 0, i3 = 0, i5 = 0;
        long nextMultipleOf2 = 2;
        long nextMultipleOf3 = 3;
        long nextMultipleOf5 = 5;
        long nextUglyNo = 1;
        dp[0] = 1;

        for (int i = 1; i < n; i++) {
            nextUglyNo = Math.min(nextMultipleOf2, Math.min(nextMultipleOf3, nextMultipleOf5));
            dp[i] = nextUglyNo;

            if (nextMultipleOf2 == nextUglyNo) {
                i2++;
                nextMultipleOf2 = dp[i2] * 2;
            }
            if (nextMultipleOf3 == nextUglyNo) {
                i3++;
                nextMultipleOf3 = dp[i3] * 3;
            }
            if (nextMultipleOf5 == nextUglyNo) {
                i5++;
                nextMultipleOf5 = dp[i5] * 5;
            }
        }

        return nextUglyNo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            System.out.println(uglyNumber(n));
        }
    }
}
