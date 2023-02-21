
public class Display implements StrategyPattern {

	@Override
	public void processMessage(String email, String blogTitle, String blogMessage) {
		System.out.println();
		System.out.println("Displaying blog: " );
		System.out.println("Email: " + email);
		System.out.println("Title: " + blogTitle);
		System.out.println("Message: " + blogMessage);
		System.out.println();
		
	}

}
