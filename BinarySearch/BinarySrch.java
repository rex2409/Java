package BinarySearch;

public class BinarySrch {

	public static int binarySearch(int[] arr, int search) {
		int l = 0, r = arr.length - 1;
		
		while(l<=r) {
			int mid = (l+r)/2;
			
			if(arr[mid]==search) {
				return mid;
			}
			else if(arr[mid]<search) {
				l = mid+1;
			}
			else {
				r = mid - 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,5,8,12,16,23,38,56,72,91};
		int search = 23;
		
		System.out.println(binarySearch(arr,search));
	}

}
