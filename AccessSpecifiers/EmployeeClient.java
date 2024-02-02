package AccessSpecifiers;

public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee();
		e1.name= "Raj";
		
		//e1.id//not accessible because private
		
		System.out.println(e1.age);
		
		System.out.println(e1.salary);
	}

}
