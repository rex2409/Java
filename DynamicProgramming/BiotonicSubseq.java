package DynamicProgramming;

import java.util.Scanner;

public class BiotonicSubseq {

	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int t = scanner.nextInt();

	        for (int i = 0; i < t; i++) {
	            int n = scanner.nextInt();
	            int[] arr = new int[n];

	            for (int j = 0; j < n; j++) {
	                arr[j] = scanner.nextInt();
	            }

	            int result = findBiotonicSubsequenceLength(arr);
	            System.out.println(result);
	        }
	    }

	    private static int findBiotonicSubsequenceLength(int[] arr) {
	        int n = arr.length;
	        int[] inc = new int[n];
	        int[] dec = new int[n];

	        inc[0] = 1;
	        for (int i = 1; i < n; i++) {
	            inc[i] = 1;
	            for (int j = 0; j < i; j++) {
	                if (arr[i] > arr[j] && inc[i] < inc[j] + 1) {
	                    inc[i] = inc[j] + 1;
	                }
	            }
	        }

	        dec[n - 1] = 1;
	        for (int i = n - 2; i >= 0; i--) {
	            dec[i] = 1;
	            for (int j = n - 1; j > i; j--) {
	                if (arr[i] > arr[j] && dec[i] < dec[j] + 1) {
	                    dec[i] = dec[j] + 1;
	                }
	            }
	        }

	        int maxLength = 1;
	        for (int i = 0; i < n; i++) {
	            maxLength = Math.max(maxLength, inc[i] + dec[i] - 1);
	        }

	        return maxLength;
	    }
}
