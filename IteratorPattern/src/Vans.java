
import java.util.Iterator;
import java.util.LinkedList;

public class Vans implements VehicleCollection {
	
	LinkedList<Vehicle> vans = new LinkedList<Vehicle> ();

	Vans () {
		// add 3 Van Objects to vans LinkedList
		Van van1 = new Van(500, "black");
		Van van2 = new Van(600, "white");
		Van van3 = new Van(800, "red");
		
		vans.add(van1);
		vans.add(van2);
		vans.add(van3);
	}
	
	@Override
	public Iterator<Vehicle> getIterator() {
		
		//return null; // return vans listIteator()
		return vans.listIterator();
		
	}
	

}
