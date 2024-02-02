package Recursion;

public class ClimbingStairs {

	public static int countWays(int currStep, int n) {
		
		//+ve
		if(currStep == n) {
			return 1;
		}
		
		//-ve
		if(currStep>n) {
			return 0;
		}
		
		int left = countWays(currStep+1,n);
		
		int right = countWays(currStep+2,n);
		
		return left+right;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(countWays(0,2));
	}

}
