
public class NewOrderIDGenerator {
	private static NewOrderIDGenerator uniqueInstance;
	
	int id = 0;
	String prefix = "XY-";
	
	private NewOrderIDGenerator() {}
	
	public static synchronized NewOrderIDGenerator getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new NewOrderIDGenerator();
		}
		return uniqueInstance;
	}

	public String getNextOrderID() {
		id++;
		return(prefix + id); 
	}
	
	
}