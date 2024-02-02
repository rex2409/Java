package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GrandTemple {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        ArrayList<Integer> x = new ArrayList<>();
	        ArrayList<Integer> y = new ArrayList<>();

	        for (int i = 0; i < n; i++) {
	            int xc = scanner.nextInt();
	            int yc = scanner.nextInt();
	            x.add(xc);
	            y.add(yc);
	        }

	        Collections.sort(x);
	        Collections.sort(y);

	        int dx = 0;
	        int dy = 0;

	        for (int i = 0; i < n - 1; i++) {
	            dx = Math.max(dx, x.get(i + 1) - x.get(i));
	            dy = Math.max(dy, y.get(i + 1) - y.get(i));
	        }

	        System.out.println((dx - 1) * (dy - 1));
	    }
}
