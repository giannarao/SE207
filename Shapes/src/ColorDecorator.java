
public class ColorDecorator extends ShapeDecorator{

	Shape shape;
	
	public ColorDecorator(Shape shape) {
		this.shape = shape;
		
		
	}
	@Override
	public String getDescription() {
		return shape.getDescription();
	}

	@Override
	public void draw() {
		shape.draw();
		System.out.println("Drawing with color");
		
	}

}
