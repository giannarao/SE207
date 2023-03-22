
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class MotorCycles implements VehicleCollection {
	
	Vehicle [] motorCycles;
	
	MotorCycles (int count) {
		// add "count" MotorCycle Objects to motorCycles Array
		motorCycles = new MotorCycle[count];
		MotorCycle motorCycle1 = new MotorCycle(500, "black");
		MotorCycle motorCycle2 = new MotorCycle(600, "white");
		
		motorCycles[0] = motorCycle1;
		motorCycles[1] = motorCycle2;
		
		
		
		
	}
	
	
	@Override
	public Iterator<Vehicle> getIterator () {
		// Note - Java has a built in method in Arrays class convert Array to a list
		//        Arrays.asList<arrayVariable>
		//     
		//        Once we have the list, we can get the iterator as
		//        List.iterator()
		//
		// Replace null below with returned iterator
		List<Vehicle> motorCyclesList = Arrays.asList(motorCycles);
		return motorCyclesList.iterator();
		
		
		
		
		
	}
	

}