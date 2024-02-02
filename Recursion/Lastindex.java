package Recursion;

public class Lastindex {

	public static int lI(int[] arr, int ci, int search) {
		if(ci==arr.length) {
			return -1;
		}
		int recAns = lI(arr,ci+1,search);
		if(arr[ci]==search && recAns==-1) {
			return ci;
		}
		
		return recAns;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {7,10,7,7,5};
		int search = 7;
		
		System.out.println(lI(arr,0,search));
	}

}
