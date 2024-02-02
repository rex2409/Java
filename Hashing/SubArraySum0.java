package Hashing;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum0 {

	private static void sol(int[] arr) {
		// TODO Auto-generated method stub

		Map<Integer, Integer> map = new HashMap<>();
		
		int sum = 0;
		
		
		for(int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			
			if(sum == 0) {
				int si = 0;
				int ei = i;
				System.out.println(si + " " + ei);
				break;
			}
			
			
			else if(map.containsKey(sum)) {
				int si = map.get(sum)+1;
				int ei = i;
				
				System.out.println(si + " " + ei);
				break;
			}
			if(!map.containsKey(sum)) {
				map.put(sum, i);
			}
			
		}
		//System.out.println(map);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {-3,1,-4,2,-3,4};
		sol(arr);
	}

}
