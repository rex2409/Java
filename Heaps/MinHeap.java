package Heaps;

import java.util.ArrayList;
import java.util.List;

public class MinHeap {

	
	List<Integer> nodes;
	
	public MinHeap() {
		this.nodes = new ArrayList<>();
		this.nodes.add(Integer.MIN_VALUE);
	}
	
	private void insert(int val) {
		// TODO Auto-generated method stub

		this.nodes.add(val);
		int cI = this.nodes.size() - 1;
		int pI = cI / 2;
		
		while(cI > 1 && this.nodes.get(pI) > this.nodes.get(cI)) {
			int temp = this.nodes.get(pI);
			
			this.nodes.set(pI, this.nodes.get(cI));
			
			this.nodes.set(cI, temp);
			
			cI = pI;
			pI = cI/2;
		}
	}
	
	private int top() {
		// TODO Auto-generated method stub

		return nodes.get(1);
	}
	
	private void downHeapify(int ci) {
		// TODO Auto-generated method stub

		int minI = ci;
		int lC = 2 *ci;
		int rC = 2*ci + 1;
		
		if(lC < nodes.size() && nodes.get(minI)>nodes.get(lC)) {
			minI = lC;
		}
		if(rC < nodes.size() && nodes.get(minI)>nodes.get(rC)) {
			minI = rC;
		}
		
		if(minI != ci) {
			int temp = nodes.get(ci);
			nodes.set(ci, nodes.get(minI));
			nodes.set(minI, temp);
			downHeapify(minI);
		}
	}
	
	private int delete() {
		// TODO Auto-generated method stub

		int lI = this.nodes.size() - 1;
		int temp = this.top();
		this.nodes.set(1, this.nodes.get(lI));
		this.nodes.set(lI, temp);
		
		int rV  = this.nodes.remove(lI);
		
		downHeapify(1);
		return rV;
	}
	
	public static void main(String[] args) {
		MinHeap h = new MinHeap();
		
		h.insert(10);
		h.insert(20);
		h.insert(30);
		h.insert(5);
		h.insert(3);
		
		System.out.println(h.nodes);
		//System.out.println(h.top());
		
		System.out.println(h.delete());
		System.out.println(h.nodes);
	}
}
