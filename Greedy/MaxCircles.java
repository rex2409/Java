package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MaxCircles {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();

	        ArrayList<Pair<Long, Long>> v = new ArrayList<>();

	        for (int i = 0; i < n; i++) {
	            long c = scanner.nextLong();
	            long r = scanner.nextLong();
	            v.add(new Pair<>(c - r, c + r));
	        }

	        Collections.sort(v, Comparator.comparingLong(p -> p.second));

	        int count = 1;
	        long eidx = v.get(0).second;

	        for (int i = 1; i < v.size(); i++) {
	            if (v.get(i).first >= eidx) {
	                count++;
	                eidx = v.get(i).second;
	            }
	        }

	        System.out.println(n - count);
	    }

	    static class Pair<K, V> {
	        private final K first;
	        private final V second;

	        public Pair(K first, V second) {
	            this.first = first;
	            this.second = second;
	        }

	        public K getFirst() {
	            return first;
	        }

	        public V getSecond() {
	            return second;
	        }
	    }
}
