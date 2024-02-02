package Hashing;

import java.util.HashMap;
import java.util.Map;

public class LargestSubArraySum0 {

	private static int sol(int[] arr) {
		// TODO Auto-generated method stub

		Map<Integer, Integer> map = new HashMap<>();
		
		int sum = 0;
		int maxL = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			
			if(sum == 0) {
				int si = 0;
				int ei = i;
				maxL = Math.max(maxL, ei-si+1);
				
			}
			
			
			if(map.containsKey(sum)) {
				int si = map.get(sum)+1;
				int ei = i;
				maxL = Math.max(maxL, ei-si+1);
				
			}
			if(!map.containsKey(sum)) {
				map.put(sum, i);
			}
			
		}
		return maxL;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {15,-2,2,-8,1,7,10,23};
		
		System.out.println(sol(arr));
	}

}
