package DeepDivingRecursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DictionaryOrderLarge {

	 static ArrayList<String> ans = new ArrayList<>();

	    // Function to generate all permutations larger than the original string
	    static void dictionaryOrderLarger(String original, StringBuilder str, int cnt) {
	        if (cnt == str.length()) {
	            if (str.toString().compareTo(original) > 0) {
	                ans.add(str.toString());
	            }
	            return;
	        }
	        for (int i = cnt; i < str.length(); i++) {
	            swap(str, i, cnt);
	            dictionaryOrderLarger(original, str, cnt + 1);
	            swap(str, i, cnt);
	        }
	    }

	    // Helper function to swap characters in a StringBuilder
	    static void swap(StringBuilder str, int i, int j) {
	        char temp = str.charAt(i);
	        str.setCharAt(i, str.charAt(j));
	        str.setCharAt(j, temp);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        //System.out.println("Enter a string:");
	        String str = scanner.next();

	        StringBuilder strBuilder = new StringBuilder(str);
	        dictionaryOrderLarger(str, strBuilder, 0);

	        // Sort the output strings
	        Collections.sort(ans);

	        for (String s : ans) {
	            System.out.println(s);
	        }
	    }
}
