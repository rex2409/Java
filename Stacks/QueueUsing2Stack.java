package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsing2Stack {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        // Enqueue operation
        for (int i = 0; i < N; i++) {
            stack1.push(i);
        }

        // Dequeue operation
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            if (stack2.isEmpty()) {
                transferElements(stack1, stack2);
            }

            System.out.print(stack2.pop() + " ");
        }
    }

    // Function to transfer elements from stack1 to stack2
    private static void transferElements(Stack<Integer> stack1, Stack<Integer> stack2) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }
}
