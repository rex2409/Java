package Hashing;

import java.util.Map;
import java.util.HashMap;

public class TwoSum2Pass {

	private static void sol(int[] arr,int t) {
		// TODO Auto-generated method stub

		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i< arr.length;i++) {
			map.put(arr[i], i);
		}
		
		for(int i = 0; i < arr.length; i++) {
		
			int curr = arr[i];
			int diff = t - curr;
			if(map.containsKey(diff) && i != map.get(diff)) {
				System.out.println(i + " " + map.get(diff));
				break;
			}
		}
		//System.out.println(map);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {2,7,11,15};
		int t = 14;
		sol(arr,t);
	}

}
