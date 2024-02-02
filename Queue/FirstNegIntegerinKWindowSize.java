package Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class FirstNegIntegerinKWindowSize {

	 public static List<Integer> printFirstNegativeInteger(int[] arr, int n, int k) {
	        List<Integer> ans = new ArrayList<>();
	        Queue<Integer> q = new LinkedList<>();

	        for (int i = 0; i < k - 1; i++) {
	            if (arr[i] < 0) q.offer(arr[i]);
	        }

	        for (int i = k - 1; i < n; i++) {
	            if (arr[i] < 0) q.offer(arr[i]);

	            if (!q.isEmpty()) {
	                ans.add(q.peek());

	                if (q.peek() == arr[i - k + 1]) {
	                    q.poll();
	                }
	            } else {
	                ans.add(0);
	            }
	        }

	        return ans;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int t = scanner.nextInt();
	        while (t-- > 0) {
	            int n = scanner.nextInt();
	            int k = scanner.nextInt();
	            int[] arr = new int[n];

	            for (int i = 0; i < n; i++) {
	                arr[i] = scanner.nextInt();
	            }

	            List<Integer> result = printFirstNegativeInteger(arr, n, k);

	            for (int x : result) {
	                System.out.print(x + " ");
	            }
	            System.out.println();
	        }
	    }
}
