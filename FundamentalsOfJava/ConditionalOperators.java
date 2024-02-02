package FundamentalsOfJava;

public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//can I play cricket
		boolean bat = true;
		boolean ball = true;
		
		System.out.println(bat && ball);//logical AND gate
		
		//can I make a call
		boolean cp = true;
		boolean tp = false;
		
		System.out.println(cp || tp);//logical OR gate
		
		boolean amIRich = true;
		
		System.out.println(!amIRich);// requires only 1 var as compared to above cases
	}

}
