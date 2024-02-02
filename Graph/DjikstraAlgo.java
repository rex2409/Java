package Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Node implements Comparable<Node> {
    int vertex, weight;

    public Node(int vertex, int weight) {
        this.vertex = vertex;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node other) {
        return Integer.compare(this.weight, other.weight);
    }
}

public class DjikstraAlgo {
	@SuppressWarnings("unchecked")

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int t = scanner.nextInt();
	        while (t-- > 0) {
	            int n = scanner.nextInt();
	            int m = scanner.nextInt();

	            ArrayList<Node>[] adj = new ArrayList[n + 1];
	            for (int i = 1; i <= n; i++) {
	                adj[i] = new ArrayList<>();
	            }

	            for (int i = 0; i < m; i++) {
	                int x = scanner.nextInt();
	                int y = scanner.nextInt();
	                int r = scanner.nextInt();
	                adj[x].add(new Node(y, r));
	                adj[y].add(new Node(x, r));
	            }

	            int s = scanner.nextInt();
	            dijkstra(adj, s, n);
	        }
	    }

	    private static void dijkstra(ArrayList<Node>[] adj, int s, int V) {
	        int[] distance = new int[V + 1];
	        boolean[] sptSet = new boolean[V + 1];
	        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();

	        for (int i = 1; i <= V; i++) {
	            distance[i] = Integer.MAX_VALUE;
	            sptSet[i] = false;
	        }

	        distance[s] = 0;
	        priorityQueue.add(new Node(s, 0));

	        while (!priorityQueue.isEmpty()) {
	            int u = priorityQueue.poll().vertex;

	            if (!sptSet[u]) {
	                sptSet[u] = true;
	                for (Node neighbor : adj[u]) {
	                    int v = neighbor.vertex;
	                    int weightUV = neighbor.weight;

	                    if (!sptSet[v] && distance[v] > distance[u] + weightUV) {
	                        distance[v] = distance[u] + weightUV;
	                        priorityQueue.add(new Node(v, distance[v]));
	                    }
	                }
	            }
	        }

	        for (int i = 1; i <= V; i++) {
	            if (distance[i] == Integer.MAX_VALUE)
	                distance[i] = -1;

	            if (i != s)
	                System.out.print(distance[i] + " ");

	        }
	        System.out.println();
	    }
}
