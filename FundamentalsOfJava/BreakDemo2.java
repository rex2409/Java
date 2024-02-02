package FundamentalsOfJava;

public class BreakDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		int n = 7;
		
		while(i >= 1) {
			if(i == n + 1) {
				break;
			}
			System.out.println(i);
			i++;
		}
	}

}
