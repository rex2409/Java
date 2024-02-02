package Trees;

public class BinaryTreeClient {

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.preOrder();
		System.out.println();
		bt.inOrder();
		System.out.println();
		bt.postOrder();
		System.out.println();
		
		System.out.println(bt.height());
		
		System.out.println(bt.diameter());
		
		System.out.println(bt.countNode());
		
		bt.lvlOrder();
		System.out.println();
		
		bt.lvlOrder2();
		System.out.println();
		
		System.out.println(bt.isBalanced());
	}
}
