package Stacks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class ImportanceOfTime {

	 static int importanceOfTime(Queue<Integer> q, List<Integer> arr) {
	        int ans = 0;
	        for (int i = 0; i < arr.size(); i++) {
	            if (q.peek().equals(arr.get(i))) {
	                ans++;
	                q.poll();
	            } else {
	                while (!q.peek().equals(arr.get(i))) {
	                    int var = q.poll();
	                    q.offer(var);
	                    ans++;
	                }
	                ans++;
	                q.poll();
	            }
	        }
	        return ans;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int n = scanner.nextInt();
	        Queue<Integer> q = new LinkedList<>();
	        List<Integer> v = new ArrayList<>();

	        for (int i = 0; i < n; i++) {
	            int x = scanner.nextInt();
	            q.offer(x);
	        }

	        for (int i = 0; i < n; i++) {
	            v.add(scanner.nextInt());
	        }

	        System.out.println(importanceOfTime(q, v));

	        scanner.close();
	    }
}
