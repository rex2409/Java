package Greedy;

import java.util.Scanner;
import java.util.Vector;

public class DeepakJourney {

	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int t = scanner.nextInt();

	        while (t-- > 0) {
	            int n = scanner.nextInt();
	            Vector<Integer> cost = new Vector<>();
	            Vector<Integer> l = new Vector<>();

	            for (int i = 0; i < n; i++) {
	                int d = scanner.nextInt();

	                if (cost.size() == 0) {
	                    cost.add(d);
	                } else if (d > cost.lastElement()) {
	                    cost.add(cost.lastElement());
	                } else {
	                    cost.add(d);
	                }
	            }

	            int sum = 0;
	            for (int i = 0; i < n; i++) {
	                int d = scanner.nextInt();
	                l.add(d);

	                sum += d * cost.get(i);
	            }
	            System.out.println(sum);
	        }
	    }
}
