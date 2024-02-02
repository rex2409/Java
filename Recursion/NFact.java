package Recursion;

public class NFact {

	public static int fact(int n) {
		
		
		//base case
		if(n==0) {
			return 1;
		}
		
		//recursive calls
		int recAns = fact(n-1);
		
		//my work{ans}
		int myAns = n * recAns;
		return myAns;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4;
		int ans = fact(n);
		System.out.println(ans);
	}

}
