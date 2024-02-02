package ArraysInJava;

public class ArrayProd1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4};
		prod(arr);
	}
	public static void prod(int[] arr) {
		for(int i =0;i<arr.length;i++) {
			int p_L=1;
			for(int j = 0; j<= i-1; j++) {
				p_L = p_L * arr[j];
			}
			int p_R=1;
			for(int j = i+1; j<arr.length; j++) {
				p_R = p_R * arr[j];
			}
			System.out.print(p_L*p_R+ " ");
		}
	}

}
