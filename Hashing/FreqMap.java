package Hashing;

import java.util.LinkedHashMap;
import java.util.Map;

public class FreqMap {

	public static void main(String[] args) {
		
		int[] arr = {10,2,10,1000,2,1000,10,10};
		Map<Integer, Integer> freqMap = new LinkedHashMap<>();
		
		for(int i = 0; i< arr.length; i++) {
			if(freqMap.containsKey(arr[i])) {
				int val = freqMap.get(arr[i]);
				val++;
				freqMap.put(arr[i], val);
			}
			else {
				freqMap.put(arr[i], 1);
			}
		}
		System.out.println(freqMap);
	}
}
