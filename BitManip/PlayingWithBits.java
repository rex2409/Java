package BitManip;

import java.util.Scanner;

public class PlayingWithBits {

	public static void setBitCnt(int a, int b) {
		int ans = 0;
		for(int i=a; i<=b; i++){
	        int no = i;
	        while(no>0){
	            if((no&1) == 1){
	                ans += 1;
	            }
	            no >>= 1;
	        }
	    }
	    System.out.println(ans);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

	    for(int i=0; i<n; i++){
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        setBitCnt(a, b);
	    }
	}

}
