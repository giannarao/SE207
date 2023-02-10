
public class ShadeDecorator extends ShapeDecorator{

	Shape shape;
	
	public ShadeDecorator(Shape shape) {
		this.shape = shape;
		
		
	}
	@Override
	public String getDescription() {
		return shape.getDescription();
	}

	@Override
	public void draw() {
		shape.draw();
		System.out.println("Drawing with shading");
		
	}

}