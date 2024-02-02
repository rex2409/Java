package Recursion;

public class TOH {

	private static void sol(int n, char src, char helper, char des) {
		
		if(n==1) {
			System.out.println("Move Disk "+n+" from "+src+" to "+ des);
			return;
		}
		
		sol(n-1, src,des,helper);
		System.out.println("Move Disk "+n+" from "+src+" to "+ des);
		sol(n-1,helper,src,des);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sol(3,'A','B','C');
	}

}
