package DeepDivingRecursion;

import java.util.Arrays;
import java.util.Scanner;

public class TrickyPermutations {

	 public static void permutationNoDuplicates(String ques, String ans) {
	        if (ques.length() == 0) {
	            System.out.println(ans);
	            return;
	        }

	        for (int i = 0; i < ques.length(); i++) {
	            char ch = ques.charAt(i);
	            String ros = ques.substring(0, i) + ques.substring(i + 1);

	            boolean flag = true;

	            // Check for duplicate characters
	            for (int j = i + 1; j < ques.length(); j++) {
	                if (ques.charAt(j) == ch) {
	                    flag = false;
	                }
	            }

	            if (flag) {
	                permutationNoDuplicates(ros, ans + ch);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        //System.out.print("Enter a string: ");
	        String str = scanner.next();

	        // Convert the input string to char array and sort it
	        char[] charArray = str.toCharArray();
	        Arrays.sort(charArray);
	        String sortedStr = new String(charArray);

	        // Generate permutations without duplicates
	        permutationNoDuplicates(sortedStr, "");

	        scanner.close();
	    }
}
