package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExistOrNot {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t-- > 0) {
            Map<Integer, Boolean> m = new HashMap<>();

            int L = scanner.nextInt();
            int num;

            for (int i = 0; i < L; i++) {
                num = scanner.nextInt();
                m.put(num, true);
            }

            int Q = scanner.nextInt();
            for (int i = 0; i < Q; i++) {
                num = scanner.nextInt();

                if (m.containsKey(num)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}
