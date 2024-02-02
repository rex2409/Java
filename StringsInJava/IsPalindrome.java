package StringsInJava;

import java.util.Scanner;

public class IsPalindrome {

	public static boolean isPalin(String a) {
		int len = a.length();
		int i = 0;
		while(i<len) {
			if(a.charAt(i)!=a.charAt(len-1)) {
				return false;
			}
			i++;
			len--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		String inp = s.nextLine();
		
		if(isPalin(inp)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
