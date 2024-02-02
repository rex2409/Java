package Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ActivitySelection {

	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int t = scanner.nextInt();
	        while (t-- > 0) {
	            int n = scanner.nextInt();
	            int[][] arr = new int[n][2];
	            for (int i = 0; i < n; i++) {
	                arr[i][0] = scanner.nextInt();
	                arr[i][1] = scanner.nextInt();
	            }
	            Arrays.sort(arr, Comparator.comparingInt(a -> a[1]));
	            int ans = 1, chosen = 0;
	            for (int i = 1; i < n; i++) {
	                if (arr[i][0] >= arr[chosen][1]) {
	                    ans++;
	                    chosen = i;
	                }
	            }
	            System.out.println(ans);
	        }
	    }
}
