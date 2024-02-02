//package LL;
//
//import java.util.Scanner;
//
//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//class LinkedList {
//    Node head;
//
//    LinkedList() {
//        this.head = null;
//    }
//
//    void insert(int data) {
//        Node newNode = new Node(data);
//        newNode.next = head;
//        head = newNode;
//    }
//
//    void printList() {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//}
//
//
//public class SumOf2LL {
//
//
//    static Node sumList(Node list1, Node list2, int carry) {
//        if (list1 == null && list2 == null && carry == 0) {
//            return null;
//        }
//
//        int value = carry;
//        if (list1 != null) {
//            value += list1.data;
//        }
//        if (list2 != null) {
//            value += list2.data;
//        }
//
//        Node resultNode = new Node(value % 10);
//
//        if (list1 != null || list2 != null) {
//            Node nextNode = sumList(
//                    (list1 != null) ? list1.next : null,
//                    (list2 != null) ? list2.next : null,
//                    value / 10
//            );
//            resultNode.next = nextNode;
//        }
//
//        return resultNode;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//
//        LinkedList list1 = new LinkedList();
//        LinkedList list2 = new LinkedList();
//
//        for (int i = 0; i < n; i++) {
//            list1.insert(scanner.nextInt());
//        }
//
//        for (int i = 0; i < m; i++) {
//            list2.insert(scanner.nextInt());
//        }
//
//       Node result = sumList(list1.head, list2.head, 0);
//
//// Store the result in a stack to reverse the order
//java.util.Stack<Integer> stack = new java.util.Stack<>();
//while (result != null) {
//    stack.push(result.data);
//    result = result.next;
//}
//
//// Pop and print elements from the stack
//while (!stack.isEmpty()) {
//    System.out.print(stack.pop() + " ");
//}
//    }
//}
