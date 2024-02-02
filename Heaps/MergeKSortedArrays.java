package Heaps;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Vector;

class Node {
    public int data;
    public Node next;

    public Node(int d) {
        data = d;
        next = null;
    }
}

public class MergeKSortedArrays {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();

        Vector<Node> lists = new Vector<>();

        // input
        for (int i = 0; i < k; i++) {
            Node head = null;
            for (int j = 0; j < n; j++) {
                int data = scanner.nextInt();
                head = insertAtTail(head, data);
            }
            lists.add(head);
        }

        Node ans = mergeKSortedList(lists);
        printList(ans);
    }

    static Node insertAtTail(Node head, int data) {
        if (head == null) {
            head = new Node(data);
            return head;
        }

        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = new Node(data);
        return head;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    static class Compare implements java.util.Comparator<Node> {
        public int compare(Node lhs, Node rhs) {
            return Integer.compare(lhs.data, rhs.data);
        }
    }

    static Node mergeKSortedList(Vector<Node> lists) {
        PriorityQueue<Node> pq = new PriorityQueue<>(new Compare());

        for (Node list : lists) {
            if (list != null) {
                pq.add(list);
            }
        }

        Node head = null;
        Node last = null;

        while (!pq.isEmpty()) {
            Node min = pq.poll();

            if (head == null) {
                head = last = min;
            } else {
                last.next = min;
                last = min;
            }

            if (min.next != null) {
                pq.add(min.next);
            }
        }

        return head;
    }
}
