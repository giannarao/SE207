
public class ShapeTester {

	public static void main(String[] args) {
		Shape shape1 = new Circle();
		shape1 = new BorderDecorator(shape1);
		shape1.draw();
		
		System.out.println();
		
		
		Shape shape2 = new Rectangle();
		shape2 = new BorderDecorator(shape2);
		shape2 = new ColorDecorator(shape2);
		shape2.draw();
		
		System.out.println();
		
		
		Shape shape3 = new Triangle();
		shape3 = new BorderDecorator(shape3);
		shape3 = new ColorDecorator(shape3);
		shape3 = new ShadeDecorator(shape3);
		shape3.draw();
		
		
		
		
		
		
		

	}

}
