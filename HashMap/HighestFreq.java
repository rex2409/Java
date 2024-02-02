package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestFreq {

	static int highestFrequency(int[] arr, int n) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }

        int maxFreq = 0;
        int result = -1;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (maxFreq < entry.getValue()) {
                result = entry.getKey();
                maxFreq = entry.getValue();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(highestFrequency(arr, n));
    }
}
