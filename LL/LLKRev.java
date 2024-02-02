//package LL;
//
//import java.util.Scanner;
//
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
//
//public class LLKRev {
//
//	 static Node insertAtTail(Node head, int data) {
//	        if (head == null) {
//	            return new Node(data);
//	        }
//
//	        Node temp = head;
//	        while (temp.next != null) {
//	            temp = temp.next;
//	        }
//	        temp.next = new Node(data);
//	        return head; // Updated to return the head of the list
//	    }
//
//	    static void print(Node head) {
//	        while (head != null) {
//	            System.out.print(head.data + " ");
//	            head = head.next;
//	        }
//	        System.out.println();
//	    }
//
//	    static Node kReverse(Node head, int k) {
//	        Node curr = head;
//	        Node prev = null;
//	        Node next = null;
//	        int count = 0;
//
//	        // Reverse the first k elements
//	        while (curr != null && count < k) {
//	            next = curr.next;
//	            curr.next = prev;
//	            prev = curr;
//	            curr = next;
//	            count++;
//	        }
//
//	        // Recursively reverse the next k elements
//	        if (next != null) {
//	            head.next = kReverse(next, k);
//	        }
//
//	        return prev;
//	    }
//
//	    public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//	        int n = scanner.nextInt();
//	        int k = scanner.nextInt();
//
//	        Node head = null;
//
//	        for (int i = 0; i < n; i++) {
//	            int data = scanner.nextInt();
//	            head = insertAtTail(head, data);
//	        }
//
//	        head = kReverse(head, k);
//
//	        print(head);
//	        scanner.close();
//	    }
//}
