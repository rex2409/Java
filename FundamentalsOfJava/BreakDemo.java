package FundamentalsOfJava;

public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pos = 0;
		while(true) {
			if(pos == 5) {
				break;
			}//if break executes all other statements are ignored
			System.out.println("Stop me if u can");
			pos++;
		}
		System.out.println(pos);
	}

}
