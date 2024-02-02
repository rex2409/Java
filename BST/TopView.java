//package BST;
//
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//import java.util.TreeMap;
//
//class Node {
//    int data;
//    Node left, right;
//
//    public Node(int item) {
//        data = item;
//        left = right = null;
//    }
//}
//
//public class TopView {
//	
//	 static Node root;
//
//	    public static void main(String args[]) {
//	        Scanner scanner = new Scanner(System.in);
//
//	        //System.out.println("Enter the level order traversal of the binary tree (space-separated, -1 for null nodes):");
//	        String input = scanner.nextLine().trim().replaceAll("\\s+", " ");
//
//	        // Sample input: 1 2 3 4 5 6 -1 -1 -1 -1 -1 -1 -1
//	        root = buildTree(input.split(" "));
//
//	       // System.out.println("Top view of the tree:");
//	        printTopView(root);
//
//	        scanner.close();
//	    }
//
//	    static Node buildTree(String[] nodes) {
//	        if (nodes.length == 0 || nodes[0].equals("-1")) return null;
//
//	        Node root = new Node(Integer.parseInt(nodes[0]));
//	        Queue<Node> queue = new LinkedList<>();
//	        queue.add(root);
//
//	        for (int i = 1; i < nodes.length; i += 2) {
//	            Node current = queue.poll();
//
//	            if (!nodes[i].equals("-1")) {
//	                current.left = new Node(Integer.parseInt(nodes[i]));
//	                queue.add(current.left);
//	            }
//
//	            if (i + 1 < nodes.length && !nodes[i + 1].equals("-1")) {
//	                current.right = new Node(Integer.parseInt(nodes[i + 1]));
//	                queue.add(current.right);
//	            }
//	        }
//
//	        return root;
//	    }
//
//	    static void printTopView(Node root) {
//	        if (root == null) return;
//
//	        TreeMap<Integer, Integer> map = new TreeMap<>();
//	        Queue<NodeWithHorizontalDistance> queue = new LinkedList<>();
//
//	        queue.add(new NodeWithHorizontalDistance(root, 0));
//
//	        while (!queue.isEmpty()) {
//	            NodeWithHorizontalDistance temp = queue.poll();
//	            int horizontalDistance = temp.horizontalDistance;
//	            Node node = temp.node;
//
//	            if (!map.containsKey(horizontalDistance)) {
//	                map.put(horizontalDistance, node.data);
//	            }
//
//	            if (node.left != null) {
//	                queue.add(new NodeWithHorizontalDistance(node.left, horizontalDistance - 1));
//	            }
//
//	            if (node.right != null) {
//	                queue.add(new NodeWithHorizontalDistance(node.right, horizontalDistance + 1));
//	            }
//	        }
//
//	        for (int value : map.values()) {
//	            System.out.print(value + " ");
//	        }
//	    }
//
//	    static class NodeWithHorizontalDistance {
//	        Node node;
//	        int horizontalDistance;
//
//	        public NodeWithHorizontalDistance(Node node, int horizontalDistance) {
//	            this.node = node;
//	            this.horizontalDistance = horizontalDistance;
//	        }
//	    }
//}
