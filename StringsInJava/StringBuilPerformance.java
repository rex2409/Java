package StringsInJava;

public class StringBuilPerformance {

	public static void stringPer(String s, int N) {
		for(int i =1; i<=N; i++) {
			s = s + 'a';
		}
	}
	
	public static void stringBuilPer(String s, int N) {
		StringBuilder sb = new StringBuilder(s);
		for(int i =1; i<=N; i++) {
			sb.append('a');
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "hello";
		int N = 1000;
		long start = System.currentTimeMillis();
		//stringPer(s,N);
		stringBuilPer(s,N);
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
	}

}
