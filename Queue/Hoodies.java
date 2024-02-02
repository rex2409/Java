package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class QueueOperation {
    int course;
    int rollNumber;

    public QueueOperation(int course, int rollNumber) {
        this.course = course;
        this.rollNumber = rollNumber;
    }
}

public class Hoodies {

	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int Q = scanner.nextInt();
	        Queue<Integer>[] courseQueues = new LinkedList[5]; // Using 1-based indexing for courses

	        for (int i = 1; i <= 4; i++) {
	            courseQueues[i] = new LinkedList<>();
	        }

	        Queue<Integer> groupOrder = new LinkedList<>();
	        boolean[] isCourseOccupied = new boolean[5];

	        for (int i = 0; i < Q; i++) {
	            char operationType = scanner.next().charAt(0);

	            try {
	                if (operationType == 'E') {
	                    int x = scanner.nextInt();
	                    int y = scanner.nextInt();
	                    validateCourseAndRollNumber(x, y);
	                    enqueue(courseQueues, x, y, groupOrder, isCourseOccupied);
	                } else if (operationType == 'D') {
	                    dequeue(courseQueues, groupOrder, isCourseOccupied);
	                } else {
	                    throw new IllegalArgumentException("Invalid operation type: " + operationType);
	                }
	            } catch (IllegalArgumentException e) {
	                System.err.println("Invalid input: " + e.getMessage());
	            }
	        }

	        scanner.close();
	    }

	    private static void enqueue(Queue<Integer>[] courseQueues, int course, int rollNumber, Queue<Integer> groupOrder, boolean[] isCourseOccupied) {
	        courseQueues[course].add(rollNumber);

	        if (!isCourseOccupied[course]) {
	            groupOrder.add(course);
	            isCourseOccupied[course] = true;
	        }
	    }

	    private static void dequeue(Queue<Integer>[] courseQueues, Queue<Integer> groupOrder, boolean[] isCourseOccupied) {
	        if (!groupOrder.isEmpty()) {
	            int frontCourse = groupOrder.peek();

	            if (!courseQueues[frontCourse].isEmpty()) {
	                System.out.println(frontCourse + " " + courseQueues[frontCourse].poll());
	            }

	            if (courseQueues[frontCourse].isEmpty()) {
	                groupOrder.poll();
	                isCourseOccupied[frontCourse] = false;
	            }
	        }
	    }

	    private static void validateCourseAndRollNumber(int x, int y) {
	        if (x < 1 || x > 4 || y < 1 || y > 50000) {
	            throw new IllegalArgumentException("Invalid course or roll number.");
	        }
	    }
	    }
