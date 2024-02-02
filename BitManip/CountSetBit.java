package BitManip;

import java.util.Scanner;

public class CountSetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[]arr = new int[n];
		
		for(int i = 0; i<n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		for(int i = 0; i < n; i++) {
			int ct = 0;
			
			while(arr[i]>0) {
				if((arr[i]&1) == 1) {
					ct++;
				}
				arr[i] = arr[i]>>1;
			}
			System.out.println(ct);
		}
	}

}
