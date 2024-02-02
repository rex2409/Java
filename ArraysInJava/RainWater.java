package ArraysInJava;

public class RainWater {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
		
		rainWater3(arr);
	}
	
	public static void rainWater3(int[] arr) {
		int ans = 0;
		int L = 0;
		int R = arr.length - 1;
		int max_L = arr[0];
		int max_R = arr[arr.length - 1];
		while(L<=R) {
			if(max_L<=max_R) {
				max_L = Math.max(max_L,  arr[L]);
				ans = ans + max_L - arr[L];
				L++;
			}
			else {
				max_R = Math.max(max_R,  arr[R]);
				ans = ans + max_R-arr[R];
				R--;
			}
		}
		System.out.println(ans);
	}
	
	public static void rainWater2(int[] arr) {
		int wall_R = arr[arr.length - 1];
		int[] wall_Right = new int[arr.length];
		for(int i = arr.length-1;i>=0;i--) {
			wall_R = Math.max(wall_R, arr[i]);
			wall_Right[i] = wall_R;
		}
		int wall_L = arr[0];
		int ans = 0;
		for(int i = 0; i < arr.length;i++) {
			
			wall_L = Math.max(wall_L, arr[i]);
			
		
			ans = ans + Math.min(wall_L, wall_Right[i]) - arr[i];
			
		}
		System.out.println(ans);
	}
	
	public static void rainWater(int[] arr) {
		
		int ans = 0;
		for(int i = 0; i < arr.length;i++) {
			int wall_L = arr[0];
			for(int j=0;j<=i;j++) {
				wall_L = Math.max(wall_L, arr[j]);
			}
			
			int wall_R = arr[arr.length - 1];
			for(int j=i;j<arr.length;j++) {
				wall_R = Math.max(wall_R, arr[j]);
			}
			ans = ans + Math.min(wall_L, wall_R) - arr[i];
			
		}
		System.out.println(ans);
	}

}
