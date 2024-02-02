//package LL;
//
//import java.util.HashMap;
//import java.util.Scanner;
//
//class Node {
//    public int data;
//    public Node next;
//
//    Node(int d) {
//        this.data = d;
//        this.next = null;
//    }
//}
//
//class Solution {
//    // This function gets two arguments - the head pointers of the two linked lists
//    // Return the node which is the intersection point of these linked lists
//    // It is assured that the two lists intersect
//    Node intersectionOfTwoLinkedLists(Node l1, Node l2) {
//        if (l1 == null || l2 == null) {
//            return null;
//        }
//
//        Node a = l1;
//        Node b = l2;
//
//        // Traverse both lists until they either intersect or reach the end
//        while (a != b) {
//            // If a reaches the end, reset it to the head of the other list
//            a = (a == null) ? l2 : a.next;
//            // If b reaches the end, reset it to the head of the other list
//            b = (b == null) ? l1 : b.next;
//        }
//
//        // At this point, a and b either point to the intersection node or are both null
//        return a;
//    }
//}
//
///*
//*
//*
//*   You do not need to refer or modify any code below this. 
//*   Only modify the above class definition.
//*	Any modications to code below could lead to a 'Wrong Answer' verdict despite above code being correct.
//*	You do not even need to read or know about the code below.
//*
//*
//*
//*/
//
//class IntersectionOfLinkedLists {
//	  static Scanner sc = new Scanner(System.in);
//
//	    public static Node buildList(HashMap<Integer, Node> hash) {
//	        int x = sc.nextInt();
//	        Node head = new Node(x);
//	        Node current = head;
//	        hash.put(x, head);
//	        while (x != -1) {
//	            x = sc.nextInt();
//	            if (x == -1)
//	                break;
//	            Node n = new Node(x);
//	            hash.put(x, n);
//	            current.next = n;
//	            current = n;
//	        }
//	        current.next = null;
//	        return head;
//	    }
//
//	    public static void printLinkedList(Node head) {
//	        Node temp = head;
//	        while (temp != null) {
//	            System.out.print(temp.data + " ");
//	            temp = temp.next;
//	        }
//	        System.out.println();
//	    }
//
//	    public static void main(String[] args) {
//
//	        HashMap<Integer, Node> hash = new HashMap<Integer, Node>();
//	        Node l1 = buildList(hash);
//
//	        Node l2 = null;
//	        int x = sc.nextInt();
//	        l2 = new Node(x);
//	        Node temp = l2;
//
//	        while (x != -1) {
//	            x = sc.nextInt();
//	            if (x == -1)
//	                break;
//	            if (hash.containsKey(x)) {
//	                temp.next = hash.get(x);
//	                break;
//	            }
//	            Node n = new Node(x);
//	            temp.next = n;
//	            temp = n;
//	        }
//
//	        System.out.print("L1 - ");
//	        printLinkedList(l1);
//	        System.out.print("L2 - ");
//	        printLinkedList(l2);
//
//	        Solution s = new Solution();
//
//	        Node intersectionPoint = s.intersectionOfTwoLinkedLists(l1, l2);
//	        System.out.println("Intersection at node with data = " + intersectionPoint.data);
//
//	    }
//}