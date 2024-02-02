//package BST;
//
//import java.util.Scanner;
//
//class Node {
//    int data;
//    Node left;
//    Node right;
//
//    Node(int d) {
//        data = d;
//        left = null;
//        right = null;
//    }
//}
//
//public class LowestCommonAncestor {
//
//	 static Scanner scn = new Scanner(System.in);
//
//	    public static void main(String[] args) {
//	        Node root = buildTree();
//	        int a = scn.nextInt();
//	        int b = scn.nextInt();
//
//	        Node ans = lca(root, a, b);
//	        System.out.println(ans.data);
//	    }
//
//	    public static Node buildTree() {
//	        int data = scn.nextInt();
//	        Node root = new Node(data);
//
//	        String isLeftPresent = scn.next();
//	        if (isLeftPresent.equals("true")) {
//	            root.left = buildTree();
//	        }
//
//	        String isRightPresent = scn.next();
//	        if (isRightPresent.equals("true")) {
//	            root.right = buildTree();
//	        }
//
//	        return root;
//	    }
//
//	    public static Node lca(Node root, int a, int b) {
//	        if (root == null) {
//	            return null;
//	        }
//
//	        if (root.data == a || root.data == b) {
//	            return root;
//	        }
//
//	        Node leftAns = lca(root.left, a, b);
//	        Node rightAns = lca(root.right, a, b);
//
//	        if (leftAns != null && rightAns != null) {
//	            return root;
//	        }
//
//	        if (leftAns != null) {
//	            return leftAns;
//	        }
//
//	        return rightAns;
//	    }
//}
