package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class GenAllSubSeq {

	public static void generateSubsequences(String str, int index, StringBuilder current, String[] result) {
        // Include the current subsequence
        result[0] += current.toString() + " ";

        for (int i = index; i < str.length(); i++) {
            // Include the current character and recurse
            current.append(str.charAt(i));
            generateSubsequences(str, i + 1, current, result);
            current.deleteCharAt(current.length() - 1); // Backtrack
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // Number of strings

        for (int i = 0; i < N; i++) {
            String str = scanner.next();
            StringBuilder current = new StringBuilder();
            String[] result = new String[]{""};

            // Sort the result lexicographically
            generateSubsequences(str, 0, current, result);
            String[] subsequences = result[0].split(" ");
            Arrays.sort(subsequences);

            // Print the subsequences in lexicographical order
            for (String subsequence : subsequences) {
                System.out.println(subsequence);
            }
        }

        scanner.close();
    }

}
