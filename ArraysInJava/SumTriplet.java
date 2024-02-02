package ArraysInJava;

import java.util.Arrays;
import java.util.Scanner;

public class SumTriplet {

	public static void sumTriplet(int[] a, int n, int target) {
		for(int i = 0; i<n-2; i++) {
			int j = i+1, k = n-1;
			
			while(j<k) {
				if(a[i] + a[j] + a[k] == target) {
					System.out.println(a[i]+", "+a[j]+" and "+a[k]);
					j++;
					k--;
				}
				if(a[i]+a[j]+a[k]>target) {
					k--;
				}
				if(a[i]+a[j]+a[k]<target) {
					j++;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] a = new int[n];
		for(int i = 0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		
		int target = sc.nextInt();
		
		sumTriplet(a,n,target);
		
	}

}
