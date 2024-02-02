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
//    Map<Integer, List<Integer>> l;
//
//    public Graph() {
//        l = new HashMap<>();
//    }
//
//    void addEdge(int x, int y) {
//        l.computeIfAbsent(x, k -> new ArrayList<>()).add(y);
//    }
//
//    void bfs(int src, int des) {
//        Map<Integer, Integer> dist = new HashMap<>();
//        Queue<Integer> q = new LinkedList<>();
//
//        for (int x : l.keySet()) {
//            dist.put(x, Integer.MAX_VALUE);
//        }
//
//        dist.put(src, 0);
//        q.add(src);
//
//        while (!q.isEmpty()) {
//            int node = q.poll();
//
//            for (int x : l.getOrDefault(node, new ArrayList<>())) {
//                if (dist.get(x) == Integer.MAX_VALUE) {
//                    q.add(x);
//                    dist.put(x, dist.get(node) + 1);
//                }
//            }
//        }
//
//        System.out.println(dist.get(des));
//    }
//}
//
//
//public class SnakeAndLadder {
//
//	 public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//
//	        int t = scanner.nextInt();
//	        while (t-- > 0) {
//	            int n = scanner.nextInt();
//	            int l = scanner.nextInt();
//	            int s = scanner.nextInt();
//
//	            int[] board = new int[50];
//
//	            for (int i = 0; i < l; i++) {
//	                int start = scanner.nextInt();
//	                int end = scanner.nextInt();
//	                int d = end - start;
//	                board[start] = d;
//	            }
//
//	            for (int i = 0; i < s; i++) {
//	                int start = scanner.nextInt();
//	                int end = scanner.nextInt();
//	                int d = end - start;
//	                board[start] = d;
//	            }
//
//	            Graph G = new Graph();
//
//	            for (int i = 0; i <= n; i++) {
//	                for (int dice = 1; dice <= 6; dice++) {
//	                    int j = i + dice;
//	                    j += board[j];
//	                    if (j <= n) {
//	                        G.addEdge(i, j);
//	                    }
//	                }
//	            }
//
//	            G.addEdge(n, n);
//	            G.bfs(0, n);
//	        }
//	    }
//}
