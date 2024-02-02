package BitManip;

public class UnsetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 7;
		int i = 2;
		int mask = 1;
		mask = ~(mask<<i);
		
		System.out.println(mask);
		
		a = (a&mask);
		System.out.println(a);
	}

}
