package StringsInJava;

import java.util.Scanner;

public class ToggleCase {

	public static void toggle(String a) {
		for(int  i =0; i<a.length();i++) {
			if(a.charAt(i)<'a') {
				char x = (char) (a.charAt(i) + 32);
				System.out.print(x);
			}
			else if(a.charAt(i)>='a'){
				char x = (char) (a.charAt(i) - 32);
				System.out.print(x);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String inp = s.nextLine();
		
		toggle(inp);
	}

}
