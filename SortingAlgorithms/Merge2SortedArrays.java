package SortingAlgorithms;

import java.util.Arrays;

public class Merge2SortedArrays {

	public static void merge(int[] a1, int[] a2) {
		int n = a1.length,m = a2.length;
		
		int[] ans = new int[n+m];
		
		int i = 0, j = 0, k = 0;
		
		while(i<n && j<m) {
			if(a1[i]<a2[j]) {
				ans[k] = a1[i];
				i++;
				k++;
			}
			else {
				ans[k] = a2[j];
				j++;
				k++;
			}
		}
		while(j<m) {
			ans[k] = a2[j];
			j++;
			k++;
		}
		
		while(i<n) {
			ans[k] = a1[i];
			i++;
			k++;
		}
		
		System.out.println(Arrays.toString(ans));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a1 = {1,3,5,7};
		int[] a2 = {2,4,6,8};
		
		merge(a1,a2);
	}

}
