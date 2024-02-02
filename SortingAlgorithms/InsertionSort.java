package SortingAlgorithms;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] arr = {5,3,1,2,4};
		int size = arr.length;
		
		for(int i = 1; i <= size - 1; i++) {
			int puc = arr[i];
			
			int j;
			for(j = i-1; j>=0 && arr[j]>puc; j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = puc;
		}
		
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
