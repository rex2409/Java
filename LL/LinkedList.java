package LL;

public class LinkedList {

	class Node{
		int val;
		Node next;
		
		public Node(int val) {
			// TODO Auto-generated constructor stub
			this.val = val;
		}
		
	}
	
	Node head;
	Node tail;
	
	int size;
	
	public void addAtFirst(int value) {
		
		Node nn = new Node(value);
		
		if(size == 0) {
			head = nn;
			tail = nn;
			size++;
		}
		else {
			nn.next = head;
			head = nn;
			size++;
		}
		
	}
	
	public void addAtLast(int value) {
		Node nn = new Node(value);
		
		if(size == 0) {
			addAtFirst(value);
		}
		else {
			tail.next = nn;
			tail = nn;
			size++;
		}
	}
	
	public int getFirstNodeValue() throws Exception {
		
		if(size == 0) {
			throw new Exception("Linked List is Empty!");
		}
		
		return head.val;
	}
	
	public int getLastNodeValue() throws Exception{
		if(size == 0) {
			throw new Exception("Linked List is Empty!");
		}
		return tail.val;
	}
	
	public int getNodeValueAtIndex(int idx) throws Exception {
		
		if(idx < 0 || idx >= size) {
			throw new Exception("Invalid index!");
		}
		
		if(size == 0) {
			throw new Exception("Linked List is Empty!");
		}
		
		Node i = head;
		for(int k = 1; k <= idx; k++) {
			i = i.next;
		}
		
		return i.val;
	}
	
	public Node getNodeAtIndex(int idx) throws Exception {
		if(idx < 0 || idx >= size) {
			throw new Exception("Invalid index!");
		}
		
		if(size == 0) {
			throw new Exception("Linked List is Empty!");
		}
		
		Node i = head;
		for(int k = 1; k <= idx; k++) {
			i = i.next;
		}
		
		return i;//address of type Node is returned
	}
	
	public void addAtIndex(int val,int idx) throws Exception{
		
		if(idx<0||idx>size) {
			throw new Exception("Invalid Index");
		}
		
		if(idx == 0) {
			addAtFirst(val);
		}
		else if(idx == size){
			addAtLast(val);
		}
		else {
			Node nn = new Node(val);
			Node prev = getNodeAtIndex(idx - 1);//idx - 1th node
			Node prevNext = prev.next;
			prev.next = nn;
			nn.next = prevNext;
			size++;
		}
	}
	
	public int deleteFirst() throws Exception {
		
		if(size == 0) {
			throw new Exception("Linked List is Empty!");
		}
		
		if(size == 1) {
			tail = null;
		}
		
		Node i = head;
		head = head.next;
		i.next = null;
		size--;
		
		return i.val;
	}
	
	public int deleteLast() throws Exception {
		
		if(size == 0) {
			throw new Exception("Linked List is Empty!");
		}
		
		if(size == 1) {
			return deleteFirst();
		}
		else {
		
			Node secLast = getNodeAtIndex(size-2);
			
			int temp = tail.val;
			secLast.next = null;
			tail = secLast;
			size--;
			
			return temp;
		}
	}
	
	public void display() {
		
		Node i = head;
		while(i != null) {
			System.out.print(i.val + " -> ");
			i = i.next;
			
		}
		System.out.println();
	}
	
	public void reverseIterative() {
		Node prev = null;
		Node curr = head;
		
		while(curr != null) {
			Node ahead = curr.next;
			curr.next = prev;
			prev = curr;
			curr = ahead;
		}
		Node temp = head;
		head = tail;
		tail = temp;
	}
	
	public Node midPoint() {
		Node s = head;
		Node f = head;
		
		while(f != null && f.next != null) {
			s = s.next;
			f = f.next.next;
		}
		
		return s;
	}
	
	public int midPointVal() {
		
		return midPoint().val;
	}
	
	
	public int kthNodeFromLast(int k) {
		
		Node s = head;
		Node f = head;
		
		for(int i = 1; i<=k; i++) {
			f = f.next;
		}
		
		while(f != null) {
			s = s.next;
			f = f.next;
		}
		
		return s.val;
	}
	
	public LinkedList merge(LinkedList a, LinkedList b) {
		LinkedList ans = new LinkedList();
		Node t1 = a.head;
		Node t2 = b.head;
		
		while(t1 != null && t2 != null) {
			if(t1.val<t2.val) {
				ans.addAtLast(t1.val);
				t1 = t1.next;
			}
			else {
				ans.addAtLast(t2.val);
				t2 = t2.next;
			}
		}
		while(t2 != null) {
			ans.addAtLast(t2.val);
			t2 = t2.next;
		}
		while(t1 != null) {
			ans.addAtLast(t1.val);
			t1 = t1.next;
		}
		
		
		return ans;
	}
	
	public void createCycle() throws Exception{
		Node nn = getNodeAtIndex(2);
		tail.next = nn;
	}
	
	public boolean floydCycleDetection() {
		Node s = head;
		Node f = head;
		
		while(f != null && f.next != null) {
			s = s.next;
			f = f.next.next;
			
			if(s == f) {
				return true;
			}
		}
		
		return false;
	}
	
	public int cycleRemoval() {
		Node s = head;
		Node f = head;
		
		boolean hasCycle = false;
		while(f != null && f.next != null) {
			
			s = s.next;
			f = f.next.next;
			
			if(s==f) {
				hasCycle = true;
				break;
			}
		}
		
		if(hasCycle) {
			Node sDash = head;
			while(true) {
				if(s.next == sDash.next) {
					s.next = null;
					return sDash.next.val;
				}
				
				s = s.next;
				sDash = sDash.next;
			}
		}
		return Integer.MAX_VALUE;
	}
}
