package BinarySearch;

import java.util.Scanner;

public class BinarySrch2 {

	 static int binarySearch(int arr[], int l, int r, int x) {
	        while (l <= r) {
	            int m = l + (r - l) / 2;

	            // Check if x is present at mid
	            if (arr[m] == x)
	                return m;

	            // If x is greater, ignore the left half
	            if (arr[m] < x)
	                l = m + 1;

	            // If x is smaller, ignore the right half
	            else
	                r = m - 1;
	        }

	        // If we reach here, then the element was not present
	        return -1;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read the size of the array
	        int n = scanner.nextInt();

	        // Read the elements of the array
	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++)
	            arr[i] = scanner.nextInt();

	        // Read the number to be searched
	        int num = scanner.nextInt();

	        // Perform binary search
	        int result = binarySearch(arr, 0, n - 1, num);

	        // Print the result
	        if (result == -1) {
	            System.out.println(-1);
	        } else {
	            System.out.println(result);
	        }

	     
	    }

}
