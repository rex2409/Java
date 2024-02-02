package Heaps;

import java.util.ArrayList;
import java.util.List;

public class ArrayToHeap {

	private static void downHeapify(List<Integer> nodes, int ci, int vSize) {
		// TODO Auto-generated method stub

		int maxI = ci;
		int lC = 2 *ci;
		int rC = 2*ci + 1;
		
		if(lC < vSize && nodes.get(maxI)<nodes.get(lC)) {
			maxI = lC;
		}
		if(rC < vSize && nodes.get(maxI)<nodes.get(rC)) {
			maxI = rC;
		}
		
		if(maxI != ci) {
			int temp = nodes.get(ci);
			nodes.set(ci, nodes.get(maxI));
			nodes.set(maxI, temp);
			downHeapify(nodes, maxI, vSize);
		}
	}
	
	private static void buildHeap(List<Integer> nodes) {
		// TODO Auto-generated method stub

		for(int ci = (nodes.size() - 1)/2; ci >= 1; ci--) {
			downHeapify(nodes,ci,nodes.size());
		}
	}
	
	private static void heapSort(List<Integer> nodes) {
		// TODO Auto-generated method stub

		buildHeap(nodes);
		
		int vSize = nodes.size();
		while(vSize > 1) {
			int temp = nodes.get(1);
			nodes.set(1, nodes.get(vSize-1));
			nodes.set(vSize-1, temp);
			vSize--;
			
			downHeapify(nodes, 1, vSize);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> nodes = new ArrayList<>();
		
		nodes.add(Integer.MIN_VALUE);
		
//		for(int i = 15; i>=1; i--) {
//			nodes.add(i);
//		}
//		for(int ci = (nodes.size() - 1)/2; ci >= 1; ci--) {
//			downHeapify(nodes,ci);
//		}
//		System.out.println(nodes);
		
		nodes.add(2);
		nodes.add(1);
		nodes.add(0);
		nodes.add(4);
		nodes.add(3);
		
		heapSort(nodes);
		
		System.out.println(nodes);
	}

}
