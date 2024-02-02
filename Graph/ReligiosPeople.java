//package Graph;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Scanner;
//
//class Graph {
//    private long V;
//    private Map<Long, List<Long>> adjList;
//
//    public Graph(long v) {
//        V = v;
//        adjList = new HashMap<>();
//        for (long i = 1; i <= V; i++) {
//            adjList.put(i, new ArrayList<>());
//        }
//    }
//
//    public void addEdge(long u, long v) {
//        adjList.get(u).add(v);
//        adjList.get(v).add(u);
//    }
//
//    public void printAdjList() {
//        for (Map.Entry<Long, List<Long>> entry : adjList.entrySet()) {
//            System.out.print(entry.getKey() + " -> ");
//            for (long j : entry.getValue()) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    private void dfsHelper(long node, Map<Long, Boolean> visited) {
//        visited.put(node, true);
//
//        for (long child : adjList.get(node)) {
//            if (!visited.get(child)) {
//                dfsHelper(child, visited);
//            }
//        }
//    }
//
//    public long dfsReligiousPeople(long src, long a, long b) {
//        if (a <= b) {
//            return V * a;
//        }
//
//        Map<Long, Boolean> visited = new HashMap<>();
//        for (long i = 1; i <= V; i++) {
//            visited.put(i, false);
//        }
//
//        long components = 1;
//        dfsHelper(src, visited);
//
//        for (Map.Entry<Long, List<Long>> entry : adjList.entrySet()) {
//            long city = entry.getKey();
//            if (!visited.get(city)) {
//                dfsHelper(city, visited);
//                components++;
//            }
//        }
//
//        long n = adjList.size();
//        long totalCost = a * components + b * (n - components) + a * (V - n);
//
//        return totalCost;
//    }
//}
//
//
//public class ReligiosPeople {
//
//	 public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//
//	        long testCases = scanner.nextLong();
//	        while (testCases-- > 0) {
//	            long n = scanner.nextLong();
//	            long m = scanner.nextLong();
//	            long a = scanner.nextLong();
//	            long b = scanner.nextLong();
//
//	            Graph g = new Graph(n);
//	            for (long i = 0; i < m; i++) {
//	                long u = scanner.nextLong();
//	                long v = scanner.nextLong();
//	                g.addEdge(u, v);
//	            }
//
//	            System.out.println(g.dfsReligiousPeople(1, a, b));
//	        }
//	    }
//}
