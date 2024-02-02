//package LL;
//
//import java.util.Scanner;
//
//class Node {
//    int data;
//    Node next;
//
//    public Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//public class DeleteNode {
//	public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int N = scanner.nextInt();
//
//        Node head = null;
//        Node tail = null;
//
//        for (int i = 0; i < N; i++) {
//            int data = scanner.nextInt();
//            Node newNode = new Node(data);
//
//            if (head == null) {
//                head = newNode;
//                tail = newNode;
//            } else {
//                tail.next = newNode;
//                tail = newNode;
//            }
//        }
//
//        scanner.close();
//
//        head = deleteGreaterOnRight(head);
//        printLinkedList(head);
//    }
//
//    private static Node deleteGreaterOnRight(Node head) {
//        if (head == null || head.next == null) {
//            return head; // No need to modify the list
//        }
//
//        head = reverseList(head);
//        Node current = head;
//        Node maxNode = head;
//
//        while (current != null && current.next != null) {
//            if (current.next.data < maxNode.data) {
//                current.next = current.next.next;
//            } else {
//                current = current.next;
//                maxNode = current;
//            }
//        }
//
//        head = reverseList(head);
//        return head;
//    }
//
//    private static Node reverseList(Node head) {
//        Node prev = null;
//        Node current = head;
//        Node next = null;
//
//        while (current != null) {
//            next = current.next;
//            current.next = prev;
//            prev = current;
//            current = next;
//        }
//
//        head = prev;
//        return head;
//    }
//
//    private static void printLinkedList(Node head) {
//        while (head != null) {
//            System.out.print(head.data + " ");
//            head = head.next;
//        }
//    }
//}
