package BitManip;

import java.util.Scanner;

public class TavasSaddas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner scanner = new Scanner(System.in);

	        long n = scanner.nextLong();

	        // Convert the lucky number to its decimal representation
	        String decimalRepresentation = Long.toString(n);

	        // Calculate the index of the lucky number
	        long index = (1L << decimalRepresentation.length()) - 2; // 2^(length of lucky number) - 2

	        for (int i = 0; i < decimalRepresentation.length(); i++) {
	            if (decimalRepresentation.charAt(i) == '7') {
	                index += (1L << (decimalRepresentation.length() - i - 1));
	            }
	        }

	        System.out.println(index + 1); // 1-based index

	        scanner.close();
	}

}
