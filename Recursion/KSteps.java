package Recursion;

public class KSteps {

	public static int sol(int ci, int n, int k) {
		if(ci == n) {
			return 1;
		}
		if(ci>n) {
			return 0;
		}
		
		int ans = 0;
		for(int jump = 1; jump<=k;jump++) {
			ans += sol(ci+jump,n, k);
		}
	
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sol(0,4,3));
	}

}
