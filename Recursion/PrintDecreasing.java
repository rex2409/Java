package Recursion;

public class PrintDecreasing {

	public static void decrease(int a) {
		
		if(a == 0) {
			return;
		}
		
		System.out.println(a);
		
		decrease(a-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		decrease(4);
	}

}
