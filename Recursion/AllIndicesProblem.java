package Recursion;

import java.util.Scanner;

public class AllIndicesProblem {
	static void allIndices(int[] a, int n, int i, int M) {
        // base case
        if (i == n) {
            return;
        }

        // recursive case
        if (a[i] == M) {
            System.out.print(i + " ");
        }

        allIndices(a, n, i + 1, M);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      //  System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        int[] a = new int[n];

       // System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

       // System.out.println("Enter the element to find:");
        int M = scanner.nextInt();

        allIndices(a, n, 0, M);
    }

}
