//package LL;
//
//import java.util.Scanner;
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
//class LinkedList {
//    Node head;
//
//    public void addNode(int data) {
//        Node newNode = new Node(data);
//        if (head == null) {
//            head = newNode;
//        } else {
//            Node temp = head;
//            while (temp.next != null) {
//                temp = temp.next;
//            }
//            temp.next = newNode;
//        }
//    }
//
//    public int findKthFromEnd(int k) {
//        Node fast = head;
//        Node slow = head;
//
//        // Move fast pointer k nodes ahead
//        for (int i = 0; i < k; i++) {
//            if (fast == null) {
//                // Handle case where k is greater than the length of the linked list
//                return -1;
//            }
//            fast = fast.next;
//        }
//
//        // Move both pointers until fast reaches the end
//        while (fast != null) {
//            fast = fast.next;
//            slow = slow.next;
//        }
//
//        // Now, slow is at the kth node from the end
//        return slow.data;
//    }
//}
//
//
//public class KthElementFromLast {
//
//	 public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//	        LinkedList linkedList = new LinkedList();
//
//	        // Input the linked list values
//	        int value;
//	        while ((value = scanner.nextInt()) != -1) {
//	            linkedList.addNode(value);
//	        }
//
//	        // Input the value of k
//	        int k = scanner.nextInt();
//
//	        // Find and output the kth element from the end
//	        int result = linkedList.findKthFromEnd(k);
//	        System.out.println(result);
//
//	        scanner.close();
//	    }
//}
