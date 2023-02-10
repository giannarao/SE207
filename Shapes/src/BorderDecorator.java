
public class BorderDecorator extends ShapeDecorator{

	Shape shape;
	
	public BorderDecorator(Shape shape) {
		this.shape = shape;
		
		
	}
	@Override
	public String getDescription() {
		return shape.getDescription();
	}

	@Override
	public void draw() {
		shape.draw();
		System.out.println ("Drawing with a border");
		
		
	}

}
