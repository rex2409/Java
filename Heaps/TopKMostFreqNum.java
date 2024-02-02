package Heaps;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

class Element implements Comparable<Element> {
    int value;
    int frequency;

    public Element(int value, int frequency) {
        this.value = value;
        this.frequency = frequency;
    }

    @Override
    public int compareTo(Element other) {
        if (this.frequency != other.frequency) {
            return Integer.compare(other.frequency, this.frequency);
        } else {
            return Integer.compare(this.value, other.value);
        }
    }
}


public class TopKMostFreqNum {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int t = scanner.nextInt();

	        while (t-- > 0) {
	            int n = scanner.nextInt();
	            int k = scanner.nextInt();

	            Map<Integer, Integer> frequencyMap = new HashMap<>();
	            PriorityQueue<Element> priorityQueue = new PriorityQueue<>();

	            for (int i = 0; i < n; i++) {
	                int num = scanner.nextInt();

	                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);

	                priorityQueue.clear();
	                Set<Integer> keys = frequencyMap.keySet();

	                for (Integer key : keys) {
	                    priorityQueue.add(new Element(key, frequencyMap.get(key)));
	                }

	                int count = 0;
	                while (!priorityQueue.isEmpty() && count < k) {
	                    Element element = priorityQueue.poll();
	                    System.out.print(element.value + " ");
	                    count++;
	                }
	            }
	            System.out.println();
	        }
	    }
}
