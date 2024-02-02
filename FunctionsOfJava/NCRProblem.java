package FunctionsOfJava;

public class NCRProblem {

	public static int factorial(int n) {
		int ans = 1;
		
		for(int i = 1;i<=n;i++) {
			ans = ans * i;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		//System.out.println(factorial(n));
		int r = 2;
		int a = factorial(n);
		int b = factorial(r);
		int c = factorial(n-r);
		
		int ans  = a/(b*c);
		System.out.println(ans);
	}

}
