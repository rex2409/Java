package Heaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MergeKSorted {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();

        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int no = scanner.nextInt();
                list.add(no);
            }
            arr.add(list);
        }

        List<Integer> output = mergeKSortedArrays(arr);

        for (int x : output) {
            System.out.print(x + " ");
        }
    }

    static List<Integer> mergeKSortedArrays(List<List<Integer>> arr) {
        List<Integer> result = new ArrayList<>();
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(node -> node.data));

        for (int i = 0; i < arr.size(); i++) {
            pq.add(new Node(arr.get(i).get(0), i, 0));
        }

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int element = current.data;
            int row = current.row;
            int col = current.col;

            result.add(element);

            if (col + 1 < arr.get(row).size()) {
                pq.add(new Node(arr.get(row).get(col + 1), row, col + 1));
            }
        }
        return result;
    }

    static class Node {
        int data;
        int row;
        int col;

        public Node(int data, int row, int col) {
            this.data = data;
            this.row = row;
            this.col = col;
        }
    }
}
