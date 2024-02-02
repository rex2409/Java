//package Graph;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Scanner;
//
//class DSU {
//    private int[] parent;
//    private int[] rank;
//
//    public DSU(int n) {
//        parent = new int[n];
//        rank = new int[n];
//        for (int i = 0; i < n; i++) {
//            parent[i] = -1;
//            rank[i] = 1;
//        }
//    }
//
//    public int find(int i) {
//        if (parent[i] == -1)
//            return i;
//        return parent[i] = find(parent[i]);
//    }
//
//    public void unite(int x, int y) {
//        int s1 = find(x);
//        int s2 = find(y);
//        if (s1 != s2) {
//            if (rank[s1] < rank[s2]) {
//                parent[s1] = s2;
//                rank[s2] += rank[s1];
//                rank[s1] = 0;
//            } else {
//                parent[s2] = s1;
//                rank[s1] += rank[s2];
//                rank[s2] = 0;
//            }
//        }
//    }
//}
//
//class Graph {
//    private List<int[]> edgelist;
//    private int v;
//
//    public Graph(int v) {
//        this.v = v;
//        edgelist = new ArrayList<>();
//    }
//
//    public void addEdge(int x, int y, int w) {
//        edgelist.add(new int[]{w, x, y});
//    }
//
//    public int kruskalMST() {
//        Collections.sort(edgelist, Comparator.comparingInt(edge -> edge[0]));
//        DSU dsu = new DSU(v);
//        int ans = 0;
//        for (int[] edge : edgelist) {
//            int w = edge[0];
//            int x = edge[1];
//            int y = edge[2];
//            if (dsu.find(x) != dsu.find(y)) {
//                dsu.unite(x, y);
//                ans += w;
//            }
//        }
//        return ans;
//    }
//}
//
//public class MinSpanningTree {
//
//	 public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//
//	        int n = scanner.nextInt();
//	        int m = scanner.nextInt();
//	        Graph g = new Graph(n + 1);
//
//	        for (int i = 0; i < m; i++) {
//	            int x = scanner.nextInt();
//	            int y = scanner.nextInt();
//	            int w = scanner.nextInt();
//	            g.addEdge(x, y, w);
//	        }
//
//	        System.out.println(g.kruskalMST());
//	    }
//}
