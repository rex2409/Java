package Recursion;

import java.util.Scanner;

public class Lexicographical {

	 static void lexicographicalOrderNums(int n, int startWith) {
	        // base case
	        if (startWith > n) {
	            return;
	        }

	        // recursive case
	        System.out.print(startWith + " ");

	        for (int i = 0; i <= 9; i++) {
	            int newNum = startWith * 10 + i;
	            lexicographicalOrderNums(n, newNum);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        System.out.print("0 ");

	        for (int i = 1; i <= 9; i++) {
	            lexicographicalOrderNums(n, i);
	        }
	    }

}
