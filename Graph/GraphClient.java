package Graph;

public class GraphClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GraphDemo G = new GraphDemo(7);
		
		G.addEdge(1, 4, 6);
		G.addEdge(1, 2, 10);
		G.addEdge(2, 3, 2);
		G.addEdge(3, 4, 3);
		G.addEdge(5, 4, 10);
		G.addEdge(5, 6, 9);
		G.addEdge(5, 7, 15);
		G.addEdge(6, 7, 13);
		
		System.out.println(G.HM);
		
		G.allPath(1, 7);
		G.BFS(1);
		G.Dijkstra(1);
		
	}

}
