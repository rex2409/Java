//package BST;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Map;
//import java.util.Queue;
//import java.util.Scanner;
//import java.util.TreeMap;
//
//class Node {
//    int data;
//    Node left, right;
//
//    public Node(int d) {
//        data = d;
//        left = right = null;
//    }
//}
//
//public class VertOrderPrint {
//	  static Node createTree(Scanner scanner) {
//	        int d = scanner.nextInt();
//	        Node root = new Node(d);
//	        Queue<Node> q = new LinkedList<>();
//	        q.add(root);
//
//	        while (!q.isEmpty()) {
//	            Node f = q.poll();
//	            int c1 = scanner.nextInt();
//	            int c2 = scanner.nextInt();
//	            if (c1 != -1) {
//	                f.left = new Node(c1);
//	                q.add(f.left);
//	            }
//	            if (c2 != -1) {
//	                f.right = new Node(c2);
//	                q.add(f.right);
//	            }
//	        }
//	        return root;
//	    }
//
//	    static void vertical(Node root, int d, Map<Integer, List<Integer>> map) {
//	        if (root == null) {
//	            return;
//	        }
//	        map.computeIfAbsent(d, k -> new ArrayList<>()).add(root.data);
//
//	        vertical(root.left, d - 1, map);
//	        vertical(root.right, d + 1, map);
//	    }
//
//	    public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//	        int level = scanner.nextInt();
//	        Node root = createTree(scanner);
//	        int d = 0;
//	        Map<Integer, List<Integer>> map = new TreeMap<>();
//	        vertical(root, d, map);
//
//	        for (List<Integer> values : map.values()) {
//	            for (int x : values) {
//	                System.out.print(x + " ");
//	            }
//	        }
//	    }
//}
