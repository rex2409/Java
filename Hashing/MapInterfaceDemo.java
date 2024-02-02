package Hashing;

import java.util.Map;
import java.util.HashMap;

public class MapInterfaceDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> popMap = new HashMap<>();
		//HashMap<String, Integer> map1 = new HashMap();
//		popMap.put("India", 200);//Insert
//		System.out.println(popMap);
//		popMap.put("India", 300);//Update
//		System.out.println(popMap);
//		
//		System.out.println(popMap.get("India"));//case sensitive key
//		System.out.println(popMap.get("Usa"));
//		
//		System.out.println(popMap.containsKey("India"));
//		
//		//safety check
//		if(popMap.containsKey("Usa")) {
//			System.out.println(popMap.get("Usa"));
//		}
//		else {
//			System.out.println("Key not present");
//		}
		
		popMap.put("India", 200);
		popMap.put("USA", 100);
		popMap.put("NZ", 50);
		
		System.out.println(popMap);
		System.out.println(popMap.keySet());
		
		System.out.println(popMap.getOrDefault("India", 10));//only get will run
		
		System.out.println(popMap.getOrDefault("UK", 10));//key not present, default runs
		
		popMap.putIfAbsent("UK", 150);// will not update, just inserts if not present
		System.out.println(popMap);
		/*
		for(String key : popMap.keySet()) {
			System.out.println(key + " " + popMap.get(key));
		}
		
		System.out.println(popMap.entrySet());
		
		for(var entry : popMap.entrySet()) {//for java 10 and above
			System.out.println(entry);
			
			System.out.println(entry.getKey()+ " " + entry.getValue());
		}
		
		for(Map.Entry<String, Integer> entry : popMap.entrySet()) {
			
			System.out.println(entry.getKey() + " " + entry.getValue());
			
		}
		*/
	}
}
