package Recursion;

import java.util.Scanner;

public class PhoneNumLetterCombo {

	private static String getString(char cc) {
		if(cc == '1') {
			return "abc";
		}
		else if(cc == '2') {
			return "def";
		}
		else if(cc == '3') {
			return "ghi";
		}
		else if(cc == '4') {
			return "jkl";
		}
		else if(cc == '5') {
			return "mno";
		}
		else if(cc == '6') {
			return "pqrs";
		}
		else if(cc == '7') {
			return "tuv";
		}
		else if(cc == '8') {
			return "wx";
		}
		else if(cc == '9') {
			return "yz";
		}
		return "";
	}
	
	private static int combo(String inp, String out) {
        if(inp.length() == 0) {
            System.out.print(out + " ");
            return 1; // Found a valid combination
        }
        char ccoth = inp.charAt(0);
        String mappedString = getString(ccoth);

        int count = 0;
        for(int ci = 0; ci < mappedString.length(); ci++) {
            count += combo(inp.substring(1), out + mappedString.charAt(ci));
        }
        return count;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    	Scanner sc = new Scanner(System.in);
    	
    	String n = sc.nextLine();
    	
        int count = combo(n, "");
        System.out.println();
        System.out.println(count);
    }

}
