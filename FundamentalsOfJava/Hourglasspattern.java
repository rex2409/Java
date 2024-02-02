package FundamentalsOfJava;

import java.util.Scanner;

public class Hourglasspattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in); 
		
		 int n = sc.nextInt(); // Adjust the value of 'n' based on the size of the pattern

	        // Outer loop for each row
	        for (int i = n; i > 0; i--) {
	            
	            // Inner loop for spaces before the numbers
	            for (int j = 0; j < n - i; j++) {
	                System.out.print("  ");
	            }

	            // Inner loop for the decreasing sequence
	            for (int k = i; k >= 0; k--) {
	                System.out.print(k + " ");
	            }

	            // Inner loop for the increasing sequence (skip the center value)
	            for (int l = 1; l <= i; l++) {
	                System.out.print(l + " ");
	            }

	            // Move to the next line after each row is printed
	            System.out.println();
	        }
	        for (int i = 0; i <= n; i++) {

	            // Inner loop for spaces before the numbers
	            for (int j = 0; j <= n - i - 1; j++) {
	                System.out.print("  ");
	            }

	            // Inner loop for the decreasing sequence
	            for (int k = i; k >= 0; k--) {
	                System.out.print(k + " ");
	            }

	            // Inner loop for the increasing sequence (skip the center value)
	            for (int l = 1; l <= i; l++) {
	                System.out.print(l + " ");
	            }

	            // Move to the next line after each row is printed
	            System.out.println();
	        }
	        
	}

}
