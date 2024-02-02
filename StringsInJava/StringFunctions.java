package StringsInJava;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "hello";
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(2));
		
		System.out.println(str.length());
		
		System.out.println(str.substring(0,4));//si to ei, where si is inclusive and ei is exclusive
		System.out.println(str.substring(2));
		
		String s1 = "hi";
		String s2 = "bye";
		String s3 = new String("hello");
		System.out.println(s1+s2);
		
		System.out.println(s1.concat(s2));
		
		System.out.println(str.indexOf('e'));
		System.out.println(str.indexOf('p'));//not exist -1
		
		System.out.println(str.startsWith("he"));
		
		System.out.println(str == s3);//checks address
		System.out.println(str.equals(s3));//checks char by char 
	}

}
