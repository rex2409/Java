package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStackRecursion {

	  public static void insertAtBottom(Stack<Integer> s, int x) {
	        if (s.isEmpty()) {
	            s.push(x);
	            return;
	        }

	        int data = s.pop();
	        insertAtBottom(s, x);
	        s.push(data);
	    }

	    public static void reverseStack(Stack<Integer> s) {
	        if (!s.isEmpty()) {
	            int x = s.pop();
	            reverseStack(s);
	            insertAtBottom(s, x);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();

	        Stack<Integer> s = new Stack<>();
	        for (int i = 0; i < n; i++) {
	            int data = scanner.nextInt();
	            s.push(data);
	        }

	        reverseStack(s);

	        // Print the elements of the stack by popping each element
	        while (!s.isEmpty()) {
	            System.out.println(s.pop());
	        }
	    }
}
