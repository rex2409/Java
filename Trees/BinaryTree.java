package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;

public class BinaryTree {

	Scanner s = new Scanner(System.in);
	
	class Node{
		
		int val;
		Node left;
		Node right;
		
		public Node(int val) {
			this.val = val;
		}
	}
	
	private Node root;
	
	public BinaryTree() {
		root = buildTree();
	}
	
	public BinaryTree(int[] pre, int[] in) {
		root = build(pre,in,0,pre.length-1);
	}
	
	private Node buildTree() {
		int val = s.nextInt();
		if(val == -1) {
			return null;
		}
		
		Node node = new Node(val);
		
		node.left = buildTree();
		node.right = buildTree();
		return node;
	}
	
	
	public void preOrder() {
		
		preOrder(root);
	}
	
	private void preOrder(Node root) {
		// TODO Auto-generated method stub

		if(root == null) {
			return;
		}
		
		System.out.print(root.val+ " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public void inOrder() {
		inOrder(root);
	}
	
	private void inOrder(Node root) {
		if(root == null) {
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.val + " ");
		inOrder(root.right);
	}
	
	public void postOrder() {
		postOrder(root);
	}
	
	private void postOrder(Node root) {
		if(root == null) {
			return;
		}
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.val + " ");
	}
	
	public void lvlOrder() {
		lvlOrder(root);
	}
	
	private void lvlOrder(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			Node front = q.remove();
			System.out.print(front.val + " ");
			
			if(front.left != null) {
				q.add(front.left);
			}
			
			if(front.right != null) {
				q.add(front.right);
			}
		}
	}
	
	public int countNode() {
		return countNodes(root);
	}
	
	private int countNodes(Node root) {
		
		if(root == null) {
			return 0;
		}
		
		int lC = countNodes(root.left);
		int rC = countNodes(root.right);
		
		int myans = lC + rC + 1;
		return myans;
	}
	
	public int height() {
		return height(root);
	}
	
	private int height(Node root) {
		
		if(root == null) {
			return 0;
		}
		
		int leftHt = height(root.left);
		int rightHt = height(root.right);
		
		int myAns = Math.max(leftHt, rightHt) + 1;
		
		return myAns;
	}
	
	public int diameter() {
		return diameter(root);
	}
	
	private int diameter(Node root) {
		
		if(root == null) {
			return 0;
		}
		
		int htL = this.height(root.left);
		int htR = this.height(root.right);
		
		int rootD = htL + htR;
		int leftD = diameter(root.left);
		int rightD = diameter(root.right);
		
		int treeDia = Math.max(leftD,Math.max(leftD, rootD));
		return treeDia;
	}
	
	public void lvlOrder2() {
		lvlOrder2(root);
	}
	
	private void lvlOrder2(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			Node front = q.remove();
			
			if(front == null) {
				
				if(!q.isEmpty()) {
					System.out.println();
					q.add(null);
				}
			}
			else {
				System.out.print(front.val + " ");
				
				if(front.left != null) {
					q.add(front.left);
				}
				
				if(front.right != null) {
					q.add(front.right);
				}
			}
		}
	}
	
	public void rightView() {
		rightView(root);
	}
	
	private void rightView(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			Node front = q.remove();
			
			if(front == null) {
				
				if(!q.isEmpty()) {
					System.out.println();
					q.add(null);
				}
			}
			else {
				if(q.peek() == null) {
					System.out.print(front.val + " ");
				}
				
				if(front.left != null) {
					q.add(front.left);
				}
				
				if(front.right != null) {
					q.add(front.right);
				}
			}
		}
	}
	
	public boolean isBalanced() {
		return isBalanced(root);
	}
	
	private boolean isBalanced(Node root) {
		
		if(root == null) {
			return true;
		}
		
		int leftH = this.height(root.left);
		int rightH = this.height(root.right);
		
		boolean isBalR = (Math.abs(leftH - rightH) <= 1);
		boolean isBalLeft = isBalanced(root.left);
		boolean isBalRight = isBalanced(root.right);
		
		return isBalR && isBalLeft && isBalRight;
	}
	
	int i = 0;
	public Node build(int[] pre, int[] in, int s, int e) {
		
		if(s>e) {
			return null;
		}
		
		Node nn = new Node(pre[i]);
		int idx = -1;
		
		for(int j = s; j<=e; j++) {
			if(pre[i] == in[j]) {
				idx = j;
				break;
			}
		}
		
		i++;
		
		nn.left = build(pre,in,s,idx-1);
		nn.right = build(pre,in,idx+1,e);
		
		return nn;
	}
	
	private class Pair{
		int vLvl;
		Node node;
		
		public Pair(int vLvl, Node node) {
			this.vLvl = vLvl;
			this.node = node;
		}
	}
	
	public void vertTraversal(){
		vertTraversal(root);
	}
	
	private void vertTraversal(Node root) {
		
		Queue<Pair> bfs = new LinkedList<>();
		bfs.add(new Pair(0, root));
		
		Map<Integer, List<Integer>> map = new TreeMap<>();
		
		while(!bfs.isEmpty()) {
			Pair front = bfs.poll();
			int frontL = front.vLvl;
			Node frontN = front.node;
			
			List<Integer> list = map.getOrDefault(frontL, new ArrayList<>());
			list.add(frontN.val);
			
			map.put(frontL, list);
			
			if(frontN.left != null) {
				bfs.add(new Pair(frontL - 1, frontN.left));
			}
			if(frontN.right != null) {
				bfs.add(new Pair(frontL + 1, frontN.right));
			}
		}
		
		System.out.println(map);
	}
}
