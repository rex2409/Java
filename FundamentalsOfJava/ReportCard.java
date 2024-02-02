package FundamentalsOfJava;

public class ReportCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float marks = 75;
		
		if(marks >= 90)
			System.out.println("A+");
		else if(marks >= 80 && marks <= 90)
			System.out.println("A");
		else if(marks >= 70 && marks <= 80)
			System.out.println("B");
		else if(marks >= 60 && marks <= 70)
			System.out.println("C");
		else if(marks < 60)
			System.out.println("Fail");
		else
			System.out.println("Invalid Mark!");
	}

}
