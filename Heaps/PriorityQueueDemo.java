package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> minHeap = new PriorityQueue<>();//by default minHeap
		
		minHeap.add(10);
		minHeap.add(20);
		minHeap.add(30);
		minHeap.add(5);
		minHeap.add(3);
		
		System.out.println(minHeap);
		
		System.out.println(minHeap.poll());
		System.out.println(minHeap);
		
		System.out.println(minHeap.peek());
		
		System.out.println(minHeap.isEmpty());
		
		System.out.println(minHeap.size());
		
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		maxHeap.add(10);
		maxHeap.add(20);
		maxHeap.add(30);
		maxHeap.add(5);
		maxHeap.add(3);
		
		System.out.println(maxHeap );
	}

}
