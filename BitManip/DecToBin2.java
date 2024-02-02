package BitManip;

public class DecToBin2 {

	public static void decToBin(int n) {
		StringBuilder sb = new StringBuilder();
		int pow = 1;
		
		
		while(n>0) {
			int rem = n%2;
			rem = rem * pow;
			sb.append(rem);
			//System.out.print(rem);
			n = n/ 2;
		}
		System.out.println(sb.reverse());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		decToBin(12);
	}

}
