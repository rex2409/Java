package Recursion;

public class PermuOfAString {

	private static void pperm(String inp,String perm) {
		if(inp.length()==0) {
			System.out.println(perm);
			return;
		}
		
		for(int ci = 0; ci<inp.length();ci++) {
			char cith = inp.charAt(ci);
			String left = inp.substring(0,ci)+ inp.substring(ci+1);
			pperm(left,perm+cith);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pperm("abc","");
	}

}
