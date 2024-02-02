package Heaps;

import java.util.PriorityQueue;

public class KthLargestEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3,2,1,5,6,4};
		
		int k = 4;
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		
		for(int i = 0; i<arr.length; i++) {
			minHeap.add(arr[i]);
			
			if(minHeap.size()>k) {
				minHeap.poll();
			}
		}
		System.out.println(minHeap);
		System.out.println(minHeap.peek());
	}

}
