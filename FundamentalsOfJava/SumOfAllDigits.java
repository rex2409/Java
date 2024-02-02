package FundamentalsOfJava;

public class SumOfAllDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1234;
		int sum = 0;
		
		while(num != 0) {
			int digit = num % 10;
			sum += digit;
			num = num / 10;
		}
		System.out.println(sum);
	}

}
