package StringsInJava;

import java.util.Scanner;

public class AsciiDiff {

	public static void diffAscii(String a) {
		int len = a.length();
		int e = len -1 ;
		
		for(int i = 1; i<len;i++) {
			int x = a.charAt(i) - a.charAt(i-1);
			System.out.print(a.charAt(i-1)+""+x);
		}
		System.out.println(a.charAt(e));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		String inp = s.nextLine();
		
		diffAscii(inp);
	}

}
