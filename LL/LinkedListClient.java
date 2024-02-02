package LL;

public class LinkedListClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

//		LinkedList ll = new LinkedList();
//		
//		ll.addAtFirst(10);
//		ll.addAtFirst(20);
//		ll.addAtFirst(30);
//		
//		ll.addAtIndex(60, 2);
//		
//		ll.addAtLast(40);
//		
//		ll.display();
//		
////		System.out.println(ll.getFirstNodeValue());
////		
////		System.out.println(ll.getLastNodeValue());
////		
////		System.out.println(ll.getNodeValueAtIndex(2));
////		
////		System.out.println(ll.getNodeAtIndex(3));
//		
//		//ll.reverseIterative();
//		//ll.display();
//		
//		System.out.println(ll.midPointVal());
//		
//		System.out.println(ll.kthNodeFromLast(2));
		
		LinkedList a = new LinkedList();
		a.addAtLast(1);
		a.addAtLast(3);
		a.addAtLast(4);
		a.addAtLast(7);
		
		LinkedList b = new LinkedList();
		b.addAtLast(0);
		b.addAtLast(2);
		b.addAtLast(8);
		b.addAtLast(10);
		
		LinkedList ans = b.merge(a, b);
		ans.display();
		
	}

}
