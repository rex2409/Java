package FundamentalsOfJava;

import java.util.Scanner;

public class NumDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        int k = 0, count = 0, count1 = 0;

	        // Upper half of the diamond
	        for (int i = 1; i <= n; ++i) {
	            for (int space = 1; space <= n - i; ++space) {
	                System.out.print("\t");
	            }

	            while (k != 2 * i - 1) {
	                if (count <= i - 1) {
	                    System.out.print((i + k) + "\t");
	                    ++count;
	                } else {
	                    ++count1;
	                    System.out.print((i + k - 2 * count1) + "\t");
	                }

	                ++k;
	            }
	            count1 = count = k = 0;

	            System.out.println();
	        }

	        // Lower half of the diamond
	        for (int i = n - 1; i >= 1; --i) {
	            for (int space = 1; space <= n - i; ++space) {
	                System.out.print("\t");
	            }

	            k = 0;
	            while (k != 2 * i - 1) {
	                if (count <= i - 1) {
	                    System.out.print((i + k) + "\t");
	                    ++count;
	                } else {
	                    ++count1;
	                    System.out.print((i + k - 2 * count1) + "\t");
	                }

	                ++k;
	            }
	            count1 = count = k = 0;

	            System.out.println();
	        }
	}
}
