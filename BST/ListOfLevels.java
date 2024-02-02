package BST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ListOfLevels {
	 static Scanner scn = new Scanner(System.in);

	    public static void main(String[] args) {
	        ListOfLevels m = new ListOfLevels();
	        BinaryTree bt1 = m.new BinaryTree();
	        System.out.println(bt1.levelArrayList());
	    }

	    private class BinaryTree {
	        private class Node {
	            int data;
	            Node left;
	            Node right;
	        }

	        private Node root;
	        private int size;

	        public BinaryTree() {
	            this.root = this.takeInput(null, false);
	        }

	        public Node takeInput(Node parent, boolean ilc) {
	            int cdata = scn.nextInt();
	            Node child = new Node();
	            child.data = cdata;
	            this.size++;

	            // left
	            boolean hlc = scn.nextBoolean();

	            if (hlc) {
	                child.left = this.takeInput(child, true);
	            }

	            // right
	            boolean hrc = scn.nextBoolean();

	            if (hrc) {
	                child.right = this.takeInput(child, false);
	            }

	            // return
	            return child;
	        }

	        public ArrayList<ArrayList<Integer>> levelArrayList() {
	            ArrayList<ArrayList<Integer>> result = new ArrayList<>();

	            if (this.root == null) {
	                return result;
	            }

	            Queue<Node> queue = new LinkedList<>();
	            queue.offer(this.root);

	            while (!queue.isEmpty()) {
	                int levelSize = queue.size();
	                ArrayList<Integer> levelList = new ArrayList<>();

	                for (int i = 0; i < levelSize; i++) {
	                    Node currentNode = queue.poll();
	                    levelList.add(currentNode.data);

	                    if (currentNode.left != null) {
	                        queue.offer(currentNode.left);
	                    }

	                    if (currentNode.right != null) {
	                        queue.offer(currentNode.right);
	                    }
	                }

	                result.add(levelList);
	            }

	            return result;
	        }
	    }
}
