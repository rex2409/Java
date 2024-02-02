package FundamentalsOfJava;

import java.util.Scanner;

public class VonNeumanLovesBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i =0;i<n;i++) {
			int no = sc.nextInt();
			
			int num =0,place =0;
			
			while(no!=0) {
				int rem = no%10;
				num = (int) (num +rem*Math.pow(2,place));
				place++;
				no=no/10;
			}
			System.out.println(num);
		}
	}

}
