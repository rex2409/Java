package BitManip;

import java.util.Scanner;

public class CountingBits {
	// Function to count the number of set bits in a number using bitwise operations
    public static int countOnes(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1; // Check the rightmost bit
            n >>= 1;        // Right shift to check the next bit
        }
        return count;
    }

    // Function to calculate the number of 1's in binary representation for numbers from 0 to num
    public static int[] countBits(int num) {
        int[] result = new int[num + 1];

        for (int i = 0; i <= num; i++) {
            result[i] = countOnes(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        // Calculate the number of 1's in binary representation for each number from 0 to num
        int[] result = countBits(num);

        // Print the result as space-separated integers
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        scanner.close();
    }
}
