package ArraysInJava;

public class ArrayRotate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10,20,30,40,50};
		
		int rot = 94;
		disp(arr);
		//rotate(arr,94);
		rotate2(arr,rot);
		//disp(arr);
	}
	
	public static void rev(int[] arr, int L, int R) {
		while(L<R) {
			int temp = arr[L];
			arr[L] = arr[R];
			arr[R] = temp;
			L++;
			R--;
		}
	}
	
	public static void rotate2(int[] arr, int rot) {
		rot = rot % arr.length;
		
		if(rot<0) {//-3%5=-3 in java
			rot = rot +arr.length;//for negative rotation
		}
		
		rev(arr,0,arr.length-1);// reve whole array
		disp(arr);
		
		rev(arr,0,rot-1);//rev elements infront
		disp(arr);
		
		rev(arr, rot, arr.length - 1);
		disp(arr);
	}
	
	
	public static void rotate(int[] arr, int rot) {
		rot = rot % arr.length;
		
		for(int rrr = 1; rrr<= rot; rrr++) {
			int last = arr[arr.length-1];
			for(int i = arr.length-1; i >= 1 ; i--) {
				arr[i] = arr[i-1];
			}
			arr[0] = last;
			disp(arr);
		}
	}
	
	public static void disp(int[] arr) {
		for(int ali:arr) {
			System.out.print(ali + " ");
		}
		System.out.println();
	}

}
