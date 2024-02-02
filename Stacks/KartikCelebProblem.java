package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class KartikCelebProblem {

	static boolean knows(int[][] people, int a, int b) {
        return people[a][b] == 1;
    }

    static int findCelebrity(int[][] people, int n) {
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            s.push(i);
        }

        while (s.size() > 1) {
            int A = s.pop();
            int B = s.pop();

            if (knows(people, A, B)) {
                s.push(B);
            } else {
                s.push(A);
            }
        }

        if (s.isEmpty()) {
            return -1;
        }

        int C = s.pop();

        for (int i = 0; i < n; i++) {
            if (i != C && (knows(people, C, i) || !knows(people, i, C))) {
                return -1;
            }
        }

        return C;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] people = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                people[i][j] = scanner.nextInt();
            }
        }

        int celebrity = findCelebrity(people, N);

        if (celebrity == -1) {
            System.out.println("No Celebrity");
        } else {
            System.out.println(celebrity);
        }
    }
}
