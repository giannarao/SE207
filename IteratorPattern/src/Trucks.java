
import java.util.Iterator;
import java.util.*;

public class Trucks implements VehicleCollection {
	
    HashMap <String, Vehicle> trucks = new HashMap <String, Vehicle> ();
	
	Trucks () {
		// add 4 Truck Objects to trucks HashMap
		Truck truck1 = new Truck(1500, "black");
		Truck truck2 = new Truck(1600, "white");
		Truck truck3 = new Truck(1800, "red");
		Truck truck4 = new Truck(1900, "blue");
		
		trucks.put("Truck 1", truck1);
		trucks.put("Truck 2", truck2);
		trucks.put("Truck 3", truck3);
		trucks.put("Truck 4", truck4);
		
	}

	@Override
	public Iterator<Vehicle> getIterator() {
		
		//return null; // return the iterator from HashMap values
		return trucks.values().iterator();
		
	}

}
