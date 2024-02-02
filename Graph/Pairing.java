//package Graph;
//
//import java.util.LinkedList;
//import java.util.Scanner;
//
//@SuppressWarnings("unchecked")
//class Graph<T> {
//    private LinkedList<Integer>[] l;
//    private int V;
//
//    public Graph(int V) {
//        this.V = V;
//        l = new LinkedList[V];
//        for (int i = 0; i < V; i++) {
//            l[i] = new LinkedList<>();
//        }
//    }
//
//    void addEdge(int x, int y) {
//        l[x].add(y);
//        l[y].add(x);
//    }
//
//    void dfsHelper(int src, boolean[] visited, long[] cntn) {
//        visited[src] = true;
//        cntn[0]++;
//
//        for (int nbr : l[src]) {
//            if (!visited[nbr]) {
//                dfsHelper(nbr, visited, cntn);
//            }
//        }
//    }
//
//    void dfs() {
//        boolean[] visited = new boolean[V];
//
//        long cnt_sub = 0;
//        for (int i = 0; i < V; i++) {
//            if (!visited[i]) {
//                long[] cntn = {0};
//                dfsHelper(i, visited, cntn);
//                long ans = (cntn[0]) * (cntn[0] - 1) / 2;
//                cnt_sub += ans;
//            }
//        }
//        long total = (V) * (V - 1) / 2;
//        System.out.println(total - cnt_sub);
//    }
//}
//
//
//@SuppressWarnings("unchecked")
//public class Pairing {
//	
//	public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int nodes = scanner.nextInt();
//        int edges = scanner.nextInt();
//        Graph<Integer> g = new Graph<>(nodes);
//
//        for (int i = 0; i < edges; i++) {
//            int x = scanner.nextInt();
//            int y = scanner.nextInt();
//            g.addEdge(x, y);
//        }
//
//        g.dfs();
//    }
//	
//}
