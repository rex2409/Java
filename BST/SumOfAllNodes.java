//package BST;
//
//import java.util.Scanner;
//
//class Node {
//    public int data;
//    public Node left;
//    public Node right;
//
//    public Node(int d) {
//        data = d;
//        left = null;
//        right = null;
//    }
//}
//
//public class SumOfAllNodes {
//
//	   public static void buildTree(Node root, Scanner sc) {
//	        int data = sc.nextInt();
//	        root.data = data;
//
//	        String isLeftPresent = sc.next();
//	        if (isLeftPresent.equals("true")) {
//	            root.left = new Node(0); // Create left child node
//	            buildTree(root.left, sc);
//	        }
//
//	        String isRightPresent = sc.next();
//	        if (isRightPresent.equals("true")) {
//	            root.right = new Node(0); // Create right child node
//	            buildTree(root.right, sc);
//	        }
//	    }
//
//	    public static int sumOfNodes(Node root) {
//	        // base case
//	        if (root == null) {
//	            return 0;
//	        }
//
//	        // leaf node case
//	        if (root.left == null && root.right == null) {
//	            return root.data;
//	        }
//
//	        // recursive case
//	        int sumLeft = sumOfNodes(root.left);
//	        int sumRight = sumOfNodes(root.right);
//
//	        return sumLeft + sumRight + root.data;
//	    }
//
//	    public static void main(String[] args) {
//	        Scanner sc = new Scanner(System.in);
//
//	        Node root = new Node(0); // Create the root node
//	        buildTree(root, sc);
//
//	        int sum = sumOfNodes(root);
//	        System.out.println(sum);
//
//	        sc.close();
//	    }
//}
