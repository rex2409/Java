package Heaps;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Vector;

public class FindKthLargest {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int k = scanner.nextInt();

	        Vector<Integer> v = new Vector<>();
	        for (int i = 0; i < n; i++) {
	            int no = scanner.nextInt();
	            v.add(no);
	        }

	        System.out.println(kthLargestNumber(v, k));
	    }

	    static int kthLargestNumber(Vector<Integer> arr, int k) {
	        PriorityQueue<Integer> pq = new PriorityQueue<>();

	        // push kth element in pq
	        for (int i = 0; i < k; i++) {
	            pq.add(arr.get(i));
	        }

	        // push remaining elements one by one only if
	        // they are greater than the top of pq
	        for (int i = k; i < arr.size(); i++) {
	            if (pq.peek() < arr.get(i)) {
	                pq.poll();
	                pq.add(arr.get(i));
	            }
	        }
	        return pq.peek();
	    }
	}
