package ArraysInJava;

import java.util.Scanner;

public class SortingInLinearTime {

	 static void sort012(int a[], int arr_size)
	    {
	        int lo = 0;
	        int hi = arr_size - 1;
	        int mid = 0, temp = 0;
	        // Iterate till all the elements
	        // are sorted
	        while (mid <= hi) {
	            switch (a[mid]) {
	                // If the element is 0
	            case 0: {
	                temp = a[lo];
	                a[lo] = a[mid];
	                a[mid] = temp;
	                lo++;
	                mid++;
	                break;
	            }
	                // If the element is 1
	            case 1:
	                mid++;
	                break;
	                // If the element is 2
	            case 2: {
	                temp = a[mid];
	                a[mid] = a[hi];
	                a[hi] = temp;
	                hi--;
	                break;
	            }
	            }
	        }
	    }
	 
	    /* Utility function to print array arr[] */
	    static void printArray(int arr[], int arr_size)
	    {
	        int i;
	        for (i = 0; i < arr_size; i++)
	            System.out.println(arr[i]);
	        //System.out.println("");
	    }
	 
	    /*Driver function to check for above functions*/
	    public static void main(String[] args)
	    {
	    	
	    	Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		   // int arr_size = n;
		    int [] arr = new int [n];
		    for(int i=0;i<n;i++){
		      arr[i]=sc.nextInt();
		    }
	        sort012(arr, n);
	        printArray(arr, n);
	    }

}
