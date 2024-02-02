package BitManip;

import java.util.Scanner;

public class UltraFast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);

	        int t = scanner.nextInt(); // Number of test cases

	        while (t-- > 0) {
	            char[] num1 = scanner.next().toCharArray();
	            char[] num2 = scanner.next().toCharArray();

	            // Process each pair of digits and construct the new number
	            StringBuilder result = new StringBuilder();
	            for (int i = 0; i < num1.length; i++) {
	                int digit1 = num1[i] - '0';
	                int digit2 = num2[i] - '0';

	                // XOR operation to determine if digits differ
	                int newDigit = digit1 ^ digit2;
	                result.append(newDigit);
	            }

	            System.out.println(result);
	        }

	        scanner.close();
	}

}
