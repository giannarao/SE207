
import java.util.Iterator;
import java.util.LinkedList;

public class Atvs implements VehicleCollection {
	
	LinkedList<Vehicle> atvs = new LinkedList<Vehicle> ();

	Atvs () {
		// add 3 Van Objects to vans LinkedList
		Atv atv1 = new Atv(300, "black");
		Atv atv2 = new Atv(400, "white");
		Atv atv3 = new Atv(500, "red");
		
		atvs.add(atv1);
		atvs.add(atv2);
		atvs.add(atv3);
	}
	
	@Override
	public Iterator<Vehicle> getIterator() {
		
		//return null; // return listIteator()
		return atvs.listIterator();
		
	}
	

}
