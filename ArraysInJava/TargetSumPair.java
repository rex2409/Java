package ArraysInJava;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumPair {

	public static void sumPair(int[] a, int n, int target) {
		int i = 0,j = n-1;
		
		while(i<j) {
			if(a[i] + a[j] == target) {
				System.out.println(a[i]+" and "+a[j]);
				i++;
				j--;
			}
			if((a[i] + a[j])>target)
				j--;
			if((a[i] + a[j])<target)
				i++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] a = new int[n];
		for(int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		
		int target = sc.nextInt();
		
		sumPair(a,n,target);
		
	}

}
