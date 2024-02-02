package Recursion;

public class PrintRevCharString {

	public static void print(String str) {
		if(str.length()==0) {
			return;
		}
		print(str.substring(1));
		char cc0th = str.charAt(0);
		System.out.println(cc0th);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		print("CODE");
	}

}
