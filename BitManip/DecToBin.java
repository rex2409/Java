package BitManip;

public class DecToBin {

	public static void decToBin(int n) {
		int pow = 1;
		int binNum = 0;
		
		while(n>0) {
			int rem = n%2;
			rem = rem * pow;
			binNum += rem;
			pow = pow * 10;
			//System.out.print(rem);
			n = n/ 2;
		}
		System.out.println(binNum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		decToBin(12);
	}

}
