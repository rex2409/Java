package LL;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.InputMismatchException;
import java.util.Scanner;

class Node {
    public int data;
    public Node next;

    Node(int d) {
        this.data = d;
        this.next = null;
    }
}

class Solution {
    // head - Head pointer of the Linked List
    // Return a boolean value indicating the presence of cycle
    // If the cycle is present, modify the linked list to remove the cycle as well
    boolean floydCycleRemoval(Node head) {
        if (head == null || head.next == null) {
            return false; // No cycle if the list is empty or has only one node
        }

        Node slow = head;
        Node fast = head;
        Node prev = null;

        // Detect cycle
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Cycle detected
                removeCycle(prev, head);
                return true;
            }
        }

        return false; // No cycle detected
    }

    private void removeCycle(Node prev, Node head) {
        Node start = head;

        // Find the start of the cycle
        while (start != prev.next) {
            start = start.next;
            prev = prev.next;
        }

        // Remove the cycle
        prev.next = null;
    }
}


public class CycleDetectionAndRemoval {

    public static Node buildCycleList() {
        Scanner sc = new Scanner(System.in);
        Hashtable<Integer, Node> hash = new Hashtable<>();
        int x;

        try {
            x = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers.");
            return null;
        }

        if (x == -1) {
            return null;
        }

        Node head = new Node(x);
        hash.put(x, head);
        Node current = head;

        while (true) {
            try {
                x = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter integers.");
                return head;
            }

            if (x == -1)
                break;

            if (hash.containsKey(x)) {
                current.next = hash.get(x);
                return head;
            }

            Node n = new Node(x);
            current.next = n;
            current = n;
            hash.put(x, n);
        }

        current.next = null;
        return head;
    }

    public static void printLinkedList(Node head) {
        HashSet<Integer> s = new HashSet<>();
        while (head != null) {
            if (s.contains(head.data)) {
                System.out.println("\nCycle detected at " + head.data);
                return;
            }
            System.out.print(head.data + " ");
            s.add(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Node head = buildCycleList();
        Solution s = new Solution();

        boolean cyclePresent = s.floydCycleRemoval(head);
        if (cyclePresent) {
            System.out.println("Cycle was present");
        } else {
            System.out.println("No cycle");
        }

        System.out.print("Linked List - ");
        printLinkedList(head);
    }
}
