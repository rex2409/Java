package BitManip;

public class BitWiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// & //and
		int a = 7;
		int b = 5;
		System.out.println(a&b);
		
		// | //or
		System.out.println(a|b);
		
		// ^ //xor
		System.out.println(a^b);
		
		// ~ //complement
		System.out.println(~a);
		
		// << //leftshift// can also be written as a = a*2^b
		int c = 1;
		System.out.println(c<<1);
		
		// >> //rightshift// a = a/2^b
		int d = 4;
		System.out.println(d>>1);
	}

}
