package OOP;

public class DoctorClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cardiologist c1 = new Cardiologist();
		c1.name = "Ram";
		c1.specialization = "heart ailments";
		
		c1.treatPatients();
		
		Orthopedic o1 = new Orthopedic();
		
		o1.treatPatients();
	}

}
