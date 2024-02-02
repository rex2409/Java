package Recursion;

public class CountLenOfStr {

	public static int length(String str) {
		if(str.isEmpty()) {
			return 0;
		}
		
		int recAns = length(str.substring(1));
		
		int myAns = recAns + 1;
		
		return myAns;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(length("JAVA"));
	}

}
