package Recursion;

import java.util.Scanner;

public class duplicateCharFormat {

	public static String separateConsecutiveDuplicates(String str) {
        if (str.length() <= 1) {
            return str;
        }

        if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + separateConsecutiveDuplicates(str.substring(1));
        } else {
            return str.charAt(0) + separateConsecutiveDuplicates(str.substring(1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String result = separateConsecutiveDuplicates(inputString);

        System.out.println(result);

        scanner.close();
    }
}
