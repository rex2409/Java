package ComparatorsAndToString;

public class Car {

	String name;
	int speed;
	int price;
	
	public Car(String name,int speed,int price) {
		
		this.name = name;
		this.speed = speed;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return this.name + "|" + this.speed + "|" + this.price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
}
