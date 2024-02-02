package ArraysInJava;

public class PairSum {

	public static void pairSum(int[] arr, int n, int t) {
		int s = 0, e = n-1;
		
		while(s<e) {
			int sum = arr[s] + arr[e];
			if(sum<t) {
				s++;
			}
			else if(sum>t) {
				e--;
			}
			else{
				System.out.println(s +" "+ e);
				s++;
				e--;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,3,5,7,10,11,12,13};
		
		int n = 8;
		int t = 16;
		
		pairSum(arr,n,t);
	}

}
