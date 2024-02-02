package StringsInJava;

import java.util.Scanner;

public class PiyushMagicPark {

	public static void magic(char[][] a, int n, int m, int k, int s) {
		boolean success = true;
		for(int i =0; i<n ; i++) {
			for(int j = 0; j<m ; j++) {
				if(s<k) {
					success = false;
					break;
				}
				if(a[i][j] == '.') {
					if(j == (m-1)) {
						s-=2;
					}
					else {
						s-=3;
					}
				}
				else if(a[i][j] == '*') {
					if(j == (m-1)) {
						s+=5;
					}
					else {
						s+=4;
					}
				}
				else if(a[i][j] == '#') {
					break;
				}
			}
		}
		if(success == true) {
			System.out.println("Yes");
			System.out.print(s);
		}
		else {
			System.out.println("No");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//char[][] a = new char[100][100];
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		int S = sc.nextInt();
		
		char[][] a = new char[N][M];
		
		for(int i = 0; i<N;i++) {
			for(int j = 0; j<M; j++) {
					a[i][j] = sc.next().charAt(0);
				}
			}
		magic(a,N,M,K,S);
	}

}
