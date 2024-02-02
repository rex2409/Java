package AccessSpecifiersDiffPackage;

import AccessSpecifiers.Employee;

public class Manager extends Employee{

	public void setName() {
		System.out.println(this.name);
		//e1.id//not accessible because private
		//System.out.println(this.age);//default is also not visible in diff package child class
		System.out.println(this.salary);
	}
}
