package ArraysInJava;

import java.util.Scanner;

public class MaxSumPath {

	public static int max(int a, int b) {
		if(a>b)
			return a;
		else
			return b;
	}
	
	public static int msp(int[] a1, int[] a2, int n, int m) {
		int sum1 = 0, sum2 = 0, result = 0;
		
		int i = 0, j = 0;
		while(i<n && j<m) {
			if(a1[i]<a2[j])
				sum1 += a1[i++];
			else if(a1[i]>a2[j])
				sum2 += a2[j++];
			else {
				result += max(sum1,sum2)+a1[i];
				sum1 = 0;
				sum2 = 0;
				i++;
				j++;
			}
		}
		while(i<n) {
			sum1 += a1[i++];
		}
		
		while(j<m) {
			sum2 += a2[j++];
		}
		
		result += max(sum1,sum2);
		return result;
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int k = 0; k < t; k++) {
            int n = sc.nextInt();
            int[] a1 = new int[n];
            int m = sc.nextInt();
            int[] a2 = new int[m];

            for (int i = 0; i < n; i++) {
                a1[i] = sc.nextInt();
            }

            for (int i = 0; i < m; i++) {
                a2[i] = sc.nextInt();
            }

            System.out.println(msp(a1, a2, n, m));
        }
    }

}
