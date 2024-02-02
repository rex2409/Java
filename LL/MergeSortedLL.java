package LL;

import java.util.Scanner;

//class Node {
//    int data;
//    Node next;
//
//    // constructor
//    Node(int d) {
//        data = d;
//        next = null;
//    }
//}

public class MergeSortedLL {

	static Node insertAtTail(Node head, int data) {
        if (head == null) {
            return new Node(data);
        }

        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = new Node(data);
        return head;
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    static Node merge(Node a, Node b) {
        // base case
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }

        // rec case
        // take a head pointer
        Node c;
        if (a.data < b.data) {
            c = a;
            c.next = merge(a.next, b);
        } else {
            c = b;
            c.next = merge(a, b.next);
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {

            Node head1 = null;
            Node head2 = null;

            int n1 = scanner.nextInt();

            for (int j = 0; j < n1; j++) {
                int data = scanner.nextInt();
                head1 = insertAtTail(head1, data);
            }

            int n2 = scanner.nextInt();

            for (int j = 0; j < n2; j++) {
                int data = scanner.nextInt();
                head2 = insertAtTail(head2, data);
            }

            Node newHead = merge(head1, head2);

            print(newHead);
        }
        scanner.close();
    }
}
