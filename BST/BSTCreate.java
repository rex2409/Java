package BST;

public class BSTCreate {

	class Node{
		
		public Node(int i) {
			data = i;
		}
		int data;
		Node left;
		Node right;
	}
	Node root;
	public BSTCreate(int[] arr) {
		root = create(arr,0,arr.length-1);
	}
	
	public void print() {
		print(root);
		System.out.println();
	}
	
	private void print(Node nn) {
		
		if(nn==null) {
			return;
		}
		print(nn.left);
		System.out.print(nn.data + " ");
		print(nn.right);
	}
	
	private Node create(int[] arr, int s, int e) {
		
		if(s>e) {
			return null;
		}
		
		int mid = (s+e)/2;
		Node nn = new Node(arr[mid]);
		
		nn.left = create(arr,s,mid-1);
		nn.right = create(arr,mid+1,e);
		
		return nn;
	}
	
	public int min() {
		return min(root);
	}
	
	private int min(Node nn) {
		if(nn.left == null) {
			return nn.data;
		}
		return min(nn.left);
	}
	public boolean find(int ele) {
		return find(root,ele);
	}

	private boolean find(Node nn, int ele) {
		// TODO Auto-generated method stub
		if(nn == null) {
			return false;
		}
		
		if(nn.data == ele) {
			return true;
		}
		else if(nn.data<ele) {
			return find(nn.right, ele);
		}
		else {
			return find(nn.left,ele);
		}
	}
	
	public void add(int ele) {
		root=add(root,ele);
	}

	private Node add(Node nn, int ele) {
		// TODO Auto-generated method stub
		
		if(nn == null) {
			return new Node(ele);
		}
		
		if(nn.data<ele) {
			nn.right = add(nn.right,ele);
		}
		else {
			nn.left = add(nn.left,ele);
		}
		return nn;
	}
}
