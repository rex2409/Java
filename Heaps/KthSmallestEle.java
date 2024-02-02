package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {40,20,10,70,50,30,80,100,90,60};
		
		int k = 4;
		
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i = 0; i<arr.length; i++) {
			maxHeap.add(arr[i]);
			
			if(maxHeap.size()>k) {
				maxHeap.poll();
			}
		}
		System.out.println(maxHeap);
		System.out.println(maxHeap.peek());
	}

}
