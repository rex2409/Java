package ArraysInJava;

public class MaxSubArray {//for sum of array

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {-1,2,3,-4};
		int n = 4;
		int maxSum = Integer.MIN_VALUE;
		
		for(int si = 0; si<= n-1; si++) {
			for(int ei = si; ei <= n-1; ei++){
				int cSum = 0;
				for(int k = si; k <=ei; k++) {
					cSum += arr[k];
				}
				if(cSum > maxSum)
					maxSum = cSum;
			}
		}
		System.out.println(maxSum);
	}

}
