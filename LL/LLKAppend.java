//package LL;
//
//import java.util.Scanner;
//
//class Node {
//    public int data;
//    public Node next;
//
//    public Node(int d) {
//        data = d;
//        next = null;
//    }
//}
//
//public class LLKAppend {
//
//
//    public static Node insertAtTail(Node head, int data) {
//        Node newNode = new Node(data);
//
//        if (head == null) {
//            return newNode;
//        }
//
//        Node temp = head;
//        while (temp.next != null) {
//            temp = temp.next;
//        }
//
//        temp.next = newNode;
//        return head;
//    }
//
//    public static void print(Node head) {
//        while (head != null) {
//            System.out.print(head.data + " ");
//            head = head.next;
//        }
//        System.out.println();
//    }
//
//    public static Node linkedListKAppend(Node head, int k, int n) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//
//        if (k == n) {
//            return head;
//        }
//
//        k = k % n;
//
//        Node temp = head;
//
//        for (int i = 0; i < n - k - 1; i++) {
//            temp = temp.next;
//        }
//
//        Node tail = temp.next;
//
//        while (tail.next != null) {
//            tail = tail.next;
//        }
//
//        Node temp2 = temp.next;
//
//        temp.next = null;
//        tail.next = head;
//
//        return temp2;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//        Node head = null;
//
//        for (int i = 0; i < n; i++) {
//            int data = scanner.nextInt();
//            head = insertAtTail(head, data);
//        }
//
//        int k = scanner.nextInt();
//        head = linkedListKAppend(head, k, n);
//
//        print(head);
//    }
//}
