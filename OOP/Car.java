package OOP;

public class Car extends MotorVehicle {//inheritance via extends
	
	public Car() {}
	
	public Car(String comp) {
		this.company = comp;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	
}
