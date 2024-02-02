package DynamicProgramming;

import java.util.Arrays;

public class LIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,5,2,3,4,9,6,10};
		
		int n = arr.length;
		
		int[] dp = new int[n];
		
		Arrays.fill(dp, 1);
		
		for(int i = 1; i<n;i++) {
			for(int j = 0; j<i;j++) {
				if(arr[j]<arr[i]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
		}
		
		System.out.println(Arrays.toString(dp));
		
		int ans = Integer.MIN_VALUE;
		
		for(int e:dp) {
			ans = Math.max(e, ans);
		}
		
		System.out.println(ans);
	}

}
