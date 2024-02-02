package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ImportanceOfTime {

	  static int importanceOfTime(Queue<Integer> co, Queue<Integer> io) {
	        int time = 0;
	        while (!co.isEmpty() && !io.isEmpty()) {
	            // make co front element equal to ideal order
	            while (!co.peek().equals(io.peek())) {
	                int temp = co.poll();
	                co.add(temp);
	                time++;
	            }

	            // co and io front become equal
	            co.poll();
	            io.poll();
	            time++;
	        }

	        return time;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int n = scanner.nextInt();

	        Queue<Integer> co = new LinkedList<>();
	        Queue<Integer> io = new LinkedList<>();

	        for (int i = 0; i < n; i++) {
	            int data = scanner.nextInt();
	            co.add(data);
	        }

	        for (int i = 0; i < n; i++) {
	            int data = scanner.nextInt();
	            io.add(data);
	        }

	        System.out.println(importanceOfTime(co, io));

	     
	    }
}
