package DynamicProgramming;

import java.util.HashMap;
import java.util.Scanner;

public class XchangeCoin {

	 static HashMap<Long, Long> dp = new HashMap<>();

	    static long maxGold(long n) {
	        // n == 0 return
	        if (n == 0) {
	            return 0;
	        }
	        // lookup
	        if (dp.containsKey(n)) return dp.get(n);
	        // else max of n or n/2 + n/3 + n/4
	        long result = Math.max(n, maxGold(n / 2) + maxGold(n / 3) + maxGold(n / 4));
	        dp.put(n, result);
	        return result;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        long n = scanner.nextLong();
	        long ans = n;
	        System.out.println(maxGold(n));
	    }
}
