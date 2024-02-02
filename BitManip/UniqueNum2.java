package BitManip;

import java.util.Scanner;

public class UniqueNum2 {

	public static void swap(int a, int b) {
	    int temp = a;
	    a = b;
	    b = temp;
	}
	
	public static boolean compare(int a, int b) {
		return a<b;
	}
	
	public static void uniNum(int[] a, int n) {
		int ans = 0;
	    for(int i=0; i<n; i++){
	        ans ^= a[i];
	    }
	    int result = ans;
	    //1: extrect the bit pos with value 1, that means it would be diff. in both unique numbers
	    int pos = 0;
	    while(ans>0){
	        if((ans&1) == 1){
	            break;
	        }
	        ans >>= 1;
	        pos++;
	    }
	    //2: we need to separate according to bit position

	    int x = 1 << pos;
	    int un1 = 0;
	    for(int i=0; i<n; i++){
	        if((a[i]&x) == 0){
	            un1 ^= a[i];
	        }
	    }
	    int un2 = result^un1;
	    
	    //in increasing order
	    if(compare(un1,un2)){
	        System.out.println(un1+" "+un2);
	    }
	    else{
	        swap(un1,un2);
	        System.out.println(un1+" "+un2);
	    }
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
