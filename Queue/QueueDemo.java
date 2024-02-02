package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> q = new LinkedList<>();
		
		q.add(10);
		q.add(20);
		q.add(30);
		
		System.out.println(q.peek());//check first element
		
		System.out.println(q.poll());//remove front element
		
		System.out.println(q.size());
		
		System.out.println(q.isEmpty());
		
		System.out.println(q);//display
		
	}

}
