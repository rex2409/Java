package DeepDivingRecursion;

public class NQueens {

	private static boolean queenPlace(boolean[][] board,int cr,int cc,int n) {
		for(int row = 0; row<=cr-1;row++) {
			if(board[row][cc]) {
				return false;
			}
		}
		int row = cr;
		int col = cc;
		
		while(row>=0 && col<n) {
			if(board[row][col]) {
				return false;
			}
			row--;
			col++;
		}
		
		row = cr;
		col = cc;
		
		while(row>=0 && col>=0) {
			if(board[row][col]) {
				return false;
			}
			row--;
			col--;
		}
		
		return true;
	}
	
	private static void print(boolean[][] board,int cr, int n) {
		
		if(cr==n) {
			for(int i = 0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(board[i][j]) {
						System.out.print("Q ");
					}
					else {
						System.out.print("_ ");
					}
				}
				System.out.println();
			}
			System.out.println("*****************************");
		}
		
		for(int cc = 0; cc<n; cc++) {
			if(queenPlace(board,cr,cc,n)) {
				board[cr][cc] = true;
				print(board,cr+1,n);
				board[cr][cc] = false;//backtracking
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		boolean[][] board = new boolean[n][n];
		print(board,0,n);
	}

}
