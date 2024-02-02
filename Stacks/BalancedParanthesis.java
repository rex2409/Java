package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {

	  public static boolean isBalance(char[] s) {
	        Stack<Character> stk = new Stack<>();

	        for (int i = 0; i < s.length; i++) {
	            char ch = s[i];

	            if (ch == '(' || ch == '{' || ch == '[') {
	                stk.push(ch);
	            } else if (ch == ')' || ch == '}' || ch == ']') {
	                if (stk.isEmpty() || !isMatchingPair(stk.pop(), ch)) {
	                    return false;
	                }
	            }
	        }
	        return stk.isEmpty();
	    }

	    public static boolean isMatchingPair(char character1, char character2) {
	        if (character1 == '(' && character2 == ')') {
	            return true;
	        } else if (character1 == '{' && character2 == '}') {
	            return true;
	        } else return character1 == '[' && character2 == ']';
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String input = scanner.next();

	        if (isBalance(input.toCharArray())) {
	            System.out.println("Yes");
	        } else {
	            System.out.println("No");
	        }
	    }
}
