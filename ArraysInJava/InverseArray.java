package ArraysInJava;

import java.util.Scanner;

public class InverseArray {

	public static void inverse(int[] a, int n, int f[]) {
		
		int j;
		for(int i = 0; i<n; ++i) {
			j = a[i];
			f[j] = i;
		}
		
		for(j=0; j<n; j++) {
			System.out.print(f[j]+ " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		int[] a = new int[n];
		int[] f = new int[n];
		
		int i;
		for(i = 0; i<n ; i++) {
			a[i] = sc.nextInt();
		}
		
		inverse(a,n,f);
	}

}
