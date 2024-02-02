package ArraysInJava;

import java.util.Scanner;

public class MaxCircularSum {

	public static int kadane(int[] a, int n) {
		int max_so_far = 0, max_ending_here = 0;
		int i;
		for(i = 0; i<n; i++) {
			max_ending_here = max_ending_here + a[i];
			if(max_ending_here<0) {
				max_ending_here = 0;
			}
			if(max_so_far<max_ending_here) {
				max_so_far=max_ending_here;
			}
		}
		return max_so_far;
	}
	
	public static int maxCirSum(int[] a, int n) {
		int max_kadane = kadane(a,n);
		
		int max_wrap = 0,i;
		for(i=0;i<n;i++) {
			max_wrap += a[i];
			a[i] = -a[i];
		}
		max_wrap = max_wrap + kadane(a,n);
		
		if(max_wrap>max_kadane) {
			return max_wrap;
		}
		else
			return max_kadane;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i<t;i++) {
			int n = sc.nextInt();
			int[] a = new int [n];
			for(int j = 0;j<n;j++) {
				a[j] = sc.nextInt();
			}
			System.out.println(maxCirSum(a,n));
		}
	}

}
