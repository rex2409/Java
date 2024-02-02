package BST;

import java.util.Scanner;

public class PostOrderInOrder {

	 static Scanner scn = new Scanner(System.in);

	    public static void main(String[] args) {
	    	PostOrderInOrder m = new PostOrderInOrder();
	        int[] post = takeInput();
	        int[] in = takeInput();
	        BinaryTree bt = m.new BinaryTree(post, in);
	        bt.display();
	    }

	    public static int[] takeInput() {
	        int n = scn.nextInt();

	        int[] rv = new int[n];
	        for (int i = 0; i < rv.length; i++) {
	            rv[i] = scn.nextInt();
	        }

	        return rv;
	    }

	    private class BinaryTree {
	        private class Node {
	            int data;
	            Node left;
	            Node right;
	        }

	        private Node root;
	        private int size;

	        public BinaryTree(int[] post, int[] in) {
	            this.root = this.construct(post, 0, post.length - 1, in, 0, in.length - 1);
	        }

	        private Node construct(int[] post, int plo, int phi, int[] in, int ilo, int ihi) {
	            if (plo > phi || ilo > ihi) {
	                return null;
	            }

	            Node node = new Node();
	            node.data = post[phi]; // The last element in postorder is the root of the current subtree

	            // Find the index of the root in inorder
	            int rootIndex = -1;
	            for (int i = ilo; i <= ihi; i++) {
	                if (in[i] == node.data) {
	                    rootIndex = i;
	                    break;
	                }
	            }

	            // Recursively construct left and right subtrees
	            node.left = construct(post, plo, plo + rootIndex - ilo - 1, in, ilo, rootIndex - 1);
	            node.right = construct(post, plo + rootIndex - ilo, phi - 1, in, rootIndex + 1, ihi);

	            return node;
	        }

	        public void display() {
	            this.display(this.root);
	        }

	        private void display(Node node) {
	            if (node == null) {
	                return;
	            }

	            String str = "";

	            if (node.left != null) {
	                str += node.left.data;
	            } else {
	                str += "END";
	            }

	            str += " => " + node.data + " <= ";

	            if (node.right != null) {
	                str += node.right.data;
	            } else {
	                str += "END";
	            }

	            System.out.println(str);

	            this.display(node.left);
	            this.display(node.right);
	        }
	    }
}
