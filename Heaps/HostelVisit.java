package Heaps;

import java.util.PriorityQueue;
import java.util.Scanner;

public class HostelVisit {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int k = scanner.nextInt();
	        PriorityQueue<Long> q = new PriorityQueue<>((a, b) -> Long.compare(b, a));

	        for (int i = 0; i < n; i++) {
	            int type = scanner.nextInt();
	            if (type == 1) {
	                long x = scanner.nextLong();
	                long y = scanner.nextLong();
	                long dis = x * x + y * y;

	                if (q.size() < k) {
	                    q.add(dis);
	                } else if (q.peek() > dis) {
	                    q.poll();
	                    q.add(dis);
	                }
	            } else {
	                System.out.println(q.peek());
	            }
	        }
	    }
}
