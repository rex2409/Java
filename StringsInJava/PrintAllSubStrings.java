package StringsInJava;

public class PrintAllSubStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "code";
		
		//System.out.println(str.substring(1,1));
		for(int si = 0; si<= str.length()-1;si++) {
			for(int ei = si+1; ei<=str.length();ei++) {
				System.out.println(str.substring(si,ei));
			}
		}
	}

}
