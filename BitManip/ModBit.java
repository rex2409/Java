package BitManip;

public class ModBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 7;
		int i = 2;
		
		int b = 0;
		
		int mask = 1;
		mask = (mask << i);
		
		mask = ~mask;
		
		n = n & mask;
		
		b = b<<i;
		
		n = n| b;
		
		System.out.println(n);
	}

}
