package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class MaxTriangleOf1 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input: Number of rows and columns
	        int n = scanner.nextInt();
	        int m = scanner.nextInt();

	        // Input: Binary matrix
	        int[][] matrix = new int[n][m];
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < m; j++) {
	                matrix[i][j] = scanner.nextInt();
	            }
	        }

	        int maxRectangleArea = maximalRectangle(matrix);
	        System.out.println(maxRectangleArea);
	    }

	    public static int maximalRectangle(int[][] matrix) {
	        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
	            return 0;
	        }

	        int rows = matrix.length;
	        int cols = matrix[0].length;

	        int[] heights = new int[cols];
	        int maxArea = 0;

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                // Update the height array based on the current row
	                if (matrix[i][j] == 0) {
	                    heights[j] = 0;
	                } else {
	                    heights[j] += matrix[i][j];
	                }
	            }

	            // Calculate the maximum area for the current row
	            maxArea = Math.max(maxArea, largestRectangleArea(heights));
	        }

	        return maxArea;
	    }

	    public static int largestRectangleArea(int[] heights) {
	        Stack<Integer> stack = new Stack<>();
	        int maxArea = 0;

	        for (int i = 0; i <= heights.length; i++) {
	            int h = (i == heights.length) ? 0 : heights[i];

	            while (!stack.isEmpty() && h < heights[stack.peek()]) {
	                int height = heights[stack.pop()];
	                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
	                maxArea = Math.max(maxArea, height * width);
	            }

	            stack.push(i);
	        }

	        return maxArea;
	    }
}
