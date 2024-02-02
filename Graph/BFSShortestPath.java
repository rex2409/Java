//package Graph;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Map;
//import java.util.Queue;
//import java.util.Scanner;
//
//class Graph {
//    Map<Integer, List<Pair<Integer, Integer>>> m;
//
//    public Graph() {
//        m = new HashMap<>();
//    }
//
//    void edgeAdd(int src, int dest, int dist) {
//        m.computeIfAbsent(src, k -> new ArrayList<>()).add(new Pair<>(dest, dist));
//        m.computeIfAbsent(dest, k -> new ArrayList<>()).add(new Pair<>(src, dist));
//    }
//
//    void shortestPath(int src, Map<Integer, Integer> d) {
//        Map<Integer, Integer> distance = new HashMap<>();
//        for (int key : m.keySet()) {
//            distance.put(key, Integer.MAX_VALUE);
//        }
//
//        distance.put(src, 0);
//        Queue<Integer> q = new LinkedList<>();
//        q.add(src);
//
//        while (!q.isEmpty()) {
//            int s = q.poll();
//            for (Pair<Integer, Integer> p : m.getOrDefault(s, new ArrayList<>())) {
//                int neighbor = p.getKey();
//                int weight = p.getValue();
//                if (distance.get(neighbor) > distance.get(s) + weight) {
//                    distance.put(neighbor, distance.get(s) + weight);
//                    q.add(neighbor);
//                    d.put(neighbor, distance.get(neighbor));
//                }
//            }
//        }
//    }
//}
//
//class Pair<K, V> {
//    private K key;
//    private V value;
//
//    public Pair(K key, V value) {
//        this.key = key;
//        this.value = value;
//    }
//
//    public K getKey() {
//        return key;
//    }
//
//    public V getValue() {
//        return value;
//    }
//}
//
//public class BFSShortestPath {
//
//	 public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//
//	        int t = scanner.nextInt();
//	        while (t-- > 0) {
//	            Graph g = new Graph();
//	            int n = scanner.nextInt();
//	            int m = scanner.nextInt();
//
//	            for (int i = 0; i < m; i++) {
//	                int a = scanner.nextInt();
//	                int b = scanner.nextInt();
//	                g.edgeAdd(a, b, 6);
//	            }
//
//	            Map<Integer, Integer> d = new HashMap<>();
//	            int src = scanner.nextInt();
//	            g.shortestPath(src, d);
//
//	            for (int i = 1; i <= n; i++) {
//	                if (i != src) {
//	                    if (d.containsKey(i)) {
//	                        System.out.print(d.get(i) + " ");
//	                    } else {
//	                        System.out.print("-1 ");
//	                    }
//	                }
//	            }
//	            System.out.println();
//	        }
//	    }
//}
