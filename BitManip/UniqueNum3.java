package BitManip;

import java.util.Scanner;

public class UniqueNum3 {

	public static void uniNum(int[] a, int n) {
		int[] cnt = new int[64];

	    //make count array by adding all the bits of numb according to the position of the bits
	    for(int i=0; i<n; i++){
	        int pos = 0;
	        int no = a[i];
	        while(no>0){
	            if((no&1) == 1){
	                cnt[pos]++;
	            }
	            no >>= 1;
	            pos++;
	        }    
	    }

	    //Binary to decimal
	    int ans = 0, place = 1;

	    for(int i=0; i<64; i++){
	        cnt[i] %= 3;
	    
	    //(cnt[] is binary of unique no)

	        ans += cnt[i]*place;
	        place <<= 1; // equi to  place *= 2; 
	    }
	    System.out.println(ans);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		uniNum(arr,n);
	}

}
