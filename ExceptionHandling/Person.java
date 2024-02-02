package ExceptionHandling;

public class Person {

	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) throws Exception {
		if(age<0) {
			throw new Exception("The age can never be negaive");
		}
		this.age = age;
	}
}
