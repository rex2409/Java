package StringsInJava;

import java.util.Scanner;

public class CharaType {

	public static void cType(char a) {
		if(a>='A'&& a<='Z') {
			System.out.println('U');
		}
		else if(a>='a'&& a<='z') {
			System.out.println('L');
		}
		else {
			System.out.println('I');
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		char a = sc.next().charAt(0);
		
		cType(a);
	}

}
