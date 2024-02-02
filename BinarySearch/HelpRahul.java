package BinarySearch;

import java.util.Scanner;

public class HelpRahul {

	 public static int rahulKey(int[] A, int n, int key) {
	        int s = 0;
	        int e = n - 1;
	        while (s <= e) {
	            int mid = (s + e) / 2;
	            if (A[mid] == key) {
	                return mid;
	            } else if (A[s] <= A[mid]) {
	                // 2 cases
	                if (A[s] <= key && A[mid] >= key) {
	                    e = mid - 1;
	                } else {
	                    s = mid + 1;
	                }
	            } else {
	                if (A[mid] <= key && key <= A[e]) {
	                    s = mid + 1;
	                } else {
	                    e = mid - 1;
	                }
	            }
	        }
	        return -1;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int n = scanner.nextInt();

	        int[] A = new int[n];
	        for (int i = 0; i < n; i++) {
	            A[i] = scanner.nextInt();
	        }

	        int key = scanner.nextInt();

	        System.out.println(rahulKey(A, n, key));
	    }

}
