package HashMap;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubArrayWithDistinctEle {

	static int sumOfLength(int[] arr, int n) {
        // For maintaining distinct elements.
        Set<Integer> set = new HashSet<>();

        // Initialize ending point and result
        int j = 0, ans = 0;

        // Fix starting point
        for (int i = 0; i < n; i++) {
            // Find ending point for the current subarray with distinct elements.
            while (j < n && !set.contains(arr[j])) {
                set.add(arr[j]);
                j++;
            }

            // Calculating and adding all possible length subarrays in arr[i..j]
            ans += ((j - i) * (j - i + 1)) / 2;

            // Remove arr[i] as we pick a new starting point from next
            set.remove(arr[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(sumOfLength(arr, n) % (int) (1e9 + 7));
    }
}
