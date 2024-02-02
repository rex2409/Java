package BinarySearch;

import java.util.Scanner;

public class WinningCBSchol {

	static long students(long N, long M, long X, long Y) {
        long s = 0;
        long e = N;
        long ans = 0;

        while (s <= e) {
            long mid = s + (e - s) / 2;

            if (mid * X <= (M + Y * (N - mid))) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();
        long M = scanner.nextLong();
        long X = scanner.nextLong();
        long Y = scanner.nextLong();

        System.out.println(students(N, M, X, Y));

        
    }
}
