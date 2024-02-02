package Recursion;

import java.util.Scanner;
import java.util.TreeSet;

public class GenParanthesis {

	 public static void generateParentheses(int n) {
	        TreeSet<String> result = new TreeSet<>((s1, s2) -> s2.compareTo(s1));
	        generateParenthesesHelper(n, n, "", result);

	        for (String combination : result) {
	            System.out.println(combination);
	        }
	    }

	    private static void generateParenthesesHelper(int open, int close, String current, TreeSet<String> result) {
	        if (open == 0 && close == 0) {
	            result.add(current);
	            return;
	        }

	        if (open > 0) {
	            generateParenthesesHelper(open - 1, close, current + "(", result);
	        }

	        if (close > open) {
	            generateParenthesesHelper(open, close - 1, current + ")", result);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input
	        int n = scanner.nextInt();

	        // Generate balanced parentheses
	        generateParentheses(n);
	    }
}

