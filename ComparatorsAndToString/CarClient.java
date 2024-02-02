package ComparatorsAndToString;

import java.util.Arrays;
import java.util.Comparator;

public class CarClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car[] cars = new Car[3];
		Car c1 = new Car("maruti 800", 120, 10000);
		Car c2 = new Car("aston martin",250,10000000);
		Car c3 = new Car("Ferrari", 300, 5000000);
		
		//new Car(null,0,0) this is an anonymous object
		
		cars[0] = c1;
		cars[1] = c2;
		cars[2] = c3;
		
		
		Arrays.sort(cars, new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				// TODO Auto-generated method stub
				return o2.price - o1.price;//descending order
				//o1 - o2 ascending order
			}
			
		});
		
		
		System.out.println(Arrays.toString(cars));
	}

}
