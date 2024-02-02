package StringsInJava;

import java.util.Scanner;

public class OddEven {

	public static void oddEven(String a) {
		for(int i = 0; i < a.length(); i++) {
			if(i%2 == 0) {
				char x = (char) (a.charAt(i) + 1);
				System.out.print(x);
			}
			else {
				char x = (char) (a.charAt(i) - 1);
				System.out.print(x);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		String inp = s.nextLine();
		
		oddEven(inp);
		
	}

}
