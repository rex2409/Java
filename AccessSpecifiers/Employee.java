package AccessSpecifiers;

public class Employee {

	public String name;

	public String getName() {
		return name;
	}
	
	private int id;//cannot be inherited
	
	int age;//default//only accessible at package level
	
	protected int salary;

	public void setName(String name) {
		this.id = 123;
		this.name = name;
		this.age = 5;
	}
	
}
