package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows2 {

	 public static boolean isPossible(int[] stalls, int n, int cows, int minDistance) {
	        int count = 1;
	        int lastPosition = stalls[0];

	        for (int i = 1; i < n; i++) {
	            if (stalls[i] - lastPosition >= minDistance) {
	                count++;
	                lastPosition = stalls[i];
	            }
	        }

	        return count >= cows;
	    }

	    public static int largestMinDistance(int[] stalls, int n, int cows) {
	        Arrays.sort(stalls);

	        int low = 0;
	        int high = stalls[n - 1] - stalls[0];
	        int result = -1;

	        while (low <= high) {
	            int mid = low + (high - low) / 2;

	            if (isPossible(stalls, n, cows, mid)) {
	                result = mid;
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int n = scanner.nextInt();
	        int c = scanner.nextInt();

	        int[] stalls = new int[n];
	        for (int i = 0; i < n; i++) {
	            stalls[i] = scanner.nextInt();
	        }

	        int result = largestMinDistance(stalls, n, c);
	        System.out.println(result);
	    }
}
