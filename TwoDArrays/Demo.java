package TwoDArrays;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = new int[3][5];
		System.out.println(arr);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		arr[1][2]=10;
		System.out.println(arr[1][2]);
		
		System.out.println(arr.length);//number of rows
		System.out.println(arr[0].length);//number of columns
	}

}
