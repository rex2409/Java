package FunctionsOfJava;

public class ScopeOfVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	int a = 1;
		if(a>0) {
			int x = 10;
			System.out.println(x);
		}
		System.out.println(x);//it is out of bounds, wont print
	*/
		
	/*	int a = 1;
		if(a>0) {
			a=10;
			System.out.println(a);
		}
		System.out.println(a);//since a is defined outside, the new updation will overwrite the value if used in a new block
	*/
	/*	
		int a = 1;
		int x =-100;
		if(a>0) {
			a=10;
			int x = 10;//this is wront as it is a duplicate, it has already been initialised before
			System.out.println(x);
		}
		System.out.println(x);
	*/
	}

}
