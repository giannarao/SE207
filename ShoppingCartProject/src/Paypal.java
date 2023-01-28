
public class Paypal implements PaymentStrategy {
	private String email;
	private String password;
		
	Paypal(String email, String password){
		this.email = email;
		this.password = password;
	}

	@Override
	public void pay (double amount) {
		System.out.println("Paid " + amount + " with Paypal account: " + this.email);

	}

}
