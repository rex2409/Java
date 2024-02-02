package OOP;

public class Person {
	
	//object also called Instance

	//data members, attributes,variables,adjectives
	String name;
	String gender;
	int age;
	
	public Person() {//constructor
		
		this.name = "Raj";
		this.gender = "male";
		this.age = 20;
	}
	
	//Both constructors have same name, it is called constructor overloading
	
	public Person(String name,String gender, int age) {//parameterized constructor
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	//functions/methods/behaviour
	public void walk() {
		System.out.println("Started Walking!");
	}
	
	public void eat() {
		System.out.println("Started Eating!");
	}
	
	public void sleep() {
		System.out.println("Started Sleeping!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	//this variable is a reference variable
	//it stores current object
	
	
}
