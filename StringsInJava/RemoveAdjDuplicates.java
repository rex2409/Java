package StringsInJava;

import java.util.Scanner;

public class RemoveAdjDuplicates {

	public static String remAdj(String inp) {
		
		StringBuilder sb = new StringBuilder(inp);
		int i = 0, j = 1;
		
		while(j<inp.length()) {
			if(sb.charAt(i)!=sb.charAt(j)) {
				i++;
				sb.setCharAt(i, sb.charAt(j));
			}
			j++;
		}
		
		return sb.substring(0,i+1);//[0,i]
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		String inp = s.nextLine();
		String ans = remAdj(inp);
		System.out.println(ans);
	}

}
