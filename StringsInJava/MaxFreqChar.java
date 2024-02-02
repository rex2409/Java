package StringsInJava;

import java.util.Scanner;

public class MaxFreqChar {

	public static void maxFreqChar(String str) {
		int[] freq = new int[26];
//		char cc = 'd';
//		int index = cc - 'a';
//		System.out.println(index);
		
		for(int i = 0; i<str.length();i++) {
			char cc = str.charAt(i);
			int index = cc - 'a';
			freq[index]++;//freq[cc-'a']++//freq[str.charAt(i) - 'a']++
		}
		int max=0;
		for(int i = 0; i<26;i++) {
			//int val = i+97;
			//char cc = (char)val;
			if(freq[i]>freq[max]) {
				//System.out.print(cc + "->" + freq[i]+" ");
				max = i;
			}
		}
		
		char maxFreq = (char)(max+'a');
		System.out.println(maxFreq);
//		for(int i = 0; i<26;i++) {
//			if(freq[i]==max) {
//				char x = (char) (i + 97);
//				System.out.println(x);
//			}
//		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		String inp = s.nextLine();
		
		maxFreqChar(inp);
	}

}
