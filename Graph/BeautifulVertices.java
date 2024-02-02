//package Graph;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Scanner;
//import java.util.Set;
//
//public class BeautifulVertices {
//
//	 static List<Integer>[] adj;
//	    static int[] childCount;
//	    static int[] visited;
//	    static long happy = 0;
//	    static List<Integer> master = new ArrayList<>();
//	    static Set<Integer> s = new HashSet<>();
//
//	    public static void dfs(int x) {
//	        visited[x] = -1;
//	        for (int i : adj[x]) {
//	            if (visited[i] == 0) {
//	                dfs(i);
//	            }
//	        }
//	        visited[x] = 1;
//	        s.add(x);
//	    }
//
//	    public static void dfs2(int x, int y) {
//	        visited[x] = -1;
//	        for (int i : adj[x]) {
//	            if (visited[i] == 0) {
//	                dfs2(i, x);
//	            }
//	        }
//	        visited[x] = 1;
//	        if (x != y && childCount[x] > childCount[y]) {
//	            happy++;
//	        }
//	    }
//	    @SuppressWarnings("unchecked")
//	    public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//
//	        int node = scanner.nextInt();
//	        int edge = scanner.nextInt();
//
//	        adj = new ArrayList[node + 1];
//	        for (int i = 1; i <= node; i++) {
//	            adj[i] = new ArrayList<>();
//	        }
//
//	        childCount = new int[node + 1];
//	        visited = new int[node + 1];
//
//	        for (int i = 1; i <= edge; i++) {
//	            int node1 = scanner.nextInt();
//	            int node2 = scanner.nextInt();
//	            adj[node1].add(node2);
//	            adj[node2].add(node1);
//	            childCount[node1]++;
//	            childCount[node2]++;
//	        }
//
//	        for (int i = 1; i <= node; i++) {
//	            visited[i] = 0;
//	        }
//
//	        for (int i = 1; i <= node; i++) {
//	            if (visited[i] == 0) {
//	                dfs(i);
//	                master.add(Collections.min(s));
//	                s.clear();
//	            }
//	        }
//
//	        for (int i = 1; i <= node; i++) {
//	            if (!master.contains(i)) {
//	                childCount[i]--;
//	            }
//	        }
//
//	        Arrays.fill(visited, 0);
//
//	        for (int i : master) {
//	            if (visited[i] == 0) {
//	                dfs2(i, i);
//	            }
//	        }
//
//	        System.out.println(happy);
//	    }
//}
