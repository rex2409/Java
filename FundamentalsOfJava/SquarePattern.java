package FundamentalsOfJava;

public class SquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int row = 1;
		
		while(row <= n) {
			int col = 1;
			while(col <= n) {
				System.out.print("* ");
				col++;
			}
			System.out.println();
			row++;
		}
	}

}
