package FundamentalsOfJava;

public class MirrorTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		
		while(row <= n) {
			
			//printing spaces
			int col = 1;
			while(col <= nsp) {
				System.out.print(" \t");
				col++;
			}
			
			//printing stars
			col = 1;
			while(col <= nst) {
				System.out.print("*\t");
				col++;
			}
			
			System.out.println();
			nsp--;
			nst++;
			row++;
		}
	}

}
