package Recursion;

import java.util.Scanner;

public class StringToInteger {

	static void strToInt(String str, int i) {
        // base case
        if (i == str.length()) {
            return;
        }

        // recursive case
        int digit = Character.getNumericValue(str.charAt(i));
        System.out.print(digit);

        strToInt(str, i + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // System.out.println("Enter a string:");
        String s = scanner.next();

        strToInt(s, 0);
    }

}
