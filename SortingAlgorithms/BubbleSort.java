package SortingAlgorithms;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] arr = {5,3,1,2,4};
		int size = arr.length;
		
		for(int i = 0; i<= size-2; i++) {
			for(int j =0;j<=size-2;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp; 
				}
			}
		}
		
		for(int i = 0 ; i < size ; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
