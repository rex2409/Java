package ArraysInJava;

public class ArrayRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10,20,30,40,50};
		
		int rot = 90;
		disp(arr);
		rotate(arr,94);
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
			//disp(arr);
		}
	}
	
	public static void disp(int[] arr) {
		for(int ali:arr) {
			System.out.print(ali + " ");
		}
		System.out.println();
	}

}
