package StringsInJava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FormBigNum {

	 public static class CustomComparator implements Comparator<Long> {
	        @Override
	        public int compare(Long a, Long b) {
	            String ab = a + "" + b;
	            String ba = b + "" + a;
	            return ba.compareTo(ab);
	        }
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			long n = sc.nextLong();
            Long[] arr = new Long[(int) n]; // Use Long[] instead of long[]
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            Arrays.sort(arr, new CustomComparator());

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
            t--;
		}
		
	}

}
