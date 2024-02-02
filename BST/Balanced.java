package BST;

import java.util.Scanner;

public class Balanced {

	 public static class Pair<T, U> {
	        public T first;
	        public U second;

	        public Pair(T first, U second) {
	            this.first = first;
	            this.second = second;
	        }
	    }

	    public static class Node {
	        public int data;
	        public Node left;
	        public Node right;

	        public Node(int d) {
	            data = d;
	            left = null;
	            right = null;
	        }
	    }

	    public static Node build(String s, Scanner sc) {
	        if (s.equals("true")) {
	            int d = sc.nextInt();
	            Node root = new Node(d);
	            String left = sc.next();
	            if (left.equals("true")) {
	                root.left = build(left, sc);
	            }
	            String right = sc.next();
	            if (right.equals("true")) {
	                root.right = build(right, sc);
	            }
	            return root;
	        }
	        return null;
	    }

	    public static Pair<Integer, Boolean> isHeightBalancedOptimised(Node root) {
	        // base case
	        Pair<Integer, Boolean> p = new Pair<>(0, true);
	        if (root == null) {
	            return p;
	        }

	        // rec case
	        Pair<Integer, Boolean> left = isHeightBalancedOptimised(root.left);
	        Pair<Integer, Boolean> right = isHeightBalancedOptimised(root.right);

	        p.first = Math.max(left.first, right.first) + 1;

	        if (Math.abs(left.first - right.first) <= 1 && left.second && right.second) {
	            p.second = true;
	        } else {
	            p.second = false;
	        }

	        return p;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Node root = build("true", sc);
	        System.out.println(isHeightBalancedOptimised(root).second);
	        sc.close();
	    }
}
