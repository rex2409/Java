package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SubsetSum {

	static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

    static boolean myCompare(ArrayList<Integer> a, ArrayList<Integer> b) {
        return a.size() < b.size();
    }

    static void allsubsets(int[] arr, int n, ArrayList<Integer> v, int sum) {
        if (sum == 0) {
            ans.add(new ArrayList<>(v));
            return;
        }
        if (n == 0) {
            return;
        }
        v.add(arr[n - 1]);
        allsubsets(arr, n - 1, v, sum - arr[n - 1]);
        v.remove(v.size() - 1);
        allsubsets(arr, n - 1, v, sum);
    }

    static void printsub(int[] arr, int n, int sum) {
        ArrayList<Integer> v = new ArrayList<>();
        allsubsets(arr, n, v, sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        printsub(arr, n, k);
        Collections.sort(ans, (a, b) -> Integer.compare(a.size(), b.size()));
        for (ArrayList<Integer> v : ans) {
            for (int ele : v) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
