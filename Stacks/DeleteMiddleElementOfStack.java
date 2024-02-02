package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class DeleteMiddleElementOfStack {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the stack
        int n = scanner.nextInt();

        // Input the elements of the stack
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(scanner.nextInt());
        }

        // Delete the middle element
        deleteMiddleElement(stack);

        // Print the modified stack
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    private static void deleteMiddleElement(Stack<Integer> stack) {
        int mid = stack.size() / 2;
        Stack<Integer> tempStack = new Stack<>();

        // Pop and store the elements until the middle
        for (int i = 0; i < mid; i++) {
            tempStack.push(stack.pop());
        }

        // Skip the middle element
        stack.pop();

        // Push back the elements after the middle
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}
