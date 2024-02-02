package Recursion;

public class MazePath2Dir {

	public static void ppath(int cr, int cc, int er, int ec, String path) {
		
		if(cr>er||cc>ec) {
			return;
		}
		
		if(cr==er && cc==ec) {
			System.out.println(path);
			return;
		}
		
		
		ppath(cr,cc+1,er,ec,path+'H');
		
		ppath(cr+1,cc,er,ec,path+'V');
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3,m = 3;
		ppath(0,0,n-1,m-1,"");
	}

}
