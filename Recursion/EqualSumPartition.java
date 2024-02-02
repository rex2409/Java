package Recursion;

import java.util.Scanner;

public class EqualSumPartition {

	static void generateSub(int i, int[] v, int n, boolean[] temp, int sum, int[] cntways) {
        if (i == n) {
            int sumsplit = 0;

            for (int j = 0; j < n; j++) {
                if (temp[j]) {
                    sumsplit += v[j];
                }
            }
            if (sumsplit == sum) {
                for (int j = 0; j < n; j++) {
                    if (temp[j]) {
                        System.out.print(v[j] + " ");
                    }
                }
                System.out.print("and ");
                for (int x = 0; x < n; x++) {
                    if (!temp[x]) {
                        System.out.print(v[x] + " ");
                    }
                }
                System.out.println();
                cntways[0]++;
            }
            return;
        }
        temp[i] = true;
        generateSub(i + 1, v, n, temp, sum, cntways);

        temp[i] = false;
        generateSub(i + 1, v, n, temp, sum, cntways);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] v = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            v[i] = scanner.nextInt();
            sum += v[i];
        }

        if (sum % 2 != 0) {
            System.out.println("0");
            return;
        }
        sum = sum / 2;

        boolean[] temp = new boolean[n];
        int[] cntways = {0};
        generateSub(0, v, n, temp, sum, cntways);
        System.out.println(cntways[0]);
    }
}
