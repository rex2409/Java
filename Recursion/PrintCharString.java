package Recursion;

public class PrintCharString {

	public static void print(String str) {
		
		if(str.length()==0) {
			return;
		}
		char cc0th = str.charAt(0);
		System.out.println(cc0th);
		
		//index 1 to last
		print(str.substring(1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		print("JAVA");
	}

}
