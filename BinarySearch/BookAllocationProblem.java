package BinarySearch;

import java.util.Scanner;

public class BookAllocationProblem {

	 public static boolean isPossible(int[] pages, int n, int m, int mid) {
	        int students = 1;
	        int currentPages = 0;

	        for (int i = 0; i < n; i++) {
	            if (pages[i] > mid) {
	                return false;  // Impossible to assign if a book has more pages than mid
	            }

	            if (currentPages + pages[i] > mid) {
	                students++;
	                currentPages = pages[i];

	                if (students > m) {
	                    return false;  // Cannot assign to more than m students
	                }
	            } else {
	                currentPages += pages[i];
	            }
	        }

	        return true;
	    }

	    public static int minMaxPages(int[] pages, int n, int m) {
	        int low = 1;  // Minimum possible value
	        int high = 1000000;  // Maximum possible value

	        while (low < high) {
	            int mid = low + (high - low) / 2;

	            if (isPossible(pages, n, m, mid)) {
	                high = mid;
	            } else {
	                low = mid + 1;
	            }
	        }

	        return low;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int t = scanner.nextInt();

	        while (t-- > 0) {
	            int n = scanner.nextInt();
	            int m = scanner.nextInt();

	            int[] pages = new int[n];
	            for (int i = 0; i < n; i++) {
	                pages[i] = scanner.nextInt();
	            }

	            int result = minMaxPages(pages, n, m);
	            System.out.println(result);
	        }
	    }

}
