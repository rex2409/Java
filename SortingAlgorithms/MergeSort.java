package SortingAlgorithms;

import java.util.Arrays;

public class MergeSort {

	public static int[] merge(int[] a1, int[] a2) {
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
		
		return ans;
	}
	
	public static int[] mergeSort(int[] a, int l, int r) {
		
		if(l==r) {
			int[] arr = new int[1];
			arr[0] = a[l];
			return arr;
		}
		
		int mid = (l+r)/2;
		
		int[] a1 = mergeSort(a,l,mid);
		int[] a2 = mergeSort(a,mid+1,r);
		
		return merge(a1,a2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {9,7,8,3,2,1};
		
		int[] ans = mergeSort(a, 0, a.length-1);
		System.out.println(Arrays.toString(ans));
	}

}
