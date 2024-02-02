package ArraysInJava;

import java.util.Arrays;
import java.util.Scanner;

public class PairOfRoses {

	public static void rosePair(int[] a, int n, int money) {
		int i = 0, j = n-1, diff,first = 0,second = 0;
		int min = Integer.MAX_VALUE;
		while(i<j) {
			if(a[i]+a[j]==money) {
				diff = Math.abs(a[j]-a[i]);
				if(diff<=min) {
					min = diff;
					first = a[i];
					second = a[j];
				}
				i++;
				j--;
			}
			if(a[i]+a[j]>money) {
				j--;
			}
			if(a[i]+a[j]<money) {
				i++;
			}
		}
		System.out.println("Deepak should buy roses whose prices are " + first +" and " + second);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int n;
		for(int i = 0;i<t;i++) {
			n = sc.nextInt();
			int[] a = new int[n];
			for(int j = 0;j<n;j++) {
				a[j]=sc.nextInt();
			}
			Arrays.sort(a);
			
			int money = sc.nextInt();
			
			rosePair(a,n,money);
		}
	}

}
