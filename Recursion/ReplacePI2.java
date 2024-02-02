package Recursion;

import java.util.Scanner;

public class ReplacePI2 {

	 static void replaceAllPi(char[] a, int i, int length) {
	        // base case
	        if (i == length) {
	            System.out.println(new String(a, 0, length));
	            return;
	        }

	        // recursive case
	        if (a[i] == 'p' && i + 1 < length && a[i + 1] == 'i') {
	            // shift elements to the right to make space for "3.14"
	            for (int j = length - 1; j >= i + 2; j--) {
	                a[j + 2] = a[j];
	            }

	            a[i] = '3';
	            a[i + 1] = '.';
	            a[i + 2] = '1';
	            a[i + 3] = '4';

	            replaceAllPi(a, i + 4, length + 2);
	        } else {
	            replaceAllPi(a, i + 1, length);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	     //   System.out.println("Enter the number of test cases:");
	        int n = scanner.nextInt();

	        for (int i = 0; i < n; i++) {
	          //  System.out.println("Enter a string for test case #" + (i + 1) + ":");
	            String str = scanner.next();
	            char[] a = new char[str.length() * 2]; // Ensure enough space for replacement
	            System.arraycopy(str.toCharArray(), 0, a, 0, str.length());
	            replaceAllPi(a, 0, str.length());
	        }
	    }
}
