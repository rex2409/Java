package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class Expedi {

	   public static void main(String[] args) {
	        int flag = 0;
	        int ans = 0;

	        ArrayList<Pair<Integer, Integer>> v = new ArrayList<>();
	        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();

	        for (int i = 0; i < n; i++) {
	            int d = scanner.nextInt();
	            int f = scanner.nextInt();
	            v.add(new Pair<>(d, f));
	        }

	        Collections.sort(v, (p1, p2) -> Integer.compare(p2.getKey(), p1.getKey()));

	        int D = scanner.nextInt();
	        int F = scanner.nextInt();

	        for (int i = 0; i < n; i++) {
	            v.set(i, new Pair<>(D - v.get(i).getKey(), v.get(i).getValue()));
	        }

	        int x = 0;
	        int prev = 0;

	        while (x < n) {
	            if (F >= v.get(x).getKey() - prev) {
	                F = F - (v.get(x).getKey() - prev);
	                pq.add(v.get(x).getValue());
	                prev = v.get(x).getKey();
	            } else {
	                if (pq.isEmpty()) {
	                    flag = 1;
	                    break;
	                }
	                F += pq.poll();
	                ans++;
	                continue;
	            }
	            x++;
	        }

	        if (flag == 1) {
	            System.out.println("-1");
	        } else {
	            D = D - v.get(n - 1).getKey();
	            if (F >= D) {
	                System.out.println(ans);
	            } else {
	                while (F < D) {
	                    if (pq.isEmpty()) {
	                        flag = 1;
	                        break;
	                    }
	                    F = F + pq.poll();
	                    ans++;
	                }

	                if (flag == 1) {
	                    System.out.println("-1");
	                }

	                System.out.println(ans);
	            }
	        }
	    }
}
