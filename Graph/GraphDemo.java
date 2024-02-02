package Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import BST.Balanced.Pair;

public class GraphDemo {

	HashMap<Integer, HashMap<Integer,Integer>> HM;
	
	GraphDemo(int numV){
		HM = new HashMap<>();
		for(int V = 1; V<=numV;V++) {
			HM.put(V,  new HashMap<>());
		}
	}
	
	public void addEdge(int V1, int V2, int wt) {
		// TODO Auto-generated method stub

		HashMap<Integer, Integer> Nbrs_V1=HM.get(V1);
		Nbrs_V1.put(V2, wt);
		
		HashMap<Integer, Integer> Nbrs_V2=HM.get(V2);
		Nbrs_V2.put(V1, wt);
	}
	
	public int getEdge(int V1, int V2) {
		// TODO Auto-generated method stub

		return HM.get(V1).get(V2);
	}
	
	public void remEdge(int V1, int V2) {
		// TODO Auto-generated method stub

		HM.get(V1).remove(V2);
		HM.get(V2).remove(V1);
	}
	
	
	public boolean hasPath(int src, int dest) {
		
		return hasPath(src, dest, new HashSet<Integer>());
	}
	
	private boolean hasPath(int curr, int dest, HashSet<Integer> Visited) {
		// TODO Auto-generated method stub

		if(curr == dest) {
			return true;
		}
		boolean ans = false;
		Visited.add(curr);
		for(int nbr: HM.get(curr).keySet()) {
			if(!Visited.contains(nbr)) {
				boolean sp = hasPath(nbr,dest, Visited);
				ans = ans || sp;
			}
		}
		return ans;
	}
	
	public void allPath(int src, int dest) {
		
		allPath(src, dest, new HashSet<Integer>(), src+" ");
	}
	
	private boolean allPath(int curr, int dest, HashSet<Integer> Visited, String path) {
		// TODO Auto-generated method stub

		if(curr == dest) {
			System.out.println(path);
			return true;
		}
		boolean ans = false;
		Visited.add(curr);
		for(int nbr: HM.get(curr).keySet()) {
			if(!Visited.contains(nbr)) {
				boolean sp = allPath(nbr,dest, Visited, path + " "+ nbr);
				ans = ans || sp;
			}
		}
		Visited.remove(curr);
		return ans;
	}
	
	public void BFS(int src) {
		// TODO Auto-generated method stub

		HashSet<Integer> Visited = new HashSet<Integer>();
		Queue<Integer> Q = new LinkedList<>();
		Q.add(src);
		while(!Q.isEmpty()) {
			int curr = Q.poll();
			Visited.add(curr);
			System.out.println(curr);
			for(int nbr : HM.get(curr).keySet()) {
				if(!Visited.contains(nbr)) {
					Q.add(nbr);
				}
			}
		}
		
	}
	
	public void BFT() {
		// TODO Auto-generated method stub

		HashSet<Integer> Visited = new HashSet<Integer>();
		int numOfComp = 0;
		for(int src:HM.keySet()) {
			if(Visited.contains(src)) {
				continue;
			}
			numOfComp++;
			Queue<Integer> Q = new LinkedList<>();
			Q.add(src);
			while(!Q.isEmpty()) {
				int curr = Q.poll();
				Visited.add(curr);
				System.out.println(curr);
				for(int nbr : HM.get(curr).keySet()) {
					if(!Visited.contains(nbr)) {
						Q.add(nbr);
					}
				}
			}
		}
		System.out.println(numOfComp);
	}
	
	class pair implements Comparable<pair>{
		public pair(int src, int i) {
			V = src;
			Dst = i;
		}
		int V;
		int Dst;
		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
			return this.Dst - o.Dst;
		}
	}
	
	public void Dijkstra(int src) {
		// TODO Auto-generated method stub

		PriorityQueue<pair> PQ = new PriorityQueue<>();
		HashSet<Integer> Visited = new HashSet<>();
		PQ.add(new pair(src,0));
		while(!PQ.isEmpty()) {
			pair curr = PQ.poll();
			System.out.println(curr.V + " - " + curr.Dst);
			Visited.add(curr.V);
			for(int nbr : HM.get(curr.V).keySet()) {
				if(!Visited.contains(nbr)) {
					int wt = curr.Dst + getEdge(nbr,curr.V);
					pair p = new pair(nbr,wt);
					PQ.add(p);
				}
			}
		}
	}
}
