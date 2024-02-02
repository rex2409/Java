package ArraysInJava;

import java.util.Scanner;

public class RainWater2 {

	public static void rain(int[] a, int n) {
		int[] left = new int [n];
		int[] right = new int [n];
		
		left[0]=a[0];
		for(int i =1;i<n;i++) {
			left[i] = Math.max(left[i-1],a[i]);
		}
		right[n-1] = a[n-1];
		for(int i = n-2;i>=0;i--) {
			right[i] = Math.max(right[i+1],a[i]);
		}
		
		int totalrain = 0;
		for(int i=0;i<n;i++) {
			totalrain+= (Math.min(left[i], right[i])-a[i]);
		}
		System.out.println(totalrain);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int t= sc.nextInt();
		
		int n;
		for(int i=0;i<t;i++) {
			n = sc.nextInt();
			int[]a=new int[n];
			for(int j =0;j<n;j++) {
				a[j]=sc.nextInt();
			}
			rain(a,n);
		}
	}

}
