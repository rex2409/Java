package BinarySearch;

import java.util.Scanner;
import java.util.Vector;

public class MurthalParantha {
	static long inf = (long) 1e18;
    static long mod = (long) 1e9 + 7;

    static boolean isPossible(Vector<Long> rnk, long minTime, long paranthas) {
        int n = rnk.size();
        for (int i = 0; i < n; i++) {
            long tm = 0;
            long ct = 1;
            while (tm + ct * rnk.get(i) <= minTime && paranthas > 0) {
                tm += ct * rnk.get(i);
                paranthas--;
                ct++;
            }
            if (paranthas == 0)
                return true;
        }
        return (paranthas == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = 1;
        // t = scanner.nextInt(); // Uncomment this line if you want to take input for the number of test cases

        while (t-- > 0) {
            // Accept the number of paranthas to be made
            long par = scanner.nextLong();
            int n = scanner.nextInt();

            // Accept the rank of cooks at various stalls
            Vector<Long> ran = new Vector<Long>();
            for (int i = 0; i < n; i++) {
                ran.add(scanner.nextLong());
            }

            // Binary search on the time needed to cook the given paranthas
            long lo = 0;
            long hi = (long) 1e18;

            // ans stores the minimum amount of time needed to cook the paranthas
            // ans is initialized to some logically maximum value
            long ans = (long) 1e18;

            while (lo <= hi) {
                long mid = lo + hi >> 1;
                // if it is possible to cook the paranthas in "mid" units of time, then use it for computing the ans
                // and again start trying for smaller values by reducing hi to mid-1
                if (isPossible(ran, mid, par)) {
                    ans = Math.min(ans, mid);
                    hi = mid - 1;
                } else {
                    // Else search for larger units of time
                    lo = mid + 1;
                }
            }
            System.out.println(ans);
        }
    }
}

