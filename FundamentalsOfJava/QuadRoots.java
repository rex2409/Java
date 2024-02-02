package FundamentalsOfJava;

import java.util.Scanner;

public class QuadRoots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		// value a, b, and c
	    double a = sc.nextDouble();
	    double b = sc.nextDouble();
	    double c = sc.nextDouble();
	    double root1, root2;

	    // calculate the determinant (b2 - 4ac)
	    double determinant = b * b - 4 * a * c;

	    // check if determinant is greater than 0
	    if (determinant > 0) {
	      // two real and distinct roots
	      root1 = (-b + Math.sqrt(determinant)) / (2 * a);
	      root2 = (-b - Math.sqrt(determinant)) / (2 * a);

	      System.out.println("Real and Distinct");
	      
	      if(root1>root2) {
	    	  System.out.print((int)root2 + " " + (int)root1);
	      }
	      else {
	    	  System.out.print((int)root2 + " " + (int)root1);
	      }
	    }

	    // check if determinant is equal to 0
	    else if (determinant == 0) {
	      // two real and equal roots
	      // determinant is equal to 0
	      // so -b + 0 == -b
	      root1 = root2 = -b / (2 * a);
	      System.out.println("Real and Equal");
	      System.out.print((int)root1 + (int)root2);
	    }

	    // if determinant is less than zero
	    else {
	      // roots are complex number and distinct
	      double real = -b / (2 * a);
	      double imaginary = Math.sqrt(-determinant) / (2 * a);
	      System.out.println("Imaginary");
	    }
	}

}
