//package BST;
//
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//class TreeNode {
//    int data;
//    TreeNode left;
//    TreeNode right;
//
//    public TreeNode(int data) {
//        this.data = data;
//        this.left = null;
//        this.right = null;
//    }
//}
//
//public class LeftView {
//
//
//    public static TreeNode buildTree() {
//        Scanner sc = new Scanner(System.in);
//        int d = sc.nextInt();
//        TreeNode root = new TreeNode(d);
//        Queue<TreeNode> q = new LinkedList<>();
//        q.add(root);
//
//        while (!q.isEmpty()) {
//            TreeNode root1 = q.poll();
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            
//            if (a != -1) {
//                root1.left = new TreeNode(a);
//                q.add(root1.left);
//            }
//            if (b != -1) {
//                root1.right = new TreeNode(b);
//                q.add(root1.right);
//            }
//        }
//        return root;
//    }
//
//    public static void printLeft(TreeNode root, int level, int[] maxLevel) {
//        if (root == null)
//            return;
//
//        if (maxLevel[0] < level) {
//            System.out.print(root.data + " ");
//            maxLevel[0] = level;
//        }
//
//        printLeft(root.left, level + 1, maxLevel);
//        printLeft(root.right, level + 1, maxLevel);
//    }
//
//    public static void main(String[] args) {
//        TreeNode root = buildTree();
//        int[] maxLevel = { -1 };
//        printLeft(root, 0, maxLevel);
//    }
//}
