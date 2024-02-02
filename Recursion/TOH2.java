package Recursion;

import java.util.Scanner;

public class TOH2 {
	public static void towerOfHanoiSteps(int n, String source, String destination, String auxiliary) {
        if (n == 1) {
            System.out.println("Move 1th disc from " + source + " to " + destination);
            return;
        }

        towerOfHanoiSteps(n - 1, source, auxiliary, destination);
        System.out.println("Move " + n + "th disc from " + source + " to " + destination);
        towerOfHanoiSteps(n - 1, auxiliary, destination, source);
    }

    // Function to return the number of steps for Tower of Hanoi
    public static int towerOfHanoiStepsCount(int n) {
        if (n == 1) {
            return 1;
        }
        return 2 * towerOfHanoiStepsCount(n - 1) + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // System.out.print("Enter the number of discs: ");
        int numberOfDiscs = scanner.nextInt();

        // Print the steps for Tower of Hanoi
        towerOfHanoiSteps(numberOfDiscs, "T1", "T2", "T3");

        // Get the number of steps for Tower of Hanoi
        int stepsCount = towerOfHanoiStepsCount(numberOfDiscs);
        System.out.println(stepsCount);

        scanner.close();
    }

}
