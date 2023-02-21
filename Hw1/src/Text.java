
public class Text implements StrategyPattern {

	@Override
	public void processMessage(String email, String blogTitle, String blogMessage) {
		System.out.println();
		System.out.println("Texting message: ");
		System.out.println("Texting to: " + email);
		System.out.println("Title: " + blogTitle);
		System.out.println("Message: " + blogMessage);
		System.out.println();
		
	}

}
