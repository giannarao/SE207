
import java.util.*;

public class Cars implements VehicleCollection {
	private List <Vehicle> cars = new ArrayList<Vehicle> ();

	Cars () {
		
		// Add 2 Car objects to cars List
		Car car1 = new Car(800, "black");
		Car car2 = new Car(900, "white");
		
		cars.add(car1);
		cars.add(car2);
		
		
	}
	
	@Override
	public Iterator<Vehicle> getIterator() {		
		//return null; // return listIterator() from cars List
		return cars.listIterator();   
		
	}
	
	
}
