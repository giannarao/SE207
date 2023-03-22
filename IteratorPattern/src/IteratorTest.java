
import java.util.*;

public class IteratorTest {

	public static void main(String[] args) {
		
		// declare a variable to hold a collection of VehicleCollection - i.e., an ArrayList VehicleCollection
		ArrayList<VehicleCollection> vehicleCollection = new ArrayList<VehicleCollection>();
		
		
		// Add each VehicleCollection Object to the above variable
		Cars myCars = new Cars();
		vehicleCollection.add(myCars);
		
		MotorCycles myMotorCycles = new MotorCycles(2);
		vehicleCollection.add(myMotorCycles);
		
		Trucks myTrucks = new Trucks();
		vehicleCollection.add(myTrucks);
		
		Vans myVans = new Vans();
		vehicleCollection.add(myVans);
		
		Atvs myAtvs = new Atvs();
		vehicleCollection.add(myAtvs);
		
		
		
		
		
		// instantiate the ShowMyCollections Class and invoke show method passing the above variable as an argument
		ShowMyCollections showMyCollections = new ShowMyCollections();
		
		
		showMyCollections.show(vehicleCollection); 
		
		
	}
}

