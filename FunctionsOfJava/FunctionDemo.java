package FunctionsOfJava;

import java.util.Scanner;

public class FunctionDemo {

	public static int add(int a,int b) {
		int res = a+b;
		return res;
	}
	
	public static int multiply(int a,int b) {
		int res = a*b;
		return res;
	}
	
	public static void sayHello() {//void because its not returning any value
		System.out.println("Hello Sir!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sayHello();
		
		int mul = multiply(a,b);
		System.out.println(mul);
		
		int add = add(a,b);
		System.out.println(add);
	}

}
