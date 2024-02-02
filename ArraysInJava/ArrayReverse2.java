package ArraysInJava;

import java.util.Arrays;

public class ArrayReverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {10,20,30,40,50};
		System.out.println(Arrays.toString(arr));
		rev2(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void rev2(int[] arr) {
		int L=0;
		int R=arr.length-1;
		while(L<R) {
			int temp = arr[L];
			arr[L]=arr[R];
			arr[R]=temp;
			L++;
			R--;
		}
	}
}
