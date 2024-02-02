package Recursion;

public class ClimbingStairs123 {

	public static int sol(int ci, int n) {
		if(ci == n) {
			return 1;
		}
		if(ci>n) {
			return 0;
		}
		
		int one = sol(ci+1,n);
		int two = sol(ci+2,n);
		int three = sol(ci+3,n);
		
		return one+two+three;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sol(0,4));
	}

}
