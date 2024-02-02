package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class MappedString {
	 static ArrayList<String> ans = new ArrayList<>();

	    static void possibleCodes(String str, int i, StringBuilder out) {
	        if (i == str.length()) {
	            // base Case
	            ans.add(out.toString());
	            return;
	        }

	        // select only one digit
	        out.append((char) (str.charAt(i) - '0' - 1 + 'A'));
	        possibleCodes(str, i + 1, out);
	        out.deleteCharAt(out.length() - 1);

	        // consider 2 digits
	        if (i + 1 < str.length()) {
	            int num = Integer.parseInt(str.substring(i, i + 2));
	            if (num <= 26) {
	                out.append((char) (num - 1 + 'A'));
	                possibleCodes(str, i + 2, out);
	                out.deleteCharAt(out.length() - 1);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        //System.out.println("Enter a numeric string:");
	        String str = scanner.next();

	        possibleCodes(str, 0, new StringBuilder());
	        for (int i = 0; i < ans.size() - 1; i++) {
	            System.out.println(ans.get(i));
	        }
	        System.out.println(ans.get(ans.size() - 1));
	    }

}
