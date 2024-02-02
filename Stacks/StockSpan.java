package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {

	static void stockSpan(int[] price, int n) {
        Stack<Integer> stack = new Stack<>();
        int[] span = new int[n];

        stack.push(0);
        span[0] = 1;

        for (int i = 1; i < n; i++) {
            int currPrice = price[i];

            while (!stack.isEmpty() && price[stack.peek()] <= currPrice) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                span[i] = i - stack.peek();
            } else {
                span[i] = i + 1;
            }

            stack.push(i);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(span[i] + " ");
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        stockSpan(a, n);
    }
}
