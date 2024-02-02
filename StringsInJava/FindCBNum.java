package StringsInJava;

import java.util.Scanner;

public class FindCBNum {

	public static long stoint(String s) {
        long i, j = 0;
        i = 0;
        while (j < s.length() && s.charAt((int) j) >= '0' && s.charAt((int) j) <= '9') {
            i = i * 10 + (s.charAt((int) j) - '0');
            j++;
        }
        return i;
    }

    public static boolean cbNum(long num) {
        if (num == 0 || num == 1) {
            return false;
        }
        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                return true;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (num % arr[i] == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean valid(boolean[] visited, int l, int r) {
        for (int i = l; i < r; i++) {
            if (visited[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = Integer.parseInt(s.nextLine());

        String inp = s.nextLine();

        long count = 0;

        boolean[] visited = new boolean[n];

        for (int i = 1; i <= inp.length(); i++) {
            for (int j = 0; j <= inp.length() - i; j++) {
                int e = j + i;
                String sub = inp.substring(j, e);
                long subNum = stoint(sub);
                if (cbNum(subNum) && valid(visited, j, e)) {
                    count++;
                    for (int k = j; k < e; k++) {
                        visited[k] = true;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
