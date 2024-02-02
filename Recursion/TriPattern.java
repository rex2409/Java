package Recursion;

import java.util.Scanner;

public class TriPattern {

	 static void triangle(int i) {
	        if (i == 0) {
	            return;
	        }
	        System.out.print("*\t");
	        triangle(i - 1);
	    }

	    static void triangle2(int n, int i) {
	        if (i == n + 1) {
	            return;
	        }
	        triangle(i);
	        System.out.println();
	        triangle2(n, i + 1);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       // System.out.println("Enter the value of n:");
	        int n = scanner.nextInt();

	        triangle2(n, 1);
	    }
}
