package Recursion;

public class TilingProblem {

	public static int sol(int n) {
		
		if(n==1 || n == 2) {
			return n;
		}
		int c1 = sol(n-1);
		int c2 = sol(n-2);
		
		return c1 + c2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;
		System.out.println(sol(n));
	}

}
