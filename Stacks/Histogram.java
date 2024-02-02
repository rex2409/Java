package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Histogram {

	public static void maxRecAreaHistogram(int[] hist, int n) {
        Stack<Integer> s = new Stack<>();
        long area_with_top;
        long maxArea = 0;
        int top;
        int i = 0;

        while (i < n) {
            if (s.empty() || hist[s.peek()] <= hist[i]) {
                s.push(i++);
            } else {
                top = s.pop();

                if (s.empty()) {
                    area_with_top = (long) hist[top] * i;
                } else {
                    area_with_top = (long) hist[top] * (i - s.peek() - 1);
                }

                if (area_with_top > maxArea) {
                    maxArea = area_with_top;
                }
            }
        }

        while (!s.empty()) {
            top = s.pop();
            area_with_top = (long) hist[top] * (s.empty() ? i : i - s.peek() - 1);

            if (area_with_top > maxArea) {
                maxArea = area_with_top;
            }
        }

        System.out.println(maxArea);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        maxRecAreaHistogram(a, n);
    }
}
