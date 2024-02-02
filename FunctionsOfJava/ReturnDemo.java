package FunctionsOfJava;

public class ReturnDemo {

	public static int abc(int n) {
		if(n==5) {
			return 5;// if this return is hit, it will return only
		}
		System.out.println("hELLO");
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n= 5;
		int val = abc(n);
		System.out.println(val);
	}

}
