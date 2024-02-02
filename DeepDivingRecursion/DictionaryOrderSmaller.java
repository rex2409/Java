package DeepDivingRecursion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class DictionaryOrderSmaller {
	static boolean cmp(String x, String y) {
        return x.compareTo(y) < 0;
    }

    static void permute(String s, String p, int i, int n, ArrayList<String> ans) {
        // thinking about the base case
        if (i == n) {
            if (s.compareTo(p) < 0) {
                ans.add(s);
                return;
            }
        }

        // building recursive case
        for (int j = i; j < n; j++) {
            char[] charArray = s.toCharArray();
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            s = new String(charArray);

            permute(s, p, i + 1, n, ans);

            temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            s = new String(charArray);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String p = s;

        ArrayList<String> ans = new ArrayList<>();
        int n = s.length();
        permute(s, p, 0, n, ans);

        ans.sort(Comparator.naturalOrder());
        for (String x : ans) {
            System.out.println(x);
        }
    }
}
