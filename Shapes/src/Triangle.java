
public class Triangle extends Shape{

	public Triangle() {
		description = "Triangle";
		
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing a " + description);
		
	}

}
