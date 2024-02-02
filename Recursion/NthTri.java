package Recursion;

import java.util.Scanner;

public class NthTri {
	static int nthTriangleRec(int n) {
        // base case
        if (n == 1) {
            return 1;
        }
        // recursive case
        return n + nthTriangleRec(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // System.out.println("Enter the value of N:");
        int n = scanner.nextInt();

        int ans = nthTriangleRec(n);
        System.out.println(ans);
    }

}
