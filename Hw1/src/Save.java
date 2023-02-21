
public class Save implements StrategyPattern {

	@Override
	public void processMessage(String email, String blogTitle, String blogMessage) {
		System.out.println();
		System.out.println("Saving message");
		System.out.println("Email: " + email);
		System.out.println("Title: " + blogTitle);
		System.out.println("Saving message: " + blogMessage);
		System.out.println();
		
	}

}
