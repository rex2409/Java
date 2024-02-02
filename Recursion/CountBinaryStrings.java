package Recursion;

public class CountBinaryStrings {

	public static int sol(int n) {
		if(n==1) {
			return 2;
		}
		if(n==2) {
			return 3;
		}
		
		int w1 = sol(n-1);
		int w2 = sol(n-2);
		
		return w1+w2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sol(3));
	}

}
