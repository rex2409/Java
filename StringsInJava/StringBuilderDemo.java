package StringsInJava;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "hello";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		
		System.out.println(sb.charAt(1));
		
		System.out.println(sb.length());
		
		sb.setCharAt(2, 'w');
		System.out.println(sb);
		
		sb.insert(2, 'k');
		System.out.println(sb);
		
		sb.append('k');
		System.out.println(sb);
		
		sb.deleteCharAt(2);
		System.out.println(sb);
		
		String s1 = sb.toString();
		System.out.println(s1);
	}

}
