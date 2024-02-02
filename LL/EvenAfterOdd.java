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

public class EvenAfterOdd {

	static void insertAtTail(Node head, int data) {
        if (head == null) {
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    static void buildList(Node head) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (n-- > 0) {
            int data = scanner.nextInt();
            insertAtTail(head, data);
        }
        scanner.close();
    }

    static Node evenAfterOdd(Node head) {
        Node oddHead = null, oddTail = null, evenHead = null, evenTail = null;
        Node curr = head;

        while (curr != null) {
            // if data is odd
            if (curr.data % 2 != 0) {
                // it should be part of the left list
                if (oddHead == null) {
                    oddHead = oddTail = curr;
                } else {
                    oddTail.next = curr;
                    oddTail = curr;
                }
            }
            // if data is even
            else {
                // it should be part of the right list
                if (evenHead == null) {
                    evenHead = evenTail = curr;
                } else {
                    evenTail.next = curr;
                    evenTail = curr;
                }
            }
            curr = curr.next;
        }

        // corner case -->
        if (oddHead == null) {
            return evenHead;
        }

        if (evenHead == null) {
            return oddHead;
        }

        // link left (odd) part to right (even) part
        evenTail.next = null;
        oddTail.next = evenHead;

        return oddHead;
    }

    public static void main(String[] args) {
        Node head = new Node(0); // Dummy node to represent the head of the list
        buildList(head);

        head.next = evenAfterOdd(head.next);

        print(head.next);
    }
}
