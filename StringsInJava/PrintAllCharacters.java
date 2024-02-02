package StringsInJava;

import java.util.Scanner;

public class PrintAllCharacters {

	public static void printAllChars(String inp) {
		for(int i = 0; i<inp.length();i++) {
			System.out.println(inp.charAt(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		String inp = s.nextLine();
		
		printAllChars(inp);
		
	}

}
