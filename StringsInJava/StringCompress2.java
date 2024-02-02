package StringsInJava;

import java.util.Scanner;

public class StringCompress2 {
	public static void comp(String a) {
		 int i = 0;
	        while (i < a.length()) {
	            char ch = a.charAt(i);
	            int freq = 0;
	            while (i < a.length() && a.charAt(i) == ch) {
	                freq++;
	                i++;
	            }
	            System.out.print(ch);
	          
	            System.out.print(freq);
	         
	        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		String inp = s.nextLine();
		
		comp(inp);
	}

}
