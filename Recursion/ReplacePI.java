package Recursion;

public class ReplacePI {

	public static void sol(String inp, String out) {
		
		if(inp.length()<=1) {
			System.out.println(out+inp);
			return;
		}
		if(inp.charAt(0) == 'p' && inp.charAt(1) == 'i') {
			sol(inp.substring(2), out + 3.14);
		}
		else {
			sol(inp.substring(1), out+inp.charAt(0));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sol("xpipippixx", "");
	}

}
