package Stacks;

import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class PlayingWithCards {

	static final int MAX = 1000000; // Choose a larger prime number for the sieve

    static boolean[] sieve = new boolean[MAX];
    static Vector<Integer> primes = new Vector<>();

    static void createSieve() {
        for (int i = 0; i < MAX; i++) {
            sieve[i] = true;
        }
        sieve[0] = sieve[1] = false;
        for (int i = 2; i < MAX; i++) {
            if (sieve[i]) {
                primes.add(i);
                for (long j = (long)i * i; j < MAX; j += i) {
                    sieve[(int)j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        primes.add(1); // Putting 1 as 0th prime number (even though it's not)
        createSieve();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int q = scanner.nextInt();
        int size = q + 1;

        Stack<Integer>[] a = new Stack[size];
        Stack<Integer>[] b = new Stack[size];

        for (int i = 0; i < size; i++) {
            a[i] = new Stack<>();
            b[i] = new Stack<>();
        }

        while (n-- > 0) {
            int x = scanner.nextInt();
            a[0].push(x);
        }

        int i = 1;
        while (q-- > 0) {
            while (!a[i - 1].empty()) {
                int topElement = a[i - 1].pop();
                if (topElement % primes.get(i) == 0) {
                    b[i].push(topElement);
                } else {
                    a[i].push(topElement);
                }
            }
            i++;
        }

        // Print b stacks first, then a stacks
        for (int j = 0; j < size; j++) {
            while (!b[j].empty()) {
                System.out.println(b[j].pop());
            }
        }

        for (int j = 0; j < size; j++) {
            while (!a[j].empty()) {
                System.out.println(a[j].pop());
            }
        }
    }
}
