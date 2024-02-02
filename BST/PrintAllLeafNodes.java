//package BST;
//
//import java.util.LinkedList;
//import java.util.Queue;
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
//public class PrintAllLeafNodes {
//
//    public static Node levelOrderBuild(Scanner sc) {
//        Queue<Node> q = new LinkedList<>();
//        int data = sc.nextInt();
//        Node root = new Node(data);
//        q.add(root);
//
//        while (!q.isEmpty()) {
//            Node temp = q.poll();
//
//            int leftIn = sc.nextInt();
//            int rightIn = sc.nextInt();
//
//            if (leftIn != -1) {
//                temp.left = new Node(leftIn);
//                q.add(temp.left);
//            }
//
//            if (rightIn != -1) {
//                temp.right = new Node(rightIn);
//                q.add(temp.right);
//            }
//        }
//
//        return root;
//    }
//
//    public static void printLeafNode(Node root) {
//        // base case
//        if (root == null) {
//            return;
//        }
//
//        if (root.left == null && root.right == null) {
//            System.out.print(root.data + " ");
//            return;
//        }
//
//        printLeafNode(root.left);
//        printLeafNode(root.right);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        Node root = levelOrderBuild(sc);
//
//        printLeafNode(root);
//
//        sc.close();
//    }
//}
