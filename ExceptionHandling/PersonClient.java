package ExceptionHandling;

public class PersonClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Person p1 = new Person();
		
		try {
			p1.setAge(-10);
		}
		catch(Exception e) {
			p1.setAge(0);
		}
		System.out.println(p1.getAge());
	}

}
