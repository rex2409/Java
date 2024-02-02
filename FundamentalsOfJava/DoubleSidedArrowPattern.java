package FundamentalsOfJava;

public class DoubleSidedArrowPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 7;
		int i,j;
		
		for(i=0;i<n/2+1;i++) {
			for(j=0;j<n-2*i-1;j++) {
				System.out.print("  ");
			}
			for(j=i+1;j>0;j--) {
				System.out.print(j+" ");
			}
			for(j=0;j<2*i-1;j++) {
				System.out.print("  ");
			}
			for(j=1;j<=i+1;j++) {
				if(i!=0)
					System.out.print(j+" ");
			}
			System.out.println();
		}
		for(i=n/2-1; i>=0;i--) {
			for(j=0;j<n-2*i-1;j++) {
				System.out.print("  ");
			}
			for(j=i+1;j>0;j--) {
				System.out.print(j+" ");
			}
			for(j=0;j<2*i-1;j++) {
				System.out.print("  ");
			}
			for(j=1;j<=i+1;j++) {
				if(i!=0)
					System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
