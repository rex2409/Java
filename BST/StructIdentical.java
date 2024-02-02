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
//public class StructIdentical {
//
//	 public static void buildTreePreOrder(Node root, Scanner sc) {
//	        int data = sc.nextInt();
//	        root.data = data;
//
//	        String isLeftPresent = sc.next();
//	        if (isLeftPresent.equals("true")) {
//	            root.left = new Node(0); // Create left child node
//	            buildTreePreOrder(root.left, sc);
//	        }
//
//	        String isRightPresent = sc.next();
//	        if (isRightPresent.equals("true")) {
//	            root.right = new Node(0); // Create right child node
//	            buildTreePreOrder(root.right, sc);
//	        }
//	    }
//
//	    public static boolean isIdentical(Node root1, Node root2) {
//	        // 1. both empty
//	        if (root1 == null && root2 == null) {
//	            return true;
//	        }
//
//	        // 2. both non-empty -> compare them
//	        if (root1 != null && root2 != null) {
//	            return (isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right));
//	        }
//
//	        // 3. one empty, one not -> false
//	        return false;
//	    }
//
//	    public static void main(String[] args) {
//	        Scanner sc = new Scanner(System.in);
//
//	        Node root1 = new Node(0); // Create the root node for the first tree
//	        Node root2 = new Node(0); // Create the root node for the second tree
//
//	        buildTreePreOrder(root1, sc);
//	        buildTreePreOrder(root2, sc);
//
//	        if (isIdentical(root1, root2)) {
//	            System.out.println("true");
//	        } else {
//	            System.out.println("false");
//	        }
//
//	        sc.close();
//	    }
//}
