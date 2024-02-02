//package BST;
//
//import java.util.ArrayList;
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
//public class RootToLeaf {
//
//	 static Scanner scn = new Scanner(System.in);
//
//	    public static void main(String[] args) {
//	        Node root = createTree();
//	        int sum = scn.nextInt();
//	        ArrayList<Integer> path = new ArrayList<>();
//	        printPathUtils(root, sum, 0, path);
//	    }
//
//	    public static Node createTree() {
//	        int data = scn.nextInt();
//	        Node root = new Node(data);
//
//	        String leftPresent = scn.next();
//	        if (leftPresent.equals("true")) {
//	            root.left = createTree();
//	        }
//
//	        String rightPresent = scn.next();
//	        if (rightPresent.equals("true")) {
//	            root.right = createTree();
//	        }
//
//	        return root;
//	    }
//
//	    public static void printPathUtils(Node root, int targetSum, int currentSum, ArrayList<Integer> path) {
//	        if (root == null) {
//	            return;
//	        }
//
//	        currentSum += root.data;
//	        path.add(root.data);
//
//	        if (root.left == null && root.right == null && currentSum == targetSum) {
//	            for (int i = 0; i < path.size(); i++) {
//	                System.out.print(path.get(i) + " ");
//	            }
//	            System.out.println();
//	        }
//
//	        if (root.left != null) {
//	            printPathUtils(root.left, targetSum, currentSum, path);
//	        }
//
//	        if (root.right != null) {
//	            printPathUtils(root.right, targetSum, currentSum, path);
//	        }
//
//	        path.remove(path.size() - 1);
//	    }
//}
