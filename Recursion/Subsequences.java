package Recursion;

import java.util.Scanner;

public class Subsequences {

	 static void printSubsequences(int i, StringBuilder temp, String str, int[] cnt) {
	        if (i == str.length()) {
	            System.out.print(temp.toString() + " ");
	            cnt[0]++;
	            return;
	        }

	        printSubsequences(i + 1, temp, str, cnt);
	        temp.append(str.charAt(i));
	        printSubsequences(i + 1, temp, str, cnt);
	        temp.deleteCharAt(temp.length() - 1);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	     //   System.out.println("Enter a string:");
	        String str = scanner.next();

	        int[] cnt = {0};
	        printSubsequences(0, new StringBuilder(), str, cnt);
	        System.out.println();
	        System.out.println(cnt[0]);
	    }
	}