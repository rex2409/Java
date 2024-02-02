package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class PrateekSirCoding {

	static void manageCostModule(int n, Scanner scanner) {
        Stack<Integer> stack = new Stack<>();

        while (n-- > 0) {
            int query = scanner.nextInt();

            if (query == 2) {
                int price = scanner.nextInt();
                stack.push(price);
            } else {
                if (!stack.isEmpty()) {
                    System.out.println(stack.pop());
                } else {
                    System.out.println("No Code");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        manageCostModule(q, scanner);
    }
}
