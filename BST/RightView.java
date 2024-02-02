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
//class RightView {
//
//	 public static TreeNode buildLevelOrder() {
//	        Scanner sc = new Scanner(System.in);
//	        int d = sc.nextInt();
//
//	        TreeNode root = new TreeNode(d);
//
//	        Queue<TreeNode> q = new LinkedList<>();
//	        q.add(root);
//
//	        while (!q.isEmpty()) {
//	            TreeNode f = q.poll();
//
//	            int left_d = sc.nextInt();
//	            int right_d = sc.nextInt();
//
//	            if (left_d != -1) {
//	                f.left = new TreeNode(left_d);
//	                q.add(f.left);
//	            }
//
//	            if (right_d != -1) {
//	                f.right = new TreeNode(right_d);
//	                q.add(f.right);
//	            }
//	        }
//
//	        return root;
//	    }
//
//	    public static void treeRightView(TreeNode root) {
//	        Queue<TreeNode> q = new LinkedList<>();
//	        q.add(root);
//	        q.add(null);
//
//	        while (!q.isEmpty()) {
//	            TreeNode f = q.poll();
//
//	            if (f == null) {
//	                if (!q.isEmpty()) {
//	                    q.add(null);
//	                }
//	            } else {
//	                if (q.peek() == null) {
//	                    System.out.print(f.data + " ");
//	                }
//
//	                if (f.left != null) {
//	                    q.add(f.left);
//	                }
//
//	                if (f.right != null) {
//	                    q.add(f.right);
//	                }
//	            }
//	        }
//	    }
//
//	    public static void main(String[] args) {
//	        TreeNode root = buildLevelOrder();
//	        treeRightView(root);
//	    }
//}
