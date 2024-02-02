package StringsInJava;

import java.util.Scanner;

public class CountPalinSubstr {

	public static boolean palin(String a, int i, int j) {
		while(i<j) {
			if(a.charAt(i)!=a.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	public static void countPalinSub(String a) {
		int len = a.length();
		int count = 0;
		
		for(int i = 0; i<len; i++) {
			String temp = "";
			for(int j = i; j< len; j++) {
				temp = a.substring(i,j+1);
				if(palin(temp,0,temp.length()-1)) {
					count++;
				}
			}
		}
		System.out.print(count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		String inp = s.nextLine();
		
		countPalinSub(inp);
	}

}
