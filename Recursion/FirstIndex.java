package Recursion;

public class FirstIndex {

	public static int fI(int[] arr, int ci, int search) {
		if(ci == arr.length)
			return -1;
		
		if(arr[ci] == search) {
			return ci;
		}
		int recAns = fI(arr, ci+1, search);
		return recAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5,10,7,5};
		int search = 7;
		
		System.out.println(fI(arr,0,search));
	}

}
