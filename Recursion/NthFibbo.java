package Recursion;

public class NthFibbo {

	
	public static int fib(int n) {
		if(n==0||n==1) {
			return n;
		}
		
		int fibN_1 = fib(n-1);
		int fibN_2 = fib(n-2);
		
		int fibN = fibN_1 + fibN_2;
		return fibN;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fib(4));
	}

}
