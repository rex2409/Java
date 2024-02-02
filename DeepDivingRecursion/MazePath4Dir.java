package DeepDivingRecursion;

public class MazePath4Dir {

	private static void print(int cr,int cc, int er, int ec, String path,boolean[][] visi) {
		
		if(cr<0||cc<0||cr>er||cc>ec||visi[cr][cc]==true) {
			return;
		}
		
		if(cr==er && cc==ec) {
			System.out.println(path);
			return;
		}
		
		visi[cr][cc]=true;
		
		print(cr-1,cc, er,ec,path+'U',visi);
		print(cr+1,cc,er,ec,path+'D',visi);
		print(cr,cc-1,er,ec,path+'L',visi);
		print(cr,cc+1,er,ec,path+'R',visi);
		
		visi[cr][cc]=false;
		//return;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3, m = 3;
		
		print(0,0,n-1,m-1,"", new boolean[n][m]);
	}

}
