package BST;

import java.util.Scanner;

import Trees.BinaryTree;

public class PreOrderInOrder {

	static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
    	PreOrderInOrder m = new PreOrderInOrder();
        int[] pre = takeInput();
        int[] in = takeInput();
        BinaryTree bt = m.new BinaryTree(pre, in);
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

        public BinaryTree(int[] pre, int[] in) {
            this.root = this.construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
        }

        private Node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {
            if (plo > phi || ilo > ihi) {
                return null;
            }

            Node node = new Node();
            node.data = pre[plo]; // The first element in preorder is the root of the current subtree

            // Find the index of the root in inorder
            int rootIndex = -1;
            for (int i = ilo; i <= ihi; i++) {
                if (in[i] == node.data) {
                    rootIndex = i;
                    break;
                }
            }

            // Calculate the size of the left subtree
            int leftSubtreeSize = rootIndex - ilo;

            // Recursively construct left and right subtrees
            node.left = construct(pre, plo + 1, plo + leftSubtreeSize, in, ilo, rootIndex - 1);
            node.right = construct(pre, plo + leftSubtreeSize + 1, phi, in, rootIndex + 1, ihi);

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
