//package BST;
//
//import java.util.Scanner;
//
//class TreeNode {
//    int data;
//    TreeNode[] children;
//
//    public TreeNode(int data, int numChildren) {
//        this.data = data;
//        this.children = new TreeNode[numChildren];
//    }
//}
//
//public class SumAtKLevel {
//
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Input tree
//        TreeNode root = buildTree(scanner);
//
//        // Input level K
//        int K = scanner.nextInt();
//
//        // Calculate and print the sum at level K
//        int sumAtLevelK = calculateSumAtLevelK(root, K);
//        System.out.println(sumAtLevelK);
//    }
//
//    // Function to build the generic tree
//    private static TreeNode buildTree(Scanner scanner) {
//        int data = scanner.nextInt();
//        int numChildren = scanner.nextInt();
//        TreeNode node = new TreeNode(data, numChildren);
//
//        for (int i = 0; i < numChildren; i++) {
//            node.children[i] = buildTree(scanner);
//        }
//
//        return node;
//    }
//
//    // Function to calculate the sum at level K
//    private static int calculateSumAtLevelK(TreeNode root, int K) {
//        return calculateSumAtLevelKHelper(root, 0, K);
//    }
//
//    private static int calculateSumAtLevelKHelper(TreeNode node, int currentLevel, int targetLevel) {
//        if (node == null) {
//            return 0;
//        }
//
//        // If the current level matches the target level, add the node's data to the sum
//        if (currentLevel == targetLevel) {
//            return node.data;
//        }
//
//        int sum = 0;
//
//        // Recursively calculate the sum for each child at the next level
//        for (TreeNode child : node.children) {
//            sum += calculateSumAtLevelKHelper(child, currentLevel + 1, targetLevel);
//        }
//
//        return sum;
//    }
//	
//}
