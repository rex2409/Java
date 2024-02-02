package AccessSpecifiersDiffPackage;

import AccessSpecifiers.Employee;

public class EmployeeClient2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee();
		e.name = "Ram";
		//e.id//not accessible because private
		
		//e.age;//default not accessible in diff package diff class
		
		//e.salary// protected not accessible 
	}

}
