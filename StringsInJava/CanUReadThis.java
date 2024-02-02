package StringsInJava;

import java.util.Scanner;

public class CanUReadThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		String inp = s.nextLine();
		
		for(int i = 0; i < inp.length()-1 ; i++) {
			System.out.print(inp.charAt(i));
			if(inp.charAt(i+1)>=65 && inp.charAt(i+1)<=90) {
				System.out.println();
			}
		}
		System.out.print(inp.charAt(inp.length() - 1));
	}

}
