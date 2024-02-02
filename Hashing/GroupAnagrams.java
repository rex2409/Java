package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GroupAnagrams {

	private static void sol(String[] strs) {
		// TODO Auto-generated method stub

		Map<String, List<String>> map = new HashMap<>();
		for(int i = 0; i< strs.length; i++) {
			String currS = strs[i];
			char[] currSA = currS.toCharArray();
			Arrays.sort(currSA);
			String sortedString = new String(currSA);
			
			if(map.containsKey(sortedString)) {
				List<String> valList = map.get(sortedString);
				valList.add(currS);
				map.put(sortedString, valList);
			}
			else {
				List<String> valList = new ArrayList<>();
				valList.add(currS);
				map.put(sortedString, valList);
			}
		}
		
		System.out.println(map);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		sol(strs);
	}

}
