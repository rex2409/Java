package BitManip;

import java.util.Scanner;

public class Hulk {

	 public static int minMovesToReachN(int N) {
	        // Counting the set bits in the binary representation of N
	        int moves = 0;
	        while (N > 0) {
	            N &= (N - 1); // Unset the rightmost set bit
	            moves++;
	        }
	        return moves;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int T = scanner.nextInt(); // Number of test cases
	        while (T-- > 0) {
	            int N = scanner.nextInt(); // Replace with the actual level N
	            int result = minMovesToReachN(N);
	            System.out.println(result);
	        }

	        scanner.close();
	    }

}
