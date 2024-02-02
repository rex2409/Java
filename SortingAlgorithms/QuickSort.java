package SortingAlgorithms;

import java.util.Arrays;

public class QuickSort {

	public static int pivot(int[] a, int s, int e) {
		
		int i = s-1;
		for(int j=s;j<e;j++) {
			if(a[j] <= a[e]) {
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		
		int temp = a[i+1];
		a[i+1] = a[e];
		a[e] = temp;
		
		return i + 1;
	}
	
	public static void quickSort(int[] a, int s, int e) {
		
		if(s>=e) {
			return;
		}
		
		int p = pivot(a,s,e);
		quickSort(a,s,p-1);
		quickSort(a,p+1,e);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {2,3,1,4,11,7,8,10,6};
		
		quickSort(a,0,a.length - 1);
		System.out.println(Arrays.toString(a));
	}

}
