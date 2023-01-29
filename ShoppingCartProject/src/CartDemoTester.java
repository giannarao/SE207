
public class CartDemoTester {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("1234", 10.00);
		Item item2 = new Item("5678", 40.00);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		PaymentStrategy myCC = new CCPayment("Gianna", "1234567890123456", "12345", "12.25", "123");
		
		cart.checkout(myCC);
		
		PaymentStrategy myPP = new Paypal("gianna.r@monmouth.edu", "password");
		cart.checkout(myPP);
		
		PaymentStrategy myVenmo = new Venmo("9171234567");
		cart.checkout(myVenmo);
		
		PaymentStrategy myApplePay = new ApplePay("giannarao", "password", "9171234567");
		cart.checkout(myApplePay);
	}

}
