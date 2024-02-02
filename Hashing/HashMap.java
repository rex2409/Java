package Hashing;

public class HashMap {

	private class Node{
		int key;
		String val;
		Node next;
		
		public Node(int key, String val) {
			this.key = key;
			this.val = val;
		}
	}
	
	private Node[] hashArr;
	private int cap;
	private int size;
	
	public HashMap(int cap) {
		this.cap = cap;
		hashArr = new Node[this.cap];
		this.size = 0;
	}
	
	private int hashFunction(int key){
		return (key % cap);
	}
	
	private void rehash() {
		// TODO Auto-generated method stub

		Node[] oldHashA = hashArr;
		this.cap = 2 * cap;
		hashArr = new Node[cap];
		size = 0;
		for(int i = 0; i < oldHashA.length; i++) {
			Node temp = oldHashA[i];
			while(temp != null) {
				put(temp.key,temp.val);
				temp = temp.next;
			}
		}
	}
	
	public void put(int key, String val) {
		
		int idx = hashFunction(key);
		
		for(int i = 0; i<cap;i++) {
			Node temp = hashArr[i];
			while(temp!=null) {
				if(temp.key == key) {
					temp.val = val;
					return;
				}
				temp = temp.next;
			}
		}
		
		Node nn = new Node(key,val);
		nn.next = hashArr[idx];
		hashArr[idx] = nn;
		size++;
		
		double lf = (1.0 * size)/cap;
				if(lf>0.75) {
					rehash();
				}
	}
	
	public boolean containsKey(int key) {
		// TODO Auto-generated method stub

		int idx = hashFunction(key);
		Node temp = hashArr[idx];
		while(temp != null) {
			if(temp.key == key) {
				return true;
			}
			
			temp = temp.next;
		}
		return false;
	}
	
	public String get(int key) {

		int idx = hashFunction(key);
		Node temp = hashArr[idx];
		
		while(temp!=null) {
			if(temp.key == key) {
				return temp.val;
			}
			temp = temp.next;
		}
		return null;
	}
	
	public void display() {
		// TODO Auto-generated method stub

		for(int i = 0; i< cap; i++) {
			System.out.print("Bucket" + i + "->");
			
			Node temp = hashArr[i];
			while(temp != null) {
				System.out.print("[" + temp.key + ", " + temp.val + "]" + "->");
				temp = temp.next;
			}
			System.out.println();
		}
	}
	
}
