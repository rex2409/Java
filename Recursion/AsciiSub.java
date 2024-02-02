package Recursion;

import java.util.Scanner;

public class AsciiSub {

	public static int countASCIISubsequences(String str) {
        if (str.length() == 0) {
            return 1; // Empty string is also a valid subsequence
        }

        int includeCurrent = countASCIISubsequences(str.substring(1));
        int excludeCurrent = countASCIISubsequences(str.substring(1));

        // Include current character
        includeCurrent += 1;

        return 2 * excludeCurrent + includeCurrent - 1; // Corrected formula
    }

    // Function to print all possible ASCII subsequences
    public static void printASCIISubsequences(String str, String current) {
        if (str.length() == 0) {
            System.out.print(current + " ");
            return;
        }

        // Exclude current character
        printASCIISubsequences(str.substring(1), current);

        // Include current character
        printASCIISubsequences(str.substring(1), current + str.charAt(0));
        printASCIISubsequences(str.substring(1), current + (int) str.charAt(0));
    }

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        //System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        printASCIISubsequences(inputString, "");
        // Count and print ASCII subsequences
        System.out.println();
        int count = countASCIISubsequences(inputString);
        System.out.println(count);

        //System.out.println("All possible ASCII subsequences:");
       
    }
}
