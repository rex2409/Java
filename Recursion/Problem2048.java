package Recursion;

public class Problem2048 {

	static String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};

	public static void sol(int num) {
	
		if( num == 0) {
			return;
		}
		sol(num / 10);
		int digit = num%10;
		
		System.out.print(arr[digit]+" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sol(2345356);
	}

}
