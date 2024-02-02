package DeepDivingRecursion;

import java.util.Scanner;

public class MazePathDCount {
	static int cnt = 0;

    static void mazePathD(int i, int j, int n, int m, StringBuilder ans) {
        // base case
        if (i == n && j == m) {
            System.out.print(ans + " ");
            cnt++;
            return;
        }

        // recursive case

        // Vertical Call
        if (i + 1 <= n) {
            mazePathD(i + 1, j, n, m, new StringBuilder(ans).append('V'));
        }

        // Horizontal call
        if (j + 1 <= m) {
            mazePathD(i, j + 1, n, m, new StringBuilder(ans).append('H'));
        }

        // Diagonal call
        if (i + 1 <= n && j + 1 <= m) {
            mazePathD(i + 1, j + 1, n, m, new StringBuilder(ans).append('D'));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Enter the number of rows and columns:");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        mazePathD(0, 0, n - 1, m - 1, new StringBuilder());
        System.out.println("\n" + cnt);
    }
}
