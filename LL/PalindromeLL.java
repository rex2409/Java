//package LL;
//
//import java.util.Scanner;
//
//class Node {
//    int data;
//    Node next;
//
//    // Constructor
//    Node(int d) {
//        data = d;
//        next = null;
//    }
//}
//
//public class PalindromeLL {
//
//
//    static void insertAtTail(Node head, int data) {
//        if (head == null) {
//            head = new Node(data);
//            return;
//        }
//
//        Node temp = head;
//        while (temp.next != null) {
//            temp = temp.next;
//        }
//
//        temp.next = new Node(data);
//    }
//
//    static void buildList(Node head) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        while (n-- > 0) {
//            int data = scanner.nextInt();
//            insertAtTail(head, data);
//        }
//    }
//
//    static Node recReverse(Node head) {
//        // Base case
//        if (head == null || head.next == null) {
//            return head;
//        }
//
//        // Recursive case
//        Node smallHead = recReverse(head.next);
//
//        head.next.next = head;
//        head.next = null;
//
//        return smallHead;
//    }
//
//    static boolean isPalindrome(Node head, Node revHead) {
//        while (head != null) {
//            if (head.data == revHead.data) {
//                head = head.next;
//                revHead = revHead.next;
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        Node head = new Node(0); // Dummy node to represent the head of the linked list
//        buildList(head);
//
//        Node reverseHead = recReverse(head.next);
//
//        if (isPalindrome(head.next, reverseHead)) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//    }
//}
