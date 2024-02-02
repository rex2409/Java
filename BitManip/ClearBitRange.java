package BitManip;

public class ClearBitRange {

	public static int clearRange(int n, int j, int i) {
		int maskA = 0;
		maskA = ~maskA;
		maskA = (maskA<<j);
		
		int maskB = (1<<i) - 1;
		
		int mask = (maskA|maskB);
		
		return (n&mask);
	}
	
	public static int clearBits(int n, int i) {
		
		int mask = 0;
		mask = ~mask;
		mask = ( mask << i);
		
		return (n & mask);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int ans = clearBits(15,2);
		int ans = clearRange(31,4,2);
		
		System.out.println(ans);
	}

}
