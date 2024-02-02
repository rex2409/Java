package ArraysInJava;

import java.util.Arrays;
import java.util.Scanner;

public class MinSwapSortArray {

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static int indexOf(int[] arr, int ele, int N) {
		for(int i = 0; i<N;i++) {
			if(arr[i] == ele) {
				return i;
			}
		}
		return -1;
	}
	
	public static int minSwaps(int[] arr,int N) {
		int ans =0;
		int[] temp = new int[N];
		for(int i=0;i<N;i++) {
			temp[i]=arr[i];
		}
		Arrays.sort(temp);
		
		for(int i = 0; i<N;i++) {
			if(arr[i]!=temp[i]) {
				ans++;
				swap(arr,i,indexOf(arr,temp[i],N));
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i  = 0; i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(minSwaps(a,n));
	}

}
