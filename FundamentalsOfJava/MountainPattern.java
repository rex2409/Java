package FundamentalsOfJava;

import java.util.Scanner;

public class MountainPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i,j;
		
		for(i = 1; i <= n; i++) {
			//int k = 0;
			for(j = 1; j <= n*2-1; j++) {
				//int k = 4;
				if(j <= i) {
					System.out.print(j+"\t");
				}
				else if(j >= n*2 - i) {
					System.out.print(n*2-j+"\t");
					//k--;
				}
				else {
					System.out.print(" \t");
				}
				//k--;
				}
				System.out.println();
			}
		}
		
	}


