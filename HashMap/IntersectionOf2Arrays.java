package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IntersectionOf2Arrays {

	static ArrayList<Integer> v = new ArrayList<>();

    public static void intersection(int[] A, int[] B, int n) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            m.put(A[i], m.getOrDefault(A[i], 0) + 1);
        }

        Arrays.sort(B);

        for (int j = 0; j < n; j++) {
            if (m.containsKey(B[j])) {
                v.add(B[j]);

                int count = m.get(B[j]);
                m.put(B[j], count - 1);

                if (count == 1) {
                    m.remove(B[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        for (int j = 0; j < n; j++) {
            B[j] = scanner.nextInt();
        }

        intersection(A, B, n);

        // Print
        System.out.print("[");
        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i));

            if (i < v.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
