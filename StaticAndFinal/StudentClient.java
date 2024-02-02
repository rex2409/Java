package StaticAndFinal;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		Student s2 = new Student();
		
		System.out.println(Student.uniform);
		System.out.println(s1.uniform);//BAD Practice
	}

}
