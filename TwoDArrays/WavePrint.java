package TwoDArrays;

public class WavePrint {

	public static void wavePrint(int[][] arr,int rows,int cols) {
		for(int r = 0; r< rows; r++) {
			if(r%2 == 0) {
				for(int c = 0; c< cols; c++) {
					System.out.print(arr[r][c]+" ");
				}
			}
			else {
				for(int c = cols - 1; c>=0; c--) {
					System.out.print(arr[r][c]+" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][]arr  = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		int rows = 4, cols = 4;
		
		wavePrint(arr,rows,cols);
	}

}
