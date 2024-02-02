package Hashing;

public class HashMapClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap hm = new HashMap(5);
		
		hm.put(71, "A");
		hm.put(81, "B");
		hm.put(75, "C");
		hm.put(89, "D");
		hm.put(29, "E");
		hm.put(99, "F");
		hm.put(79, "G");
		hm.put(72, "H");
		hm.put(81, "J");
		
		hm.display();
		
		System.out.println(hm.containsKey(22));
		
		System.out.println(hm.get(81));
	}

}
