
import java.util.*;

public class ShowMyCollections {
	
	public void show (ArrayList<VehicleCollection> collections) {
		// loop thru collections and show each collection
		
		for(VehicleCollection collection: collections) {
			showVehicleCollection(collection.getIterator());
			
			
		}
	}
	
	// method to traverse thru collection and show the Vehicle
	
	private void showVehicleCollection (Iterator<Vehicle> iteratorList) {
		// implement while thru Iterator pattern using hasNext() and next() methods
		
		while (iteratorList.hasNext()) {
			System.out.println(iteratorList.next());
		}
	}
}

