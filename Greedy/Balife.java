package Greedy;

import java.util.Scanner;

public class Balife {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        int load = 0, maxLoad = 0;

	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	            load += arr[i];
	        }

	        if (load % n != 0) {
	            System.out.println(-1);
	            System.exit(0);
	        }

	        int sum = load;
	        load = load / n;

	        // to calculate left sum
	        int cs = 0;

	        for (int i = 0; i < n; i++) {
	            cs += arr[i];
	            // left transfer
	            int lt = Math.abs(cs - load * (i + 1));
	            // right transfer
	            int rt = Math.abs((sum - cs) - load * (n - i - 1));
	            // max of these 2 and prev ans
	            maxLoad = Math.max(maxLoad, Math.max(lt, rt));
	        }

	        System.out.println(maxLoad);
	    }
}
