package BinarySearch;

public class FirstBad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] arr = {'G','B','B','B','B'};
		int n = 5;
		int l = 0, r = n-1;
		
		while(r>l+1) {
			int mid = (l+r)/2;
			
			if(arr[mid]=='B') {
				r = mid;
			}
			else {
				l = mid;
			}
		}
		System.out.println(r);
	}

}
