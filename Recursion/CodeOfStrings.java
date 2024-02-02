package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class CodeOfStrings {

	 public static ArrayList<String> getAllPossibleCodes(String str) {
	        ArrayList<String> result = new ArrayList<>();
	        generateCodes(str, "", result);
	        return result;
	    }

	    private static void generateCodes(String remaining, String current, ArrayList<String> result) {
	        if (remaining.length() == 0) {
	            result.add(current);
	            return;
	        }

	        // Single digit code
	        int singleDigit = Integer.parseInt(remaining.substring(0, 1));
	        if (singleDigit >= 1 && singleDigit <= 9) {
	            char ch = (char) ('a' + singleDigit - 1);
	            generateCodes(remaining.substring(1), current + ch, result);
	        }

	        // Two-digit code
	        if (remaining.length() >= 2) {
	            int twoDigits = Integer.parseInt(remaining.substring(0, 2));
	            if (twoDigits >= 10 && twoDigits <= 26) {
	                char ch = (char) ('a' + twoDigits - 1);
	                generateCodes(remaining.substring(2), current + ch, result);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       // System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();

	        ArrayList<String> codes = getAllPossibleCodes(inputString);

	        System.out.println(codes);

	        scanner.close();
	    }
}
