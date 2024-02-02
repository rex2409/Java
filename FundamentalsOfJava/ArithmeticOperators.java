package FundamentalsOfJava;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		int sum = 0;
		
		sum = a + b;
		System.out.println(sum);
		
		int diff = a - b;
		System.out.println(diff);
		
		int mul = a * b;
		System.out.println(mul);
		
		float div = (float)a / (float)b;//quotient but truncated without typecasting
		System.out.println(div);
		
		float val = 10.2345234f;
		System.out.println(val);
		
		int mod = 20 % 18;// remainder
		System.out.println(mod);
		
		a++;
		System.out.println(a);
		
		b--;
		System.out.println(b);
		
	}

}
