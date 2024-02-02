package DeepDivingRecursion;

public class RatInAMaze {

private static void print(int[][]maze, int cr,int cc, int er, int ec, String path,boolean[][] visi) {
		
		if(cr<0||cc<0||cr>er||cc>ec||visi[cr][cc]||maze[cr][cc]==1) {
			return;
		}
		
		if(cr==er && cc==ec) {
			System.out.println(path);
			return;
		}
		
		visi[cr][cc]=true;
		
		print(maze,cr-1,cc, er,ec,path+'U',visi);
		print(maze,cr+1,cc,er,ec,path+'D',visi);
		print(maze,cr,cc-1,er,ec,path+'L',visi);
		print(maze,cr,cc+1,er,ec,path+'R',visi);
		
		visi[cr][cc]=false;
		//return;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4, m = 4;
		int[][] maze = {{0,1,0,0},{0,0,0,0},{0,1,0,0},{0,1,1,0}};
		
		print(maze,0,0,n-1,m-1,"",new boolean[n][m]);
	}

}
