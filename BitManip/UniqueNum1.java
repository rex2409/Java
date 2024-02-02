package BitManip;

import java.util.Scanner;

public class UniqueNum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		//int n = arr.length;
		int ans = 0;
		for(int i = 0; i<n; i++) {
			ans = (ans ^ arr[i]);
		}
		System.out.println(ans);
	}

}
