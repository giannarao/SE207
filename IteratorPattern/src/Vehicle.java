
public abstract class Vehicle {
	public Engine engine;
	public VehicleTypes type = VehicleTypes.NOTDEFINED;
	public String color;
	
	Vehicle (int engineSize, String color) {
		this.color = color;
		this.engine = new Engine(engineSize);
	}

	@Override
	public String toString() {
		return(this.type + " " + this.color + " " + this.engine.toString());
	}
}

