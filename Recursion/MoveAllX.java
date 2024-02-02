package Recursion;

import java.util.Scanner;

public class MoveAllX {

//	static String moveXToEnd(String s, int i, int countX) {
//        // base case
//        if (i == s.length())
//            return "x".repeat(countX);
//
//        // recursive case
//        if (s.charAt(i) != 'x')
//            return s.charAt(i) + moveXToEnd(s, i + 1, countX);
//        else
//            return moveXToEnd(s, i + 1, countX + 1);
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//       // System.out.println("Enter a string:");
//        String s = scanner.nextLine();
//
//        String result = moveXToEnd(s, 0, 0);
//
//        System.out.println(result);
//    }
	
	// Function to move all 'x' to the end
    static String moveXToEnd(String s, int i, int countX) {
        // base case
        if (i == s.length())
            return new String(new char[countX]).replace('\0', 'x');

        // recursive case
        if (s.charAt(i) != 'x')
            return s.charAt(i) + moveXToEnd(s, i + 1, countX);
        else
            return moveXToEnd(s, i + 1, countX + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Enter a string:");
        String s = scanner.nextLine();

        String result = moveXToEnd(s, 0, 0);

        System.out.println(result);
    }
}
