package TwoDArrays;

public class TwoDArrayIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int r = 0; r < arr.length;r++) {
			for(int c = 0; c < arr[0].length;c++) {
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
	}

}
