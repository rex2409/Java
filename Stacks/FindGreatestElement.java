package Stacks;

import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class FindGreatestElement {


	 // Function to find the NGE for the
    // given circular array arr[]
    static void printNGE(int[] arr, int n) {
        // Initialize stack and nge[] array
        Stack<Integer> s = new Stack<>();
        int[] nge = new int[n];
        int i = 0;

        // Initialize nge[] array to -1
        for (i = 0; i < n; i++) {
            nge[i] = -1;
        }
        i = 0;

        // Traverse the array
        while (i < 2 * n) {
            // If stack is not empty and
            // current element is greater
            // than top element of the stack
            while (!s.isEmpty() && arr[i % n] > arr[s.peek()]) {
                // Assign next greater element
                // for the top element of the stack
                nge[s.pop()] = arr[i % n];
            }

            s.push(i % n);
            i++;
        }

        // Print the nge[] array
        for (i = 0; i < n; i++) {
            System.out.print(nge[i] + " ");
        }
    }

    // Driver Code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        printNGE(a, n);
    }
}
