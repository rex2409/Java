package Recursion;

import java.util.Scanner;

public class ClassAssignment {

	 static int assign(int num) {
	        if (num == 1) {
	            return 2;
	        }
	        if (num == 2) {
	            return 3;
	        }
	        return assign(num - 1) + assign(num - 2);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       // System.out.println("Enter the number of test cases:");
	        int n = scanner.nextInt();

	        for (int i = 1; i <= n; i++) {
	          //  System.out.println("Enter a number for test case #" + i + ":");
	            int num = scanner.nextInt();
	            System.out.println("#" + i + " : " + assign(num));
	        }
	    }

}
