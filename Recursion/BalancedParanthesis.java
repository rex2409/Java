package Recursion;

public class BalancedParanthesis {

	private static void genParen(int oc, int cc, int n, String out) {
		
		//base case
		if(oc == n && cc == n) {
			System.out.println(out);
			return;
		}
		
		//open
		if(oc<n)
			genParen(oc+1,cc,n,out+'(');
		
		//closed
		if(oc>cc) {
			genParen(oc,cc+1,n,out+')');
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		genParen(0,0,2, "");
	}

}
