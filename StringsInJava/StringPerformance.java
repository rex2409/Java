package StringsInJava;

public class StringPerformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "hello";
		int N = 1000;
		
		long start = System.currentTimeMillis();
		
		for(int i = 1;i<=N;i++) {
			s = s+'a';
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
	}

}
