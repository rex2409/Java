package ArraysInJava;

import java.util.Scanner;

public class CyclicArraySum {

	public static int cyclic(int[] a, int n, int X, int[] f) {
		
		for(int i = 0; i<n ; i++) {
				/*if((i-X)<0) {
					a[i-X] = a[n-X+i];
					f[i] = a[i] + a[i-X];
				}
				else {
					f[i] = a[i] + a[i-X];
				}*/
			int newIndex = (i - X + n) % n; // Use modulo to handle circular indexing
	        f[i] = a[i] + a[newIndex];
			}

	
		for(int i = 0; i<n; i++) {
			a[i] = f[i];
		}
		return f[n-1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//int temp = 0;
		
		int[] a = new int[n];
		int[] f = new int[n];
		
		for(int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		int Q,X;
		
		Q = sc.nextInt();
		
		for(int i = 0; i<Q; i++) {
			X = sc.nextInt();
			cyclic(a,n,X,f);
		}
		for(int i = 0; i<n; i++) {
			f[i] = a[i];
		}
		
		int sum = 0, ans;
		for(int i = 0; i<n; i++) {
			sum+= f[i];
		}
		ans = sum % (1000000007);
		
		System.out.println(ans);
		
	}

}
