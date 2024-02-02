package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class PaintersPartitionProblem {

	public static boolean isPossible(int[] boards, int n, int k, long mid) {
        int painters = 1;
        long currentLength = 0;

        for (int i = 0; i < n; i++) {
            if (currentLength + boards[i] > mid) {
                painters++;
                currentLength = boards[i];

                if (painters > k) {
                    return false;
                }
            } else {
                currentLength += boards[i];
            }
        }

        return true;
    }

    public static long minTimeToPaint(int[] boards, int n, int k) {
        long low = Arrays.stream(boards).max().getAsInt(); // Maximum board length
        long high = Arrays.stream(boards).sum(); // Total sum of board lengths

        long result = -1;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (isPossible(boards, n, k, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int n = scanner.nextInt();

        if (k < 1 || k > 10 || n < 1 || n > 10) {
            System.out.println("Invalid input values. Please ensure that 1 <= K <= 10 and 1 <= N <= 10.");
            return;
        }

        int[] boards = new int[n];
        for (int i = 0; i < n; i++) {
            boards[i] = scanner.nextInt();
        }

        long result = minTimeToPaint(boards, n, k);
        System.out.println(result);
    }

}
