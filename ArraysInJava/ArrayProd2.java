package ArraysInJava;

public class ArrayProd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4};
		prod2(arr);
	}
	public static void prod2(int[] arr) {
		int p_L=1;
		for(int i =0;i<arr.length;i++) {
			
			int p_R=1;
			for(int j = i+1; j<arr.length; j++) {
				p_R = p_R * arr[j];
			}
			System.out.print(p_L*p_R+ " ");
			p_L = p_L * arr[i];
		}
	}
	
	public static void prod3(int[] arr) {
		int[] r_Prod = new int[arr.length];
		int p_R = 1;
		
		for(int j = arr.length-1; j>= 0;j--) {
			r_Prod[j] = p_R;
			p_R = p_R*arr[j];
		}
		
		int p_L=1;
		for(int i =0;i<arr.length;i++) {
			System.out.print(p_L*r_Prod[i]+ " ");
			p_L = p_L * arr[i];
		}
	}
}
