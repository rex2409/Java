package FundamentalsOfJava;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2;
		char ch;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			ch = sc.next().charAt(0);
			switch(ch) {
			case '+':
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				System.out.println(n1+n2);
				break;
			case '-':
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				System.out.println(n1-n2);
				break;
			case '*':
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				System.out.println(n1*n2);
				break;
			case '/':	
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				System.out.println(n1/n2);
				break;
			case '%':
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				System.out.println(n1%n2);
				break;
			case 'x':
			case 'X':
				break;
			default:
				System.out.println("Invalid Operation. Try again.");
				
			}
			if(ch=='x'||ch=='X')
				break;
		}while(true);
		System.out.println();
	}

}
