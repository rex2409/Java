package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KSortedMergeArrays {

	static class Node{
		int r,c,val;
		
		public Node(int r, int c, int val) {
			this.r = r;
			this.c = c;
			this.val = val;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return val + "";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = {{2,6,12,15},{1,3,14,20},{3,5,8,10}};
		
		PriorityQueue<Node> minHeap = new PriorityQueue<>(new Comparator<Node>() {
			
			@Override
			public int compare(Node o1, Node o2) {
				// TODO Auto-generated method stub
				return o1.val - o2.val;
			}
		});
		
		for(int r = 0; r< arr.length;r++) {
			minHeap.add(new Node(r,0,arr[r][0]));
		}
		
		while(!minHeap.isEmpty()) {
			Node top = minHeap.poll();
			
			int r = top.r;
			int c = top.c;
			
			System.out.print(top.val + " ");
			if(c+1 < arr[r].length) {
				minHeap.add(new Node(r,c+1,arr[r][c+1]));
			}
		}
		
		System.out.println(minHeap);
	}

}
