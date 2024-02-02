package StringsInJava;

public class CountFreq {

	public static void printFreq(String str) {
		
		int[] freq = new int[26];
//		char cc = 'd';
//		int index = cc - 'a';
//		System.out.println(index);
		
		for(int i = 0; i<str.length();i++) {
			char cc = str.charAt(i);
			int index = cc - 'a';
			freq[index]++;//freq[cc-'a']++//freq[str.charAt(i) - 'a']++
		}
		for(int i = 0; i<26;i++) {
			int val = i+97;
			char cc = (char)val;
			if(freq[i]>0) {
				System.out.print(cc + "->" + freq[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabbbglll";
		printFreq(str);
	}

}
