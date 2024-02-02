package DeepDivingRecursion;

import java.util.Scanner;

public class MazePathCount {

	static int cnt = 0;

    static void mazePath(int i, int j, int n, int m, StringBuilder ans) {
        // base case
        if (i == n && j == m) {
            System.out.print(ans + " ");
            cnt++;
            return;
        }

        // recursive case
        if (i <= n && j <= m) {
            // Vertical Call
            if (i + 1 <= n) {
                mazePath(i + 1, j, n, m, new StringBuilder(ans).append('V'));
            }

            // Horizontal call
            if (j + 1 <= m) {
                mazePath(i, j + 1, n, m, new StringBuilder(ans).append('H'));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Enter the number of rows and columns:");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        mazePath(0, 0, n - 1, m - 1, new StringBuilder());
        System.out.println("\n" + cnt);
    }

}
